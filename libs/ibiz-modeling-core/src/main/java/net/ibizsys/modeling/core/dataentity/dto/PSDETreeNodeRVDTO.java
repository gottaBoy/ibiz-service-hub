package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeNodeRVDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDETREENODEID = "PSDETREENODEID";
    protected static final String DTOFIELD_PSDETREENODEID = "psdetreenodeid";
    public static final String FIELD_PSDETREENODENAME = "PSDETREENODENAME";
    protected static final String DTOFIELD_PSDETREENODENAME = "psdetreenodename";
    public static final String FIELD_PSDETREENODERVID = "PSDETREENODERVID";
    protected static final String DTOFIELD_PSDETREENODERVID = "psdetreenodervid";
    public static final String FIELD_PSDETREENODERVNAME = "PSDETREENODERVNAME";
    protected static final String DTOFIELD_PSDETREENODERVNAME = "psdetreenodervname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_REFMODE = "REFMODE";
    protected static final String DTOFIELD_REFMODE = "refmode";
    public static final String FIELD_REFPARAM = "REFPARAM";
    protected static final String DTOFIELD_REFPARAM = "refparam";
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
    public static final String FIELD_VIEWPARAMS = "VIEWPARAMS";
    protected static final String DTOFIELD_VIEWPARAMS = "viewparams";

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
    public PSDETreeNodeRVDTO createdate(Timestamp createDate) {
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
    public PSDETreeNodeRVDTO createman(String createMan) {
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
    public PSDETreeNodeRVDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdetreenodeid")
    public void setPSDETreeNodeId(String pSDETreeNodeId) {
        this._set(DTOFIELD_PSDETREENODEID, pSDETreeNodeId);
    }

    @JsonIgnore
    public String getPSDETreeNodeId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeId() {
        this._reset(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO psdetreenodeid(String pSDETreeNodeId) {
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO psdetreenodeid(PSDETreeNodeDTO pSDETreeNode) {
        if (pSDETreeNode == null) {
            this.setPSDETreeNodeId(null);
            this.setPSDETreeNodeName(null);
        } else {
            this.setPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    @JsonProperty(value="psdetreenodename")
    public void setPSDETreeNodeName(String pSDETreeNodeName) {
        this._set(DTOFIELD_PSDETREENODENAME, pSDETreeNodeName);
    }

    @JsonIgnore
    public String getPSDETreeNodeName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODENAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeName() {
        this._reset(DTOFIELD_PSDETREENODENAME);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO psdetreenodename(String pSDETreeNodeName) {
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    @JsonProperty(value="psdetreenodervid")
    public void setPSDETreeNodeRVId(String pSDETreeNodeRVId) {
        this._set(DTOFIELD_PSDETREENODERVID, pSDETreeNodeRVId);
    }

    @JsonIgnore
    public String getPSDETreeNodeRVId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODERVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeRVIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODERVID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeRVId() {
        this._reset(DTOFIELD_PSDETREENODERVID);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO psdetreenodervid(String pSDETreeNodeRVId) {
        this.setPSDETreeNodeRVId(pSDETreeNodeRVId);
        return this;
    }

    @JsonProperty(value="psdetreenodervname")
    public void setPSDETreeNodeRVName(String pSDETreeNodeRVName) {
        this._set(DTOFIELD_PSDETREENODERVNAME, pSDETreeNodeRVName);
    }

    @JsonIgnore
    public String getPSDETreeNodeRVName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODERVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeRVNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODERVNAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeRVName() {
        this._reset(DTOFIELD_PSDETREENODERVNAME);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO psdetreenodervname(String pSDETreeNodeRVName) {
        this.setPSDETreeNodeRVName(pSDETreeNodeRVName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeNodeRVName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeNodeRVName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO name(String strName) {
        this.setPSDETreeNodeRVName(strName);
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
    public PSDETreeNodeRVDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
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
    public PSDETreeNodeRVDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="refmode")
    public void setRefMode(String refMode) {
        this._set(DTOFIELD_REFMODE, refMode);
    }

    @JsonIgnore
    public String getRefMode() {
        Object objValue = this._get(DTOFIELD_REFMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefModeDirty() {
        return this._contains(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public void resetRefMode() {
        this._reset(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO refmode(String refMode) {
        this.setRefMode(refMode);
        return this;
    }

    @JsonProperty(value="refparam")
    public void setRefParam(String refParam) {
        this._set(DTOFIELD_REFPARAM, refParam);
    }

    @JsonIgnore
    public String getRefParam() {
        Object objValue = this._get(DTOFIELD_REFPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamDirty() {
        return this._contains(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public void resetRefParam() {
        this._reset(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO refparam(String refParam) {
        this.setRefParam(refParam);
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
    public PSDETreeNodeRVDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeNodeRVDTO updateman(String updateMan) {
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
    public PSDETreeNodeRVDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDETreeNodeRVDTO usertag(String userTag) {
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
    public PSDETreeNodeRVDTO usertag2(String userTag2) {
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
    public PSDETreeNodeRVDTO usertag3(String userTag3) {
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
    public PSDETreeNodeRVDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="viewparams")
    public void setViewParams(String viewParams) {
        this._set(DTOFIELD_VIEWPARAMS, viewParams);
    }

    @JsonIgnore
    public String getViewParams() {
        Object objValue = this._get(DTOFIELD_VIEWPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParamsDirty() {
        return this._contains(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public void resetViewParams() {
        this._reset(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO viewparams(String viewParams) {
        this.setViewParams(viewParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeNodeRVId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeNodeRVId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeRVDTO id(String strValue) {
        this.setPSDETreeNodeRVId(strValue);
        return this;
    }
}
