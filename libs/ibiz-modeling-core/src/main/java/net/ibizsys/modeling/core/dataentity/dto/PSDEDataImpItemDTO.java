/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$CreateDefaultValueType
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataImpDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTranslatorDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDataImpItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEDV = "CREATEDV";
    protected static final String DTOFIELD_CREATEDV = "createdv";
    public static final String FIELD_CREATEDVT = "CREATEDVT";
    protected static final String DTOFIELD_CREATEDVT = "createdvt";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_HIDDENDATAITEM = "HIDDENDATAITEM";
    protected static final String DTOFIELD_HIDDENDATAITEM = "hiddendataitem";
    public static final String FIELD_KEYFLAG = "KEYFLAG";
    protected static final String DTOFIELD_KEYFLAG = "keyflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEDATAIMPID = "PSDEDATAIMPID";
    protected static final String DTOFIELD_PSDEDATAIMPID = "psdedataimpid";
    public static final String FIELD_PSDEDATAIMPITEMID = "PSDEDATAIMPITEMID";
    protected static final String DTOFIELD_PSDEDATAIMPITEMID = "psdedataimpitemid";
    public static final String FIELD_PSDEDATAIMPITEMNAME = "PSDEDATAIMPITEMNAME";
    protected static final String DTOFIELD_PSDEDATAIMPITEMNAME = "psdedataimpitemname";
    public static final String FIELD_PSDEDATAIMPNAME = "PSDEDATAIMPNAME";
    protected static final String DTOFIELD_PSDEDATAIMPNAME = "psdedataimpname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEDV = "UPDATEDV";
    protected static final String DTOFIELD_UPDATEDV = "updatedv";
    public static final String FIELD_UPDATEDVT = "UPDATEDVT";
    protected static final String DTOFIELD_UPDATEDVT = "updatedvt";
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

    @JsonProperty(value="cappslanresid")
    public void setCapPSLanResId(String capPSLanResId) {
        this._set(DTOFIELD_CAPPSLANRESID, capPSLanResId);
    }

    @JsonIgnore
    public String getCapPSLanResId() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResIdDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public void resetCapPSLanResId() {
        this._reset(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        } else {
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="cappslanresname")
    public void setCapPSLanResName(String capPSLanResName) {
        this._set(DTOFIELD_CAPPSLANRESNAME, capPSLanResName);
    }

    @JsonIgnore
    public String getCapPSLanResName() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResNameDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCapPSLanResName() {
        this._reset(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO cappslanresname(String capPSLanResName) {
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    @JsonProperty(value="caption")
    public void setCaption(String caption) {
        this._set(DTOFIELD_CAPTION, caption);
    }

    @JsonIgnore
    public String getCaption() {
        Object objValue = this._get(DTOFIELD_CAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCaptionDirty() {
        return this._contains(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public void resetCaption() {
        this._reset(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSDEDataImpItemDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @JsonProperty(value="createdv")
    public void setCreateDV(String createDV) {
        this._set(DTOFIELD_CREATEDV, createDV);
    }

    @JsonIgnore
    public String getCreateDV() {
        Object objValue = this._get(DTOFIELD_CREATEDV);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateDVDirty() {
        return this._contains(DTOFIELD_CREATEDV);
    }

    @JsonIgnore
    public void resetCreateDV() {
        this._reset(DTOFIELD_CREATEDV);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO createdv(String createDV) {
        this.setCreateDV(createDV);
        return this;
    }

    @JsonProperty(value="createdvt")
    public void setCreateDVT(String createDVT) {
        this._set(DTOFIELD_CREATEDVT, createDVT);
    }

    @JsonIgnore
    public String getCreateDVT() {
        Object objValue = this._get(DTOFIELD_CREATEDVT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateDVTDirty() {
        return this._contains(DTOFIELD_CREATEDVT);
    }

    @JsonIgnore
    public void resetCreateDVT() {
        this._reset(DTOFIELD_CREATEDVT);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO createdvt(String createDVT) {
        this.setCreateDVT(createDVT);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO createdvt(PSModelEnums.CreateDefaultValueType createDVT) {
        if (createDVT == null) {
            this.setCreateDVT(null);
        } else {
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDEDataImpItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="hiddendataitem")
    public void setHiddenDataItem(Integer hiddenDataItem) {
        this._set(DTOFIELD_HIDDENDATAITEM, hiddenDataItem);
    }

    @JsonIgnore
    public Integer getHiddenDataItem() {
        Object objValue = this._get(DTOFIELD_HIDDENDATAITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHiddenDataItemDirty() {
        return this._contains(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public void resetHiddenDataItem() {
        this._reset(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO hiddendataitem(Integer hiddenDataItem) {
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO hiddendataitem(Boolean hiddenDataItem) {
        if (hiddenDataItem == null) {
            this.setHiddenDataItem(null);
        } else {
            this.setHiddenDataItem(hiddenDataItem != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="keyflag")
    public void setKeyFlag(Integer keyFlag) {
        this._set(DTOFIELD_KEYFLAG, keyFlag);
    }

    @JsonIgnore
    public Integer getKeyFlag() {
        Object objValue = this._get(DTOFIELD_KEYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isKeyFlagDirty() {
        return this._contains(DTOFIELD_KEYFLAG);
    }

    @JsonIgnore
    public void resetKeyFlag() {
        this._reset(DTOFIELD_KEYFLAG);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO keyflag(Integer keyFlag) {
        this.setKeyFlag(keyFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO keyflag(Boolean keyFlag) {
        if (keyFlag == null) {
            this.setKeyFlag(null);
        } else {
            this.setKeyFlag(keyFlag != false ? 1 : 0);
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
    public PSDEDataImpItemDTO memo(String memo) {
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
    public PSDEDataImpItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdedataimpid")
    public void setPSDEDataImpId(String pSDEDataImpId) {
        this._set(DTOFIELD_PSDEDATAIMPID, pSDEDataImpId);
    }

    @JsonIgnore
    public String getPSDEDataImpId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPID);
    }

    @JsonIgnore
    public void resetPSDEDataImpId() {
        this._reset(DTOFIELD_PSDEDATAIMPID);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpid(String pSDEDataImpId) {
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp) {
        if (pSDEDataImp == null) {
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
            this.setPSDEId(pSDEDataImp.getPSDEId());
        }
        return this;
    }

    @JsonProperty(value="psdedataimpitemid")
    public void setPSDEDataImpItemId(String pSDEDataImpItemId) {
        this._set(DTOFIELD_PSDEDATAIMPITEMID, pSDEDataImpItemId);
    }

    @JsonIgnore
    public String getPSDEDataImpItemId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpItemIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPITEMID);
    }

    @JsonIgnore
    public void resetPSDEDataImpItemId() {
        this._reset(DTOFIELD_PSDEDATAIMPITEMID);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpitemid(String pSDEDataImpItemId) {
        this.setPSDEDataImpItemId(pSDEDataImpItemId);
        return this;
    }

    @JsonProperty(value="psdedataimpitemname")
    public void setPSDEDataImpItemName(String pSDEDataImpItemName) {
        this._set(DTOFIELD_PSDEDATAIMPITEMNAME, pSDEDataImpItemName);
    }

    @JsonIgnore
    public String getPSDEDataImpItemName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpItemNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPITEMNAME);
    }

    @JsonIgnore
    public void resetPSDEDataImpItemName() {
        this._reset(DTOFIELD_PSDEDATAIMPITEMNAME);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpitemname(String pSDEDataImpItemName) {
        this.setPSDEDataImpItemName(pSDEDataImpItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDataImpItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDataImpItemName(strName);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO name(String strName) {
        this.setPSDEDataImpItemName(strName);
        return this;
    }

    @JsonProperty(value="psdedataimpname")
    public void setPSDEDataImpName(String pSDEDataImpName) {
        this._set(DTOFIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }

    @JsonIgnore
    public String getPSDEDataImpName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPNAME);
    }

    @JsonIgnore
    public void resetPSDEDataImpName() {
        this._reset(DTOFIELD_PSDEDATAIMPNAME);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdedataimpname(String pSDEDataImpName) {
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSDEDataImpItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
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
    public PSDEDataImpItemDTO updatedate(Timestamp updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    @JsonProperty(value="updatedv")
    public void setUpdateDV(String updateDV) {
        this._set(DTOFIELD_UPDATEDV, updateDV);
    }

    @JsonIgnore
    public String getUpdateDV() {
        Object objValue = this._get(DTOFIELD_UPDATEDV);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDVDirty() {
        return this._contains(DTOFIELD_UPDATEDV);
    }

    @JsonIgnore
    public void resetUpdateDV() {
        this._reset(DTOFIELD_UPDATEDV);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO updatedv(String updateDV) {
        this.setUpdateDV(updateDV);
        return this;
    }

    @JsonProperty(value="updatedvt")
    public void setUpdateDVT(String updateDVT) {
        this._set(DTOFIELD_UPDATEDVT, updateDVT);
    }

    @JsonIgnore
    public String getUpdateDVT() {
        Object objValue = this._get(DTOFIELD_UPDATEDVT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDVTDirty() {
        return this._contains(DTOFIELD_UPDATEDVT);
    }

    @JsonIgnore
    public void resetUpdateDVT() {
        this._reset(DTOFIELD_UPDATEDVT);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO updatedvt(String updateDVT) {
        this.setUpdateDVT(updateDVT);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO updatedvt(PSModelEnums.CreateDefaultValueType updateDVT) {
        if (updateDVT == null) {
            this.setUpdateDVT(null);
        } else {
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDEDataImpItemDTO updateman(String updateMan) {
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
    public PSDEDataImpItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDataImpItemDTO usertag(String userTag) {
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
    public PSDEDataImpItemDTO usertag2(String userTag2) {
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
    public PSDEDataImpItemDTO usertag3(String userTag3) {
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
    public PSDEDataImpItemDTO usertag4(String userTag4) {
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
    public PSDEDataImpItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataImpItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDataImpItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDataImpItemId(strValue);
    }

    @JsonIgnore
    public PSDEDataImpItemDTO id(String strValue) {
        this.setPSDEDataImpItemId(strValue);
        return this;
    }
}
