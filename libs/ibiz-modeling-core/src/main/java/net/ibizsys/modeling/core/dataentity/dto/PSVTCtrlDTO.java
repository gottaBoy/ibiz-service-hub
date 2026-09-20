package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSVTCtrlDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLPARAM = "CTRLPARAM";
    protected static final String DTOFIELD_CTRLPARAM = "ctrlparam";
    public static final String FIELD_CTRLPARAM10 = "CTRLPARAM10";
    protected static final String DTOFIELD_CTRLPARAM10 = "ctrlparam10";
    public static final String FIELD_CTRLPARAM11 = "CTRLPARAM11";
    protected static final String DTOFIELD_CTRLPARAM11 = "ctrlparam11";
    public static final String FIELD_CTRLPARAM12 = "CTRLPARAM12";
    protected static final String DTOFIELD_CTRLPARAM12 = "ctrlparam12";
    public static final String FIELD_CTRLPARAM2 = "CTRLPARAM2";
    protected static final String DTOFIELD_CTRLPARAM2 = "ctrlparam2";
    public static final String FIELD_CTRLPARAM3 = "CTRLPARAM3";
    protected static final String DTOFIELD_CTRLPARAM3 = "ctrlparam3";
    public static final String FIELD_CTRLPARAM4 = "CTRLPARAM4";
    protected static final String DTOFIELD_CTRLPARAM4 = "ctrlparam4";
    public static final String FIELD_CTRLPARAM5 = "CTRLPARAM5";
    protected static final String DTOFIELD_CTRLPARAM5 = "ctrlparam5";
    public static final String FIELD_CTRLPARAM6 = "CTRLPARAM6";
    protected static final String DTOFIELD_CTRLPARAM6 = "ctrlparam6";
    public static final String FIELD_CTRLPARAM7 = "CTRLPARAM7";
    protected static final String DTOFIELD_CTRLPARAM7 = "ctrlparam7";
    public static final String FIELD_CTRLPARAM8 = "CTRLPARAM8";
    protected static final String DTOFIELD_CTRLPARAM8 = "ctrlparam8";
    public static final String FIELD_CTRLPARAM9 = "CTRLPARAM9";
    protected static final String DTOFIELD_CTRLPARAM9 = "ctrlparam9";
    public static final String FIELD_CTRLTYPE = "CTRLTYPE";
    protected static final String DTOFIELD_CTRLTYPE = "ctrltype";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_ENABLEDYNATOOL = "ENABLEDYNATOOL";
    protected static final String DTOFIELD_ENABLEDYNATOOL = "enabledynatool";
    public static final String FIELD_ENABLEVIEWACTIONS = "ENABLEVIEWACTIONS";
    protected static final String DTOFIELD_ENABLEVIEWACTIONS = "enableviewactions";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSSYSACHANDLERID = "PSSYSACHANDLERID";
    protected static final String DTOFIELD_PSSYSACHANDLERID = "pssysachandlerid";
    public static final String FIELD_PSSYSACHANDLERNAME = "PSSYSACHANDLERNAME";
    protected static final String DTOFIELD_PSSYSACHANDLERNAME = "pssysachandlername";
    public static final String FIELD_PSSYSTOOLBARID = "PSSYSTOOLBARID";
    protected static final String DTOFIELD_PSSYSTOOLBARID = "pssystoolbarid";
    public static final String FIELD_PSSYSTOOLBARNAME = "PSSYSTOOLBARNAME";
    protected static final String DTOFIELD_PSSYSTOOLBARNAME = "pssystoolbarname";
    public static final String FIELD_PSVIEWTYPEID = "PSVIEWTYPEID";
    protected static final String DTOFIELD_PSVIEWTYPEID = "psviewtypeid";
    public static final String FIELD_PSVIEWTYPENAME = "PSVIEWTYPENAME";
    protected static final String DTOFIELD_PSVIEWTYPENAME = "psviewtypename";
    public static final String FIELD_PSVTCTRLID = "PSVTCTRLID";
    protected static final String DTOFIELD_PSVTCTRLID = "psvtctrlid";
    public static final String FIELD_PSVTCTRLNAME = "PSVTCTRLNAME";
    protected static final String DTOFIELD_PSVTCTRLNAME = "psvtctrlname";
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
    public PSVTCtrlDTO createdate(Timestamp createDate) {
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
    public PSVTCtrlDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlparam")
    public void setCtrlParam(String ctrlParam) {
        this._set(DTOFIELD_CTRLPARAM, ctrlParam);
    }

    @JsonIgnore
    public String getCtrlParam() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParamDirty() {
        return this._contains(DTOFIELD_CTRLPARAM);
    }

    @JsonIgnore
    public void resetCtrlParam() {
        this._reset(DTOFIELD_CTRLPARAM);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam(String ctrlParam) {
        this.setCtrlParam(ctrlParam);
        return this;
    }

    @JsonProperty(value="ctrlparam10")
    public void setCtrlParam10(Double ctrlParam10) {
        this._set(DTOFIELD_CTRLPARAM10, ctrlParam10);
    }

    @JsonIgnore
    public Double getCtrlParam10() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam10Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM10);
    }

    @JsonIgnore
    public void resetCtrlParam10() {
        this._reset(DTOFIELD_CTRLPARAM10);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam10(Double ctrlParam10) {
        this.setCtrlParam10(ctrlParam10);
        return this;
    }

    @JsonProperty(value="ctrlparam11")
    public void setCtrlParam11(Integer ctrlParam11) {
        this._set(DTOFIELD_CTRLPARAM11, ctrlParam11);
    }

    @JsonIgnore
    public Integer getCtrlParam11() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM11);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam11Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM11);
    }

    @JsonIgnore
    public void resetCtrlParam11() {
        this._reset(DTOFIELD_CTRLPARAM11);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam11(Integer ctrlParam11) {
        this.setCtrlParam11(ctrlParam11);
        return this;
    }

    @JsonProperty(value="ctrlparam12")
    public void setCtrlParam12(Integer ctrlParam12) {
        this._set(DTOFIELD_CTRLPARAM12, ctrlParam12);
    }

    @JsonIgnore
    public Integer getCtrlParam12() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM12);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam12Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM12);
    }

    @JsonIgnore
    public void resetCtrlParam12() {
        this._reset(DTOFIELD_CTRLPARAM12);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam12(Integer ctrlParam12) {
        this.setCtrlParam12(ctrlParam12);
        return this;
    }

    @JsonProperty(value="ctrlparam2")
    public void setCtrlParam2(String ctrlParam2) {
        this._set(DTOFIELD_CTRLPARAM2, ctrlParam2);
    }

    @JsonIgnore
    public String getCtrlParam2() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam2Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM2);
    }

    @JsonIgnore
    public void resetCtrlParam2() {
        this._reset(DTOFIELD_CTRLPARAM2);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam2(String ctrlParam2) {
        this.setCtrlParam2(ctrlParam2);
        return this;
    }

    @JsonProperty(value="ctrlparam3")
    public void setCtrlParam3(String ctrlParam3) {
        this._set(DTOFIELD_CTRLPARAM3, ctrlParam3);
    }

    @JsonIgnore
    public String getCtrlParam3() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam3Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM3);
    }

    @JsonIgnore
    public void resetCtrlParam3() {
        this._reset(DTOFIELD_CTRLPARAM3);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam3(String ctrlParam3) {
        this.setCtrlParam3(ctrlParam3);
        return this;
    }

    @JsonProperty(value="ctrlparam4")
    public void setCtrlParam4(String ctrlParam4) {
        this._set(DTOFIELD_CTRLPARAM4, ctrlParam4);
    }

    @JsonIgnore
    public String getCtrlParam4() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam4Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM4);
    }

    @JsonIgnore
    public void resetCtrlParam4() {
        this._reset(DTOFIELD_CTRLPARAM4);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam4(String ctrlParam4) {
        this.setCtrlParam4(ctrlParam4);
        return this;
    }

    @JsonProperty(value="ctrlparam5")
    public void setCtrlParam5(Integer ctrlParam5) {
        this._set(DTOFIELD_CTRLPARAM5, ctrlParam5);
    }

    @JsonIgnore
    public Integer getCtrlParam5() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam5Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM5);
    }

    @JsonIgnore
    public void resetCtrlParam5() {
        this._reset(DTOFIELD_CTRLPARAM5);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam5(Integer ctrlParam5) {
        this.setCtrlParam5(ctrlParam5);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam5(Boolean ctrlParam5) {
        if (ctrlParam5 == null) {
            this.setCtrlParam5(null);
        } else {
            this.setCtrlParam5(ctrlParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ctrlparam6")
    public void setCtrlParam6(Integer ctrlParam6) {
        this._set(DTOFIELD_CTRLPARAM6, ctrlParam6);
    }

    @JsonIgnore
    public Integer getCtrlParam6() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam6Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM6);
    }

    @JsonIgnore
    public void resetCtrlParam6() {
        this._reset(DTOFIELD_CTRLPARAM6);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam6(Integer ctrlParam6) {
        this.setCtrlParam6(ctrlParam6);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam6(Boolean ctrlParam6) {
        if (ctrlParam6 == null) {
            this.setCtrlParam6(null);
        } else {
            this.setCtrlParam6(ctrlParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ctrlparam7")
    public void setCtrlParam7(Integer ctrlParam7) {
        this._set(DTOFIELD_CTRLPARAM7, ctrlParam7);
    }

    @JsonIgnore
    public Integer getCtrlParam7() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam7Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM7);
    }

    @JsonIgnore
    public void resetCtrlParam7() {
        this._reset(DTOFIELD_CTRLPARAM7);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam7(Integer ctrlParam7) {
        this.setCtrlParam7(ctrlParam7);
        return this;
    }

    @JsonProperty(value="ctrlparam8")
    public void setCtrlParam8(Integer ctrlParam8) {
        this._set(DTOFIELD_CTRLPARAM8, ctrlParam8);
    }

    @JsonIgnore
    public Integer getCtrlParam8() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam8Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM8);
    }

    @JsonIgnore
    public void resetCtrlParam8() {
        this._reset(DTOFIELD_CTRLPARAM8);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam8(Integer ctrlParam8) {
        this.setCtrlParam8(ctrlParam8);
        return this;
    }

    @JsonProperty(value="ctrlparam9")
    public void setCtrlParam9(Double ctrlParam9) {
        this._set(DTOFIELD_CTRLPARAM9, ctrlParam9);
    }

    @JsonIgnore
    public Double getCtrlParam9() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam9Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM9);
    }

    @JsonIgnore
    public void resetCtrlParam9() {
        this._reset(DTOFIELD_CTRLPARAM9);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrlparam9(Double ctrlParam9) {
        this.setCtrlParam9(ctrlParam9);
        return this;
    }

    @JsonProperty(value="ctrltype")
    public void setCtrlType(String ctrlType) {
        this._set(DTOFIELD_CTRLTYPE, ctrlType);
    }

    @JsonIgnore
    public String getCtrlType() {
        Object objValue = this._get(DTOFIELD_CTRLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlTypeDirty() {
        return this._contains(DTOFIELD_CTRLTYPE);
    }

    @JsonIgnore
    public void resetCtrlType() {
        this._reset(DTOFIELD_CTRLTYPE);
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrltype(String ctrlType) {
        this.setCtrlType(ctrlType);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO ctrltype(PSModelEnums.CtrlType ctrlType) {
        if (ctrlType == null) {
            this.setCtrlType(null);
        } else {
            this.setCtrlType(ctrlType.value);
        }
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSVTCtrlDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabledynatool")
    public void setEnableDynaTool(Integer enableDynaTool) {
        this._set(DTOFIELD_ENABLEDYNATOOL, enableDynaTool);
    }

    @JsonIgnore
    public Integer getEnableDynaTool() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNATOOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaToolDirty() {
        return this._contains(DTOFIELD_ENABLEDYNATOOL);
    }

    @JsonIgnore
    public void resetEnableDynaTool() {
        this._reset(DTOFIELD_ENABLEDYNATOOL);
    }

    @JsonIgnore
    public PSVTCtrlDTO enabledynatool(Integer enableDynaTool) {
        this.setEnableDynaTool(enableDynaTool);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO enabledynatool(Boolean enableDynaTool) {
        if (enableDynaTool == null) {
            this.setEnableDynaTool(null);
        } else {
            this.setEnableDynaTool(enableDynaTool != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableviewactions")
    public void setEnableViewActions(Integer enableViewActions) {
        this._set(DTOFIELD_ENABLEVIEWACTIONS, enableViewActions);
    }

    @JsonIgnore
    public Integer getEnableViewActions() {
        Object objValue = this._get(DTOFIELD_ENABLEVIEWACTIONS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableViewActionsDirty() {
        return this._contains(DTOFIELD_ENABLEVIEWACTIONS);
    }

    @JsonIgnore
    public void resetEnableViewActions() {
        this._reset(DTOFIELD_ENABLEVIEWACTIONS);
    }

    @JsonIgnore
    public PSVTCtrlDTO enableviewactions(Integer enableViewActions) {
        this.setEnableViewActions(enableViewActions);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO enableviewactions(Boolean enableViewActions) {
        if (enableViewActions == null) {
            this.setEnableViewActions(null);
        } else {
            this.setEnableViewActions(enableViewActions != false ? 1 : 0);
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
    public PSVTCtrlDTO memo(String memo) {
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
    public PSVTCtrlDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pssysachandlerid")
    public void setPSSysACHandlerId(String pSSysACHandlerId) {
        this._set(DTOFIELD_PSSYSACHANDLERID, pSSysACHandlerId);
    }

    @JsonIgnore
    public String getPSSysACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSSYSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSSYSACHANDLERID);
    }

    @JsonIgnore
    public void resetPSSysACHandlerId() {
        this._reset(DTOFIELD_PSSYSACHANDLERID);
    }

    @JsonIgnore
    public PSVTCtrlDTO pssysachandlerid(String pSSysACHandlerId) {
        this.setPSSysACHandlerId(pSSysACHandlerId);
        return this;
    }

    @JsonProperty(value="pssysachandlername")
    public void setPSSysACHandlerName(String pSSysACHandlerName) {
        this._set(DTOFIELD_PSSYSACHANDLERNAME, pSSysACHandlerName);
    }

    @JsonIgnore
    public String getPSSysACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSSYSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSSYSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSSysACHandlerName() {
        this._reset(DTOFIELD_PSSYSACHANDLERNAME);
    }

    @JsonIgnore
    public PSVTCtrlDTO pssysachandlername(String pSSysACHandlerName) {
        this.setPSSysACHandlerName(pSSysACHandlerName);
        return this;
    }

    @JsonProperty(value="pssystoolbarid")
    public void setPSSysToolbarId(String pSSysToolbarId) {
        this._set(DTOFIELD_PSSYSTOOLBARID, pSSysToolbarId);
    }

    @JsonIgnore
    public String getPSSysToolbarId() {
        Object objValue = this._get(DTOFIELD_PSSYSTOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysToolbarIdDirty() {
        return this._contains(DTOFIELD_PSSYSTOOLBARID);
    }

    @JsonIgnore
    public void resetPSSysToolbarId() {
        this._reset(DTOFIELD_PSSYSTOOLBARID);
    }

    @JsonIgnore
    public PSVTCtrlDTO pssystoolbarid(String pSSysToolbarId) {
        this.setPSSysToolbarId(pSSysToolbarId);
        return this;
    }

    @JsonProperty(value="pssystoolbarname")
    public void setPSSysToolbarName(String pSSysToolbarName) {
        this._set(DTOFIELD_PSSYSTOOLBARNAME, pSSysToolbarName);
    }

    @JsonIgnore
    public String getPSSysToolbarName() {
        Object objValue = this._get(DTOFIELD_PSSYSTOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysToolbarNameDirty() {
        return this._contains(DTOFIELD_PSSYSTOOLBARNAME);
    }

    @JsonIgnore
    public void resetPSSysToolbarName() {
        this._reset(DTOFIELD_PSSYSTOOLBARNAME);
    }

    @JsonIgnore
    public PSVTCtrlDTO pssystoolbarname(String pSSysToolbarName) {
        this.setPSSysToolbarName(pSSysToolbarName);
        return this;
    }

    @JsonProperty(value="psviewtypeid")
    public void setPSViewTypeId(String pSViewTypeId) {
        this._set(DTOFIELD_PSVIEWTYPEID, pSViewTypeId);
    }

    @JsonIgnore
    public String getPSViewTypeId() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeIdDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public void resetPSViewTypeId() {
        this._reset(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public PSVTCtrlDTO psviewtypeid(String pSViewTypeId) {
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO psviewtypeid(PSViewTypeDTO pSViewType) {
        if (pSViewType == null) {
            this.setPSViewTypeId(null);
            this.setPSViewTypeName(null);
        } else {
            this.setPSViewTypeId(pSViewType.getPSViewTypeId());
            this.setPSViewTypeName(pSViewType.getPSViewTypeName());
        }
        return this;
    }

    @JsonProperty(value="psviewtypename")
    public void setPSViewTypeName(String pSViewTypeName) {
        this._set(DTOFIELD_PSVIEWTYPENAME, pSViewTypeName);
    }

    @JsonIgnore
    public String getPSViewTypeName() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeNameDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public void resetPSViewTypeName() {
        this._reset(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public PSVTCtrlDTO psviewtypename(String pSViewTypeName) {
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    @JsonProperty(value="psvtctrlid")
    public void setPSVTCtrlId(String pSVTCtrlId) {
        this._set(DTOFIELD_PSVTCTRLID, pSVTCtrlId);
    }

    @JsonIgnore
    public String getPSVTCtrlId() {
        Object objValue = this._get(DTOFIELD_PSVTCTRLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVTCtrlIdDirty() {
        return this._contains(DTOFIELD_PSVTCTRLID);
    }

    @JsonIgnore
    public void resetPSVTCtrlId() {
        this._reset(DTOFIELD_PSVTCTRLID);
    }

    @JsonIgnore
    public PSVTCtrlDTO psvtctrlid(String pSVTCtrlId) {
        this.setPSVTCtrlId(pSVTCtrlId);
        return this;
    }

    @JsonProperty(value="psvtctrlname")
    public void setPSVTCtrlName(String pSVTCtrlName) {
        this._set(DTOFIELD_PSVTCTRLNAME, pSVTCtrlName);
    }

    @JsonIgnore
    public String getPSVTCtrlName() {
        Object objValue = this._get(DTOFIELD_PSVTCTRLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVTCtrlNameDirty() {
        return this._contains(DTOFIELD_PSVTCTRLNAME);
    }

    @JsonIgnore
    public void resetPSVTCtrlName() {
        this._reset(DTOFIELD_PSVTCTRLNAME);
    }

    @JsonIgnore
    public PSVTCtrlDTO psvtctrlname(String pSVTCtrlName) {
        this.setPSVTCtrlName(pSVTCtrlName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSVTCtrlName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSVTCtrlName(strName);
    }

    @JsonIgnore
    public PSVTCtrlDTO name(String strName) {
        this.setPSVTCtrlName(strName);
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
    public PSVTCtrlDTO updatedate(Timestamp updateDate) {
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
    public PSVTCtrlDTO updateman(String updateMan) {
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
    public PSVTCtrlDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSVTCtrlDTO usertag(String userTag) {
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
    public PSVTCtrlDTO usertag2(String userTag2) {
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
    public PSVTCtrlDTO usertag3(String userTag3) {
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
    public PSVTCtrlDTO usertag4(String userTag4) {
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
    public PSVTCtrlDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSVTCtrlDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSVTCtrlId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSVTCtrlId(strValue);
    }

    @JsonIgnore
    public PSVTCtrlDTO id(String strValue) {
        this.setPSVTCtrlId(strValue);
        return this;
    }
}
