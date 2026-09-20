package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEToolbarDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ICONALIGN = "ICONALIGN";
    protected static final String DTOFIELD_ICONALIGN = "iconalign";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFLAG = "MOBFLAG";
    protected static final String DTOFIELD_MOBFLAG = "mobflag";
    public static final String FIELD_NO2PSDEUAGROUPID = "NO2PSDEUAGROUPID";
    protected static final String DTOFIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";
    public static final String FIELD_NO2PSDEUAGROUPNAME = "NO2PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";
    public static final String FIELD_NO3PSDEUAGROUPID = "NO3PSDEUAGROUPID";
    protected static final String DTOFIELD_NO3PSDEUAGROUPID = "no3psdeuagroupid";
    public static final String FIELD_NO3PSDEUAGROUPNAME = "NO3PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO3PSDEUAGROUPNAME = "no3psdeuagroupname";
    public static final String FIELD_NO4PSDEUAGROUPID = "NO4PSDEUAGROUPID";
    protected static final String DTOFIELD_NO4PSDEUAGROUPID = "no4psdeuagroupid";
    public static final String FIELD_NO4PSDEUAGROUPNAME = "NO4PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO4PSDEUAGROUPNAME = "no4psdeuagroupname";
    public static final String FIELD_NO5PSDEUAGROUPID = "NO5PSDEUAGROUPID";
    protected static final String DTOFIELD_NO5PSDEUAGROUPID = "no5psdeuagroupid";
    public static final String FIELD_NO5PSDEUAGROUPNAME = "NO5PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO5PSDEUAGROUPNAME = "no5psdeuagroupname";
    public static final String FIELD_NO6PSDEUAGROUPID = "NO6PSDEUAGROUPID";
    protected static final String DTOFIELD_NO6PSDEUAGROUPID = "no6psdeuagroupid";
    public static final String FIELD_NO6PSDEUAGROUPNAME = "NO6PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO6PSDEUAGROUPNAME = "no6psdeuagroupname";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSTOOLBARID = "PSSYSTOOLBARID";
    protected static final String DTOFIELD_PSSYSTOOLBARID = "pssystoolbarid";
    public static final String FIELD_PSSYSTOOLBARNAME = "PSSYSTOOLBARNAME";
    protected static final String DTOFIELD_PSSYSTOOLBARNAME = "pssystoolbarname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_TOOLBARSN = "TOOLBARSN";
    protected static final String DTOFIELD_TOOLBARSN = "toolbarsn";
    public static final String FIELD_TOOLBARSTYLE = "TOOLBARSTYLE";
    protected static final String DTOFIELD_TOOLBARSTYLE = "toolbarstyle";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String DTOFIELD_PSDETBITEMS = "psdetbitems";
    public static final String DTOFIELD_PSDETOOLBARLOGICS = "psdetoolbarlogics";

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
    public PSDEToolbarDTO codename(String codeName) {
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
    public PSDEToolbarDTO createdate(Timestamp createDate) {
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
    public PSDEToolbarDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="iconalign")
    public void setIconAlign(String iconAlign) {
        this._set(DTOFIELD_ICONALIGN, iconAlign);
    }

    @JsonIgnore
    public String getIconAlign() {
        Object objValue = this._get(DTOFIELD_ICONALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconAlignDirty() {
        return this._contains(DTOFIELD_ICONALIGN);
    }

    @JsonIgnore
    public void resetIconAlign() {
        this._reset(DTOFIELD_ICONALIGN);
    }

    @JsonIgnore
    public PSDEToolbarDTO iconalign(String iconAlign) {
        this.setIconAlign(iconAlign);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO iconalign(PSModelEnums.ButtonIconAlign iconAlign) {
        if (iconAlign == null) {
            this.setIconAlign(null);
        } else {
            this.setIconAlign(iconAlign.value);
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
    public PSDEToolbarDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobflag")
    public void setMobFlag(Integer mobFlag) {
        this._set(DTOFIELD_MOBFLAG, mobFlag);
    }

    @JsonIgnore
    public Integer getMobFlag() {
        Object objValue = this._get(DTOFIELD_MOBFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMobFlagDirty() {
        return this._contains(DTOFIELD_MOBFLAG);
    }

    @JsonIgnore
    public void resetMobFlag() {
        this._reset(DTOFIELD_MOBFLAG);
    }

    @JsonIgnore
    public PSDEToolbarDTO mobflag(Integer mobFlag) {
        this.setMobFlag(mobFlag);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO mobflag(Boolean mobFlag) {
        if (mobFlag == null) {
            this.setMobFlag(null);
        } else {
            this.setMobFlag(mobFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupid")
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId) {
        this._set(DTOFIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo2PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo2PSDEUAGroupId() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO no2psdeuagroupid(String no2PSDEUAGroupId) {
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo2PSDEUAGroupId(null);
            this.setNo2PSDEUAGroupName(null);
        } else {
            this.setNo2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupname")
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName) {
        this._set(DTOFIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo2PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo2PSDEUAGroupName() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO no2psdeuagroupname(String no2PSDEUAGroupName) {
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no3psdeuagroupid")
    public void setNo3PSDEUAGroupId(String no3PSDEUAGroupId) {
        this._set(DTOFIELD_NO3PSDEUAGROUPID, no3PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo3PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO3PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO3PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo3PSDEUAGroupId() {
        this._reset(DTOFIELD_NO3PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO no3psdeuagroupid(String no3PSDEUAGroupId) {
        this.setNo3PSDEUAGroupId(no3PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO no3psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo3PSDEUAGroupId(null);
            this.setNo3PSDEUAGroupName(null);
        } else {
            this.setNo3PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo3PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no3psdeuagroupname")
    public void setNo3PSDEUAGroupName(String no3PSDEUAGroupName) {
        this._set(DTOFIELD_NO3PSDEUAGROUPNAME, no3PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo3PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO3PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO3PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo3PSDEUAGroupName() {
        this._reset(DTOFIELD_NO3PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO no3psdeuagroupname(String no3PSDEUAGroupName) {
        this.setNo3PSDEUAGroupName(no3PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no4psdeuagroupid")
    public void setNo4PSDEUAGroupId(String no4PSDEUAGroupId) {
        this._set(DTOFIELD_NO4PSDEUAGROUPID, no4PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo4PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO4PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO4PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo4PSDEUAGroupId() {
        this._reset(DTOFIELD_NO4PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO no4psdeuagroupid(String no4PSDEUAGroupId) {
        this.setNo4PSDEUAGroupId(no4PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO no4psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo4PSDEUAGroupId(null);
            this.setNo4PSDEUAGroupName(null);
        } else {
            this.setNo4PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo4PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no4psdeuagroupname")
    public void setNo4PSDEUAGroupName(String no4PSDEUAGroupName) {
        this._set(DTOFIELD_NO4PSDEUAGROUPNAME, no4PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo4PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO4PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO4PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo4PSDEUAGroupName() {
        this._reset(DTOFIELD_NO4PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO no4psdeuagroupname(String no4PSDEUAGroupName) {
        this.setNo4PSDEUAGroupName(no4PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no5psdeuagroupid")
    public void setNo5PSDEUAGroupId(String no5PSDEUAGroupId) {
        this._set(DTOFIELD_NO5PSDEUAGROUPID, no5PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo5PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO5PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo5PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO5PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo5PSDEUAGroupId() {
        this._reset(DTOFIELD_NO5PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO no5psdeuagroupid(String no5PSDEUAGroupId) {
        this.setNo5PSDEUAGroupId(no5PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO no5psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo5PSDEUAGroupId(null);
            this.setNo5PSDEUAGroupName(null);
        } else {
            this.setNo5PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo5PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no5psdeuagroupname")
    public void setNo5PSDEUAGroupName(String no5PSDEUAGroupName) {
        this._set(DTOFIELD_NO5PSDEUAGROUPNAME, no5PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo5PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO5PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo5PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO5PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo5PSDEUAGroupName() {
        this._reset(DTOFIELD_NO5PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO no5psdeuagroupname(String no5PSDEUAGroupName) {
        this.setNo5PSDEUAGroupName(no5PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no6psdeuagroupid")
    public void setNo6PSDEUAGroupId(String no6PSDEUAGroupId) {
        this._set(DTOFIELD_NO6PSDEUAGROUPID, no6PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo6PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO6PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo6PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO6PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo6PSDEUAGroupId() {
        this._reset(DTOFIELD_NO6PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO no6psdeuagroupid(String no6PSDEUAGroupId) {
        this.setNo6PSDEUAGroupId(no6PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO no6psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo6PSDEUAGroupId(null);
            this.setNo6PSDEUAGroupName(null);
        } else {
            this.setNo6PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo6PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no6psdeuagroupname")
    public void setNo6PSDEUAGroupName(String no6PSDEUAGroupName) {
        this._set(DTOFIELD_NO6PSDEUAGROUPNAME, no6PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo6PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO6PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo6PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO6PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo6PSDEUAGroupName() {
        this._reset(DTOFIELD_NO6PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO no6psdeuagroupname(String no6PSDEUAGroupName) {
        this.setNo6PSDEUAGroupName(no6PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="psctrllogicgroupid")
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupId() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupId() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
        if (pSCtrlLogicGroup == null) {
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        } else {
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    @JsonProperty(value="psctrllogicgroupname")
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupName() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupName() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
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
    public PSDEToolbarDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSDEToolbarDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdetoolbarid")
    public void setPSDEToolbarId(String pSDEToolbarId) {
        this._set(DTOFIELD_PSDETOOLBARID, pSDEToolbarId);
    }

    @JsonIgnore
    public String getPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public void resetPSDEToolbarId() {
        this._reset(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public PSDEToolbarDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonProperty(value="psdetoolbarname")
    public void setPSDEToolbarName(String pSDEToolbarName) {
        this._set(DTOFIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }

    @JsonIgnore
    public String getPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetPSDEToolbarName() {
        this._reset(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEToolbarName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEToolbarName(strName);
    }

    @JsonIgnore
    public PSDEToolbarDTO name(String strName) {
        this.setPSDEToolbarName(strName);
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
    public PSDEToolbarDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        } else {
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
    public PSDEToolbarDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
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
    public PSDEToolbarDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSDEToolbarDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssyscounterid")
    public void setPSSysCounterId(String pSSysCounterId) {
        this._set(DTOFIELD_PSSYSCOUNTERID, pSSysCounterId);
    }

    @JsonIgnore
    public String getPSSysCounterId() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterIdDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public void resetPSSysCounterId() {
        this._reset(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public PSDEToolbarDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
        if (pSSysCounter == null) {
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        } else {
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    @JsonProperty(value="pssyscountername")
    public void setPSSysCounterName(String pSSysCounterName) {
        this._set(DTOFIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }

    @JsonIgnore
    public String getPSSysCounterName() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterNameDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public void resetPSSysCounterName() {
        this._reset(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO pssyscountername(String pSSysCounterName) {
        this.setPSSysCounterName(pSSysCounterName);
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
    public PSDEToolbarDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEToolbarDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDEToolbarDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEToolbarDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSDEToolbarDTO pssystoolbarid(String pSSysToolbarId) {
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
    public PSDEToolbarDTO pssystoolbarname(String pSSysToolbarName) {
        this.setPSSysToolbarName(pSSysToolbarName);
        return this;
    }

    @JsonProperty(value="psviewmsggroupid")
    public void setPSViewMsgGroupId(String pSViewMsgGroupId) {
        this._set(DTOFIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }

    @JsonIgnore
    public String getPSViewMsgGroupId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupId() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public PSDEToolbarDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
        if (pSViewMsgGroup == null) {
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        } else {
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsggroupname")
    public void setPSViewMsgGroupName(String pSViewMsgGroupName) {
        this._set(DTOFIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }

    @JsonIgnore
    public String getPSViewMsgGroupName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupName() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public PSDEToolbarDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="toolbarsn")
    public void setToolbarSN(String toolbarSN) {
        this._set(DTOFIELD_TOOLBARSN, toolbarSN);
    }

    @JsonIgnore
    public String getToolbarSN() {
        Object objValue = this._get(DTOFIELD_TOOLBARSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToolbarSNDirty() {
        return this._contains(DTOFIELD_TOOLBARSN);
    }

    @JsonIgnore
    public void resetToolbarSN() {
        this._reset(DTOFIELD_TOOLBARSN);
    }

    @JsonIgnore
    public PSDEToolbarDTO toolbarsn(String toolbarSN) {
        this.setToolbarSN(toolbarSN);
        return this;
    }

    @JsonProperty(value="toolbarstyle")
    public void setToolbarStyle(String toolbarStyle) {
        this._set(DTOFIELD_TOOLBARSTYLE, toolbarStyle);
    }

    @JsonIgnore
    public String getToolbarStyle() {
        Object objValue = this._get(DTOFIELD_TOOLBARSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToolbarStyleDirty() {
        return this._contains(DTOFIELD_TOOLBARSTYLE);
    }

    @JsonIgnore
    public void resetToolbarStyle() {
        this._reset(DTOFIELD_TOOLBARSTYLE);
    }

    @JsonIgnore
    public PSDEToolbarDTO toolbarstyle(String toolbarStyle) {
        this.setToolbarStyle(toolbarStyle);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarDTO toolbarstyle(PSModelEnums.ToolbarStyle toolbarStyle) {
        if (toolbarStyle == null) {
            this.setToolbarStyle(null);
        } else {
            this.setToolbarStyle(toolbarStyle.value);
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
    public PSDEToolbarDTO updatedate(Timestamp updateDate) {
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
    public PSDEToolbarDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSDEToolbarDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEToolbarId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEToolbarId(strValue);
    }

    @JsonIgnore
    public PSDEToolbarDTO id(String strValue) {
        this.setPSDEToolbarId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDETBItemDTO> getPSDETBItems() {
        Object list = this._get(DTOFIELD_PSDETBITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetbitems")
    public void setPSDETBItems(List<PSDETBItemDTO> psdetbitems) {
        this._set(DTOFIELD_PSDETBITEMS, psdetbitems);
    }

    @JsonIgnore
    public List<PSDETBItemDTO> getPSDETBItemsIf() {
        Object list = this._get(DTOFIELD_PSDETBITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETBITEMS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEToolbarLogicDTO> getPSDEToolbarLogics() {
        Object list = this._get(DTOFIELD_PSDETOOLBARLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetoolbarlogics")
    public void setPSDEToolbarLogics(List<PSDEToolbarLogicDTO> psdetoolbarlogics) {
        this._set(DTOFIELD_PSDETOOLBARLOGICS, psdetoolbarlogics);
    }

    @JsonIgnore
    public List<PSDEToolbarLogicDTO> getPSDEToolbarLogicsIf() {
        Object list = this._get(DTOFIELD_PSDETOOLBARLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETOOLBARLOGICS, list);
        }
        return (List) list;
    }
}
