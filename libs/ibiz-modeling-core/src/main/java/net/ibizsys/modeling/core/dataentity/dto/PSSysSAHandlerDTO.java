package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSAHandlerDTO
extends PSModelDTOBase {
    public static final String FIELD_CLIENTHANDLEROBJ = "CLIENTHANDLEROBJ";
    protected static final String DTOFIELD_CLIENTHANDLEROBJ = "clienthandlerobj";
    public static final String FIELD_CLIENTHANDLEROBJ2 = "CLIENTHANDLEROBJ2";
    protected static final String DTOFIELD_CLIENTHANDLEROBJ2 = "clienthandlerobj2";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_HANDLEROBJ = "HANDLEROBJ";
    protected static final String DTOFIELD_HANDLEROBJ = "handlerobj";
    public static final String FIELD_HANDLEROBJ2 = "HANDLEROBJ2";
    protected static final String DTOFIELD_HANDLEROBJ2 = "handlerobj2";
    public static final String FIELD_HANDLERPARAMS = "HANDLERPARAMS";
    protected static final String DTOFIELD_HANDLERPARAMS = "handlerparams";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSFSAHANDLERID = "PSSFSAHANDLERID";
    protected static final String DTOFIELD_PSSFSAHANDLERID = "pssfsahandlerid";
    public static final String FIELD_PSSFSAHANDLERNAME = "PSSFSAHANDLERNAME";
    protected static final String DTOFIELD_PSSFSAHANDLERNAME = "pssfsahandlername";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSAHANDLERID = "PSSYSSAHANDLERID";
    protected static final String DTOFIELD_PSSYSSAHANDLERID = "pssyssahandlerid";
    public static final String FIELD_PSSYSSAHANDLERNAME = "PSSYSSAHANDLERNAME";
    protected static final String DTOFIELD_PSSYSSAHANDLERNAME = "pssyssahandlername";
    public static final String FIELD_SATYPE = "SATYPE";
    protected static final String DTOFIELD_SATYPE = "satype";
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

    @JsonProperty(value="clienthandlerobj")
    public void setClientHandlerObj(String clientHandlerObj) {
        this._set(DTOFIELD_CLIENTHANDLEROBJ, clientHandlerObj);
    }

    @JsonIgnore
    public String getClientHandlerObj() {
        Object objValue = this._get(DTOFIELD_CLIENTHANDLEROBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClientHandlerObjDirty() {
        return this._contains(DTOFIELD_CLIENTHANDLEROBJ);
    }

    @JsonIgnore
    public void resetClientHandlerObj() {
        this._reset(DTOFIELD_CLIENTHANDLEROBJ);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO clienthandlerobj(String clientHandlerObj) {
        this.setClientHandlerObj(clientHandlerObj);
        return this;
    }

    @JsonProperty(value="clienthandlerobj2")
    public void setClientHandlerObj2(String clientHandlerObj2) {
        this._set(DTOFIELD_CLIENTHANDLEROBJ2, clientHandlerObj2);
    }

    @JsonIgnore
    public String getClientHandlerObj2() {
        Object objValue = this._get(DTOFIELD_CLIENTHANDLEROBJ2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClientHandlerObj2Dirty() {
        return this._contains(DTOFIELD_CLIENTHANDLEROBJ2);
    }

    @JsonIgnore
    public void resetClientHandlerObj2() {
        this._reset(DTOFIELD_CLIENTHANDLEROBJ2);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO clienthandlerobj2(String clientHandlerObj2) {
        this.setClientHandlerObj2(clientHandlerObj2);
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
    public PSSysSAHandlerDTO codename(String codeName) {
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
    public PSSysSAHandlerDTO createdate(Timestamp createDate) {
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
    public PSSysSAHandlerDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="handlerobj")
    public void setHandlerObj(String handlerObj) {
        this._set(DTOFIELD_HANDLEROBJ, handlerObj);
    }

    @JsonIgnore
    public String getHandlerObj() {
        Object objValue = this._get(DTOFIELD_HANDLEROBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerObjDirty() {
        return this._contains(DTOFIELD_HANDLEROBJ);
    }

    @JsonIgnore
    public void resetHandlerObj() {
        this._reset(DTOFIELD_HANDLEROBJ);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO handlerobj(String handlerObj) {
        this.setHandlerObj(handlerObj);
        return this;
    }

    @JsonProperty(value="handlerobj2")
    public void setHandlerObj2(String handlerObj2) {
        this._set(DTOFIELD_HANDLEROBJ2, handlerObj2);
    }

    @JsonIgnore
    public String getHandlerObj2() {
        Object objValue = this._get(DTOFIELD_HANDLEROBJ2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerObj2Dirty() {
        return this._contains(DTOFIELD_HANDLEROBJ2);
    }

    @JsonIgnore
    public void resetHandlerObj2() {
        this._reset(DTOFIELD_HANDLEROBJ2);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO handlerobj2(String handlerObj2) {
        this.setHandlerObj2(handlerObj2);
        return this;
    }

    @JsonProperty(value="handlerparams")
    public void setHandlerParams(String handlerParams) {
        this._set(DTOFIELD_HANDLERPARAMS, handlerParams);
    }

    @JsonIgnore
    public String getHandlerParams() {
        Object objValue = this._get(DTOFIELD_HANDLERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerParamsDirty() {
        return this._contains(DTOFIELD_HANDLERPARAMS);
    }

    @JsonIgnore
    public void resetHandlerParams() {
        this._reset(DTOFIELD_HANDLERPARAMS);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO handlerparams(String handlerParams) {
        this.setHandlerParams(handlerParams);
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
    public PSSysSAHandlerDTO memo(String memo) {
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
    public PSSysSAHandlerDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysSAHandlerDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysSAHandlerDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssfsahandlerid")
    public void setPSSFSAHandlerId(String pSSFSAHandlerId) {
        this._set(DTOFIELD_PSSFSAHANDLERID, pSSFSAHandlerId);
    }

    @JsonIgnore
    public String getPSSFSAHandlerId() {
        Object objValue = this._get(DTOFIELD_PSSFSAHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFSAHandlerIdDirty() {
        return this._contains(DTOFIELD_PSSFSAHANDLERID);
    }

    @JsonIgnore
    public void resetPSSFSAHandlerId() {
        this._reset(DTOFIELD_PSSFSAHANDLERID);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO pssfsahandlerid(String pSSFSAHandlerId) {
        this.setPSSFSAHandlerId(pSSFSAHandlerId);
        return this;
    }

    @JsonProperty(value="pssfsahandlername")
    public void setPSSFSAHandlerName(String pSSFSAHandlerName) {
        this._set(DTOFIELD_PSSFSAHANDLERNAME, pSSFSAHandlerName);
    }

    @JsonIgnore
    public String getPSSFSAHandlerName() {
        Object objValue = this._get(DTOFIELD_PSSFSAHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFSAHandlerNameDirty() {
        return this._contains(DTOFIELD_PSSFSAHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSSFSAHandlerName() {
        this._reset(DTOFIELD_PSSFSAHANDLERNAME);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO pssfsahandlername(String pSSFSAHandlerName) {
        this.setPSSFSAHandlerName(pSSFSAHandlerName);
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
    public PSSysSAHandlerDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysSAHandlerDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysSAHandlerDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyssahandlerid")
    public void setPSSysSAHandlerId(String pSSysSAHandlerId) {
        this._set(DTOFIELD_PSSYSSAHANDLERID, pSSysSAHandlerId);
    }

    @JsonIgnore
    public String getPSSysSAHandlerId() {
        Object objValue = this._get(DTOFIELD_PSSYSSAHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSAHandlerIdDirty() {
        return this._contains(DTOFIELD_PSSYSSAHANDLERID);
    }

    @JsonIgnore
    public void resetPSSysSAHandlerId() {
        this._reset(DTOFIELD_PSSYSSAHANDLERID);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO pssyssahandlerid(String pSSysSAHandlerId) {
        this.setPSSysSAHandlerId(pSSysSAHandlerId);
        return this;
    }

    @JsonProperty(value="pssyssahandlername")
    public void setPSSysSAHandlerName(String pSSysSAHandlerName) {
        this._set(DTOFIELD_PSSYSSAHANDLERNAME, pSSysSAHandlerName);
    }

    @JsonIgnore
    public String getPSSysSAHandlerName() {
        Object objValue = this._get(DTOFIELD_PSSYSSAHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSAHandlerNameDirty() {
        return this._contains(DTOFIELD_PSSYSSAHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSSysSAHandlerName() {
        this._reset(DTOFIELD_PSSYSSAHANDLERNAME);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO pssyssahandlername(String pSSysSAHandlerName) {
        this.setPSSysSAHandlerName(pSSysSAHandlerName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSAHandlerName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSAHandlerName(strName);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO name(String strName) {
        this.setPSSysSAHandlerName(strName);
        return this;
    }

    @JsonProperty(value="satype")
    public void setSAType(String sAType) {
        this._set(DTOFIELD_SATYPE, sAType);
    }

    @JsonIgnore
    public String getSAType() {
        Object objValue = this._get(DTOFIELD_SATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSATypeDirty() {
        return this._contains(DTOFIELD_SATYPE);
    }

    @JsonIgnore
    public void resetSAType() {
        this._reset(DTOFIELD_SATYPE);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO satype(String sAType) {
        this.setSAType(sAType);
        return this;
    }

    @JsonIgnore
    public PSSysSAHandlerDTO satype(PSModelEnums.ServiceAPIPredefinedType sAType) {
        if (sAType == null) {
            this.setSAType(null);
        } else {
            this.setSAType(sAType.value);
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
    public PSSysSAHandlerDTO updatedate(Timestamp updateDate) {
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
    public PSSysSAHandlerDTO updateman(String updateMan) {
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
    public PSSysSAHandlerDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSAHandlerDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSAHandlerDTO usertag(String userTag) {
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
    public PSSysSAHandlerDTO usertag2(String userTag2) {
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
    public PSSysSAHandlerDTO usertag3(String userTag3) {
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
    public PSSysSAHandlerDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSAHandlerId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSAHandlerId(strValue);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO id(String strValue) {
        this.setPSSysSAHandlerId(strValue);
        return this;
    }
}
