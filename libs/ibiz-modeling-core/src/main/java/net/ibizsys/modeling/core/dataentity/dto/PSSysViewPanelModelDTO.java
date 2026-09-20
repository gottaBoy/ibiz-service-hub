package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelItemDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysViewPanelModelDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLMODELNAME = "CTRLMODELNAME";
    protected static final String DTOFIELD_CTRLMODELNAME = "ctrlmodelname";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DATATYPE = "DATATYPE";
    protected static final String DTOFIELD_DATATYPE = "datatype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELTAG = "MODELTAG";
    protected static final String DTOFIELD_MODELTAG = "modeltag";
    public static final String FIELD_MODELTAG2 = "MODELTAG2";
    protected static final String DTOFIELD_MODELTAG2 = "modeltag2";
    public static final String FIELD_MODELTYPE = "MODELTYPE";
    protected static final String DTOFIELD_MODELTYPE = "modeltype";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELITEMID = "PSSYSVIEWPANELITEMID";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";
    public static final String FIELD_PSSYSVIEWPANELITEMNAME = "PSSYSVIEWPANELITEMNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";
    public static final String FIELD_PSSYSVIEWPANELMODELID = "PSSYSVIEWPANELMODELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELMODELID = "pssysviewpanelmodelid";
    public static final String FIELD_PSSYSVIEWPANELMODELNAME = "PSSYSVIEWPANELMODELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELMODELNAME = "pssysviewpanelmodelname";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_REFFIELDNAME = "REFFIELDNAME";
    protected static final String DTOFIELD_REFFIELDNAME = "reffieldname";
    public static final String FIELD_REFMODELNAME = "REFMODELNAME";
    protected static final String DTOFIELD_REFMODELNAME = "refmodelname";
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
    public static final String FIELD_VIEWMODELNAME = "VIEWMODELNAME";
    protected static final String DTOFIELD_VIEWMODELNAME = "viewmodelname";

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
    public PSSysViewPanelModelDTO codename(String codeName) {
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
    public PSSysViewPanelModelDTO createdate(Timestamp createDate) {
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
    public PSSysViewPanelModelDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlmodelname")
    public void setCtrlModelName(String ctrlModelName) {
        this._set(DTOFIELD_CTRLMODELNAME, ctrlModelName);
    }

    @JsonIgnore
    public String getCtrlModelName() {
        Object objValue = this._get(DTOFIELD_CTRLMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlModelNameDirty() {
        return this._contains(DTOFIELD_CTRLMODELNAME);
    }

    @JsonIgnore
    public void resetCtrlModelName() {
        this._reset(DTOFIELD_CTRLMODELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO ctrlmodelname(String ctrlModelName) {
        this.setCtrlModelName(ctrlModelName);
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
    public PSSysViewPanelModelDTO customcode(String customCode) {
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
    public PSSysViewPanelModelDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="datatype")
    public void setDataType(String dataType) {
        this._set(DTOFIELD_DATATYPE, dataType);
    }

    @JsonIgnore
    public String getDataType() {
        Object objValue = this._get(DTOFIELD_DATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypeDirty() {
        return this._contains(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public void resetDataType() {
        this._reset(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO datatype(String dataType) {
        this.setDataType(dataType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO datatype(PSModelEnums.CtrlModelDataType dataType) {
        if (dataType == null) {
            this.setDataType(null);
        } else {
            this.setDataType(dataType.value);
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
    public PSSysViewPanelModelDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modeltag")
    public void setModelTag(String modelTag) {
        this._set(DTOFIELD_MODELTAG, modelTag);
    }

    @JsonIgnore
    public String getModelTag() {
        Object objValue = this._get(DTOFIELD_MODELTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelTagDirty() {
        return this._contains(DTOFIELD_MODELTAG);
    }

    @JsonIgnore
    public void resetModelTag() {
        this._reset(DTOFIELD_MODELTAG);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO modeltag(String modelTag) {
        this.setModelTag(modelTag);
        return this;
    }

    @JsonProperty(value="modeltag2")
    public void setModelTag2(String modelTag2) {
        this._set(DTOFIELD_MODELTAG2, modelTag2);
    }

    @JsonIgnore
    public String getModelTag2() {
        Object objValue = this._get(DTOFIELD_MODELTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelTag2Dirty() {
        return this._contains(DTOFIELD_MODELTAG2);
    }

    @JsonIgnore
    public void resetModelTag2() {
        this._reset(DTOFIELD_MODELTAG2);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO modeltag2(String modelTag2) {
        this.setModelTag2(modelTag2);
        return this;
    }

    @JsonProperty(value="modeltype")
    public void setModelType(String modelType) {
        this._set(DTOFIELD_MODELTYPE, modelType);
    }

    @JsonIgnore
    public String getModelType() {
        Object objValue = this._get(DTOFIELD_MODELTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelTypeDirty() {
        return this._contains(DTOFIELD_MODELTYPE);
    }

    @JsonIgnore
    public void resetModelType() {
        this._reset(DTOFIELD_MODELTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO modeltype(String modelType) {
        this.setModelType(modelType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO modeltype(PSModelEnums.PanelModelType modelType) {
        if (modelType == null) {
            this.setModelType(null);
        } else {
            this.setModelType(modelType.value);
        }
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
    public PSSysViewPanelModelDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysViewPanelModelDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysViewPanelModelDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelitemid")
    public void setPSSysViewPanelItemId(String pSSysViewPanelItemId) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMID, pSSysViewPanelItemId);
    }

    @JsonIgnore
    public String getPSSysViewPanelItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelItemId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelitemid(String pSSysViewPanelItemId) {
        this.setPSSysViewPanelItemId(pSSysViewPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setPSSysViewPanelItemId(null);
            this.setPSSysViewPanelItemName(null);
        } else {
            this.setPSSysViewPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPSSysViewPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelitemname")
    public void setPSSysViewPanelItemName(String pSSysViewPanelItemName) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMNAME, pSSysViewPanelItemName);
    }

    @JsonIgnore
    public String getPSSysViewPanelItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelItemName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelitemname(String pSSysViewPanelItemName) {
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelmodelid")
    public void setPSSysViewPanelModelId(String pSSysViewPanelModelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELMODELID, pSSysViewPanelModelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELMODELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelModelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELMODELID);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelmodelid(String pSSysViewPanelModelId) {
        this.setPSSysViewPanelModelId(pSSysViewPanelModelId);
        return this;
    }

    @JsonProperty(value="pssysviewpanelmodelname")
    public void setPSSysViewPanelModelName(String pSSysViewPanelModelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELMODELNAME, pSSysViewPanelModelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelModelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELMODELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO pssysviewpanelmodelname(String pSSysViewPanelModelName) {
        this.setPSSysViewPanelModelName(pSSysViewPanelModelName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysViewPanelModelName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysViewPanelModelName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO name(String strName) {
        this.setPSSysViewPanelModelName(strName);
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
    public PSSysViewPanelModelDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="reffieldname")
    public void setRefFieldName(String refFieldName) {
        this._set(DTOFIELD_REFFIELDNAME, refFieldName);
    }

    @JsonIgnore
    public String getRefFieldName() {
        Object objValue = this._get(DTOFIELD_REFFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefFieldNameDirty() {
        return this._contains(DTOFIELD_REFFIELDNAME);
    }

    @JsonIgnore
    public void resetRefFieldName() {
        this._reset(DTOFIELD_REFFIELDNAME);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO reffieldname(String refFieldName) {
        this.setRefFieldName(refFieldName);
        return this;
    }

    @JsonProperty(value="refmodelname")
    public void setRefModelName(String refModelName) {
        this._set(DTOFIELD_REFMODELNAME, refModelName);
    }

    @JsonIgnore
    public String getRefModelName() {
        Object objValue = this._get(DTOFIELD_REFMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefModelNameDirty() {
        return this._contains(DTOFIELD_REFMODELNAME);
    }

    @JsonIgnore
    public void resetRefModelName() {
        this._reset(DTOFIELD_REFMODELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO refmodelname(String refModelName) {
        this.setRefModelName(refModelName);
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
    public PSSysViewPanelModelDTO updatedate(Timestamp updateDate) {
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
    public PSSysViewPanelModelDTO updateman(String updateMan) {
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
    public PSSysViewPanelModelDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysViewPanelModelDTO usertag(String userTag) {
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
    public PSSysViewPanelModelDTO usertag2(String userTag2) {
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
    public PSSysViewPanelModelDTO usertag3(String userTag3) {
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
    public PSSysViewPanelModelDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="viewmodelname")
    public void setViewModelName(String viewModelName) {
        this._set(DTOFIELD_VIEWMODELNAME, viewModelName);
    }

    @JsonIgnore
    public String getViewModelName() {
        Object objValue = this._get(DTOFIELD_VIEWMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewModelNameDirty() {
        return this._contains(DTOFIELD_VIEWMODELNAME);
    }

    @JsonIgnore
    public void resetViewModelName() {
        this._reset(DTOFIELD_VIEWMODELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO viewmodelname(String viewModelName) {
        this.setViewModelName(viewModelName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysViewPanelModelId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysViewPanelModelId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelModelDTO id(String strValue) {
        this.setPSSysViewPanelModelId(strValue);
        return this;
    }
}
