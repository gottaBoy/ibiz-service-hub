package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEMainStateRSDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENTERPSDEACTIONID = "ENTERPSDEACTIONID";
    protected static final String DTOFIELD_ENTERPSDEACTIONID = "enterpsdeactionid";
    public static final String FIELD_ENTERPSDEACTIONNAME = "ENTERPSDEACTIONNAME";
    protected static final String DTOFIELD_ENTERPSDEACTIONNAME = "enterpsdeactionname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEXTPSDEMSID = "NEXTPSDEMSID";
    protected static final String DTOFIELD_NEXTPSDEMSID = "nextpsdemsid";
    public static final String FIELD_NEXTPSDEMSNAME = "NEXTPSDEMSNAME";
    protected static final String DTOFIELD_NEXTPSDEMSNAME = "nextpsdemsname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PREVPSDEMSID = "PREVPSDEMSID";
    protected static final String DTOFIELD_PREVPSDEMSID = "prevpsdemsid";
    public static final String FIELD_PREVPSDEMSNAME = "PREVPSDEMSNAME";
    protected static final String DTOFIELD_PREVPSDEMSNAME = "prevpsdemsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAINSTATERSID = "PSDEMAINSTATERSID";
    protected static final String DTOFIELD_PSDEMAINSTATERSID = "psdemainstatersid";
    public static final String FIELD_PSDEMAINSTATERSNAME = "PSDEMAINSTATERSNAME";
    protected static final String DTOFIELD_PSDEMAINSTATERSNAME = "psdemainstatersname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
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
    public PSDEMainStateRSDTO codename(String codeName) {
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
    public PSDEMainStateRSDTO createdate(Timestamp createDate) {
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
    public PSDEMainStateRSDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enterpsdeactionid")
    public void setEnterPSDEActionId(String enterPSDEActionId) {
        this._set(DTOFIELD_ENTERPSDEACTIONID, enterPSDEActionId);
    }

    @JsonIgnore
    public String getEnterPSDEActionId() {
        Object objValue = this._get(DTOFIELD_ENTERPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnterPSDEActionIdDirty() {
        return this._contains(DTOFIELD_ENTERPSDEACTIONID);
    }

    @JsonIgnore
    public void resetEnterPSDEActionId() {
        this._reset(DTOFIELD_ENTERPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO enterpsdeactionid(String enterPSDEActionId) {
        this.setEnterPSDEActionId(enterPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateRSDTO enterpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setEnterPSDEActionId(null);
            this.setEnterPSDEActionName(null);
        } else {
            this.setEnterPSDEActionId(pSDEAction.getPSDEActionId());
            this.setEnterPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="enterpsdeactionname")
    public void setEnterPSDEActionName(String enterPSDEActionName) {
        this._set(DTOFIELD_ENTERPSDEACTIONNAME, enterPSDEActionName);
    }

    @JsonIgnore
    public String getEnterPSDEActionName() {
        Object objValue = this._get(DTOFIELD_ENTERPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnterPSDEActionNameDirty() {
        return this._contains(DTOFIELD_ENTERPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetEnterPSDEActionName() {
        this._reset(DTOFIELD_ENTERPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO enterpsdeactionname(String enterPSDEActionName) {
        this.setEnterPSDEActionName(enterPSDEActionName);
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
    public PSDEMainStateRSDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nextpsdemsid")
    public void setNextPSDEMSId(String nextPSDEMSId) {
        this._set(DTOFIELD_NEXTPSDEMSID, nextPSDEMSId);
    }

    @JsonIgnore
    public String getNextPSDEMSId() {
        Object objValue = this._get(DTOFIELD_NEXTPSDEMSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSDEMSIdDirty() {
        return this._contains(DTOFIELD_NEXTPSDEMSID);
    }

    @JsonIgnore
    public void resetNextPSDEMSId() {
        this._reset(DTOFIELD_NEXTPSDEMSID);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO nextpsdemsid(String nextPSDEMSId) {
        this.setNextPSDEMSId(nextPSDEMSId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateRSDTO nextpsdemsid(PSDEMainStateDTO pSDEMainState) {
        if (pSDEMainState == null) {
            this.setNextPSDEMSId(null);
            this.setNextPSDEMSName(null);
        } else {
            this.setNextPSDEMSId(pSDEMainState.getPSDEMainStateId());
            this.setNextPSDEMSName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    @JsonProperty(value="nextpsdemsname")
    public void setNextPSDEMSName(String nextPSDEMSName) {
        this._set(DTOFIELD_NEXTPSDEMSNAME, nextPSDEMSName);
    }

    @JsonIgnore
    public String getNextPSDEMSName() {
        Object objValue = this._get(DTOFIELD_NEXTPSDEMSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSDEMSNameDirty() {
        return this._contains(DTOFIELD_NEXTPSDEMSNAME);
    }

    @JsonIgnore
    public void resetNextPSDEMSName() {
        this._reset(DTOFIELD_NEXTPSDEMSNAME);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO nextpsdemsname(String nextPSDEMSName) {
        this.setNextPSDEMSName(nextPSDEMSName);
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
    public PSDEMainStateRSDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="prevpsdemsid")
    public void setPrevPSDEMSId(String prevPSDEMSId) {
        this._set(DTOFIELD_PREVPSDEMSID, prevPSDEMSId);
    }

    @JsonIgnore
    public String getPrevPSDEMSId() {
        Object objValue = this._get(DTOFIELD_PREVPSDEMSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevPSDEMSIdDirty() {
        return this._contains(DTOFIELD_PREVPSDEMSID);
    }

    @JsonIgnore
    public void resetPrevPSDEMSId() {
        this._reset(DTOFIELD_PREVPSDEMSID);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO prevpsdemsid(String prevPSDEMSId) {
        this.setPrevPSDEMSId(prevPSDEMSId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateRSDTO prevpsdemsid(PSDEMainStateDTO pSDEMainState) {
        if (pSDEMainState == null) {
            this.setPrevPSDEMSId(null);
            this.setPrevPSDEMSName(null);
        } else {
            this.setPrevPSDEMSId(pSDEMainState.getPSDEMainStateId());
            this.setPrevPSDEMSName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    @JsonProperty(value="prevpsdemsname")
    public void setPrevPSDEMSName(String prevPSDEMSName) {
        this._set(DTOFIELD_PREVPSDEMSNAME, prevPSDEMSName);
    }

    @JsonIgnore
    public String getPrevPSDEMSName() {
        Object objValue = this._get(DTOFIELD_PREVPSDEMSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevPSDEMSNameDirty() {
        return this._contains(DTOFIELD_PREVPSDEMSNAME);
    }

    @JsonIgnore
    public void resetPrevPSDEMSName() {
        this._reset(DTOFIELD_PREVPSDEMSNAME);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO prevpsdemsname(String prevPSDEMSName) {
        this.setPrevPSDEMSName(prevPSDEMSName);
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
    public PSDEMainStateRSDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateRSDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstatersid")
    public void setPSDEMainStateRSId(String pSDEMainStateRSId) {
        this._set(DTOFIELD_PSDEMAINSTATERSID, pSDEMainStateRSId);
    }

    @JsonIgnore
    public String getPSDEMainStateRSId() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATERSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateRSIdDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATERSID);
    }

    @JsonIgnore
    public void resetPSDEMainStateRSId() {
        this._reset(DTOFIELD_PSDEMAINSTATERSID);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO psdemainstatersid(String pSDEMainStateRSId) {
        this.setPSDEMainStateRSId(pSDEMainStateRSId);
        return this;
    }

    @JsonProperty(value="psdemainstatersname")
    public void setPSDEMainStateRSName(String pSDEMainStateRSName) {
        this._set(DTOFIELD_PSDEMAINSTATERSNAME, pSDEMainStateRSName);
    }

    @JsonIgnore
    public String getPSDEMainStateRSName() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATERSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateRSNameDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATERSNAME);
    }

    @JsonIgnore
    public void resetPSDEMainStateRSName() {
        this._reset(DTOFIELD_PSDEMAINSTATERSNAME);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO psdemainstatersname(String pSDEMainStateRSName) {
        this.setPSDEMainStateRSName(pSDEMainStateRSName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEMainStateRSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEMainStateRSName(strName);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO name(String strName) {
        this.setPSDEMainStateRSName(strName);
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
    public PSDEMainStateRSDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEMainStateRSDTO updatedate(Timestamp updateDate) {
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
    public PSDEMainStateRSDTO updateman(String updateMan) {
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
    public PSDEMainStateRSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateRSDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEMainStateRSDTO usertag(String userTag) {
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
    public PSDEMainStateRSDTO usertag2(String userTag2) {
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
    public PSDEMainStateRSDTO usertag3(String userTag3) {
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
    public PSDEMainStateRSDTO usertag4(String userTag4) {
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
    public PSDEMainStateRSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateRSDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEMainStateRSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEMainStateRSId(strValue);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO id(String strValue) {
        this.setPSDEMainStateRSId(strValue);
        return this;
    }
}
