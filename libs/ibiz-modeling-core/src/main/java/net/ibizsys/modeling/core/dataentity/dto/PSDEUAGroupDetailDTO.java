package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEUAGroupDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONLEVEL = "ACTIONLEVEL";
    protected static final String DTOFIELD_ACTIONLEVEL = "actionlevel";
    public static final String FIELD_ADDSEPARATOR = "ADDSEPARATOR";
    protected static final String DTOFIELD_ADDSEPARATOR = "addseparator";
    public static final String FIELD_AFTERCONTENT = "AFTERCONTENT";
    protected static final String DTOFIELD_AFTERCONTENT = "aftercontent";
    public static final String FIELD_AFTERITEMTYPE = "AFTERITEMTYPE";
    protected static final String DTOFIELD_AFTERITEMTYPE = "afteritemtype";
    public static final String FIELD_AFTERPSSYSCSSID = "AFTERPSSYSCSSID";
    protected static final String DTOFIELD_AFTERPSSYSCSSID = "afterpssyscssid";
    public static final String FIELD_AFTERPSSYSCSSNAME = "AFTERPSSYSCSSNAME";
    protected static final String DTOFIELD_AFTERPSSYSCSSNAME = "afterpssyscssname";
    public static final String FIELD_AFTERPSSYSRESOURCEID = "AFTERPSSYSRESOURCEID";
    protected static final String DTOFIELD_AFTERPSSYSRESOURCEID = "afterpssysresourceid";
    public static final String FIELD_AFTERPSSYSRESOURCENAME = "AFTERPSSYSRESOURCENAME";
    protected static final String DTOFIELD_AFTERPSSYSRESOURCENAME = "afterpssysresourcename";
    public static final String FIELD_BEFORECONTENT = "BEFORECONTENT";
    protected static final String DTOFIELD_BEFORECONTENT = "beforecontent";
    public static final String FIELD_BEFOREITEMTYPE = "BEFOREITEMTYPE";
    protected static final String DTOFIELD_BEFOREITEMTYPE = "beforeitemtype";
    public static final String FIELD_BEFOREPSSYSCSSID = "BEFOREPSSYSCSSID";
    protected static final String DTOFIELD_BEFOREPSSYSCSSID = "beforepssyscssid";
    public static final String FIELD_BEFOREPSSYSCSSNAME = "BEFOREPSSYSCSSNAME";
    protected static final String DTOFIELD_BEFOREPSSYSCSSNAME = "beforepssyscssname";
    public static final String FIELD_BEFOREPSSYSRESOURCEID = "BEFOREPSSYSRESOURCEID";
    protected static final String DTOFIELD_BEFOREPSSYSRESOURCEID = "beforepssysresourceid";
    public static final String FIELD_BEFOREPSSYSRESOURCENAME = "BEFOREPSSYSRESOURCENAME";
    protected static final String DTOFIELD_BEFOREPSSYSRESOURCENAME = "beforepssysresourcename";
    public static final String FIELD_BUTTONSTYLE = "BUTTONSTYLE";
    protected static final String DTOFIELD_BUTTONSTYLE = "buttonstyle";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DETAILTAG = "DETAILTAG";
    protected static final String DTOFIELD_DETAILTAG = "detailtag";
    public static final String FIELD_DETAILTAG2 = "DETAILTAG2";
    protected static final String DTOFIELD_DETAILTAG2 = "detailtag2";
    public static final String FIELD_DETAILTYPE = "DETAILTYPE";
    protected static final String DTOFIELD_DETAILTYPE = "detailtype";
    public static final String FIELD_ENABLELOGIC = "ENABLELOGIC";
    protected static final String DTOFIELD_ENABLELOGIC = "enablelogic";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEUAGRPDETAILID = "PSDEUAGRPDETAILID";
    protected static final String DTOFIELD_PSDEUAGRPDETAILID = "psdeuagrpdetailid";
    public static final String FIELD_PSDEUAGRPDETAILNAME = "PSDEUAGRPDETAILNAME";
    protected static final String DTOFIELD_PSDEUAGRPDETAILNAME = "psdeuagrpdetailname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_SHOWMODE = "SHOWMODE";
    protected static final String DTOFIELD_SHOWMODE = "showmode";
    public static final String FIELD_UACAPTION = "UACAPTION";
    protected static final String DTOFIELD_UACAPTION = "uacaption";
    public static final String FIELD_UIACTIONPARAMS = "UIACTIONPARAMS";
    protected static final String DTOFIELD_UIACTIONPARAMS = "uiactionparams";
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
    public static final String FIELD_VISIBLELOGIC = "VISIBLELOGIC";
    protected static final String DTOFIELD_VISIBLELOGIC = "visiblelogic";

    @JsonProperty(value="actionlevel")
    public void setActionLevel(Integer actionLevel) {
        this._set(DTOFIELD_ACTIONLEVEL, actionLevel);
    }

    @JsonIgnore
    public Integer getActionLevel() {
        Object objValue = this._get(DTOFIELD_ACTIONLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionLevelDirty() {
        return this._contains(DTOFIELD_ACTIONLEVEL);
    }

    @JsonIgnore
    public void resetActionLevel() {
        this._reset(DTOFIELD_ACTIONLEVEL);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO actionlevel(Integer actionLevel) {
        this.setActionLevel(actionLevel);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO actionlevel(PSModelEnums.UIActionLevel actionLevel) {
        if (actionLevel == null) {
            this.setActionLevel(null);
        } else {
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    @JsonProperty(value="addseparator")
    public void setAddSeparator(Integer addSeparator) {
        this._set(DTOFIELD_ADDSEPARATOR, addSeparator);
    }

    @JsonIgnore
    public Integer getAddSeparator() {
        Object objValue = this._get(DTOFIELD_ADDSEPARATOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAddSeparatorDirty() {
        return this._contains(DTOFIELD_ADDSEPARATOR);
    }

    @JsonIgnore
    public void resetAddSeparator() {
        this._reset(DTOFIELD_ADDSEPARATOR);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO addseparator(Integer addSeparator) {
        this.setAddSeparator(addSeparator);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO addseparator(Boolean addSeparator) {
        if (addSeparator == null) {
            this.setAddSeparator(null);
        } else {
            this.setAddSeparator(addSeparator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="aftercontent")
    public void setAfterContent(String afterContent) {
        this._set(DTOFIELD_AFTERCONTENT, afterContent);
    }

    @JsonIgnore
    public String getAfterContent() {
        Object objValue = this._get(DTOFIELD_AFTERCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterContentDirty() {
        return this._contains(DTOFIELD_AFTERCONTENT);
    }

    @JsonIgnore
    public void resetAfterContent() {
        this._reset(DTOFIELD_AFTERCONTENT);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO aftercontent(String afterContent) {
        this.setAfterContent(afterContent);
        return this;
    }

    @JsonProperty(value="afteritemtype")
    public void setAfterItemType(String afterItemType) {
        this._set(DTOFIELD_AFTERITEMTYPE, afterItemType);
    }

    @JsonIgnore
    public String getAfterItemType() {
        Object objValue = this._get(DTOFIELD_AFTERITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterItemTypeDirty() {
        return this._contains(DTOFIELD_AFTERITEMTYPE);
    }

    @JsonIgnore
    public void resetAfterItemType() {
        this._reset(DTOFIELD_AFTERITEMTYPE);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afteritemtype(String afterItemType) {
        this.setAfterItemType(afterItemType);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afteritemtype(PSModelEnums.UAGroupDetailAppendItemType afterItemType) {
        if (afterItemType == null) {
            this.setAfterItemType(null);
        } else {
            this.setAfterItemType(afterItemType.value);
        }
        return this;
    }

    @JsonProperty(value="afterpssyscssid")
    public void setAfterPSSysCssId(String afterPSSysCssId) {
        this._set(DTOFIELD_AFTERPSSYSCSSID, afterPSSysCssId);
    }

    @JsonIgnore
    public String getAfterPSSysCssId() {
        Object objValue = this._get(DTOFIELD_AFTERPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterPSSysCssIdDirty() {
        return this._contains(DTOFIELD_AFTERPSSYSCSSID);
    }

    @JsonIgnore
    public void resetAfterPSSysCssId() {
        this._reset(DTOFIELD_AFTERPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afterpssyscssid(String afterPSSysCssId) {
        this.setAfterPSSysCssId(afterPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afterpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setAfterPSSysCssId(null);
            this.setAfterPSSysCssName(null);
        } else {
            this.setAfterPSSysCssId(pSSysCss.getPSSysCssId());
            this.setAfterPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="afterpssyscssname")
    public void setAfterPSSysCssName(String afterPSSysCssName) {
        this._set(DTOFIELD_AFTERPSSYSCSSNAME, afterPSSysCssName);
    }

    @JsonIgnore
    public String getAfterPSSysCssName() {
        Object objValue = this._get(DTOFIELD_AFTERPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterPSSysCssNameDirty() {
        return this._contains(DTOFIELD_AFTERPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetAfterPSSysCssName() {
        this._reset(DTOFIELD_AFTERPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afterpssyscssname(String afterPSSysCssName) {
        this.setAfterPSSysCssName(afterPSSysCssName);
        return this;
    }

    @JsonProperty(value="afterpssysresourceid")
    public void setAfterPSSysResourceId(String afterPSSysResourceId) {
        this._set(DTOFIELD_AFTERPSSYSRESOURCEID, afterPSSysResourceId);
    }

    @JsonIgnore
    public String getAfterPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_AFTERPSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_AFTERPSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetAfterPSSysResourceId() {
        this._reset(DTOFIELD_AFTERPSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afterpssysresourceid(String afterPSSysResourceId) {
        this.setAfterPSSysResourceId(afterPSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afterpssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setAfterPSSysResourceId(null);
            this.setAfterPSSysResourceName(null);
        } else {
            this.setAfterPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setAfterPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="afterpssysresourcename")
    public void setAfterPSSysResourceName(String afterPSSysResourceName) {
        this._set(DTOFIELD_AFTERPSSYSRESOURCENAME, afterPSSysResourceName);
    }

    @JsonIgnore
    public String getAfterPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_AFTERPSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_AFTERPSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetAfterPSSysResourceName() {
        this._reset(DTOFIELD_AFTERPSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO afterpssysresourcename(String afterPSSysResourceName) {
        this.setAfterPSSysResourceName(afterPSSysResourceName);
        return this;
    }

    @JsonProperty(value="beforecontent")
    public void setBeforeContent(String beforeContent) {
        this._set(DTOFIELD_BEFORECONTENT, beforeContent);
    }

    @JsonIgnore
    public String getBeforeContent() {
        Object objValue = this._get(DTOFIELD_BEFORECONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforeContentDirty() {
        return this._contains(DTOFIELD_BEFORECONTENT);
    }

    @JsonIgnore
    public void resetBeforeContent() {
        this._reset(DTOFIELD_BEFORECONTENT);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforecontent(String beforeContent) {
        this.setBeforeContent(beforeContent);
        return this;
    }

    @JsonProperty(value="beforeitemtype")
    public void setBeforeItemType(String beforeItemType) {
        this._set(DTOFIELD_BEFOREITEMTYPE, beforeItemType);
    }

    @JsonIgnore
    public String getBeforeItemType() {
        Object objValue = this._get(DTOFIELD_BEFOREITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforeItemTypeDirty() {
        return this._contains(DTOFIELD_BEFOREITEMTYPE);
    }

    @JsonIgnore
    public void resetBeforeItemType() {
        this._reset(DTOFIELD_BEFOREITEMTYPE);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforeitemtype(String beforeItemType) {
        this.setBeforeItemType(beforeItemType);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforeitemtype(PSModelEnums.UAGroupDetailAppendItemType beforeItemType) {
        if (beforeItemType == null) {
            this.setBeforeItemType(null);
        } else {
            this.setBeforeItemType(beforeItemType.value);
        }
        return this;
    }

    @JsonProperty(value="beforepssyscssid")
    public void setBeforePSSysCssId(String beforePSSysCssId) {
        this._set(DTOFIELD_BEFOREPSSYSCSSID, beforePSSysCssId);
    }

    @JsonIgnore
    public String getBeforePSSysCssId() {
        Object objValue = this._get(DTOFIELD_BEFOREPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforePSSysCssIdDirty() {
        return this._contains(DTOFIELD_BEFOREPSSYSCSSID);
    }

    @JsonIgnore
    public void resetBeforePSSysCssId() {
        this._reset(DTOFIELD_BEFOREPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforepssyscssid(String beforePSSysCssId) {
        this.setBeforePSSysCssId(beforePSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforepssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setBeforePSSysCssId(null);
            this.setBeforePSSysCssName(null);
        } else {
            this.setBeforePSSysCssId(pSSysCss.getPSSysCssId());
            this.setBeforePSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="beforepssyscssname")
    public void setBeforePSSysCssName(String beforePSSysCssName) {
        this._set(DTOFIELD_BEFOREPSSYSCSSNAME, beforePSSysCssName);
    }

    @JsonIgnore
    public String getBeforePSSysCssName() {
        Object objValue = this._get(DTOFIELD_BEFOREPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforePSSysCssNameDirty() {
        return this._contains(DTOFIELD_BEFOREPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetBeforePSSysCssName() {
        this._reset(DTOFIELD_BEFOREPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforepssyscssname(String beforePSSysCssName) {
        this.setBeforePSSysCssName(beforePSSysCssName);
        return this;
    }

    @JsonProperty(value="beforepssysresourceid")
    public void setBeforePSSysResourceId(String beforePSSysResourceId) {
        this._set(DTOFIELD_BEFOREPSSYSRESOURCEID, beforePSSysResourceId);
    }

    @JsonIgnore
    public String getBeforePSSysResourceId() {
        Object objValue = this._get(DTOFIELD_BEFOREPSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforePSSysResourceIdDirty() {
        return this._contains(DTOFIELD_BEFOREPSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetBeforePSSysResourceId() {
        this._reset(DTOFIELD_BEFOREPSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforepssysresourceid(String beforePSSysResourceId) {
        this.setBeforePSSysResourceId(beforePSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforepssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setBeforePSSysResourceId(null);
            this.setBeforePSSysResourceName(null);
        } else {
            this.setBeforePSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setBeforePSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="beforepssysresourcename")
    public void setBeforePSSysResourceName(String beforePSSysResourceName) {
        this._set(DTOFIELD_BEFOREPSSYSRESOURCENAME, beforePSSysResourceName);
    }

    @JsonIgnore
    public String getBeforePSSysResourceName() {
        Object objValue = this._get(DTOFIELD_BEFOREPSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforePSSysResourceNameDirty() {
        return this._contains(DTOFIELD_BEFOREPSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetBeforePSSysResourceName() {
        this._reset(DTOFIELD_BEFOREPSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO beforepssysresourcename(String beforePSSysResourceName) {
        this.setBeforePSSysResourceName(beforePSSysResourceName);
        return this;
    }

    @JsonProperty(value="buttonstyle")
    public void setButtonStyle(String buttonStyle) {
        this._set(DTOFIELD_BUTTONSTYLE, buttonStyle);
    }

    @JsonIgnore
    public String getButtonStyle() {
        Object objValue = this._get(DTOFIELD_BUTTONSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isButtonStyleDirty() {
        return this._contains(DTOFIELD_BUTTONSTYLE);
    }

    @JsonIgnore
    public void resetButtonStyle() {
        this._reset(DTOFIELD_BUTTONSTYLE);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO buttonstyle(String buttonStyle) {
        this.setButtonStyle(buttonStyle);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO buttonstyle(PSModelEnums.ButtonStyle buttonStyle) {
        if (buttonStyle == null) {
            this.setButtonStyle(null);
        } else {
            this.setButtonStyle(buttonStyle.value);
        }
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
    public PSDEUAGroupDetailDTO codename(String codeName) {
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
    public PSDEUAGroupDetailDTO createdate(Timestamp createDate) {
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
    public PSDEUAGroupDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="detailtag")
    public void setDetailTag(String detailTag) {
        this._set(DTOFIELD_DETAILTAG, detailTag);
    }

    @JsonIgnore
    public String getDetailTag() {
        Object objValue = this._get(DTOFIELD_DETAILTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTagDirty() {
        return this._contains(DTOFIELD_DETAILTAG);
    }

    @JsonIgnore
    public void resetDetailTag() {
        this._reset(DTOFIELD_DETAILTAG);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO detailtag(String detailTag) {
        this.setDetailTag(detailTag);
        return this;
    }

    @JsonProperty(value="detailtag2")
    public void setDetailTag2(String detailTag2) {
        this._set(DTOFIELD_DETAILTAG2, detailTag2);
    }

    @JsonIgnore
    public String getDetailTag2() {
        Object objValue = this._get(DTOFIELD_DETAILTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTag2Dirty() {
        return this._contains(DTOFIELD_DETAILTAG2);
    }

    @JsonIgnore
    public void resetDetailTag2() {
        this._reset(DTOFIELD_DETAILTAG2);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO detailtag2(String detailTag2) {
        this.setDetailTag2(detailTag2);
        return this;
    }

    @JsonProperty(value="detailtype")
    public void setDetailType(String detailType) {
        this._set(DTOFIELD_DETAILTYPE, detailType);
    }

    @JsonIgnore
    public String getDetailType() {
        Object objValue = this._get(DTOFIELD_DETAILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTypeDirty() {
        return this._contains(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public void resetDetailType() {
        this._reset(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO detailtype(String detailType) {
        this.setDetailType(detailType);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO detailtype(PSModelEnums.UAGroupDetailType detailType) {
        if (detailType == null) {
            this.setDetailType(null);
        } else {
            this.setDetailType(detailType.value);
        }
        return this;
    }

    @JsonProperty(value="enablelogic")
    public void setEnableLogic(String enableLogic) {
        this._set(DTOFIELD_ENABLELOGIC, enableLogic);
    }

    @JsonIgnore
    public String getEnableLogic() {
        Object objValue = this._get(DTOFIELD_ENABLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnableLogicDirty() {
        return this._contains(DTOFIELD_ENABLELOGIC);
    }

    @JsonIgnore
    public void resetEnableLogic() {
        this._reset(DTOFIELD_ENABLELOGIC);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO enablelogic(String enableLogic) {
        this.setEnableLogic(enableLogic);
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
    public PSDEUAGroupDetailDTO memo(String memo) {
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
    public PSDEUAGroupDetailDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDEUAGroupDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdeuagroupid")
    public void setPSDEUAGroupId(String pSDEUAGroupId) {
        this._set(DTOFIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }

    @JsonIgnore
    public String getPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPSDEUAGroupId() {
        this._reset(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEId(null);
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        } else {
            this.setPSDEId(pSDEUAGroup.getPSDEId());
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdeuagroupname")
    public void setPSDEUAGroupName(String pSDEUAGroupName) {
        this._set(DTOFIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }

    @JsonIgnore
    public String getPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGroupName() {
        this._reset(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="psdeuagrpdetailid")
    public void setPSDEUAGRPDetailId(String pSDEUAGRPDetailId) {
        this._set(DTOFIELD_PSDEUAGRPDETAILID, pSDEUAGRPDetailId);
    }

    @JsonIgnore
    public String getPSDEUAGRPDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGRPDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGRPDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGRPDETAILID);
    }

    @JsonIgnore
    public void resetPSDEUAGRPDetailId() {
        this._reset(DTOFIELD_PSDEUAGRPDETAILID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuagrpdetailid(String pSDEUAGRPDetailId) {
        this.setPSDEUAGRPDetailId(pSDEUAGRPDetailId);
        return this;
    }

    @JsonProperty(value="psdeuagrpdetailname")
    public void setPSDEUAGRPDetailName(String pSDEUAGRPDetailName) {
        this._set(DTOFIELD_PSDEUAGRPDETAILNAME, pSDEUAGRPDetailName);
    }

    @JsonIgnore
    public String getPSDEUAGRPDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGRPDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGRPDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGRPDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGRPDetailName() {
        this._reset(DTOFIELD_PSDEUAGRPDETAILNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuagrpdetailname(String pSDEUAGRPDetailName) {
        this.setPSDEUAGRPDetailName(pSDEUAGRPDetailName);
        return this;
    }

    @JsonProperty(value="psdeuiactionid")
    public void setPSDEUIActionId(String pSDEUIActionId) {
        this._set(DTOFIELD_PSDEUIACTIONID, pSDEUIActionId);
    }

    @JsonIgnore
    public String getPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetPSDEUIActionId() {
        this._reset(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
            this.setUACaption(null);
        } else {
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
            this.setUACaption(pSDEUIAction.getCaption());
        }
        return this;
    }

    @JsonProperty(value="psdeuiactionname")
    public void setPSDEUIActionName(String pSDEUIActionName) {
        this._set(DTOFIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }

    @JsonIgnore
    public String getPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEUIActionName() {
        this._reset(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEUIActionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEUIActionName(strName);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO name(String strName) {
        this.setPSDEUIActionName(strName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysimageid")
    public void setPSSysImageId(String pSSysImageId) {
        this._set(DTOFIELD_PSSYSIMAGEID, pSSysImageId);
    }

    @JsonIgnore
    public String getPSSysImageId() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageIdDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public void resetPSSysImageId() {
        this._reset(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssysimageid(PSSysImageDTO pSSysImage) {
        if (pSSysImage == null) {
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        } else {
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    @JsonProperty(value="pssysimagename")
    public void setPSSysImageName(String pSSysImageName) {
        this._set(DTOFIELD_PSSYSIMAGENAME, pSSysImageName);
    }

    @JsonIgnore
    public String getPSSysImageName() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageNameDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public void resetPSSysImageName() {
        this._reset(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="showmode")
    public void setShowMode(String showMode) {
        this._set(DTOFIELD_SHOWMODE, showMode);
    }

    @JsonIgnore
    public String getShowMode() {
        Object objValue = this._get(DTOFIELD_SHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShowModeDirty() {
        return this._contains(DTOFIELD_SHOWMODE);
    }

    @JsonIgnore
    public void resetShowMode() {
        this._reset(DTOFIELD_SHOWMODE);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO showmode(String showMode) {
        this.setShowMode(showMode);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO showmode(PSModelEnums.TBItemShowMode showMode) {
        if (showMode == null) {
            this.setShowMode(null);
        } else {
            this.setShowMode(showMode.value);
        }
        return this;
    }

    @JsonProperty(value="uacaption")
    public void setUACaption(String uACaption) {
        this._set(DTOFIELD_UACAPTION, uACaption);
    }

    @JsonIgnore
    public String getUACaption() {
        Object objValue = this._get(DTOFIELD_UACAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUACaptionDirty() {
        return this._contains(DTOFIELD_UACAPTION);
    }

    @JsonIgnore
    public void resetUACaption() {
        this._reset(DTOFIELD_UACAPTION);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO uacaption(String uACaption) {
        this.setUACaption(uACaption);
        return this;
    }

    @JsonProperty(value="uiactionparams")
    public void setUIActionParams(String uIActionParams) {
        this._set(DTOFIELD_UIACTIONPARAMS, uIActionParams);
    }

    @JsonIgnore
    public String getUIActionParams() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParamsDirty() {
        return this._contains(DTOFIELD_UIACTIONPARAMS);
    }

    @JsonIgnore
    public void resetUIActionParams() {
        this._reset(DTOFIELD_UIACTIONPARAMS);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO uiactionparams(String uIActionParams) {
        this.setUIActionParams(uIActionParams);
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
    public PSDEUAGroupDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEUAGroupDetailDTO updateman(String updateMan) {
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
    public PSDEUAGroupDetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEUAGroupDetailDTO usertag(String userTag) {
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
    public PSDEUAGroupDetailDTO usertag2(String userTag2) {
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
    public PSDEUAGroupDetailDTO usertag3(String userTag3) {
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
    public PSDEUAGroupDetailDTO usertag4(String userTag4) {
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
    public PSDEUAGroupDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="visiblelogic")
    public void setVisibleLogic(String visibleLogic) {
        this._set(DTOFIELD_VISIBLELOGIC, visibleLogic);
    }

    @JsonIgnore
    public String getVisibleLogic() {
        Object objValue = this._get(DTOFIELD_VISIBLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVisibleLogicDirty() {
        return this._contains(DTOFIELD_VISIBLELOGIC);
    }

    @JsonIgnore
    public void resetVisibleLogic() {
        this._reset(DTOFIELD_VISIBLELOGIC);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO visiblelogic(String visibleLogic) {
        this.setVisibleLogic(visibleLogic);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEUAGRPDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEUAGRPDetailId(strValue);
    }

    @JsonIgnore
    public PSDEUAGroupDetailDTO id(String strValue) {
        this.setPSDEUAGRPDetailId(strValue);
        return this;
    }
}
