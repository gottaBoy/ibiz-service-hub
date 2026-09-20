package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCanvasModelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCanvasDTO
extends PSModelDTOBase {
    public static final String FIELD_CANVASMODEL = "CANVASMODEL";
    protected static final String DTOFIELD_CANVASMODEL = "canvasmodel";
    public static final String FIELD_CANVASTAG = "CANVASTAG";
    protected static final String DTOFIELD_CANVASTAG = "canvastag";
    public static final String FIELD_CANVASTAG2 = "CANVASTAG2";
    protected static final String DTOFIELD_CANVASTAG2 = "canvastag2";
    public static final String FIELD_CANVASTAG3 = "CANVASTAG3";
    protected static final String DTOFIELD_CANVASTAG3 = "canvastag3";
    public static final String FIELD_CANVASTAG4 = "CANVASTAG4";
    protected static final String DTOFIELD_CANVASTAG4 = "canvastag4";
    public static final String FIELD_CANVASTYPE = "CANVASTYPE";
    protected static final String DTOFIELD_CANVASTYPE = "canvastype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSCANVASID = "PSSYSCANVASID";
    protected static final String DTOFIELD_PSSYSCANVASID = "pssyscanvasid";
    public static final String FIELD_PSSYSCANVASNAME = "PSSYSCANVASNAME";
    protected static final String DTOFIELD_PSSYSCANVASNAME = "pssyscanvasname";
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
    public static final String DTOFIELD_PSSYSCANVASMODELS = "pssyscanvasmodels";

    @JsonProperty(value="canvasmodel")
    public void setCanvasModel(String canvasModel) {
        this._set(DTOFIELD_CANVASMODEL, canvasModel);
    }

    @JsonIgnore
    public String getCanvasModel() {
        Object objValue = this._get(DTOFIELD_CANVASMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCanvasModelDirty() {
        return this._contains(DTOFIELD_CANVASMODEL);
    }

    @JsonIgnore
    public void resetCanvasModel() {
        this._reset(DTOFIELD_CANVASMODEL);
    }

    @JsonIgnore
    public PSSysCanvasDTO canvasmodel(String canvasModel) {
        this.setCanvasModel(canvasModel);
        return this;
    }

    @JsonProperty(value="canvastag")
    public void setCanvasTag(String canvasTag) {
        this._set(DTOFIELD_CANVASTAG, canvasTag);
    }

    @JsonIgnore
    public String getCanvasTag() {
        Object objValue = this._get(DTOFIELD_CANVASTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCanvasTagDirty() {
        return this._contains(DTOFIELD_CANVASTAG);
    }

    @JsonIgnore
    public void resetCanvasTag() {
        this._reset(DTOFIELD_CANVASTAG);
    }

    @JsonIgnore
    public PSSysCanvasDTO canvastag(String canvasTag) {
        this.setCanvasTag(canvasTag);
        return this;
    }

    @JsonProperty(value="canvastag2")
    public void setCanvasTag2(String canvasTag2) {
        this._set(DTOFIELD_CANVASTAG2, canvasTag2);
    }

    @JsonIgnore
    public String getCanvasTag2() {
        Object objValue = this._get(DTOFIELD_CANVASTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCanvasTag2Dirty() {
        return this._contains(DTOFIELD_CANVASTAG2);
    }

    @JsonIgnore
    public void resetCanvasTag2() {
        this._reset(DTOFIELD_CANVASTAG2);
    }

    @JsonIgnore
    public PSSysCanvasDTO canvastag2(String canvasTag2) {
        this.setCanvasTag2(canvasTag2);
        return this;
    }

    @JsonProperty(value="canvastag3")
    public void setCanvasTag3(String canvasTag3) {
        this._set(DTOFIELD_CANVASTAG3, canvasTag3);
    }

    @JsonIgnore
    public String getCanvasTag3() {
        Object objValue = this._get(DTOFIELD_CANVASTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCanvasTag3Dirty() {
        return this._contains(DTOFIELD_CANVASTAG3);
    }

    @JsonIgnore
    public void resetCanvasTag3() {
        this._reset(DTOFIELD_CANVASTAG3);
    }

    @JsonIgnore
    public PSSysCanvasDTO canvastag3(String canvasTag3) {
        this.setCanvasTag3(canvasTag3);
        return this;
    }

    @JsonProperty(value="canvastag4")
    public void setCanvasTag4(String canvasTag4) {
        this._set(DTOFIELD_CANVASTAG4, canvasTag4);
    }

    @JsonIgnore
    public String getCanvasTag4() {
        Object objValue = this._get(DTOFIELD_CANVASTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCanvasTag4Dirty() {
        return this._contains(DTOFIELD_CANVASTAG4);
    }

    @JsonIgnore
    public void resetCanvasTag4() {
        this._reset(DTOFIELD_CANVASTAG4);
    }

    @JsonIgnore
    public PSSysCanvasDTO canvastag4(String canvasTag4) {
        this.setCanvasTag4(canvasTag4);
        return this;
    }

    @JsonProperty(value="canvastype")
    public void setCanvasType(String canvasType) {
        this._set(DTOFIELD_CANVASTYPE, canvasType);
    }

    @JsonIgnore
    public String getCanvasType() {
        Object objValue = this._get(DTOFIELD_CANVASTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCanvasTypeDirty() {
        return this._contains(DTOFIELD_CANVASTYPE);
    }

    @JsonIgnore
    public void resetCanvasType() {
        this._reset(DTOFIELD_CANVASTYPE);
    }

    @JsonIgnore
    public PSSysCanvasDTO canvastype(String canvasType) {
        this.setCanvasType(canvasType);
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
    public PSSysCanvasDTO codename(String codeName) {
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
    public PSSysCanvasDTO createdate(Timestamp createDate) {
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
    public PSSysCanvasDTO createman(String createMan) {
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
    public PSSysCanvasDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysCanvasDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysCanvasDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysCanvasDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysCanvasDTO pssyscanvasid(String pSSysCanvasId) {
        this.setPSSysCanvasId(pSSysCanvasId);
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
    public PSSysCanvasDTO pssyscanvasname(String pSSysCanvasName) {
        this.setPSSysCanvasName(pSSysCanvasName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCanvasName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCanvasName(strName);
    }

    @JsonIgnore
    public PSSysCanvasDTO name(String strName) {
        this.setPSSysCanvasName(strName);
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
    public PSSysCanvasDTO updatedate(Timestamp updateDate) {
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
    public PSSysCanvasDTO updateman(String updateMan) {
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
    public PSSysCanvasDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysCanvasDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysCanvasDTO usertag(String userTag) {
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
    public PSSysCanvasDTO usertag2(String userTag2) {
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
    public PSSysCanvasDTO usertag3(String userTag3) {
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
    public PSSysCanvasDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCanvasId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCanvasId(strValue);
    }

    @JsonIgnore
    public PSSysCanvasDTO id(String strValue) {
        this.setPSSysCanvasId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysCanvasModelDTO> getPSSysCanvasModels() {
        Object list = this._get(DTOFIELD_PSSYSCANVASMODELS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyscanvasmodels")
    public void setPSSysCanvasModels(List<PSSysCanvasModelDTO> pssyscanvasmodels) {
        this._set(DTOFIELD_PSSYSCANVASMODELS, pssyscanvasmodels);
    }

    @JsonIgnore
    public List<PSSysCanvasModelDTO> getPSSysCanvasModelsIf() {
        Object list = this._get(DTOFIELD_PSSYSCANVASMODELS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSCANVASMODELS, list);
        }
        return (List)list;
    }
}
