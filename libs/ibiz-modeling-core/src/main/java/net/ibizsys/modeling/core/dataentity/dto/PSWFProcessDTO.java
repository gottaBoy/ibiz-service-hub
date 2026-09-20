package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFProcessDTO
extends PSModelDTOBase {
    public static final String FIELD_ASYNCMODE = "ASYNCMODE";
    protected static final String DTOFIELD_ASYNCMODE = "asyncmode";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EDITFIELDS = "EDITFIELDS";
    protected static final String DTOFIELD_EDITFIELDS = "editfields";
    public static final String FIELD_EDITFLAG = "EDITFLAG";
    protected static final String DTOFIELD_EDITFLAG = "editflag";
    public static final String FIELD_EDITPSDEFGROUPID = "EDITPSDEFGROUPID";
    protected static final String DTOFIELD_EDITPSDEFGROUPID = "editpsdefgroupid";
    public static final String FIELD_EDITPSDEFGROUPNAME = "EDITPSDEFGROUPNAME";
    protected static final String DTOFIELD_EDITPSDEFGROUPNAME = "editpsdefgroupname";
    public static final String FIELD_EMBEDPSDEDSID = "EMBEDPSDEDSID";
    protected static final String DTOFIELD_EMBEDPSDEDSID = "embedpsdedsid";
    public static final String FIELD_EMBEDPSDEDSNAME = "EMBEDPSDEDSNAME";
    protected static final String DTOFIELD_EMBEDPSDEDSNAME = "embedpsdedsname";
    public static final String FIELD_EMBEDPSDEID = "EMBEDPSDEID";
    protected static final String DTOFIELD_EMBEDPSDEID = "embedpsdeid";
    public static final String FIELD_EMBEDPSWFDEID = "EMBEDPSWFDEID";
    protected static final String DTOFIELD_EMBEDPSWFDEID = "embedpswfdeid";
    public static final String FIELD_EMBEDPSWFDENAME = "EMBEDPSWFDENAME";
    protected static final String DTOFIELD_EMBEDPSWFDENAME = "embedpswfdename";
    public static final String FIELD_EMBEDPSWFID = "EMBEDPSWFID";
    protected static final String DTOFIELD_EMBEDPSWFID = "embedpswfid";
    public static final String FIELD_EMBEDPSWFNAME = "EMBEDPSWFNAME";
    protected static final String DTOFIELD_EMBEDPSWFNAME = "embedpswfname";
    public static final String FIELD_ENABLEMOBILE = "ENABLEMOBILE";
    protected static final String DTOFIELD_ENABLEMOBILE = "enablemobile";
    public static final String FIELD_ENABLETIMEOUT = "ENABLETIMEOUT";
    protected static final String DTOFIELD_ENABLETIMEOUT = "enabletimeout";
    public static final String FIELD_EXITSTATENAME = "EXITSTATENAME";
    protected static final String DTOFIELD_EXITSTATENAME = "exitstatename";
    public static final String FIELD_EXITSTATEVALUE = "EXITSTATEVALUE";
    protected static final String DTOFIELD_EXITSTATEVALUE = "exitstatevalue";
    public static final String FIELD_FORMCODENAME = "FORMCODENAME";
    protected static final String DTOFIELD_FORMCODENAME = "formcodename";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MEMOFIELD = "MEMOFIELD";
    protected static final String DTOFIELD_MEMOFIELD = "memofield";
    public static final String FIELD_MOBFORMCODENAME = "MOBFORMCODENAME";
    protected static final String DTOFIELD_MOBFORMCODENAME = "mobformcodename";
    public static final String FIELD_MOBPSDEFORMID = "MOBPSDEFORMID";
    protected static final String DTOFIELD_MOBPSDEFORMID = "mobpsdeformid";
    public static final String FIELD_MOBPSDEFORMNAME = "MOBPSDEFORMNAME";
    protected static final String DTOFIELD_MOBPSDEFORMNAME = "mobpsdeformname";
    public static final String FIELD_MOBPSDEUAGROUPID = "MOBPSDEUAGROUPID";
    protected static final String DTOFIELD_MOBPSDEUAGROUPID = "mobpsdeuagroupid";
    public static final String FIELD_MOBPSDEUAGROUPNAME = "MOBPSDEUAGROUPNAME";
    protected static final String DTOFIELD_MOBPSDEUAGROUPNAME = "mobpsdeuagroupname";
    public static final String FIELD_MOBPSDEVIEWID = "MOBPSDEVIEWID";
    protected static final String DTOFIELD_MOBPSDEVIEWID = "mobpsdeviewid";
    public static final String FIELD_MOBPSDEVIEWNAME = "MOBPSDEVIEWNAME";
    protected static final String DTOFIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";
    public static final String FIELD_MOBPSDYNADEVIEWTEMPLID = "MOBPSDYNADEVIEWTEMPLID";
    protected static final String DTOFIELD_MOBPSDYNADEVIEWTEMPLID = "mobpsdynadeviewtemplid";
    public static final String FIELD_MOBUAGROUPCODENAME = "MOBUAGROUPCODENAME";
    protected static final String DTOFIELD_MOBUAGROUPCODENAME = "mobuagroupcodename";
    public static final String FIELD_MOBUTIL2FORMCODENAME = "MOBUTIL2FORMCODENAME";
    protected static final String DTOFIELD_MOBUTIL2FORMCODENAME = "mobutil2formcodename";
    public static final String FIELD_MOBUTIL2PSDEFORMID = "MOBUTIL2PSDEFORMID";
    protected static final String DTOFIELD_MOBUTIL2PSDEFORMID = "mobutil2psdeformid";
    public static final String FIELD_MOBUTIL2PSDEFORMNAME = "MOBUTIL2PSDEFORMNAME";
    protected static final String DTOFIELD_MOBUTIL2PSDEFORMNAME = "mobutil2psdeformname";
    public static final String FIELD_MOBUTIL3FORMCODENAME = "MOBUTIL3FORMCODENAME";
    protected static final String DTOFIELD_MOBUTIL3FORMCODENAME = "mobutil3formcodename";
    public static final String FIELD_MOBUTIL3PSDEFORMID = "MOBUTIL3PSDEFORMID";
    protected static final String DTOFIELD_MOBUTIL3PSDEFORMID = "mobutil3psdeformid";
    public static final String FIELD_MOBUTIL3PSDEFORMNAME = "MOBUTIL3PSDEFORMNAME";
    protected static final String DTOFIELD_MOBUTIL3PSDEFORMNAME = "mobutil3psdeformname";
    public static final String FIELD_MOBUTIL4FORMCODENAME = "MOBUTIL4FORMCODENAME";
    protected static final String DTOFIELD_MOBUTIL4FORMCODENAME = "mobutil4formcodename";
    public static final String FIELD_MOBUTIL4PSDEFORMID = "MOBUTIL4PSDEFORMID";
    protected static final String DTOFIELD_MOBUTIL4PSDEFORMID = "mobutil4psdeformid";
    public static final String FIELD_MOBUTIL4PSDEFORMNAME = "MOBUTIL4PSDEFORMNAME";
    protected static final String DTOFIELD_MOBUTIL4PSDEFORMNAME = "mobutil4psdeformname";
    public static final String FIELD_MOBUTIL5FORMCODENAME = "MOBUTIL5FORMCODENAME";
    protected static final String DTOFIELD_MOBUTIL5FORMCODENAME = "mobutil5formcodename";
    public static final String FIELD_MOBUTIL5PSDEFORMID = "MOBUTIL5PSDEFORMID";
    protected static final String DTOFIELD_MOBUTIL5PSDEFORMID = "mobutil5psdeformid";
    public static final String FIELD_MOBUTIL5PSDEFORMNAME = "MOBUTIL5PSDEFORMNAME";
    protected static final String DTOFIELD_MOBUTIL5PSDEFORMNAME = "mobutil5psdeformname";
    public static final String FIELD_MOBUTILFORMCODENAME = "MOBUTILFORMCODENAME";
    protected static final String DTOFIELD_MOBUTILFORMCODENAME = "mobutilformcodename";
    public static final String FIELD_MOBUTILPSDEFORMID = "MOBUTILPSDEFORMID";
    protected static final String DTOFIELD_MOBUTILPSDEFORMID = "mobutilpsdeformid";
    public static final String FIELD_MOBUTILPSDEFORMNAME = "MOBUTILPSDEFORMNAME";
    protected static final String DTOFIELD_MOBUTILPSDEFORMNAME = "mobutilpsdeformname";
    public static final String FIELD_MOBWFEDITVIEWTYPE = "MOBWFEDITVIEWTYPE";
    protected static final String DTOFIELD_MOBWFEDITVIEWTYPE = "mobwfeditviewtype";
    public static final String FIELD_MODELID = "MODELID";
    protected static final String DTOFIELD_MODELID = "modelid";
    public static final String FIELD_MSGTYPE = "MSGTYPE";
    protected static final String DTOFIELD_MSGTYPE = "msgtype";
    public static final String FIELD_MULTIINSTMODE = "MULTIINSTMODE";
    protected static final String DTOFIELD_MULTIINSTMODE = "multiinstmode";
    public static final String FIELD_NAMEPSLANRESID = "NAMEPSLANRESID";
    protected static final String DTOFIELD_NAMEPSLANRESID = "namepslanresid";
    public static final String FIELD_NAMEPSLANRESNAME = "NAMEPSLANRESNAME";
    protected static final String DTOFIELD_NAMEPSLANRESNAME = "namepslanresname";
    public static final String FIELD_NORMALPROCTYPE = "NORMALPROCTYPE";
    protected static final String DTOFIELD_NORMALPROCTYPE = "normalproctype";
    public static final String FIELD_PREDEFINEDACTIONS = "PREDEFINEDACTIONS";
    protected static final String DTOFIELD_PREDEFINEDACTIONS = "predefinedactions";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSDYNADEVIEWTEMPLID = "PSDYNADEVIEWTEMPLID";
    protected static final String DTOFIELD_PSDYNADEVIEWTEMPLID = "psdynadeviewtemplid";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSWFDEID = "PSWFDEID";
    protected static final String DTOFIELD_PSWFDEID = "pswfdeid";
    public static final String FIELD_PSWFDENAME = "PSWFDENAME";
    protected static final String DTOFIELD_PSWFDENAME = "pswfdename";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCESSNAME = "PSWFPROCESSNAME";
    protected static final String DTOFIELD_PSWFPROCESSNAME = "pswfprocessname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_PSWFWORKTIMEID = "PSWFWORKTIMEID";
    protected static final String DTOFIELD_PSWFWORKTIMEID = "pswfworktimeid";
    public static final String FIELD_PSWFWORKTIMENAME = "PSWFWORKTIMENAME";
    protected static final String DTOFIELD_PSWFWORKTIMENAME = "pswfworktimename";
    public static final String FIELD_REFPSWFVERSIONID = "REFPSWFVERSIONID";
    protected static final String DTOFIELD_REFPSWFVERSIONID = "refpswfversionid";
    public static final String FIELD_REFPSWFVERSIONNAME = "REFPSWFVERSIONNAME";
    protected static final String DTOFIELD_REFPSWFVERSIONNAME = "refpswfversionname";
    public static final String FIELD_SENDINFORM = "SENDINFORM";
    protected static final String DTOFIELD_SENDINFORM = "sendinform";
    public static final String FIELD_SHAPEPARAMS = "SHAPEPARAMS";
    protected static final String DTOFIELD_SHAPEPARAMS = "shapeparams";
    public static final String FIELD_TIMEOUT = "TIMEOUT";
    protected static final String DTOFIELD_TIMEOUT = "timeout";
    public static final String FIELD_TIMEOUTPSDEFID = "TIMEOUTPSDEFID";
    protected static final String DTOFIELD_TIMEOUTPSDEFID = "timeoutpsdefid";
    public static final String FIELD_TIMEOUTPSDEFNAME = "TIMEOUTPSDEFNAME";
    protected static final String DTOFIELD_TIMEOUTPSDEFNAME = "timeoutpsdefname";
    public static final String FIELD_TIMEOUTTYPE = "TIMEOUTTYPE";
    protected static final String DTOFIELD_TIMEOUTTYPE = "timeouttype";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
    public static final String FIELD_UAGROUPCODENAME = "UAGROUPCODENAME";
    protected static final String DTOFIELD_UAGROUPCODENAME = "uagroupcodename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_UTIL2FORMCODENAME = "UTIL2FORMCODENAME";
    protected static final String DTOFIELD_UTIL2FORMCODENAME = "util2formcodename";
    public static final String FIELD_UTIL2PSDEFORMID = "UTIL2PSDEFORMID";
    protected static final String DTOFIELD_UTIL2PSDEFORMID = "util2psdeformid";
    public static final String FIELD_UTIL2PSDEFORMNAME = "UTIL2PSDEFORMNAME";
    protected static final String DTOFIELD_UTIL2PSDEFORMNAME = "util2psdeformname";
    public static final String FIELD_UTIL3FORMCODENAME = "UTIL3FORMCODENAME";
    protected static final String DTOFIELD_UTIL3FORMCODENAME = "util3formcodename";
    public static final String FIELD_UTIL3PSDEFORMID = "UTIL3PSDEFORMID";
    protected static final String DTOFIELD_UTIL3PSDEFORMID = "util3psdeformid";
    public static final String FIELD_UTIL3PSDEFORMNAME = "UTIL3PSDEFORMNAME";
    protected static final String DTOFIELD_UTIL3PSDEFORMNAME = "util3psdeformname";
    public static final String FIELD_UTIL4FORMCODENAME = "UTIL4FORMCODENAME";
    protected static final String DTOFIELD_UTIL4FORMCODENAME = "util4formcodename";
    public static final String FIELD_UTIL4PSDEFORMID = "UTIL4PSDEFORMID";
    protected static final String DTOFIELD_UTIL4PSDEFORMID = "util4psdeformid";
    public static final String FIELD_UTIL4PSDEFORMNAME = "UTIL4PSDEFORMNAME";
    protected static final String DTOFIELD_UTIL4PSDEFORMNAME = "util4psdeformname";
    public static final String FIELD_UTIL5FORMCODENAME = "UTIL5FORMCODENAME";
    protected static final String DTOFIELD_UTIL5FORMCODENAME = "util5formcodename";
    public static final String FIELD_UTIL5PSDEFORMID = "UTIL5PSDEFORMID";
    protected static final String DTOFIELD_UTIL5PSDEFORMID = "util5psdeformid";
    public static final String FIELD_UTIL5PSDEFORMNAME = "UTIL5PSDEFORMNAME";
    protected static final String DTOFIELD_UTIL5PSDEFORMNAME = "util5psdeformname";
    public static final String FIELD_UTILFORMCODENAME = "UTILFORMCODENAME";
    protected static final String DTOFIELD_UTILFORMCODENAME = "utilformcodename";
    public static final String FIELD_UTILPSDEFORMID = "UTILPSDEFORMID";
    protected static final String DTOFIELD_UTILPSDEFORMID = "utilpsdeformid";
    public static final String FIELD_UTILPSDEFORMNAME = "UTILPSDEFORMNAME";
    protected static final String DTOFIELD_UTILPSDEFORMNAME = "utilpsdeformname";
    public static final String FIELD_WFEDITVIEWTYPE = "WFEDITVIEWTYPE";
    protected static final String DTOFIELD_WFEDITVIEWTYPE = "wfeditviewtype";
    public static final String FIELD_WFENGINETYPE = "WFENGINETYPE";
    protected static final String DTOFIELD_WFENGINETYPE = "wfenginetype";
    public static final String FIELD_WFPROCESSTYPE = "WFPROCESSTYPE";
    protected static final String DTOFIELD_WFPROCESSTYPE = "wfprocesstype";
    public static final String FIELD_WFSTEPVALUE = "WFSTEPVALUE";
    protected static final String DTOFIELD_WFSTEPVALUE = "wfstepvalue";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String DTOFIELD_PSWFPROCROLES = "pswfprocroles";
    public static final String DTOFIELD_PSWFPROCSUBWFS = "pswfprocsubwfs";
    public static final String DTOFIELD_PSWFPROCPARAMS = "pswfprocparams";

    @JsonProperty(value="asyncmode")
    public void setAsyncMode(Integer asyncMode) {
        this._set(DTOFIELD_ASYNCMODE, asyncMode);
    }

    @JsonIgnore
    public Integer getAsyncMode() {
        Object objValue = this._get(DTOFIELD_ASYNCMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAsyncModeDirty() {
        return this._contains(DTOFIELD_ASYNCMODE);
    }

    @JsonIgnore
    public void resetAsyncMode() {
        this._reset(DTOFIELD_ASYNCMODE);
    }

    @JsonIgnore
    public PSWFProcessDTO asyncmode(Integer asyncMode) {
        this.setAsyncMode(asyncMode);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO asyncmode(Boolean asyncMode) {
        if (asyncMode == null) {
            this.setAsyncMode(null);
        } else {
            this.setAsyncMode(asyncMode != false ? 1 : 0);
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
    public PSWFProcessDTO codename(String codeName) {
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
    public PSWFProcessDTO createdate(Timestamp createDate) {
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
    public PSWFProcessDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="editfields")
    public void setEditFields(String editFields) {
        this._set(DTOFIELD_EDITFIELDS, editFields);
    }

    @JsonIgnore
    public String getEditFields() {
        Object objValue = this._get(DTOFIELD_EDITFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditFieldsDirty() {
        return this._contains(DTOFIELD_EDITFIELDS);
    }

    @JsonIgnore
    public void resetEditFields() {
        this._reset(DTOFIELD_EDITFIELDS);
    }

    @JsonIgnore
    public PSWFProcessDTO editfields(String editFields) {
        this.setEditFields(editFields);
        return this;
    }

    @JsonProperty(value="editflag")
    public void setEditFlag(Integer editFlag) {
        this._set(DTOFIELD_EDITFLAG, editFlag);
    }

    @JsonIgnore
    public Integer getEditFlag() {
        Object objValue = this._get(DTOFIELD_EDITFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEditFlagDirty() {
        return this._contains(DTOFIELD_EDITFLAG);
    }

    @JsonIgnore
    public void resetEditFlag() {
        this._reset(DTOFIELD_EDITFLAG);
    }

    @JsonIgnore
    public PSWFProcessDTO editflag(Integer editFlag) {
        this.setEditFlag(editFlag);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO editflag(PSModelEnums.WFProcessEditMode editFlag) {
        if (editFlag == null) {
            this.setEditFlag(null);
        } else {
            this.setEditFlag(editFlag.value);
        }
        return this;
    }

    @JsonProperty(value="editpsdefgroupid")
    public void setEditPSDEFGroupId(String editPSDEFGroupId) {
        this._set(DTOFIELD_EDITPSDEFGROUPID, editPSDEFGroupId);
    }

    @JsonIgnore
    public String getEditPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_EDITPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_EDITPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetEditPSDEFGroupId() {
        this._reset(DTOFIELD_EDITPSDEFGROUPID);
    }

    @JsonIgnore
    public PSWFProcessDTO editpsdefgroupid(String editPSDEFGroupId) {
        this.setEditPSDEFGroupId(editPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO editpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setEditPSDEFGroupId(null);
            this.setEditPSDEFGroupName(null);
        } else {
            this.setEditPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setEditPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="editpsdefgroupname")
    public void setEditPSDEFGroupName(String editPSDEFGroupName) {
        this._set(DTOFIELD_EDITPSDEFGROUPNAME, editPSDEFGroupName);
    }

    @JsonIgnore
    public String getEditPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_EDITPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_EDITPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetEditPSDEFGroupName() {
        this._reset(DTOFIELD_EDITPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO editpsdefgroupname(String editPSDEFGroupName) {
        this.setEditPSDEFGroupName(editPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="embedpsdedsid")
    public void setEmbedPSDEDSId(String embedPSDEDSId) {
        this._set(DTOFIELD_EMBEDPSDEDSID, embedPSDEDSId);
    }

    @JsonIgnore
    public String getEmbedPSDEDSId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSDEDSIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSDEDSID);
    }

    @JsonIgnore
    public void resetEmbedPSDEDSId() {
        this._reset(DTOFIELD_EMBEDPSDEDSID);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpsdedsid(String embedPSDEDSId) {
        this.setEmbedPSDEDSId(embedPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO embedpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setEmbedPSDEDSId(null);
            this.setEmbedPSDEDSName(null);
        } else {
            this.setEmbedPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setEmbedPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="embedpsdedsname")
    public void setEmbedPSDEDSName(String embedPSDEDSName) {
        this._set(DTOFIELD_EMBEDPSDEDSNAME, embedPSDEDSName);
    }

    @JsonIgnore
    public String getEmbedPSDEDSName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSDEDSNameDirty() {
        return this._contains(DTOFIELD_EMBEDPSDEDSNAME);
    }

    @JsonIgnore
    public void resetEmbedPSDEDSName() {
        this._reset(DTOFIELD_EMBEDPSDEDSNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpsdedsname(String embedPSDEDSName) {
        this.setEmbedPSDEDSName(embedPSDEDSName);
        return this;
    }

    @JsonProperty(value="embedpsdeid")
    public void setEmbedPSDEId(String embedPSDEId) {
        this._set(DTOFIELD_EMBEDPSDEID, embedPSDEId);
    }

    @JsonIgnore
    public String getEmbedPSDEId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSDEIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSDEID);
    }

    @JsonIgnore
    public void resetEmbedPSDEId() {
        this._reset(DTOFIELD_EMBEDPSDEID);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpsdeid(String embedPSDEId) {
        this.setEmbedPSDEId(embedPSDEId);
        return this;
    }

    @JsonProperty(value="embedpswfdeid")
    public void setEmbedPSWFDEId(String embedPSWFDEId) {
        this._set(DTOFIELD_EMBEDPSWFDEID, embedPSWFDEId);
    }

    @JsonIgnore
    public String getEmbedPSWFDEId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFDEIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFDEID);
    }

    @JsonIgnore
    public void resetEmbedPSWFDEId() {
        this._reset(DTOFIELD_EMBEDPSWFDEID);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpswfdeid(String embedPSWFDEId) {
        this.setEmbedPSWFDEId(embedPSWFDEId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO embedpswfdeid(PSWFDEDTO pSWFDE) {
        if (pSWFDE == null) {
            this.setEmbedPSDEId(null);
            this.setEmbedPSWFDEId(null);
            this.setEmbedPSWFDEName(null);
        } else {
            this.setEmbedPSDEId(pSWFDE.getPSDEId());
            this.setEmbedPSWFDEId(pSWFDE.getPSWFDEId());
            this.setEmbedPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    @JsonProperty(value="embedpswfdename")
    public void setEmbedPSWFDEName(String embedPSWFDEName) {
        this._set(DTOFIELD_EMBEDPSWFDENAME, embedPSWFDEName);
    }

    @JsonIgnore
    public String getEmbedPSWFDEName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFDENameDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFDENAME);
    }

    @JsonIgnore
    public void resetEmbedPSWFDEName() {
        this._reset(DTOFIELD_EMBEDPSWFDENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpswfdename(String embedPSWFDEName) {
        this.setEmbedPSWFDEName(embedPSWFDEName);
        return this;
    }

    @JsonProperty(value="embedpswfid")
    public void setEmbedPSWFId(String embedPSWFId) {
        this._set(DTOFIELD_EMBEDPSWFID, embedPSWFId);
    }

    @JsonIgnore
    public String getEmbedPSWFId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFID);
    }

    @JsonIgnore
    public void resetEmbedPSWFId() {
        this._reset(DTOFIELD_EMBEDPSWFID);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpswfid(String embedPSWFId) {
        this.setEmbedPSWFId(embedPSWFId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO embedpswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setEmbedPSWFId(null);
            this.setEmbedPSWFName(null);
        } else {
            this.setEmbedPSWFId(pSWorkflow.getPSWorkflowId());
            this.setEmbedPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    @JsonProperty(value="embedpswfname")
    public void setEmbedPSWFName(String embedPSWFName) {
        this._set(DTOFIELD_EMBEDPSWFNAME, embedPSWFName);
    }

    @JsonIgnore
    public String getEmbedPSWFName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFNameDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFNAME);
    }

    @JsonIgnore
    public void resetEmbedPSWFName() {
        this._reset(DTOFIELD_EMBEDPSWFNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO embedpswfname(String embedPSWFName) {
        this.setEmbedPSWFName(embedPSWFName);
        return this;
    }

    @JsonProperty(value="enablemobile")
    public void setEnableMobile(Integer enableMobile) {
        this._set(DTOFIELD_ENABLEMOBILE, enableMobile);
    }

    @JsonIgnore
    public Integer getEnableMobile() {
        Object objValue = this._get(DTOFIELD_ENABLEMOBILE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableMobileDirty() {
        return this._contains(DTOFIELD_ENABLEMOBILE);
    }

    @JsonIgnore
    public void resetEnableMobile() {
        this._reset(DTOFIELD_ENABLEMOBILE);
    }

    @JsonIgnore
    public PSWFProcessDTO enablemobile(Integer enableMobile) {
        this.setEnableMobile(enableMobile);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO enablemobile(Boolean enableMobile) {
        if (enableMobile == null) {
            this.setEnableMobile(null);
        } else {
            this.setEnableMobile(enableMobile != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabletimeout")
    public void setEnableTimeout(Integer enableTimeout) {
        this._set(DTOFIELD_ENABLETIMEOUT, enableTimeout);
    }

    @JsonIgnore
    public Integer getEnableTimeout() {
        Object objValue = this._get(DTOFIELD_ENABLETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableTimeoutDirty() {
        return this._contains(DTOFIELD_ENABLETIMEOUT);
    }

    @JsonIgnore
    public void resetEnableTimeout() {
        this._reset(DTOFIELD_ENABLETIMEOUT);
    }

    @JsonIgnore
    public PSWFProcessDTO enabletimeout(Integer enableTimeout) {
        this.setEnableTimeout(enableTimeout);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO enabletimeout(Boolean enableTimeout) {
        if (enableTimeout == null) {
            this.setEnableTimeout(null);
        } else {
            this.setEnableTimeout(enableTimeout != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="exitstatename")
    public void setExitStateName(String exitStateName) {
        this._set(DTOFIELD_EXITSTATENAME, exitStateName);
    }

    @JsonIgnore
    public String getExitStateName() {
        Object objValue = this._get(DTOFIELD_EXITSTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExitStateNameDirty() {
        return this._contains(DTOFIELD_EXITSTATENAME);
    }

    @JsonIgnore
    public void resetExitStateName() {
        this._reset(DTOFIELD_EXITSTATENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO exitstatename(String exitStateName) {
        this.setExitStateName(exitStateName);
        return this;
    }

    @JsonProperty(value="exitstatevalue")
    public void setExitStateValue(String exitStateValue) {
        this._set(DTOFIELD_EXITSTATEVALUE, exitStateValue);
    }

    @JsonIgnore
    public String getExitStateValue() {
        Object objValue = this._get(DTOFIELD_EXITSTATEVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExitStateValueDirty() {
        return this._contains(DTOFIELD_EXITSTATEVALUE);
    }

    @JsonIgnore
    public void resetExitStateValue() {
        this._reset(DTOFIELD_EXITSTATEVALUE);
    }

    @JsonIgnore
    public PSWFProcessDTO exitstatevalue(String exitStateValue) {
        this.setExitStateValue(exitStateValue);
        return this;
    }

    @JsonProperty(value="formcodename")
    public void setFormCodeName(String formCodeName) {
        this._set(DTOFIELD_FORMCODENAME, formCodeName);
    }

    @JsonIgnore
    public String getFormCodeName() {
        Object objValue = this._get(DTOFIELD_FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormCodeNameDirty() {
        return this._contains(DTOFIELD_FORMCODENAME);
    }

    @JsonIgnore
    public void resetFormCodeName() {
        this._reset(DTOFIELD_FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO formcodename(String formCodeName) {
        this.setFormCodeName(formCodeName);
        return this;
    }

    @JsonProperty(value="height")
    public void setHeight(Integer height) {
        this._set(DTOFIELD_HEIGHT, height);
    }

    @JsonIgnore
    public Integer getHeight() {
        Object objValue = this._get(DTOFIELD_HEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHeightDirty() {
        return this._contains(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public void resetHeight() {
        this._reset(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public PSWFProcessDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="iconpath")
    public void setIconPath(String iconPath) {
        this._set(DTOFIELD_ICONPATH, iconPath);
    }

    @JsonIgnore
    public String getIconPath() {
        Object objValue = this._get(DTOFIELD_ICONPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathDirty() {
        return this._contains(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public void resetIconPath() {
        this._reset(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public PSWFProcessDTO iconpath(String iconPath) {
        this.setIconPath(iconPath);
        return this;
    }

    @JsonProperty(value="leftpos")
    public void setLeftPos(Integer leftPos) {
        this._set(DTOFIELD_LEFTPOS, leftPos);
    }

    @JsonIgnore
    public Integer getLeftPos() {
        Object objValue = this._get(DTOFIELD_LEFTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLeftPosDirty() {
        return this._contains(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public void resetLeftPos() {
        this._reset(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public PSWFProcessDTO leftpos(Integer leftPos) {
        this.setLeftPos(leftPos);
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
    public PSWFProcessDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="memofield")
    public void setMemoField(String memoField) {
        this._set(DTOFIELD_MEMOFIELD, memoField);
    }

    @JsonIgnore
    public String getMemoField() {
        Object objValue = this._get(DTOFIELD_MEMOFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMemoFieldDirty() {
        return this._contains(DTOFIELD_MEMOFIELD);
    }

    @JsonIgnore
    public void resetMemoField() {
        this._reset(DTOFIELD_MEMOFIELD);
    }

    @JsonIgnore
    public PSWFProcessDTO memofield(String memoField) {
        this.setMemoField(memoField);
        return this;
    }

    @JsonProperty(value="mobformcodename")
    public void setMobFormCodeName(String mobFormCodeName) {
        this._set(DTOFIELD_MOBFORMCODENAME, mobFormCodeName);
    }

    @JsonIgnore
    public String getMobFormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobFormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBFORMCODENAME);
    }

    @JsonIgnore
    public void resetMobFormCodeName() {
        this._reset(DTOFIELD_MOBFORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobformcodename(String mobFormCodeName) {
        this.setMobFormCodeName(mobFormCodeName);
        return this;
    }

    @JsonProperty(value="mobpsdeformid")
    public void setMobPSDEFormId(String mobPSDEFormId) {
        this._set(DTOFIELD_MOBPSDEFORMID, mobPSDEFormId);
    }

    @JsonIgnore
    public String getMobPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEFORMID);
    }

    @JsonIgnore
    public void resetMobPSDEFormId() {
        this._reset(DTOFIELD_MOBPSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeformid(String mobPSDEFormId) {
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobFormCodeName(null);
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        } else {
            this.setMobFormCodeName(pSDEForm.getCodeName());
            this.setMobPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeformname")
    public void setMobPSDEFormName(String mobPSDEFormName) {
        this._set(DTOFIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }

    @JsonIgnore
    public String getMobPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobPSDEFormName() {
        this._reset(DTOFIELD_MOBPSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeformname(String mobPSDEFormName) {
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    @JsonProperty(value="mobpsdeuagroupid")
    public void setMobPSDEUAGroupId(String mobPSDEUAGroupId) {
        this._set(DTOFIELD_MOBPSDEUAGROUPID, mobPSDEUAGroupId);
    }

    @JsonIgnore
    public String getMobPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetMobPSDEUAGroupId() {
        this._reset(DTOFIELD_MOBPSDEUAGROUPID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeuagroupid(String mobPSDEUAGroupId) {
        this.setMobPSDEUAGroupId(mobPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setMobPSDEUAGroupId(null);
            this.setMobPSDEUAGroupName(null);
            this.setMobUAGroupCodeName(null);
        } else {
            this.setMobPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setMobPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
            this.setMobUAGroupCodeName(pSDEUAGroup.getCodeName());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeuagroupname")
    public void setMobPSDEUAGroupName(String mobPSDEUAGroupName) {
        this._set(DTOFIELD_MOBPSDEUAGROUPNAME, mobPSDEUAGroupName);
    }

    @JsonIgnore
    public String getMobPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetMobPSDEUAGroupName() {
        this._reset(DTOFIELD_MOBPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeuagroupname(String mobPSDEUAGroupName) {
        this.setMobPSDEUAGroupName(mobPSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="mobpsdeviewid")
    public void setMobPSDEViewId(String mobPSDEViewId) {
        this._set(DTOFIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }

    @JsonIgnore
    public String getMobPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMobPSDEViewId() {
        this._reset(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeviewid(String mobPSDEViewId) {
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
            this.setMobPSDynaDEViewTemplId(null);
        } else {
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
            this.setMobPSDynaDEViewTemplId(pSDEViewBase.getPSDynaDEViewTemplId());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeviewname")
    public void setMobPSDEViewName(String mobPSDEViewName) {
        this._set(DTOFIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }

    @JsonIgnore
    public String getMobPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMobPSDEViewName() {
        this._reset(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdeviewname(String mobPSDEViewName) {
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    @JsonProperty(value="mobpsdynadeviewtemplid")
    public void setMobPSDynaDEViewTemplId(String mobPSDynaDEViewTemplId) {
        this._set(DTOFIELD_MOBPSDYNADEVIEWTEMPLID, mobPSDynaDEViewTemplId);
    }

    @JsonIgnore
    public String getMobPSDynaDEViewTemplId() {
        Object objValue = this._get(DTOFIELD_MOBPSDYNADEVIEWTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDynaDEViewTemplIdDirty() {
        return this._contains(DTOFIELD_MOBPSDYNADEVIEWTEMPLID);
    }

    @JsonIgnore
    public void resetMobPSDynaDEViewTemplId() {
        this._reset(DTOFIELD_MOBPSDYNADEVIEWTEMPLID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobpsdynadeviewtemplid(String mobPSDynaDEViewTemplId) {
        this.setMobPSDynaDEViewTemplId(mobPSDynaDEViewTemplId);
        return this;
    }

    @JsonProperty(value="mobuagroupcodename")
    public void setMobUAGroupCodeName(String mobUAGroupCodeName) {
        this._set(DTOFIELD_MOBUAGROUPCODENAME, mobUAGroupCodeName);
    }

    @JsonIgnore
    public String getMobUAGroupCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUAGROUPCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUAGroupCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUAGROUPCODENAME);
    }

    @JsonIgnore
    public void resetMobUAGroupCodeName() {
        this._reset(DTOFIELD_MOBUAGROUPCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobuagroupcodename(String mobUAGroupCodeName) {
        this.setMobUAGroupCodeName(mobUAGroupCodeName);
        return this;
    }

    @JsonProperty(value="mobutil2formcodename")
    public void setMobUtil2FormCodeName(String mobUtil2FormCodeName) {
        this._set(DTOFIELD_MOBUTIL2FORMCODENAME, mobUtil2FormCodeName);
    }

    @JsonIgnore
    public String getMobUtil2FormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL2FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil2FormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL2FORMCODENAME);
    }

    @JsonIgnore
    public void resetMobUtil2FormCodeName() {
        this._reset(DTOFIELD_MOBUTIL2FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil2formcodename(String mobUtil2FormCodeName) {
        this.setMobUtil2FormCodeName(mobUtil2FormCodeName);
        return this;
    }

    @JsonProperty(value="mobutil2psdeformid")
    public void setMobUtil2PSDEFormId(String mobUtil2PSDEFormId) {
        this._set(DTOFIELD_MOBUTIL2PSDEFORMID, mobUtil2PSDEFormId);
    }

    @JsonIgnore
    public String getMobUtil2PSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBUTIL2PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil2PSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBUTIL2PSDEFORMID);
    }

    @JsonIgnore
    public void resetMobUtil2PSDEFormId() {
        this._reset(DTOFIELD_MOBUTIL2PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil2psdeformid(String mobUtil2PSDEFormId) {
        this.setMobUtil2PSDEFormId(mobUtil2PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil2psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobUtil2FormCodeName(null);
            this.setMobUtil2PSDEFormId(null);
            this.setMobUtil2PSDEFormName(null);
        } else {
            this.setMobUtil2FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil2PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil2PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobutil2psdeformname")
    public void setMobUtil2PSDEFormName(String mobUtil2PSDEFormName) {
        this._set(DTOFIELD_MOBUTIL2PSDEFORMNAME, mobUtil2PSDEFormName);
    }

    @JsonIgnore
    public String getMobUtil2PSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL2PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil2PSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL2PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobUtil2PSDEFormName() {
        this._reset(DTOFIELD_MOBUTIL2PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil2psdeformname(String mobUtil2PSDEFormName) {
        this.setMobUtil2PSDEFormName(mobUtil2PSDEFormName);
        return this;
    }

    @JsonProperty(value="mobutil3formcodename")
    public void setMobUtil3FormCodeName(String mobUtil3FormCodeName) {
        this._set(DTOFIELD_MOBUTIL3FORMCODENAME, mobUtil3FormCodeName);
    }

    @JsonIgnore
    public String getMobUtil3FormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL3FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil3FormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL3FORMCODENAME);
    }

    @JsonIgnore
    public void resetMobUtil3FormCodeName() {
        this._reset(DTOFIELD_MOBUTIL3FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil3formcodename(String mobUtil3FormCodeName) {
        this.setMobUtil3FormCodeName(mobUtil3FormCodeName);
        return this;
    }

    @JsonProperty(value="mobutil3psdeformid")
    public void setMobUtil3PSDEFormId(String mobUtil3PSDEFormId) {
        this._set(DTOFIELD_MOBUTIL3PSDEFORMID, mobUtil3PSDEFormId);
    }

    @JsonIgnore
    public String getMobUtil3PSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBUTIL3PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil3PSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBUTIL3PSDEFORMID);
    }

    @JsonIgnore
    public void resetMobUtil3PSDEFormId() {
        this._reset(DTOFIELD_MOBUTIL3PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil3psdeformid(String mobUtil3PSDEFormId) {
        this.setMobUtil3PSDEFormId(mobUtil3PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil3psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobUtil3FormCodeName(null);
            this.setMobUtil3PSDEFormId(null);
            this.setMobUtil3PSDEFormName(null);
        } else {
            this.setMobUtil3FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil3PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil3PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobutil3psdeformname")
    public void setMobUtil3PSDEFormName(String mobUtil3PSDEFormName) {
        this._set(DTOFIELD_MOBUTIL3PSDEFORMNAME, mobUtil3PSDEFormName);
    }

    @JsonIgnore
    public String getMobUtil3PSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL3PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil3PSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL3PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobUtil3PSDEFormName() {
        this._reset(DTOFIELD_MOBUTIL3PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil3psdeformname(String mobUtil3PSDEFormName) {
        this.setMobUtil3PSDEFormName(mobUtil3PSDEFormName);
        return this;
    }

    @JsonProperty(value="mobutil4formcodename")
    public void setMobUtil4FormCodeName(String mobUtil4FormCodeName) {
        this._set(DTOFIELD_MOBUTIL4FORMCODENAME, mobUtil4FormCodeName);
    }

    @JsonIgnore
    public String getMobUtil4FormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL4FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil4FormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL4FORMCODENAME);
    }

    @JsonIgnore
    public void resetMobUtil4FormCodeName() {
        this._reset(DTOFIELD_MOBUTIL4FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil4formcodename(String mobUtil4FormCodeName) {
        this.setMobUtil4FormCodeName(mobUtil4FormCodeName);
        return this;
    }

    @JsonProperty(value="mobutil4psdeformid")
    public void setMobUtil4PSDEFormId(String mobUtil4PSDEFormId) {
        this._set(DTOFIELD_MOBUTIL4PSDEFORMID, mobUtil4PSDEFormId);
    }

    @JsonIgnore
    public String getMobUtil4PSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBUTIL4PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil4PSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBUTIL4PSDEFORMID);
    }

    @JsonIgnore
    public void resetMobUtil4PSDEFormId() {
        this._reset(DTOFIELD_MOBUTIL4PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil4psdeformid(String mobUtil4PSDEFormId) {
        this.setMobUtil4PSDEFormId(mobUtil4PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil4psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobUtil4FormCodeName(null);
            this.setMobUtil4PSDEFormId(null);
            this.setMobUtil4PSDEFormName(null);
        } else {
            this.setMobUtil4FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil4PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil4PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobutil4psdeformname")
    public void setMobUtil4PSDEFormName(String mobUtil4PSDEFormName) {
        this._set(DTOFIELD_MOBUTIL4PSDEFORMNAME, mobUtil4PSDEFormName);
    }

    @JsonIgnore
    public String getMobUtil4PSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL4PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil4PSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL4PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobUtil4PSDEFormName() {
        this._reset(DTOFIELD_MOBUTIL4PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil4psdeformname(String mobUtil4PSDEFormName) {
        this.setMobUtil4PSDEFormName(mobUtil4PSDEFormName);
        return this;
    }

    @JsonProperty(value="mobutil5formcodename")
    public void setMobUtil5FormCodeName(String mobUtil5FormCodeName) {
        this._set(DTOFIELD_MOBUTIL5FORMCODENAME, mobUtil5FormCodeName);
    }

    @JsonIgnore
    public String getMobUtil5FormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL5FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil5FormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL5FORMCODENAME);
    }

    @JsonIgnore
    public void resetMobUtil5FormCodeName() {
        this._reset(DTOFIELD_MOBUTIL5FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil5formcodename(String mobUtil5FormCodeName) {
        this.setMobUtil5FormCodeName(mobUtil5FormCodeName);
        return this;
    }

    @JsonProperty(value="mobutil5psdeformid")
    public void setMobUtil5PSDEFormId(String mobUtil5PSDEFormId) {
        this._set(DTOFIELD_MOBUTIL5PSDEFORMID, mobUtil5PSDEFormId);
    }

    @JsonIgnore
    public String getMobUtil5PSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBUTIL5PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil5PSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBUTIL5PSDEFORMID);
    }

    @JsonIgnore
    public void resetMobUtil5PSDEFormId() {
        this._reset(DTOFIELD_MOBUTIL5PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil5psdeformid(String mobUtil5PSDEFormId) {
        this.setMobUtil5PSDEFormId(mobUtil5PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil5psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobUtil5FormCodeName(null);
            this.setMobUtil5PSDEFormId(null);
            this.setMobUtil5PSDEFormName(null);
        } else {
            this.setMobUtil5FormCodeName(pSDEForm.getCodeName());
            this.setMobUtil5PSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtil5PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobutil5psdeformname")
    public void setMobUtil5PSDEFormName(String mobUtil5PSDEFormName) {
        this._set(DTOFIELD_MOBUTIL5PSDEFORMNAME, mobUtil5PSDEFormName);
    }

    @JsonIgnore
    public String getMobUtil5PSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBUTIL5PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtil5PSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBUTIL5PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobUtil5PSDEFormName() {
        this._reset(DTOFIELD_MOBUTIL5PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutil5psdeformname(String mobUtil5PSDEFormName) {
        this.setMobUtil5PSDEFormName(mobUtil5PSDEFormName);
        return this;
    }

    @JsonProperty(value="mobutilformcodename")
    public void setMobUtilFormCodeName(String mobUtilFormCodeName) {
        this._set(DTOFIELD_MOBUTILFORMCODENAME, mobUtilFormCodeName);
    }

    @JsonIgnore
    public String getMobUtilFormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUTILFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtilFormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUTILFORMCODENAME);
    }

    @JsonIgnore
    public void resetMobUtilFormCodeName() {
        this._reset(DTOFIELD_MOBUTILFORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutilformcodename(String mobUtilFormCodeName) {
        this.setMobUtilFormCodeName(mobUtilFormCodeName);
        return this;
    }

    @JsonProperty(value="mobutilpsdeformid")
    public void setMobUtilPSDEFormId(String mobUtilPSDEFormId) {
        this._set(DTOFIELD_MOBUTILPSDEFORMID, mobUtilPSDEFormId);
    }

    @JsonIgnore
    public String getMobUtilPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBUTILPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtilPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBUTILPSDEFORMID);
    }

    @JsonIgnore
    public void resetMobUtilPSDEFormId() {
        this._reset(DTOFIELD_MOBUTILPSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutilpsdeformid(String mobUtilPSDEFormId) {
        this.setMobUtilPSDEFormId(mobUtilPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobutilpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobUtilFormCodeName(null);
            this.setMobUtilPSDEFormId(null);
            this.setMobUtilPSDEFormName(null);
        } else {
            this.setMobUtilFormCodeName(pSDEForm.getCodeName());
            this.setMobUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobutilpsdeformname")
    public void setMobUtilPSDEFormName(String mobUtilPSDEFormName) {
        this._set(DTOFIELD_MOBUTILPSDEFORMNAME, mobUtilPSDEFormName);
    }

    @JsonIgnore
    public String getMobUtilPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBUTILPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtilPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBUTILPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobUtilPSDEFormName() {
        this._reset(DTOFIELD_MOBUTILPSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO mobutilpsdeformname(String mobUtilPSDEFormName) {
        this.setMobUtilPSDEFormName(mobUtilPSDEFormName);
        return this;
    }

    @JsonProperty(value="mobwfeditviewtype")
    public void setMobWFEditViewType(String mobWFEditViewType) {
        this._set(DTOFIELD_MOBWFEDITVIEWTYPE, mobWFEditViewType);
    }

    @JsonIgnore
    public String getMobWFEditViewType() {
        Object objValue = this._get(DTOFIELD_MOBWFEDITVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobWFEditViewTypeDirty() {
        return this._contains(DTOFIELD_MOBWFEDITVIEWTYPE);
    }

    @JsonIgnore
    public void resetMobWFEditViewType() {
        this._reset(DTOFIELD_MOBWFEDITVIEWTYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO mobwfeditviewtype(String mobWFEditViewType) {
        this.setMobWFEditViewType(mobWFEditViewType);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO mobwfeditviewtype(PSModelEnums.DEMobWFEditViewType mobWFEditViewType) {
        if (mobWFEditViewType == null) {
            this.setMobWFEditViewType(null);
        } else {
            this.setMobWFEditViewType(mobWFEditViewType.value);
        }
        return this;
    }

    @JsonProperty(value="modelid")
    public void setModelId(String modelId) {
        this._set(DTOFIELD_MODELID, modelId);
    }

    @JsonIgnore
    public String getModelId() {
        Object objValue = this._get(DTOFIELD_MODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelIdDirty() {
        return this._contains(DTOFIELD_MODELID);
    }

    @JsonIgnore
    public void resetModelId() {
        this._reset(DTOFIELD_MODELID);
    }

    @JsonIgnore
    public PSWFProcessDTO modelid(String modelId) {
        this.setModelId(modelId);
        return this;
    }

    @JsonProperty(value="msgtype")
    public void setMsgType(Integer msgType) {
        this._set(DTOFIELD_MSGTYPE, msgType);
    }

    @JsonIgnore
    public Integer getMsgType() {
        Object objValue = this._get(DTOFIELD_MSGTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMsgTypeDirty() {
        return this._contains(DTOFIELD_MSGTYPE);
    }

    @JsonIgnore
    public void resetMsgType() {
        this._reset(DTOFIELD_MSGTYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO msgtype(Integer msgType) {
        this.setMsgType(msgType);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO msgtype(PSModelEnums.InfomMsgType[] msgType) {
        if (msgType == null || msgType.length == 0) {
            this.setMsgType(null);
        } else {
            int _value = 0;
            for (PSModelEnums.InfomMsgType _item : msgType) {
                _value |= _item.value;
            }
            this.setMsgType(_value);
        }
        return this;
    }

    @JsonProperty(value="multiinstmode")
    public void setMultiInstMode(String multiInstMode) {
        this._set(DTOFIELD_MULTIINSTMODE, multiInstMode);
    }

    @JsonIgnore
    public String getMultiInstMode() {
        Object objValue = this._get(DTOFIELD_MULTIINSTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMultiInstModeDirty() {
        return this._contains(DTOFIELD_MULTIINSTMODE);
    }

    @JsonIgnore
    public void resetMultiInstMode() {
        this._reset(DTOFIELD_MULTIINSTMODE);
    }

    @JsonIgnore
    public PSWFProcessDTO multiinstmode(String multiInstMode) {
        this.setMultiInstMode(multiInstMode);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO multiinstmode(PSModelEnums.WFProcMultiInstMode multiInstMode) {
        if (multiInstMode == null) {
            this.setMultiInstMode(null);
        } else {
            this.setMultiInstMode(multiInstMode.value);
        }
        return this;
    }

    @JsonProperty(value="namepslanresid")
    public void setNamePSLanResId(String namePSLanResId) {
        this._set(DTOFIELD_NAMEPSLANRESID, namePSLanResId);
    }

    @JsonIgnore
    public String getNamePSLanResId() {
        Object objValue = this._get(DTOFIELD_NAMEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSLanResIdDirty() {
        return this._contains(DTOFIELD_NAMEPSLANRESID);
    }

    @JsonIgnore
    public void resetNamePSLanResId() {
        this._reset(DTOFIELD_NAMEPSLANRESID);
    }

    @JsonIgnore
    public PSWFProcessDTO namepslanresid(String namePSLanResId) {
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO namepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        } else {
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="namepslanresname")
    public void setNamePSLanResName(String namePSLanResName) {
        this._set(DTOFIELD_NAMEPSLANRESNAME, namePSLanResName);
    }

    @JsonIgnore
    public String getNamePSLanResName() {
        Object objValue = this._get(DTOFIELD_NAMEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSLanResNameDirty() {
        return this._contains(DTOFIELD_NAMEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetNamePSLanResName() {
        this._reset(DTOFIELD_NAMEPSLANRESNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO namepslanresname(String namePSLanResName) {
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    @JsonProperty(value="normalproctype")
    public void setNormalProcType(String normalProcType) {
        this._set(DTOFIELD_NORMALPROCTYPE, normalProcType);
    }

    @JsonIgnore
    public String getNormalProcType() {
        Object objValue = this._get(DTOFIELD_NORMALPROCTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNormalProcTypeDirty() {
        return this._contains(DTOFIELD_NORMALPROCTYPE);
    }

    @JsonIgnore
    public void resetNormalProcType() {
        this._reset(DTOFIELD_NORMALPROCTYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO normalproctype(String normalProcType) {
        this.setNormalProcType(normalProcType);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO normalproctype(PSModelEnums.WFServiceProcType normalProcType) {
        if (normalProcType == null) {
            this.setNormalProcType(null);
        } else {
            this.setNormalProcType(normalProcType.value);
        }
        return this;
    }

    @JsonProperty(value="predefinedactions")
    public void setPredefinedActions(String predefinedActions) {
        this._set(DTOFIELD_PREDEFINEDACTIONS, predefinedActions);
    }

    @JsonIgnore
    public String getPredefinedActions() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDACTIONS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedActionsDirty() {
        return this._contains(DTOFIELD_PREDEFINEDACTIONS);
    }

    @JsonIgnore
    public void resetPredefinedActions() {
        this._reset(DTOFIELD_PREDEFINEDACTIONS);
    }

    @JsonIgnore
    public PSWFProcessDTO predefinedactions(String predefinedActions) {
        this.setPredefinedActions(predefinedActions);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO predefinedactions(PSModelEnums.WFUtilUIActionType[] predefinedActions) {
        if (predefinedActions == null || predefinedActions.length == 0) {
            this.setPredefinedActions(null);
        } else {
            String _value = "";
            for (PSModelEnums.WFUtilUIActionType _item : predefinedActions) {
                if (_value.length() > 0) {
                    _value = _value + ";";
                }
                _value = _value + _item.value;
            }
            this.setPredefinedActions(_value);
        }
        return this;
    }

    @JsonProperty(value="psdeactionid")
    public void setPSDEActionId(String pSDEActionId) {
        this._set(DTOFIELD_PSDEACTIONID, pSDEActionId);
    }

    @JsonIgnore
    public String getPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public void resetPSDEActionId() {
        this._reset(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public PSWFProcessDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeactionname")
    public void setPSDEActionName(String pSDEActionName) {
        this._set(DTOFIELD_PSDEACTIONNAME, pSDEActionName);
    }

    @JsonIgnore
    public String getPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEActionName() {
        this._reset(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setFormCodeName(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setFormCodeName(pSDEForm.getCodeName());
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
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
    public PSWFProcessDTO psdeid(String pSDEId) {
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
    public PSWFProcessDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
            this.setUAGroupCodeName(null);
        } else {
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
            this.setUAGroupCodeName(pSDEUAGroup.getCodeName());
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
    public PSWFProcessDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="psdeviewbaseid")
    public void setPSDEViewBaseId(String pSDEViewBaseId) {
        this._set(DTOFIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }

    @JsonIgnore
    public String getPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetPSDEViewBaseId() {
        this._reset(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSWFProcessDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
            this.setPSDynaDEViewTemplId(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
            this.setPSDynaDEViewTemplId(pSDEViewBase.getPSDynaDEViewTemplId());
        }
        return this;
    }

    @JsonProperty(value="psdeviewbasename")
    public void setPSDEViewBaseName(String pSDEViewBaseName) {
        this._set(DTOFIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }

    @JsonIgnore
    public String getPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetPSDEViewBaseName() {
        this._reset(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="psdynadeviewtemplid")
    public void setPSDynaDEViewTemplId(String pSDynaDEViewTemplId) {
        this._set(DTOFIELD_PSDYNADEVIEWTEMPLID, pSDynaDEViewTemplId);
    }

    @JsonIgnore
    public String getPSDynaDEViewTemplId() {
        Object objValue = this._get(DTOFIELD_PSDYNADEVIEWTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaDEViewTemplIdDirty() {
        return this._contains(DTOFIELD_PSDYNADEVIEWTEMPLID);
    }

    @JsonIgnore
    public void resetPSDynaDEViewTemplId() {
        this._reset(DTOFIELD_PSDYNADEVIEWTEMPLID);
    }

    @JsonIgnore
    public PSWFProcessDTO psdynadeviewtemplid(String pSDynaDEViewTemplId) {
        this.setPSDynaDEViewTemplId(pSDynaDEViewTemplId);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSWFProcessDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
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
    public PSWFProcessDTO pswfdeid(String pSWFDEId) {
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO pswfdeid(PSWFDEDTO pSWFDE) {
        if (pSWFDE == null) {
            this.setPSDEId(null);
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
        } else {
            this.setPSDEId(pSWFDE.getPSDEId());
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    @JsonProperty(value="pswfdename")
    public void setPSWFDEName(String pSWFDEName) {
        this._set(DTOFIELD_PSWFDENAME, pSWFDEName);
    }

    @JsonIgnore
    public String getPSWFDEName() {
        Object objValue = this._get(DTOFIELD_PSWFDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDENameDirty() {
        return this._contains(DTOFIELD_PSWFDENAME);
    }

    @JsonIgnore
    public void resetPSWFDEName() {
        this._reset(DTOFIELD_PSWFDENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfdename(String pSWFDEName) {
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    @JsonProperty(value="pswfid")
    public void setPSWFId(String pSWFId) {
        this._set(DTOFIELD_PSWFID, pSWFId);
    }

    @JsonIgnore
    public String getPSWFId() {
        Object objValue = this._get(DTOFIELD_PSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFIdDirty() {
        return this._contains(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public void resetPSWFId() {
        this._reset(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO pswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWFId(null);
        } else {
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
        }
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonProperty(value="pswfprocessname")
    public void setPSWFProcessName(String pSWFProcessName) {
        this._set(DTOFIELD_PSWFPROCESSNAME, pSWFProcessName);
    }

    @JsonIgnore
    public String getPSWFProcessName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public void resetPSWFProcessName() {
        this._reset(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfprocessname(String pSWFProcessName) {
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFProcessName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFProcessName(strName);
    }

    @JsonIgnore
    public PSWFProcessDTO name(String strName) {
        this.setPSWFProcessName(strName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO pswfversionid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
            this.setWFEngineType(null);
        } else {
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
            this.setWFEngineType(pSWFVersion.getWFEngineType());
        }
        return this;
    }

    @JsonProperty(value="pswfversionname")
    public void setPSWFVersionName(String pSWFVersionName) {
        this._set(DTOFIELD_PSWFVERSIONNAME, pSWFVersionName);
    }

    @JsonIgnore
    public String getPSWFVersionName() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionNameDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public void resetPSWFVersionName() {
        this._reset(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonProperty(value="pswfworktimeid")
    public void setPSWFWorkTimeId(String pSWFWorkTimeId) {
        this._set(DTOFIELD_PSWFWORKTIMEID, pSWFWorkTimeId);
    }

    @JsonIgnore
    public String getPSWFWorkTimeId() {
        Object objValue = this._get(DTOFIELD_PSWFWORKTIMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFWorkTimeIdDirty() {
        return this._contains(DTOFIELD_PSWFWORKTIMEID);
    }

    @JsonIgnore
    public void resetPSWFWorkTimeId() {
        this._reset(DTOFIELD_PSWFWORKTIMEID);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfworktimeid(String pSWFWorkTimeId) {
        this.setPSWFWorkTimeId(pSWFWorkTimeId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO pswfworktimeid(PSWFWorkTimeDTO pSWFWorkTime) {
        if (pSWFWorkTime == null) {
            this.setPSWFWorkTimeId(null);
            this.setPSWFWorkTimeName(null);
        } else {
            this.setPSWFWorkTimeId(pSWFWorkTime.getPSWFWorkTimeId());
            this.setPSWFWorkTimeName(pSWFWorkTime.getPSWFWorkTimeName());
        }
        return this;
    }

    @JsonProperty(value="pswfworktimename")
    public void setPSWFWorkTimeName(String pSWFWorkTimeName) {
        this._set(DTOFIELD_PSWFWORKTIMENAME, pSWFWorkTimeName);
    }

    @JsonIgnore
    public String getPSWFWorkTimeName() {
        Object objValue = this._get(DTOFIELD_PSWFWORKTIMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFWorkTimeNameDirty() {
        return this._contains(DTOFIELD_PSWFWORKTIMENAME);
    }

    @JsonIgnore
    public void resetPSWFWorkTimeName() {
        this._reset(DTOFIELD_PSWFWORKTIMENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO pswfworktimename(String pSWFWorkTimeName) {
        this.setPSWFWorkTimeName(pSWFWorkTimeName);
        return this;
    }

    @JsonProperty(value="refpswfversionid")
    public void setRefPSWFVersionId(String refPSWFVersionId) {
        this._set(DTOFIELD_REFPSWFVERSIONID, refPSWFVersionId);
    }

    @JsonIgnore
    public String getRefPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_REFPSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_REFPSWFVERSIONID);
    }

    @JsonIgnore
    public void resetRefPSWFVersionId() {
        this._reset(DTOFIELD_REFPSWFVERSIONID);
    }

    @JsonIgnore
    public PSWFProcessDTO refpswfversionid(String refPSWFVersionId) {
        this.setRefPSWFVersionId(refPSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO refpswfversionid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setRefPSWFVersionId(null);
            this.setRefPSWFVersionName(null);
        } else {
            this.setRefPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setRefPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    @JsonProperty(value="refpswfversionname")
    public void setRefPSWFVersionName(String refPSWFVersionName) {
        this._set(DTOFIELD_REFPSWFVERSIONNAME, refPSWFVersionName);
    }

    @JsonIgnore
    public String getRefPSWFVersionName() {
        Object objValue = this._get(DTOFIELD_REFPSWFVERSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSWFVersionNameDirty() {
        return this._contains(DTOFIELD_REFPSWFVERSIONNAME);
    }

    @JsonIgnore
    public void resetRefPSWFVersionName() {
        this._reset(DTOFIELD_REFPSWFVERSIONNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO refpswfversionname(String refPSWFVersionName) {
        this.setRefPSWFVersionName(refPSWFVersionName);
        return this;
    }

    @JsonProperty(value="sendinform")
    public void setSendInform(Integer sendInform) {
        this._set(DTOFIELD_SENDINFORM, sendInform);
    }

    @JsonIgnore
    public Integer getSendInform() {
        Object objValue = this._get(DTOFIELD_SENDINFORM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSendInformDirty() {
        return this._contains(DTOFIELD_SENDINFORM);
    }

    @JsonIgnore
    public void resetSendInform() {
        this._reset(DTOFIELD_SENDINFORM);
    }

    @JsonIgnore
    public PSWFProcessDTO sendinform(Integer sendInform) {
        this.setSendInform(sendInform);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO sendinform(Boolean sendInform) {
        if (sendInform == null) {
            this.setSendInform(null);
        } else {
            this.setSendInform(sendInform != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="shapeparams")
    public void setShapeParams(String shapeParams) {
        this._set(DTOFIELD_SHAPEPARAMS, shapeParams);
    }

    @JsonIgnore
    public String getShapeParams() {
        Object objValue = this._get(DTOFIELD_SHAPEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeParamsDirty() {
        return this._contains(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public void resetShapeParams() {
        this._reset(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public PSWFProcessDTO shapeparams(String shapeParams) {
        this.setShapeParams(shapeParams);
        return this;
    }

    @JsonProperty(value="timeout")
    public void setTimeout(Integer timeout) {
        this._set(DTOFIELD_TIMEOUT, timeout);
    }

    @JsonIgnore
    public Integer getTimeout() {
        Object objValue = this._get(DTOFIELD_TIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTimeoutDirty() {
        return this._contains(DTOFIELD_TIMEOUT);
    }

    @JsonIgnore
    public void resetTimeout() {
        this._reset(DTOFIELD_TIMEOUT);
    }

    @JsonIgnore
    public PSWFProcessDTO timeout(Integer timeout) {
        this.setTimeout(timeout);
        return this;
    }

    @JsonProperty(value="timeoutpsdefid")
    public void setTimeoutPSDEFId(String timeoutPSDEFId) {
        this._set(DTOFIELD_TIMEOUTPSDEFID, timeoutPSDEFId);
    }

    @JsonIgnore
    public String getTimeoutPSDEFId() {
        Object objValue = this._get(DTOFIELD_TIMEOUTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimeoutPSDEFIdDirty() {
        return this._contains(DTOFIELD_TIMEOUTPSDEFID);
    }

    @JsonIgnore
    public void resetTimeoutPSDEFId() {
        this._reset(DTOFIELD_TIMEOUTPSDEFID);
    }

    @JsonIgnore
    public PSWFProcessDTO timeoutpsdefid(String timeoutPSDEFId) {
        this.setTimeoutPSDEFId(timeoutPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO timeoutpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTimeoutPSDEFId(null);
            this.setTimeoutPSDEFName(null);
        } else {
            this.setTimeoutPSDEFId(pSDEField.getPSDEFieldId());
            this.setTimeoutPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="timeoutpsdefname")
    public void setTimeoutPSDEFName(String timeoutPSDEFName) {
        this._set(DTOFIELD_TIMEOUTPSDEFNAME, timeoutPSDEFName);
    }

    @JsonIgnore
    public String getTimeoutPSDEFName() {
        Object objValue = this._get(DTOFIELD_TIMEOUTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimeoutPSDEFNameDirty() {
        return this._contains(DTOFIELD_TIMEOUTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTimeoutPSDEFName() {
        this._reset(DTOFIELD_TIMEOUTPSDEFNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO timeoutpsdefname(String timeoutPSDEFName) {
        this.setTimeoutPSDEFName(timeoutPSDEFName);
        return this;
    }

    @JsonProperty(value="timeouttype")
    public void setTimeoutType(String timeoutType) {
        this._set(DTOFIELD_TIMEOUTTYPE, timeoutType);
    }

    @JsonIgnore
    public String getTimeoutType() {
        Object objValue = this._get(DTOFIELD_TIMEOUTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimeoutTypeDirty() {
        return this._contains(DTOFIELD_TIMEOUTTYPE);
    }

    @JsonIgnore
    public void resetTimeoutType() {
        this._reset(DTOFIELD_TIMEOUTTYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO timeouttype(String timeoutType) {
        this.setTimeoutType(timeoutType);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO timeouttype(PSModelEnums.WFTimeoutType timeoutType) {
        if (timeoutType == null) {
            this.setTimeoutType(null);
        } else {
            this.setTimeoutType(timeoutType.value);
        }
        return this;
    }

    @JsonProperty(value="toppos")
    public void setTopPos(Integer topPos) {
        this._set(DTOFIELD_TOPPOS, topPos);
    }

    @JsonIgnore
    public Integer getTopPos() {
        Object objValue = this._get(DTOFIELD_TOPPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTopPosDirty() {
        return this._contains(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public void resetTopPos() {
        this._reset(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public PSWFProcessDTO toppos(Integer topPos) {
        this.setTopPos(topPos);
        return this;
    }

    @JsonProperty(value="uagroupcodename")
    public void setUAGroupCodeName(String uAGroupCodeName) {
        this._set(DTOFIELD_UAGROUPCODENAME, uAGroupCodeName);
    }

    @JsonIgnore
    public String getUAGroupCodeName() {
        Object objValue = this._get(DTOFIELD_UAGROUPCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAGroupCodeNameDirty() {
        return this._contains(DTOFIELD_UAGROUPCODENAME);
    }

    @JsonIgnore
    public void resetUAGroupCodeName() {
        this._reset(DTOFIELD_UAGROUPCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO uagroupcodename(String uAGroupCodeName) {
        this.setUAGroupCodeName(uAGroupCodeName);
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
    public PSWFProcessDTO updatedate(Timestamp updateDate) {
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
    public PSWFProcessDTO updateman(String updateMan) {
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
    public PSWFProcessDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSWFProcessDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSWFProcessDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSWFProcessDTO usertag(String userTag) {
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
    public PSWFProcessDTO usertag2(String userTag2) {
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
    public PSWFProcessDTO usertag3(String userTag3) {
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
    public PSWFProcessDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="util2formcodename")
    public void setUtil2FormCodeName(String util2FormCodeName) {
        this._set(DTOFIELD_UTIL2FORMCODENAME, util2FormCodeName);
    }

    @JsonIgnore
    public String getUtil2FormCodeName() {
        Object objValue = this._get(DTOFIELD_UTIL2FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil2FormCodeNameDirty() {
        return this._contains(DTOFIELD_UTIL2FORMCODENAME);
    }

    @JsonIgnore
    public void resetUtil2FormCodeName() {
        this._reset(DTOFIELD_UTIL2FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util2formcodename(String util2FormCodeName) {
        this.setUtil2FormCodeName(util2FormCodeName);
        return this;
    }

    @JsonProperty(value="util2psdeformid")
    public void setUtil2PSDEFormId(String util2PSDEFormId) {
        this._set(DTOFIELD_UTIL2PSDEFORMID, util2PSDEFormId);
    }

    @JsonIgnore
    public String getUtil2PSDEFormId() {
        Object objValue = this._get(DTOFIELD_UTIL2PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil2PSDEFormIdDirty() {
        return this._contains(DTOFIELD_UTIL2PSDEFORMID);
    }

    @JsonIgnore
    public void resetUtil2PSDEFormId() {
        this._reset(DTOFIELD_UTIL2PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO util2psdeformid(String util2PSDEFormId) {
        this.setUtil2PSDEFormId(util2PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO util2psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setUtil2FormCodeName(null);
            this.setUtil2PSDEFormId(null);
            this.setUtil2PSDEFormName(null);
        } else {
            this.setUtil2FormCodeName(pSDEForm.getCodeName());
            this.setUtil2PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil2PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="util2psdeformname")
    public void setUtil2PSDEFormName(String util2PSDEFormName) {
        this._set(DTOFIELD_UTIL2PSDEFORMNAME, util2PSDEFormName);
    }

    @JsonIgnore
    public String getUtil2PSDEFormName() {
        Object objValue = this._get(DTOFIELD_UTIL2PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil2PSDEFormNameDirty() {
        return this._contains(DTOFIELD_UTIL2PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetUtil2PSDEFormName() {
        this._reset(DTOFIELD_UTIL2PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util2psdeformname(String util2PSDEFormName) {
        this.setUtil2PSDEFormName(util2PSDEFormName);
        return this;
    }

    @JsonProperty(value="util3formcodename")
    public void setUtil3FormCodeName(String util3FormCodeName) {
        this._set(DTOFIELD_UTIL3FORMCODENAME, util3FormCodeName);
    }

    @JsonIgnore
    public String getUtil3FormCodeName() {
        Object objValue = this._get(DTOFIELD_UTIL3FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil3FormCodeNameDirty() {
        return this._contains(DTOFIELD_UTIL3FORMCODENAME);
    }

    @JsonIgnore
    public void resetUtil3FormCodeName() {
        this._reset(DTOFIELD_UTIL3FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util3formcodename(String util3FormCodeName) {
        this.setUtil3FormCodeName(util3FormCodeName);
        return this;
    }

    @JsonProperty(value="util3psdeformid")
    public void setUtil3PSDEFormId(String util3PSDEFormId) {
        this._set(DTOFIELD_UTIL3PSDEFORMID, util3PSDEFormId);
    }

    @JsonIgnore
    public String getUtil3PSDEFormId() {
        Object objValue = this._get(DTOFIELD_UTIL3PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil3PSDEFormIdDirty() {
        return this._contains(DTOFIELD_UTIL3PSDEFORMID);
    }

    @JsonIgnore
    public void resetUtil3PSDEFormId() {
        this._reset(DTOFIELD_UTIL3PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO util3psdeformid(String util3PSDEFormId) {
        this.setUtil3PSDEFormId(util3PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO util3psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setUtil3FormCodeName(null);
            this.setUtil3PSDEFormId(null);
            this.setUtil3PSDEFormName(null);
        } else {
            this.setUtil3FormCodeName(pSDEForm.getCodeName());
            this.setUtil3PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil3PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="util3psdeformname")
    public void setUtil3PSDEFormName(String util3PSDEFormName) {
        this._set(DTOFIELD_UTIL3PSDEFORMNAME, util3PSDEFormName);
    }

    @JsonIgnore
    public String getUtil3PSDEFormName() {
        Object objValue = this._get(DTOFIELD_UTIL3PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil3PSDEFormNameDirty() {
        return this._contains(DTOFIELD_UTIL3PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetUtil3PSDEFormName() {
        this._reset(DTOFIELD_UTIL3PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util3psdeformname(String util3PSDEFormName) {
        this.setUtil3PSDEFormName(util3PSDEFormName);
        return this;
    }

    @JsonProperty(value="util4formcodename")
    public void setUtil4FormCodeName(String util4FormCodeName) {
        this._set(DTOFIELD_UTIL4FORMCODENAME, util4FormCodeName);
    }

    @JsonIgnore
    public String getUtil4FormCodeName() {
        Object objValue = this._get(DTOFIELD_UTIL4FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil4FormCodeNameDirty() {
        return this._contains(DTOFIELD_UTIL4FORMCODENAME);
    }

    @JsonIgnore
    public void resetUtil4FormCodeName() {
        this._reset(DTOFIELD_UTIL4FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util4formcodename(String util4FormCodeName) {
        this.setUtil4FormCodeName(util4FormCodeName);
        return this;
    }

    @JsonProperty(value="util4psdeformid")
    public void setUtil4PSDEFormId(String util4PSDEFormId) {
        this._set(DTOFIELD_UTIL4PSDEFORMID, util4PSDEFormId);
    }

    @JsonIgnore
    public String getUtil4PSDEFormId() {
        Object objValue = this._get(DTOFIELD_UTIL4PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil4PSDEFormIdDirty() {
        return this._contains(DTOFIELD_UTIL4PSDEFORMID);
    }

    @JsonIgnore
    public void resetUtil4PSDEFormId() {
        this._reset(DTOFIELD_UTIL4PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO util4psdeformid(String util4PSDEFormId) {
        this.setUtil4PSDEFormId(util4PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO util4psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setUtil4FormCodeName(null);
            this.setUtil4PSDEFormId(null);
            this.setUtil4PSDEFormName(null);
        } else {
            this.setUtil4FormCodeName(pSDEForm.getCodeName());
            this.setUtil4PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil4PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="util4psdeformname")
    public void setUtil4PSDEFormName(String util4PSDEFormName) {
        this._set(DTOFIELD_UTIL4PSDEFORMNAME, util4PSDEFormName);
    }

    @JsonIgnore
    public String getUtil4PSDEFormName() {
        Object objValue = this._get(DTOFIELD_UTIL4PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil4PSDEFormNameDirty() {
        return this._contains(DTOFIELD_UTIL4PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetUtil4PSDEFormName() {
        this._reset(DTOFIELD_UTIL4PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util4psdeformname(String util4PSDEFormName) {
        this.setUtil4PSDEFormName(util4PSDEFormName);
        return this;
    }

    @JsonProperty(value="util5formcodename")
    public void setUtil5FormCodeName(String util5FormCodeName) {
        this._set(DTOFIELD_UTIL5FORMCODENAME, util5FormCodeName);
    }

    @JsonIgnore
    public String getUtil5FormCodeName() {
        Object objValue = this._get(DTOFIELD_UTIL5FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil5FormCodeNameDirty() {
        return this._contains(DTOFIELD_UTIL5FORMCODENAME);
    }

    @JsonIgnore
    public void resetUtil5FormCodeName() {
        this._reset(DTOFIELD_UTIL5FORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util5formcodename(String util5FormCodeName) {
        this.setUtil5FormCodeName(util5FormCodeName);
        return this;
    }

    @JsonProperty(value="util5psdeformid")
    public void setUtil5PSDEFormId(String util5PSDEFormId) {
        this._set(DTOFIELD_UTIL5PSDEFORMID, util5PSDEFormId);
    }

    @JsonIgnore
    public String getUtil5PSDEFormId() {
        Object objValue = this._get(DTOFIELD_UTIL5PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil5PSDEFormIdDirty() {
        return this._contains(DTOFIELD_UTIL5PSDEFORMID);
    }

    @JsonIgnore
    public void resetUtil5PSDEFormId() {
        this._reset(DTOFIELD_UTIL5PSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO util5psdeformid(String util5PSDEFormId) {
        this.setUtil5PSDEFormId(util5PSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO util5psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setUtil5FormCodeName(null);
            this.setUtil5PSDEFormId(null);
            this.setUtil5PSDEFormName(null);
        } else {
            this.setUtil5FormCodeName(pSDEForm.getCodeName());
            this.setUtil5PSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtil5PSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="util5psdeformname")
    public void setUtil5PSDEFormName(String util5PSDEFormName) {
        this._set(DTOFIELD_UTIL5PSDEFORMNAME, util5PSDEFormName);
    }

    @JsonIgnore
    public String getUtil5PSDEFormName() {
        Object objValue = this._get(DTOFIELD_UTIL5PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtil5PSDEFormNameDirty() {
        return this._contains(DTOFIELD_UTIL5PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetUtil5PSDEFormName() {
        this._reset(DTOFIELD_UTIL5PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO util5psdeformname(String util5PSDEFormName) {
        this.setUtil5PSDEFormName(util5PSDEFormName);
        return this;
    }

    @JsonProperty(value="utilformcodename")
    public void setUtilFormCodeName(String utilFormCodeName) {
        this._set(DTOFIELD_UTILFORMCODENAME, utilFormCodeName);
    }

    @JsonIgnore
    public String getUtilFormCodeName() {
        Object objValue = this._get(DTOFIELD_UTILFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilFormCodeNameDirty() {
        return this._contains(DTOFIELD_UTILFORMCODENAME);
    }

    @JsonIgnore
    public void resetUtilFormCodeName() {
        this._reset(DTOFIELD_UTILFORMCODENAME);
    }

    @JsonIgnore
    public PSWFProcessDTO utilformcodename(String utilFormCodeName) {
        this.setUtilFormCodeName(utilFormCodeName);
        return this;
    }

    @JsonProperty(value="utilpsdeformid")
    public void setUtilPSDEFormId(String utilPSDEFormId) {
        this._set(DTOFIELD_UTILPSDEFORMID, utilPSDEFormId);
    }

    @JsonIgnore
    public String getUtilPSDEFormId() {
        Object objValue = this._get(DTOFIELD_UTILPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDEFormIdDirty() {
        return this._contains(DTOFIELD_UTILPSDEFORMID);
    }

    @JsonIgnore
    public void resetUtilPSDEFormId() {
        this._reset(DTOFIELD_UTILPSDEFORMID);
    }

    @JsonIgnore
    public PSWFProcessDTO utilpsdeformid(String utilPSDEFormId) {
        this.setUtilPSDEFormId(utilPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO utilpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setUtilFormCodeName(null);
            this.setUtilPSDEFormId(null);
            this.setUtilPSDEFormName(null);
        } else {
            this.setUtilFormCodeName(pSDEForm.getCodeName());
            this.setUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="utilpsdeformname")
    public void setUtilPSDEFormName(String utilPSDEFormName) {
        this._set(DTOFIELD_UTILPSDEFORMNAME, utilPSDEFormName);
    }

    @JsonIgnore
    public String getUtilPSDEFormName() {
        Object objValue = this._get(DTOFIELD_UTILPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDEFormNameDirty() {
        return this._contains(DTOFIELD_UTILPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetUtilPSDEFormName() {
        this._reset(DTOFIELD_UTILPSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFProcessDTO utilpsdeformname(String utilPSDEFormName) {
        this.setUtilPSDEFormName(utilPSDEFormName);
        return this;
    }

    @JsonProperty(value="wfeditviewtype")
    public void setWFEditViewType(String wFEditViewType) {
        this._set(DTOFIELD_WFEDITVIEWTYPE, wFEditViewType);
    }

    @JsonIgnore
    public String getWFEditViewType() {
        Object objValue = this._get(DTOFIELD_WFEDITVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFEditViewTypeDirty() {
        return this._contains(DTOFIELD_WFEDITVIEWTYPE);
    }

    @JsonIgnore
    public void resetWFEditViewType() {
        this._reset(DTOFIELD_WFEDITVIEWTYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO wfeditviewtype(String wFEditViewType) {
        this.setWFEditViewType(wFEditViewType);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO wfeditviewtype(PSModelEnums.DEWFEditViewType wFEditViewType) {
        if (wFEditViewType == null) {
            this.setWFEditViewType(null);
        } else {
            this.setWFEditViewType(wFEditViewType.value);
        }
        return this;
    }

    @JsonProperty(value="wfenginetype")
    public void setWFEngineType(String wFEngineType) {
        this._set(DTOFIELD_WFENGINETYPE, wFEngineType);
    }

    @JsonIgnore
    public String getWFEngineType() {
        Object objValue = this._get(DTOFIELD_WFENGINETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFEngineTypeDirty() {
        return this._contains(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public void resetWFEngineType() {
        this._reset(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO wfenginetype(String wFEngineType) {
        this.setWFEngineType(wFEngineType);
        return this;
    }

    @JsonProperty(value="wfprocesstype")
    public void setWFProcessType(String wFProcessType) {
        this._set(DTOFIELD_WFPROCESSTYPE, wFProcessType);
    }

    @JsonIgnore
    public String getWFProcessType() {
        Object objValue = this._get(DTOFIELD_WFPROCESSTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFProcessTypeDirty() {
        return this._contains(DTOFIELD_WFPROCESSTYPE);
    }

    @JsonIgnore
    public void resetWFProcessType() {
        this._reset(DTOFIELD_WFPROCESSTYPE);
    }

    @JsonIgnore
    public PSWFProcessDTO wfprocesstype(String wFProcessType) {
        this.setWFProcessType(wFProcessType);
        return this;
    }

    @JsonIgnore
    public PSWFProcessDTO wfprocesstype(PSModelEnums.WFProcessType wFProcessType) {
        if (wFProcessType == null) {
            this.setWFProcessType(null);
        } else {
            this.setWFProcessType(wFProcessType.value);
        }
        return this;
    }

    @JsonProperty(value="wfstepvalue")
    public void setWFStepValue(String wFStepValue) {
        this._set(DTOFIELD_WFSTEPVALUE, wFStepValue);
    }

    @JsonIgnore
    public String getWFStepValue() {
        Object objValue = this._get(DTOFIELD_WFSTEPVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepValueDirty() {
        return this._contains(DTOFIELD_WFSTEPVALUE);
    }

    @JsonIgnore
    public void resetWFStepValue() {
        this._reset(DTOFIELD_WFSTEPVALUE);
    }

    @JsonIgnore
    public PSWFProcessDTO wfstepvalue(String wFStepValue) {
        this.setWFStepValue(wFStepValue);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(Integer width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public Integer getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWidthDirty() {
        return this._contains(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public void resetWidth() {
        this._reset(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public PSWFProcessDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFProcessId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFProcessId(strValue);
    }

    @JsonIgnore
    public PSWFProcessDTO id(String strValue) {
        this.setPSWFProcessId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSWFProcRoleDTO> getPSWFProcRoles() {
        Object list = this._get(DTOFIELD_PSWFPROCROLES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswfprocroles")
    public void setPSWFProcRoles(List<PSWFProcRoleDTO> pswfprocroles) {
        this._set(DTOFIELD_PSWFPROCROLES, pswfprocroles);
    }

    @JsonIgnore
    public List<PSWFProcRoleDTO> getPSWFProcRolesIf() {
        Object list = this._get(DTOFIELD_PSWFPROCROLES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFPROCROLES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSWFProcSubWFDTO> getPSWFProcSubWFs() {
        Object list = this._get(DTOFIELD_PSWFPROCSUBWFS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswfprocsubwfs")
    public void setPSWFProcSubWFs(List<PSWFProcSubWFDTO> pswfprocsubwfs) {
        this._set(DTOFIELD_PSWFPROCSUBWFS, pswfprocsubwfs);
    }

    @JsonIgnore
    public List<PSWFProcSubWFDTO> getPSWFProcSubWFsIf() {
        Object list = this._get(DTOFIELD_PSWFPROCSUBWFS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFPROCSUBWFS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSWFProcParamDTO> getPSWFProcParams() {
        Object list = this._get(DTOFIELD_PSWFPROCPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswfprocparams")
    public void setPSWFProcParams(List<PSWFProcParamDTO> pswfprocparams) {
        this._set(DTOFIELD_PSWFPROCPARAMS, pswfprocparams);
    }

    @JsonIgnore
    public List<PSWFProcParamDTO> getPSWFProcParamsIf() {
        Object list = this._get(DTOFIELD_PSWFPROCPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFPROCPARAMS, list);
        }
        return (List) list;
    }
}