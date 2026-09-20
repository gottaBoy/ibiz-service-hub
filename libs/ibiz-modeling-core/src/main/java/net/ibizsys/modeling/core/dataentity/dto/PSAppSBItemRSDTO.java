package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppSBItemRSDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CPSAPPSBITEMID = "CPSAPPSBITEMID";
    protected static final String DTOFIELD_CPSAPPSBITEMID = "cpsappsbitemid";
    public static final String FIELD_CPSAPPSBITEMNAME = "CPSAPPSBITEMNAME";
    protected static final String DTOFIELD_CPSAPPSBITEMNAME = "cpsappsbitemname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DSTENDPOINT = "DSTENDPOINT";
    protected static final String DTOFIELD_DSTENDPOINT = "dstendpoint";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSAPPSBITEMID = "PPSAPPSBITEMID";
    protected static final String DTOFIELD_PPSAPPSBITEMID = "ppsappsbitemid";
    public static final String FIELD_PPSAPPSBITEMNAME = "PPSAPPSBITEMNAME";
    protected static final String DTOFIELD_PPSAPPSBITEMNAME = "ppsappsbitemname";
    public static final String FIELD_PSAPPSBITEMRSID = "PSAPPSBITEMRSID";
    protected static final String DTOFIELD_PSAPPSBITEMRSID = "psappsbitemrsid";
    public static final String FIELD_PSAPPSBITEMRSNAME = "PSAPPSBITEMRSNAME";
    protected static final String DTOFIELD_PSAPPSBITEMRSNAME = "psappsbitemrsname";
    public static final String FIELD_PSAPPSTORYBOARDID = "PSAPPSTORYBOARDID";
    protected static final String DTOFIELD_PSAPPSTORYBOARDID = "psappstoryboardid";
    public static final String FIELD_PSAPPSTORYBOARDNAME = "PSAPPSTORYBOARDNAME";
    protected static final String DTOFIELD_PSAPPSTORYBOARDNAME = "psappstoryboardname";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSUSECASEID = "PSSYSUSERCASEID";
    protected static final String DTOFIELD_PSSYSUSECASEID = "pssysusecaseid";
    public static final String FIELD_PSSYSUSECASENAME = "PSSYSUSERCASENAME";
    protected static final String DTOFIELD_PSSYSUSECASENAME = "pssysusecasename";
    public static final String FIELD_RSTAG = "RSTAG";
    protected static final String DTOFIELD_RSTAG = "rstag";
    public static final String FIELD_RSTAG2 = "RSTAG2";
    protected static final String DTOFIELD_RSTAG2 = "rstag2";
    public static final String FIELD_RSTAG3 = "RSTAG3";
    protected static final String DTOFIELD_RSTAG3 = "rstag3";
    public static final String FIELD_RSTAG4 = "RSTAG4";
    protected static final String DTOFIELD_RSTAG4 = "rstag4";
    public static final String FIELD_RSTYPE = "RSTYPE";
    protected static final String DTOFIELD_RSTYPE = "rstype";
    public static final String FIELD_SRCENDPOINT = "SRCENDPOINT";
    protected static final String DTOFIELD_SRCENDPOINT = "srcendpoint";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERFLAG = "USERFLAG";
    protected static final String DTOFIELD_USERFLAG = "userflag";
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
    public PSAppSBItemRSDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="cpsappsbitemid")
    public void setCPSAppSBItemId(String cPSAppSBItemId) {
        this._set(DTOFIELD_CPSAPPSBITEMID, cPSAppSBItemId);
    }

    @JsonIgnore
    public String getCPSAppSBItemId() {
        Object objValue = this._get(DTOFIELD_CPSAPPSBITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSAppSBItemIdDirty() {
        return this._contains(DTOFIELD_CPSAPPSBITEMID);
    }

    @JsonIgnore
    public void resetCPSAppSBItemId() {
        this._reset(DTOFIELD_CPSAPPSBITEMID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO cpsappsbitemid(String cPSAppSBItemId) {
        this.setCPSAppSBItemId(cPSAppSBItemId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO cpsappsbitemid(PSAppSBItemDTO pSAppSBItem) {
        if (pSAppSBItem == null) {
            this.setCPSAppSBItemId(null);
            this.setCPSAppSBItemName(null);
        } else {
            this.setCPSAppSBItemId(pSAppSBItem.getPSAppSBItemId());
            this.setCPSAppSBItemName(pSAppSBItem.getPSAppSBItemName());
        }
        return this;
    }

    @JsonProperty(value="cpsappsbitemname")
    public void setCPSAppSBItemName(String cPSAppSBItemName) {
        this._set(DTOFIELD_CPSAPPSBITEMNAME, cPSAppSBItemName);
    }

    @JsonIgnore
    public String getCPSAppSBItemName() {
        Object objValue = this._get(DTOFIELD_CPSAPPSBITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSAppSBItemNameDirty() {
        return this._contains(DTOFIELD_CPSAPPSBITEMNAME);
    }

    @JsonIgnore
    public void resetCPSAppSBItemName() {
        this._reset(DTOFIELD_CPSAPPSBITEMNAME);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO cpsappsbitemname(String cPSAppSBItemName) {
        this.setCPSAppSBItemName(cPSAppSBItemName);
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
    public PSAppSBItemRSDTO createdate(Timestamp createDate) {
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
    public PSAppSBItemRSDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dstendpoint")
    public void setDstEndPoint(String dstEndPoint) {
        this._set(DTOFIELD_DSTENDPOINT, dstEndPoint);
    }

    @JsonIgnore
    public String getDstEndPoint() {
        Object objValue = this._get(DTOFIELD_DSTENDPOINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstEndPointDirty() {
        return this._contains(DTOFIELD_DSTENDPOINT);
    }

    @JsonIgnore
    public void resetDstEndPoint() {
        this._reset(DTOFIELD_DSTENDPOINT);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO dstendpoint(String dstEndPoint) {
        this.setDstEndPoint(dstEndPoint);
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
    public PSAppSBItemRSDTO memo(String memo) {
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
    public PSAppSBItemRSDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsappsbitemid")
    public void setPPSAppSBItemId(String pPSAppSBItemId) {
        this._set(DTOFIELD_PPSAPPSBITEMID, pPSAppSBItemId);
    }

    @JsonIgnore
    public String getPPSAppSBItemId() {
        Object objValue = this._get(DTOFIELD_PPSAPPSBITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAppSBItemIdDirty() {
        return this._contains(DTOFIELD_PPSAPPSBITEMID);
    }

    @JsonIgnore
    public void resetPPSAppSBItemId() {
        this._reset(DTOFIELD_PPSAPPSBITEMID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO ppsappsbitemid(String pPSAppSBItemId) {
        this.setPPSAppSBItemId(pPSAppSBItemId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO ppsappsbitemid(PSAppSBItemDTO pSAppSBItem) {
        if (pSAppSBItem == null) {
            this.setPPSAppSBItemId(null);
            this.setPPSAppSBItemName(null);
        } else {
            this.setPPSAppSBItemId(pSAppSBItem.getPSAppSBItemId());
            this.setPPSAppSBItemName(pSAppSBItem.getPSAppSBItemName());
        }
        return this;
    }

    @JsonProperty(value="ppsappsbitemname")
    public void setPPSAppSBItemName(String pPSAppSBItemName) {
        this._set(DTOFIELD_PPSAPPSBITEMNAME, pPSAppSBItemName);
    }

    @JsonIgnore
    public String getPPSAppSBItemName() {
        Object objValue = this._get(DTOFIELD_PPSAPPSBITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAppSBItemNameDirty() {
        return this._contains(DTOFIELD_PPSAPPSBITEMNAME);
    }

    @JsonIgnore
    public void resetPPSAppSBItemName() {
        this._reset(DTOFIELD_PPSAPPSBITEMNAME);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO ppsappsbitemname(String pPSAppSBItemName) {
        this.setPPSAppSBItemName(pPSAppSBItemName);
        return this;
    }

    @JsonProperty(value="psappsbitemrsid")
    public void setPSAppSBItemRSId(String pSAppSBItemRSId) {
        this._set(DTOFIELD_PSAPPSBITEMRSID, pSAppSBItemRSId);
    }

    @JsonIgnore
    public String getPSAppSBItemRSId() {
        Object objValue = this._get(DTOFIELD_PSAPPSBITEMRSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppSBItemRSIdDirty() {
        return this._contains(DTOFIELD_PSAPPSBITEMRSID);
    }

    @JsonIgnore
    public void resetPSAppSBItemRSId() {
        this._reset(DTOFIELD_PSAPPSBITEMRSID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO psappsbitemrsid(String pSAppSBItemRSId) {
        this.setPSAppSBItemRSId(pSAppSBItemRSId);
        return this;
    }

    @JsonProperty(value="psappsbitemrsname")
    public void setPSAppSBItemRSName(String pSAppSBItemRSName) {
        this._set(DTOFIELD_PSAPPSBITEMRSNAME, pSAppSBItemRSName);
    }

    @JsonIgnore
    public String getPSAppSBItemRSName() {
        Object objValue = this._get(DTOFIELD_PSAPPSBITEMRSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppSBItemRSNameDirty() {
        return this._contains(DTOFIELD_PSAPPSBITEMRSNAME);
    }

    @JsonIgnore
    public void resetPSAppSBItemRSName() {
        this._reset(DTOFIELD_PSAPPSBITEMRSNAME);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO psappsbitemrsname(String pSAppSBItemRSName) {
        this.setPSAppSBItemRSName(pSAppSBItemRSName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppSBItemRSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppSBItemRSName(strName);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO name(String strName) {
        this.setPSAppSBItemRSName(strName);
        return this;
    }

    @JsonProperty(value="psappstoryboardid")
    public void setPSAppStoryBoardId(String pSAppStoryBoardId) {
        this._set(DTOFIELD_PSAPPSTORYBOARDID, pSAppStoryBoardId);
    }

    @JsonIgnore
    public String getPSAppStoryBoardId() {
        Object objValue = this._get(DTOFIELD_PSAPPSTORYBOARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppStoryBoardIdDirty() {
        return this._contains(DTOFIELD_PSAPPSTORYBOARDID);
    }

    @JsonIgnore
    public void resetPSAppStoryBoardId() {
        this._reset(DTOFIELD_PSAPPSTORYBOARDID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO psappstoryboardid(String pSAppStoryBoardId) {
        this.setPSAppStoryBoardId(pSAppStoryBoardId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO psappstoryboardid(PSAppStoryBoardDTO pSAppStoryBoard) {
        if (pSAppStoryBoard == null) {
            this.setPSAppStoryBoardId(null);
            this.setPSAppStoryBoardName(null);
            this.setPSSysAppId(null);
        } else {
            this.setPSAppStoryBoardId(pSAppStoryBoard.getPSAppStoryBoardId());
            this.setPSAppStoryBoardName(pSAppStoryBoard.getPSAppStoryBoardName());
            this.setPSSysAppId(pSAppStoryBoard.getPSSysAppId());
        }
        return this;
    }

    @JsonProperty(value="psappstoryboardname")
    public void setPSAppStoryBoardName(String pSAppStoryBoardName) {
        this._set(DTOFIELD_PSAPPSTORYBOARDNAME, pSAppStoryBoardName);
    }

    @JsonIgnore
    public String getPSAppStoryBoardName() {
        Object objValue = this._get(DTOFIELD_PSAPPSTORYBOARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppStoryBoardNameDirty() {
        return this._contains(DTOFIELD_PSAPPSTORYBOARDNAME);
    }

    @JsonIgnore
    public void resetPSAppStoryBoardName() {
        this._reset(DTOFIELD_PSAPPSTORYBOARDNAME);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO psappstoryboardname(String pSAppStoryBoardName) {
        this.setPSAppStoryBoardName(pSAppStoryBoardName);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDynaInstId(String pSDynaInstId) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDynaInstId);
    }

    @JsonIgnore
    public String getPSDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDynaInstId() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysusecaseid")
    public void setPSSysUseCaseId(String pSSysUseCaseId) {
        this._set(DTOFIELD_PSSYSUSECASEID, pSSysUseCaseId);
        this._set(FIELD_PSSYSUSECASEID, pSSysUseCaseId);
    }

    @JsonIgnore
    public String getPSSysUseCaseId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSECASEID);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSECASEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty() {
        if (this._contains(DTOFIELD_PSSYSUSECASEID)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSECASEID);
    }

    @JsonIgnore
    public void resetPSSysUseCaseId() {
        this._reset(DTOFIELD_PSSYSUSECASEID);
        this._reset(FIELD_PSSYSUSECASEID);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO pssysusecaseid(String pSSysUseCaseId) {
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseId() {
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysUserCaseId(String pSSysUserCaseId) {
        this.setPSSysUseCaseId(pSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseIdDirty() {
        return this.isPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseId() {
        this.resetPSSysUseCaseId();
    }

    @JsonProperty(value="pssysusecasename")
    public void setPSSysUseCaseName(String pSSysUseCaseName) {
        this._set(DTOFIELD_PSSYSUSECASENAME, pSSysUseCaseName);
        this._set(FIELD_PSSYSUSECASENAME, pSSysUseCaseName);
    }

    @JsonIgnore
    public String getPSSysUseCaseName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSECASENAME);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSECASENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty() {
        if (this._contains(DTOFIELD_PSSYSUSECASENAME)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSECASENAME);
    }

    @JsonIgnore
    public void resetPSSysUseCaseName() {
        this._reset(DTOFIELD_PSSYSUSECASENAME);
        this._reset(FIELD_PSSYSUSECASENAME);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO pssysusecasename(String pSSysUseCaseName) {
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseName() {
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysUserCaseName(String pSSysUserCaseName) {
        this.setPSSysUseCaseName(pSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseNameDirty() {
        return this.isPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseName() {
        this.resetPSSysUseCaseName();
    }

    @JsonProperty(value="rstag")
    public void setRSTag(String rSTag) {
        this._set(DTOFIELD_RSTAG, rSTag);
    }

    @JsonIgnore
    public String getRSTag() {
        Object objValue = this._get(DTOFIELD_RSTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTagDirty() {
        return this._contains(DTOFIELD_RSTAG);
    }

    @JsonIgnore
    public void resetRSTag() {
        this._reset(DTOFIELD_RSTAG);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO rstag(String rSTag) {
        this.setRSTag(rSTag);
        return this;
    }

    @JsonProperty(value="rstag2")
    public void setRSTag2(String rSTag2) {
        this._set(DTOFIELD_RSTAG2, rSTag2);
    }

    @JsonIgnore
    public String getRSTag2() {
        Object objValue = this._get(DTOFIELD_RSTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTag2Dirty() {
        return this._contains(DTOFIELD_RSTAG2);
    }

    @JsonIgnore
    public void resetRSTag2() {
        this._reset(DTOFIELD_RSTAG2);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO rstag2(String rSTag2) {
        this.setRSTag2(rSTag2);
        return this;
    }

    @JsonProperty(value="rstag3")
    public void setRSTag3(String rSTag3) {
        this._set(DTOFIELD_RSTAG3, rSTag3);
    }

    @JsonIgnore
    public String getRSTag3() {
        Object objValue = this._get(DTOFIELD_RSTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTag3Dirty() {
        return this._contains(DTOFIELD_RSTAG3);
    }

    @JsonIgnore
    public void resetRSTag3() {
        this._reset(DTOFIELD_RSTAG3);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO rstag3(String rSTag3) {
        this.setRSTag3(rSTag3);
        return this;
    }

    @JsonProperty(value="rstag4")
    public void setRSTag4(String rSTag4) {
        this._set(DTOFIELD_RSTAG4, rSTag4);
    }

    @JsonIgnore
    public String getRSTag4() {
        Object objValue = this._get(DTOFIELD_RSTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTag4Dirty() {
        return this._contains(DTOFIELD_RSTAG4);
    }

    @JsonIgnore
    public void resetRSTag4() {
        this._reset(DTOFIELD_RSTAG4);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO rstag4(String rSTag4) {
        this.setRSTag4(rSTag4);
        return this;
    }

    @JsonProperty(value="rstype")
    public void setRSType(String rSType) {
        this._set(DTOFIELD_RSTYPE, rSType);
    }

    @JsonIgnore
    public String getRSType() {
        Object objValue = this._get(DTOFIELD_RSTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTypeDirty() {
        return this._contains(DTOFIELD_RSTYPE);
    }

    @JsonIgnore
    public void resetRSType() {
        this._reset(DTOFIELD_RSTYPE);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO rstype(String rSType) {
        this.setRSType(rSType);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO rstype(PSModelEnums.AppStoryBoardItemRSType rSType) {
        if (rSType == null) {
            this.setRSType(null);
        } else {
            this.setRSType(rSType.value);
        }
        return this;
    }

    @JsonProperty(value="srcendpoint")
    public void setSrcEndPoint(String srcEndPoint) {
        this._set(DTOFIELD_SRCENDPOINT, srcEndPoint);
    }

    @JsonIgnore
    public String getSrcEndPoint() {
        Object objValue = this._get(DTOFIELD_SRCENDPOINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcEndPointDirty() {
        return this._contains(DTOFIELD_SRCENDPOINT);
    }

    @JsonIgnore
    public void resetSrcEndPoint() {
        this._reset(DTOFIELD_SRCENDPOINT);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO srcendpoint(String srcEndPoint) {
        this.setSrcEndPoint(srcEndPoint);
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
    public PSAppSBItemRSDTO updatedate(Timestamp updateDate) {
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
    public PSAppSBItemRSDTO updateman(String updateMan) {
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
    public PSAppSBItemRSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userflag")
    public void setUserFlag(Integer userFlag) {
        this._set(DTOFIELD_USERFLAG, userFlag);
    }

    @JsonIgnore
    public Integer getUserFlag() {
        Object objValue = this._get(DTOFIELD_USERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserFlagDirty() {
        return this._contains(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public void resetUserFlag() {
        this._reset(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO userflag(Integer userFlag) {
        this.setUserFlag(userFlag);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO userflag(Boolean userFlag) {
        if (userFlag == null) {
            this.setUserFlag(null);
        } else {
            this.setUserFlag(userFlag != false ? 1 : 0);
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
    public PSAppSBItemRSDTO usertag(String userTag) {
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
    public PSAppSBItemRSDTO usertag2(String userTag2) {
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
    public PSAppSBItemRSDTO usertag3(String userTag3) {
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
    public PSAppSBItemRSDTO usertag4(String userTag4) {
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
    public PSAppSBItemRSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemRSDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppSBItemRSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppSBItemRSId(strValue);
    }

    @JsonIgnore
    public PSAppSBItemRSDTO id(String strValue) {
        this.setPSAppSBItemRSId(strValue);
        return this;
    }
}
