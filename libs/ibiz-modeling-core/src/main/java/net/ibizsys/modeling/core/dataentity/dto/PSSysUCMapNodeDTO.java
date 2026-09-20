package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysActorDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUCMapDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysUCMapNodeDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NODETYPE = "NODETYPE";
    protected static final String DTOFIELD_NODETYPE = "nodetype";
    public static final String FIELD_PSSYSACTORID = "PSSYSACTORID";
    protected static final String DTOFIELD_PSSYSACTORID = "pssysactorid";
    public static final String FIELD_PSSYSACTORNAME = "PSSYSACTORNAME";
    protected static final String DTOFIELD_PSSYSACTORNAME = "pssysactorname";
    public static final String FIELD_PSSYSUCMAPID = "PSSYSUCMAPID";
    protected static final String DTOFIELD_PSSYSUCMAPID = "pssysucmapid";
    public static final String FIELD_PSSYSUCMAPNAME = "PSSYSUCMAPNAME";
    protected static final String DTOFIELD_PSSYSUCMAPNAME = "pssysucmapname";
    public static final String FIELD_PSSYSUCMAPNODEID = "PSSYSUCMAPNODEID";
    protected static final String DTOFIELD_PSSYSUCMAPNODEID = "pssysucmapnodeid";
    public static final String FIELD_PSSYSUCMAPNODENAME = "PSSYSUCMAPNODENAME";
    protected static final String DTOFIELD_PSSYSUCMAPNODENAME = "pssysucmapnodename";
    public static final String FIELD_PSSYSUSECASEID = "PSSYSUSERCASEID";
    protected static final String DTOFIELD_PSSYSUSECASEID = "pssysusecaseid";
    public static final String FIELD_PSSYSUSECASENAME = "PSSYSUSERCASENAME";
    protected static final String DTOFIELD_PSSYSUSECASENAME = "pssysusecasename";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
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
    public PSSysUCMapNodeDTO createdate(Timestamp createDate) {
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
    public PSSysUCMapNodeDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysUCMapNodeDTO leftpos(Integer leftPos) {
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
    public PSSysUCMapNodeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nodetype")
    public void setNodeType(String nodeType) {
        this._set(DTOFIELD_NODETYPE, nodeType);
    }

    @JsonIgnore
    public String getNodeType() {
        Object objValue = this._get(DTOFIELD_NODETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeTypeDirty() {
        return this._contains(DTOFIELD_NODETYPE);
    }

    @JsonIgnore
    public void resetNodeType() {
        this._reset(DTOFIELD_NODETYPE);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO nodetype(String nodeType) {
        this.setNodeType(nodeType);
        return this;
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO nodetype(PSModelEnums.UCMapNodeType nodeType) {
        if (nodeType == null) {
            this.setNodeType(null);
        } else {
            this.setNodeType(nodeType.value);
        }
        return this;
    }

    @JsonProperty(value="pssysactorid")
    public void setPSSysActorId(String pSSysActorId) {
        this._set(DTOFIELD_PSSYSACTORID, pSSysActorId);
    }

    @JsonIgnore
    public String getPSSysActorId() {
        Object objValue = this._get(DTOFIELD_PSSYSACTORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysActorIdDirty() {
        return this._contains(DTOFIELD_PSSYSACTORID);
    }

    @JsonIgnore
    public void resetPSSysActorId() {
        this._reset(DTOFIELD_PSSYSACTORID);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysactorid(String pSSysActorId) {
        this.setPSSysActorId(pSSysActorId);
        return this;
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysactorid(PSSysActorDTO pSSysActor) {
        if (pSSysActor == null) {
            this.setPSSysActorId(null);
            this.setPSSysActorName(null);
        } else {
            this.setPSSysActorId(pSSysActor.getPSSysActorId());
            this.setPSSysActorName(pSSysActor.getPSSysActorName());
        }
        return this;
    }

    @JsonProperty(value="pssysactorname")
    public void setPSSysActorName(String pSSysActorName) {
        this._set(DTOFIELD_PSSYSACTORNAME, pSSysActorName);
    }

    @JsonIgnore
    public String getPSSysActorName() {
        Object objValue = this._get(DTOFIELD_PSSYSACTORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysActorNameDirty() {
        return this._contains(DTOFIELD_PSSYSACTORNAME);
    }

    @JsonIgnore
    public void resetPSSysActorName() {
        this._reset(DTOFIELD_PSSYSACTORNAME);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysactorname(String pSSysActorName) {
        this.setPSSysActorName(pSSysActorName);
        return this;
    }

    @JsonProperty(value="pssysucmapid")
    public void setPSSysUCMapId(String pSSysUCMapId) {
        this._set(DTOFIELD_PSSYSUCMAPID, pSSysUCMapId);
    }

    @JsonIgnore
    public String getPSSysUCMapId() {
        Object objValue = this._get(DTOFIELD_PSSYSUCMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUCMapIdDirty() {
        return this._contains(DTOFIELD_PSSYSUCMAPID);
    }

    @JsonIgnore
    public void resetPSSysUCMapId() {
        this._reset(DTOFIELD_PSSYSUCMAPID);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysucmapid(String pSSysUCMapId) {
        this.setPSSysUCMapId(pSSysUCMapId);
        return this;
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysucmapid(PSSysUCMapDTO pSSysUCMap) {
        if (pSSysUCMap == null) {
            this.setPSSysUCMapId(null);
            this.setPSSysUCMapName(null);
        } else {
            this.setPSSysUCMapId(pSSysUCMap.getPSSysUCMapId());
            this.setPSSysUCMapName(pSSysUCMap.getPSSysUCMapName());
        }
        return this;
    }

    @JsonProperty(value="pssysucmapname")
    public void setPSSysUCMapName(String pSSysUCMapName) {
        this._set(DTOFIELD_PSSYSUCMAPNAME, pSSysUCMapName);
    }

    @JsonIgnore
    public String getPSSysUCMapName() {
        Object objValue = this._get(DTOFIELD_PSSYSUCMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUCMapNameDirty() {
        return this._contains(DTOFIELD_PSSYSUCMAPNAME);
    }

    @JsonIgnore
    public void resetPSSysUCMapName() {
        this._reset(DTOFIELD_PSSYSUCMAPNAME);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysucmapname(String pSSysUCMapName) {
        this.setPSSysUCMapName(pSSysUCMapName);
        return this;
    }

    @JsonProperty(value="pssysucmapnodeid")
    public void setPSSysUCMapNodeId(String pSSysUCMapNodeId) {
        this._set(DTOFIELD_PSSYSUCMAPNODEID, pSSysUCMapNodeId);
    }

    @JsonIgnore
    public String getPSSysUCMapNodeId() {
        Object objValue = this._get(DTOFIELD_PSSYSUCMAPNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUCMapNodeIdDirty() {
        return this._contains(DTOFIELD_PSSYSUCMAPNODEID);
    }

    @JsonIgnore
    public void resetPSSysUCMapNodeId() {
        this._reset(DTOFIELD_PSSYSUCMAPNODEID);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysucmapnodeid(String pSSysUCMapNodeId) {
        this.setPSSysUCMapNodeId(pSSysUCMapNodeId);
        return this;
    }

    @JsonProperty(value="pssysucmapnodename")
    public void setPSSysUCMapNodeName(String pSSysUCMapNodeName) {
        this._set(DTOFIELD_PSSYSUCMAPNODENAME, pSSysUCMapNodeName);
    }

    @JsonIgnore
    public String getPSSysUCMapNodeName() {
        Object objValue = this._get(DTOFIELD_PSSYSUCMAPNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUCMapNodeNameDirty() {
        return this._contains(DTOFIELD_PSSYSUCMAPNODENAME);
    }

    @JsonIgnore
    public void resetPSSysUCMapNodeName() {
        this._reset(DTOFIELD_PSSYSUCMAPNODENAME);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO pssysucmapnodename(String pSSysUCMapNodeName) {
        this.setPSSysUCMapNodeName(pSSysUCMapNodeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysUCMapNodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysUCMapNodeName(strName);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO name(String strName) {
        this.setPSSysUCMapNodeName(strName);
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
    public PSSysUCMapNodeDTO pssysusecaseid(String pSSysUseCaseId) {
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
    public PSSysUCMapNodeDTO pssysusecasename(String pSSysUseCaseName) {
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
    public PSSysUCMapNodeDTO toppos(Integer topPos) {
        this.setTopPos(topPos);
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
    public PSSysUCMapNodeDTO updatedate(Timestamp updateDate) {
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
    public PSSysUCMapNodeDTO updateman(String updateMan) {
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
    public PSSysUCMapNodeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysUCMapNodeDTO usertag(String userTag) {
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
    public PSSysUCMapNodeDTO usertag2(String userTag2) {
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
    public PSSysUCMapNodeDTO usertag3(String userTag3) {
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
    public PSSysUCMapNodeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysUCMapNodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysUCMapNodeId(strValue);
    }

    @JsonIgnore
    public PSSysUCMapNodeDTO id(String strValue) {
        this.setPSSysUCMapNodeId(strValue);
        return this;
    }
}
