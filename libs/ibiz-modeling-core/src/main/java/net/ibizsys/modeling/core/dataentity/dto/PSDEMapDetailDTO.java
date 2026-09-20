package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEMapDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DSTFIELDNAME = "DSTFIELDNAME";
    protected static final String DTOFIELD_DSTFIELDNAME = "dstfieldname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAPDETAILID = "PSDEMAPDETAILID";
    protected static final String DTOFIELD_PSDEMAPDETAILID = "psdemapdetailid";
    public static final String FIELD_PSDEMAPDETAILNAME = "PSDEMAPDETAILNAME";
    protected static final String DTOFIELD_PSDEMAPDETAILNAME = "psdemapdetailname";
    public static final String FIELD_PSDEMAPID = "PSDEMAPID";
    protected static final String DTOFIELD_PSDEMAPID = "psdemapid";
    public static final String FIELD_PSDEMAPNAME = "PSDEMAPNAME";
    protected static final String DTOFIELD_PSDEMAPNAME = "psdemapname";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_SRCPSDEFID = "SRCPSDEFID";
    protected static final String DTOFIELD_SRCPSDEFID = "srcpsdefid";
    public static final String FIELD_SRCPSDEFNAME = "SRCPSDEFNAME";
    protected static final String DTOFIELD_SRCPSDEFNAME = "srcpsdefname";
    public static final String FIELD_SRCTYPE = "SRCTYPE";
    protected static final String DTOFIELD_SRCTYPE = "srctype";
    public static final String FIELD_SRCVALUE = "SRCVALUE";
    protected static final String DTOFIELD_SRCVALUE = "srcvalue";
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
    public PSDEMapDetailDTO createdate(Timestamp createDate) {
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
    public PSDEMapDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dstfieldname")
    public void setDstFieldName(String dstFieldName) {
        this._set(DTOFIELD_DSTFIELDNAME, dstFieldName);
    }

    @JsonIgnore
    public String getDstFieldName() {
        Object objValue = this._get(DTOFIELD_DSTFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstFieldNameDirty() {
        return this._contains(DTOFIELD_DSTFIELDNAME);
    }

    @JsonIgnore
    public void resetDstFieldName() {
        this._reset(DTOFIELD_DSTFIELDNAME);
    }

    @JsonIgnore
    public PSDEMapDetailDTO dstfieldname(String dstFieldName) {
        this.setDstFieldName(dstFieldName);
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
    public PSDEMapDetailDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDEMapDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdemapdetailid")
    public void setPSDEMapDetailId(String pSDEMapDetailId) {
        this._set(DTOFIELD_PSDEMAPDETAILID, pSDEMapDetailId);
    }

    @JsonIgnore
    public String getPSDEMapDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEMAPDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEMAPDETAILID);
    }

    @JsonIgnore
    public void resetPSDEMapDetailId() {
        this._reset(DTOFIELD_PSDEMAPDETAILID);
    }

    @JsonIgnore
    public PSDEMapDetailDTO psdemapdetailid(String pSDEMapDetailId) {
        this.setPSDEMapDetailId(pSDEMapDetailId);
        return this;
    }

    @JsonProperty(value="psdemapdetailname")
    public void setPSDEMapDetailName(String pSDEMapDetailName) {
        this._set(DTOFIELD_PSDEMAPDETAILNAME, pSDEMapDetailName);
    }

    @JsonIgnore
    public String getPSDEMapDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEMAPDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEMAPDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEMapDetailName() {
        this._reset(DTOFIELD_PSDEMAPDETAILNAME);
    }

    @JsonIgnore
    public PSDEMapDetailDTO psdemapdetailname(String pSDEMapDetailName) {
        this.setPSDEMapDetailName(pSDEMapDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEMapDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEMapDetailName(strName);
    }

    @JsonIgnore
    public PSDEMapDetailDTO name(String strName) {
        this.setPSDEMapDetailName(strName);
        return this;
    }

    @JsonProperty(value="psdemapid")
    public void setPSDEMapId(String pSDEMapId) {
        this._set(DTOFIELD_PSDEMAPID, pSDEMapId);
    }

    @JsonIgnore
    public String getPSDEMapId() {
        Object objValue = this._get(DTOFIELD_PSDEMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapIdDirty() {
        return this._contains(DTOFIELD_PSDEMAPID);
    }

    @JsonIgnore
    public void resetPSDEMapId() {
        this._reset(DTOFIELD_PSDEMAPID);
    }

    @JsonIgnore
    public PSDEMapDetailDTO psdemapid(String pSDEMapId) {
        this.setPSDEMapId(pSDEMapId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDetailDTO psdemapid(PSDEMapDTO pSDEMap) {
        if (pSDEMap == null) {
            this.setPSDEId(null);
            this.setPSDEMapId(null);
            this.setPSDEMapName(null);
        } else {
            this.setPSDEId(pSDEMap.getPSDEId());
            this.setPSDEMapId(pSDEMap.getPSDEMapId());
            this.setPSDEMapName(pSDEMap.getPSDEMapName());
        }
        return this;
    }

    @JsonProperty(value="psdemapname")
    public void setPSDEMapName(String pSDEMapName) {
        this._set(DTOFIELD_PSDEMAPNAME, pSDEMapName);
    }

    @JsonIgnore
    public String getPSDEMapName() {
        Object objValue = this._get(DTOFIELD_PSDEMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapNameDirty() {
        return this._contains(DTOFIELD_PSDEMAPNAME);
    }

    @JsonIgnore
    public void resetPSDEMapName() {
        this._reset(DTOFIELD_PSDEMAPNAME);
    }

    @JsonIgnore
    public PSDEMapDetailDTO psdemapname(String pSDEMapName) {
        this.setPSDEMapName(pSDEMapName);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDEMapDetailDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDetailDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDEMapDetailDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="srcpsdefid")
    public void setSrcPSDEFId(String srcPSDEFId) {
        this._set(DTOFIELD_SRCPSDEFID, srcPSDEFId);
    }

    @JsonIgnore
    public String getSrcPSDEFId() {
        Object objValue = this._get(DTOFIELD_SRCPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDEFIdDirty() {
        return this._contains(DTOFIELD_SRCPSDEFID);
    }

    @JsonIgnore
    public void resetSrcPSDEFId() {
        this._reset(DTOFIELD_SRCPSDEFID);
    }

    @JsonIgnore
    public PSDEMapDetailDTO srcpsdefid(String srcPSDEFId) {
        this.setSrcPSDEFId(srcPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDetailDTO srcpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setSrcPSDEFId(null);
            this.setSrcPSDEFName(null);
        } else {
            this.setSrcPSDEFId(pSDEField.getPSDEFieldId());
            this.setSrcPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="srcpsdefname")
    public void setSrcPSDEFName(String srcPSDEFName) {
        this._set(DTOFIELD_SRCPSDEFNAME, srcPSDEFName);
    }

    @JsonIgnore
    public String getSrcPSDEFName() {
        Object objValue = this._get(DTOFIELD_SRCPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDEFNameDirty() {
        return this._contains(DTOFIELD_SRCPSDEFNAME);
    }

    @JsonIgnore
    public void resetSrcPSDEFName() {
        this._reset(DTOFIELD_SRCPSDEFNAME);
    }

    @JsonIgnore
    public PSDEMapDetailDTO srcpsdefname(String srcPSDEFName) {
        this.setSrcPSDEFName(srcPSDEFName);
        return this;
    }

    @JsonProperty(value="srctype")
    public void setSrcType(String srcType) {
        this._set(DTOFIELD_SRCTYPE, srcType);
    }

    @JsonIgnore
    public String getSrcType() {
        Object objValue = this._get(DTOFIELD_SRCTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcTypeDirty() {
        return this._contains(DTOFIELD_SRCTYPE);
    }

    @JsonIgnore
    public void resetSrcType() {
        this._reset(DTOFIELD_SRCTYPE);
    }

    @JsonIgnore
    public PSDEMapDetailDTO srctype(String srcType) {
        this.setSrcType(srcType);
        return this;
    }

    @JsonIgnore
    public PSDEMapDetailDTO srctype(PSModelEnums.DEMapFieldSrcType srcType) {
        if (srcType == null) {
            this.setSrcType(null);
        } else {
            this.setSrcType(srcType.value);
        }
        return this;
    }

    @JsonProperty(value="srcvalue")
    public void setSrcValue(String srcValue) {
        this._set(DTOFIELD_SRCVALUE, srcValue);
    }

    @JsonIgnore
    public String getSrcValue() {
        Object objValue = this._get(DTOFIELD_SRCVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueDirty() {
        return this._contains(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public void resetSrcValue() {
        this._reset(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public PSDEMapDetailDTO srcvalue(String srcValue) {
        this.setSrcValue(srcValue);
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
    public PSDEMapDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEMapDetailDTO updateman(String updateMan) {
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
    public PSDEMapDetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEMapDetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEMapDetailDTO usertag(String userTag) {
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
    public PSDEMapDetailDTO usertag2(String userTag2) {
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
    public PSDEMapDetailDTO usertag3(String userTag3) {
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
    public PSDEMapDetailDTO usertag4(String userTag4) {
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
    public PSDEMapDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEMapDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEMapDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEMapDetailId(strValue);
    }

    @JsonIgnore
    public PSDEMapDetailDTO id(String strValue) {
        this.setPSDEMapDetailId(strValue);
        return this;
    }
}
