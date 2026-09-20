package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementAttrDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementREDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIDEFieldDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EAIDEFTAG = "EAIDEFTAG";
    protected static final String DTOFIELD_EAIDEFTAG = "eaideftag";
    public static final String FIELD_EAIDEFTAG2 = "EAIDEFTAG2";
    protected static final String DTOFIELD_EAIDEFTAG2 = "eaideftag2";
    public static final String FIELD_MAPTYPE = "MAPTYPE";
    protected static final String DTOFIELD_MAPTYPE = "maptype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSEAIDEFIELDID = "PSSYSEAIDEFIELDID";
    protected static final String DTOFIELD_PSSYSEAIDEFIELDID = "pssyseaidefieldid";
    public static final String FIELD_PSSYSEAIDEFIELDNAME = "PSSYSEAIDEFIELDNAME";
    protected static final String DTOFIELD_PSSYSEAIDEFIELDNAME = "pssyseaidefieldname";
    public static final String FIELD_PSSYSEAIDEID = "PSSYSEAIDEID";
    protected static final String DTOFIELD_PSSYSEAIDEID = "pssyseaideid";
    public static final String FIELD_PSSYSEAIDENAME = "PSSYSEAIDENAME";
    protected static final String DTOFIELD_PSSYSEAIDENAME = "pssyseaidename";
    public static final String FIELD_PSSYSEAIELEMENTATTRID = "PSSYSEAIELEMENTATTRID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTATTRID = "pssyseaielementattrid";
    public static final String FIELD_PSSYSEAIELEMENTATTRNAME = "PSSYSEAIELEMENTATTRNAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTATTRNAME = "pssyseaielementattrname";
    public static final String FIELD_PSSYSEAIELEMENTID = "PSSYSEAIELEMENTID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTID = "pssyseaielementid";
    public static final String FIELD_PSSYSEAIELEMENTREID = "PSSYSEAIELEMENTREID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTREID = "pssyseaielementreid";
    public static final String FIELD_PSSYSEAIELEMENTRENAME = "PSSYSEAIELEMENTRENAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTRENAME = "pssyseaielementrename";
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
    public PSSysEAIDEFieldDTO codename(String codeName) {
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
    public PSSysEAIDEFieldDTO createdate(Timestamp createDate) {
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
    public PSSysEAIDEFieldDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="eaideftag")
    public void setEAIDEFTag(String eAIDEFTag) {
        this._set(DTOFIELD_EAIDEFTAG, eAIDEFTag);
    }

    @JsonIgnore
    public String getEAIDEFTag() {
        Object objValue = this._get(DTOFIELD_EAIDEFTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDEFTagDirty() {
        return this._contains(DTOFIELD_EAIDEFTAG);
    }

    @JsonIgnore
    public void resetEAIDEFTag() {
        this._reset(DTOFIELD_EAIDEFTAG);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO eaideftag(String eAIDEFTag) {
        this.setEAIDEFTag(eAIDEFTag);
        return this;
    }

    @JsonProperty(value="eaideftag2")
    public void setEAIDEFTag2(String eAIDEFTag2) {
        this._set(DTOFIELD_EAIDEFTAG2, eAIDEFTag2);
    }

    @JsonIgnore
    public String getEAIDEFTag2() {
        Object objValue = this._get(DTOFIELD_EAIDEFTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDEFTag2Dirty() {
        return this._contains(DTOFIELD_EAIDEFTAG2);
    }

    @JsonIgnore
    public void resetEAIDEFTag2() {
        this._reset(DTOFIELD_EAIDEFTAG2);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO eaideftag2(String eAIDEFTag2) {
        this.setEAIDEFTag2(eAIDEFTag2);
        return this;
    }

    @JsonProperty(value="maptype")
    public void setMapType(String mapType) {
        this._set(DTOFIELD_MAPTYPE, mapType);
    }

    @JsonIgnore
    public String getMapType() {
        Object objValue = this._get(DTOFIELD_MAPTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapTypeDirty() {
        return this._contains(DTOFIELD_MAPTYPE);
    }

    @JsonIgnore
    public void resetMapType() {
        this._reset(DTOFIELD_MAPTYPE);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO maptype(String mapType) {
        this.setMapType(mapType);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO maptype(PSModelEnums.EAIDEFieldMapType mapType) {
        if (mapType == null) {
            this.setMapType(null);
        } else {
            this.setMapType(mapType.value);
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
    public PSSysEAIDEFieldDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSSysEAIDEFieldDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssyseaidefieldid")
    public void setPSSysEAIDEFieldId(String pSSysEAIDEFieldId) {
        this._set(DTOFIELD_PSSYSEAIDEFIELDID, pSSysEAIDEFieldId);
    }

    @JsonIgnore
    public String getPSSysEAIDEFieldId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDEFIELDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDEFieldIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDEFIELDID);
    }

    @JsonIgnore
    public void resetPSSysEAIDEFieldId() {
        this._reset(DTOFIELD_PSSYSEAIDEFIELDID);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaidefieldid(String pSSysEAIDEFieldId) {
        this.setPSSysEAIDEFieldId(pSSysEAIDEFieldId);
        return this;
    }

    @JsonProperty(value="pssyseaidefieldname")
    public void setPSSysEAIDEFieldName(String pSSysEAIDEFieldName) {
        this._set(DTOFIELD_PSSYSEAIDEFIELDNAME, pSSysEAIDEFieldName);
    }

    @JsonIgnore
    public String getPSSysEAIDEFieldName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDEFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDEFieldNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDEFIELDNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDEFieldName() {
        this._reset(DTOFIELD_PSSYSEAIDEFIELDNAME);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaidefieldname(String pSSysEAIDEFieldName) {
        this.setPSSysEAIDEFieldName(pSSysEAIDEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIDEFieldName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIDEFieldName(strName);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO name(String strName) {
        this.setPSSysEAIDEFieldName(strName);
        return this;
    }

    @JsonProperty(value="pssyseaideid")
    public void setPSSysEAIDEId(String pSSysEAIDEId) {
        this._set(DTOFIELD_PSSYSEAIDEID, pSSysEAIDEId);
    }

    @JsonIgnore
    public String getPSSysEAIDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDEID);
    }

    @JsonIgnore
    public void resetPSSysEAIDEId() {
        this._reset(DTOFIELD_PSSYSEAIDEID);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaideid(String pSSysEAIDEId) {
        this.setPSSysEAIDEId(pSSysEAIDEId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaideid(PSSysEAIDEDTO pSSysEAIDE) {
        if (pSSysEAIDE == null) {
            this.setPSDEId(null);
            this.setPSSysEAIDEId(null);
            this.setPSSysEAIDEName(null);
            this.setPSSysEAIElementId(null);
        } else {
            this.setPSDEId(pSSysEAIDE.getPSDEId());
            this.setPSSysEAIDEId(pSSysEAIDE.getPSSysEAIDEId());
            this.setPSSysEAIDEName(pSSysEAIDE.getPSSysEAIDEName());
            this.setPSSysEAIElementId(pSSysEAIDE.getPSSysEAIElementId());
        }
        return this;
    }

    @JsonProperty(value="pssyseaidename")
    public void setPSSysEAIDEName(String pSSysEAIDEName) {
        this._set(DTOFIELD_PSSYSEAIDENAME, pSSysEAIDEName);
    }

    @JsonIgnore
    public String getPSSysEAIDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDENameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDEName() {
        this._reset(DTOFIELD_PSSYSEAIDENAME);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaidename(String pSSysEAIDEName) {
        this.setPSSysEAIDEName(pSSysEAIDEName);
        return this;
    }

    @JsonProperty(value="pssyseaielementattrid")
    public void setPSSysEAIElementAttrId(String pSSysEAIElementAttrId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTATTRID, pSSysEAIElementAttrId);
    }

    @JsonIgnore
    public String getPSSysEAIElementAttrId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTATTRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementAttrIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTATTRID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementAttrId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTATTRID);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementattrid(String pSSysEAIElementAttrId) {
        this.setPSSysEAIElementAttrId(pSSysEAIElementAttrId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementattrid(PSSysEAIElementAttrDTO pSSysEAIElementAttr) {
        if (pSSysEAIElementAttr == null) {
            this.setPSSysEAIElementAttrId(null);
            this.setPSSysEAIElementAttrName(null);
        } else {
            this.setPSSysEAIElementAttrId(pSSysEAIElementAttr.getPSSysEAIElementAttrId());
            this.setPSSysEAIElementAttrName(pSSysEAIElementAttr.getPSSysEAIElementAttrName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaielementattrname")
    public void setPSSysEAIElementAttrName(String pSSysEAIElementAttrName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTATTRNAME, pSSysEAIElementAttrName);
    }

    @JsonIgnore
    public String getPSSysEAIElementAttrName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTATTRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementAttrNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTATTRNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementAttrName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTATTRNAME);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementattrname(String pSSysEAIElementAttrName) {
        this.setPSSysEAIElementAttrName(pSSysEAIElementAttrName);
        return this;
    }

    @JsonProperty(value="pssyseaielementid")
    public void setPSSysEAIElementId(String pSSysEAIElementId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }

    @JsonIgnore
    public String getPSSysEAIElementId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementid(String pSSysEAIElementId) {
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    @JsonProperty(value="pssyseaielementreid")
    public void setPSSysEAIElementREId(String pSSysEAIElementREId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTREID, pSSysEAIElementREId);
    }

    @JsonIgnore
    public String getPSSysEAIElementREId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTREID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementREIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTREID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementREId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTREID);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementreid(String pSSysEAIElementREId) {
        this.setPSSysEAIElementREId(pSSysEAIElementREId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementreid(PSSysEAIElementREDTO pSSysEAIElementRE) {
        if (pSSysEAIElementRE == null) {
            this.setPSSysEAIElementREId(null);
            this.setPSSysEAIElementREName(null);
        } else {
            this.setPSSysEAIElementREId(pSSysEAIElementRE.getPSSysEAIElementREId());
            this.setPSSysEAIElementREName(pSSysEAIElementRE.getPSSysEAIElementREName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaielementrename")
    public void setPSSysEAIElementREName(String pSSysEAIElementREName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTRENAME, pSSysEAIElementREName);
    }

    @JsonIgnore
    public String getPSSysEAIElementREName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTRENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementRENameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTRENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementREName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTRENAME);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementrename(String pSSysEAIElementREName) {
        this.setPSSysEAIElementREName(pSSysEAIElementREName);
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
    public PSSysEAIDEFieldDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIDEFieldDTO updateman(String updateMan) {
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
    public PSSysEAIDEFieldDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIDEFieldDTO usertag(String userTag) {
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
    public PSSysEAIDEFieldDTO usertag2(String userTag2) {
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
    public PSSysEAIDEFieldDTO usertag3(String userTag3) {
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
    public PSSysEAIDEFieldDTO usertag4(String userTag4) {
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
    public PSSysEAIDEFieldDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIDEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIDEFieldId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO id(String strValue) {
        this.setPSSysEAIDEFieldId(strValue);
        return this;
    }
}
