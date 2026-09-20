package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCanvasDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCanvasModelDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSMODELID = "PSMODELID";
    protected static final String DTOFIELD_PSMODELID = "psmodelid";
    public static final String FIELD_PSMODELNAME = "PSMODELNAME";
    protected static final String DTOFIELD_PSMODELNAME = "psmodelname";
    public static final String FIELD_PSMODELTYPE = "PSMODELTYPE";
    protected static final String DTOFIELD_PSMODELTYPE = "psmodeltype";
    public static final String FIELD_PSSYSCANVASID = "PSSYSCANVASID";
    protected static final String DTOFIELD_PSSYSCANVASID = "pssyscanvasid";
    public static final String FIELD_PSSYSCANVASMODELID = "PSSYSCANVASMODELID";
    protected static final String DTOFIELD_PSSYSCANVASMODELID = "pssyscanvasmodelid";
    public static final String FIELD_PSSYSCANVASMODELNAME = "PSSYSCANVASMODELNAME";
    protected static final String DTOFIELD_PSSYSCANVASMODELNAME = "pssyscanvasmodelname";
    public static final String FIELD_PSSYSCANVASNAME = "PSSYSCANVASNAME";
    protected static final String DTOFIELD_PSSYSCANVASNAME = "pssyscanvasname";
    public static final String FIELD_SYMBOLNAME = "SYMBOLNAME";
    protected static final String DTOFIELD_SYMBOLNAME = "symbolname";
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
    public PSSysCanvasModelDTO createdate(Timestamp createDate) {
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
    public PSSysCanvasModelDTO createman(String createMan) {
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
    public PSSysCanvasModelDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psmodelid")
    public void setPSModelId(String pSModelId) {
        this._set(DTOFIELD_PSMODELID, pSModelId);
    }

    @JsonIgnore
    public String getPSModelId() {
        Object objValue = this._get(DTOFIELD_PSMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelIdDirty() {
        return this._contains(DTOFIELD_PSMODELID);
    }

    @JsonIgnore
    public void resetPSModelId() {
        this._reset(DTOFIELD_PSMODELID);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO psmodelid(String pSModelId) {
        this.setPSModelId(pSModelId);
        return this;
    }

    @JsonProperty(value="psmodelname")
    public void setPSModelName(String pSModelName) {
        this._set(DTOFIELD_PSMODELNAME, pSModelName);
    }

    @JsonIgnore
    public String getPSModelName() {
        Object objValue = this._get(DTOFIELD_PSMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelNameDirty() {
        return this._contains(DTOFIELD_PSMODELNAME);
    }

    @JsonIgnore
    public void resetPSModelName() {
        this._reset(DTOFIELD_PSMODELNAME);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO psmodelname(String pSModelName) {
        this.setPSModelName(pSModelName);
        return this;
    }

    @JsonProperty(value="psmodeltype")
    public void setPSModelType(String pSModelType) {
        this._set(DTOFIELD_PSMODELTYPE, pSModelType);
    }

    @JsonIgnore
    public String getPSModelType() {
        Object objValue = this._get(DTOFIELD_PSMODELTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelTypeDirty() {
        return this._contains(DTOFIELD_PSMODELTYPE);
    }

    @JsonIgnore
    public void resetPSModelType() {
        this._reset(DTOFIELD_PSMODELTYPE);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO psmodeltype(String pSModelType) {
        this.setPSModelType(pSModelType);
        return this;
    }

    @JsonProperty(value="pssyscanvasid")
    public void setPSSysCanvasId(String pSSysCanvasId) {
        this._set(DTOFIELD_PSSYSCANVASID, pSSysCanvasId);
    }

    @JsonIgnore
    public String getPSSysCanvasId() {
        Object objValue = this._get(DTOFIELD_PSSYSCANVASID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCanvasIdDirty() {
        return this._contains(DTOFIELD_PSSYSCANVASID);
    }

    @JsonIgnore
    public void resetPSSysCanvasId() {
        this._reset(DTOFIELD_PSSYSCANVASID);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasid(String pSSysCanvasId) {
        this.setPSSysCanvasId(pSSysCanvasId);
        return this;
    }

    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasid(PSSysCanvasDTO pSSysCanvas) {
        if (pSSysCanvas == null) {
            this.setPSSysCanvasId(null);
            this.setPSSysCanvasName(null);
        } else {
            this.setPSSysCanvasId(pSSysCanvas.getPSSysCanvasId());
            this.setPSSysCanvasName(pSSysCanvas.getPSSysCanvasName());
        }
        return this;
    }

    @JsonProperty(value="pssyscanvasmodelid")
    public void setPSSysCanvasModelId(String pSSysCanvasModelId) {
        this._set(DTOFIELD_PSSYSCANVASMODELID, pSSysCanvasModelId);
    }

    @JsonIgnore
    public String getPSSysCanvasModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSCANVASMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCanvasModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSCANVASMODELID);
    }

    @JsonIgnore
    public void resetPSSysCanvasModelId() {
        this._reset(DTOFIELD_PSSYSCANVASMODELID);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasmodelid(String pSSysCanvasModelId) {
        this.setPSSysCanvasModelId(pSSysCanvasModelId);
        return this;
    }

    @JsonProperty(value="pssyscanvasmodelname")
    public void setPSSysCanvasModelName(String pSSysCanvasModelName) {
        this._set(DTOFIELD_PSSYSCANVASMODELNAME, pSSysCanvasModelName);
    }

    @JsonIgnore
    public String getPSSysCanvasModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSCANVASMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCanvasModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSCANVASMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysCanvasModelName() {
        this._reset(DTOFIELD_PSSYSCANVASMODELNAME);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasmodelname(String pSSysCanvasModelName) {
        this.setPSSysCanvasModelName(pSSysCanvasModelName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCanvasModelName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCanvasModelName(strName);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO name(String strName) {
        this.setPSSysCanvasModelName(strName);
        return this;
    }

    @JsonProperty(value="pssyscanvasname")
    public void setPSSysCanvasName(String pSSysCanvasName) {
        this._set(DTOFIELD_PSSYSCANVASNAME, pSSysCanvasName);
    }

    @JsonIgnore
    public String getPSSysCanvasName() {
        Object objValue = this._get(DTOFIELD_PSSYSCANVASNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCanvasNameDirty() {
        return this._contains(DTOFIELD_PSSYSCANVASNAME);
    }

    @JsonIgnore
    public void resetPSSysCanvasName() {
        this._reset(DTOFIELD_PSSYSCANVASNAME);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasname(String pSSysCanvasName) {
        this.setPSSysCanvasName(pSSysCanvasName);
        return this;
    }

    @JsonProperty(value="symbolname")
    public void setSymbolName(String symbolName) {
        this._set(DTOFIELD_SYMBOLNAME, symbolName);
    }

    @JsonIgnore
    public String getSymbolName() {
        Object objValue = this._get(DTOFIELD_SYMBOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSymbolNameDirty() {
        return this._contains(DTOFIELD_SYMBOLNAME);
    }

    @JsonIgnore
    public void resetSymbolName() {
        this._reset(DTOFIELD_SYMBOLNAME);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO symbolname(String symbolName) {
        this.setSymbolName(symbolName);
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
    public PSSysCanvasModelDTO updatedate(Timestamp updateDate) {
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
    public PSSysCanvasModelDTO updateman(String updateMan) {
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
    public PSSysCanvasModelDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysCanvasModelDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysCanvasModelDTO usertag(String userTag) {
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
    public PSSysCanvasModelDTO usertag2(String userTag2) {
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
    public PSSysCanvasModelDTO usertag3(String userTag3) {
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
    public PSSysCanvasModelDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCanvasModelId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCanvasModelId(strValue);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO id(String strValue) {
        this.setPSSysCanvasModelId(strValue);
        return this;
    }
}
