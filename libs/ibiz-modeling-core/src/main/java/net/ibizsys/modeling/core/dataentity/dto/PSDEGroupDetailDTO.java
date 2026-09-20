package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEGroupDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DETAG = "DETAG";
    protected static final String DTOFIELD_DETAG = "detag";
    public static final String FIELD_DETAG2 = "DETAG2";
    protected static final String DTOFIELD_DETAG2 = "detag2";
    public static final String FIELD_DETAILPARAM = "DETAILPARAM";
    protected static final String DTOFIELD_DETAILPARAM = "detailparam";
    public static final String FIELD_DETAILPARAM2 = "DETAILPARAM2";
    protected static final String DTOFIELD_DETAILPARAM2 = "detailparam2";
    public static final String FIELD_DETAILTAG = "DETAILTAG";
    protected static final String DTOFIELD_DETAILTAG = "detailtag";
    public static final String FIELD_DETAILTAG2 = "DETAILTAG2";
    protected static final String DTOFIELD_DETAILTAG2 = "detailtag2";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODCOLOR = "MODCOLOR";
    protected static final String DTOFIELD_MODCOLOR = "modcolor";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEGROUPDETAILID = "PSDEGROUPDETAILID";
    protected static final String DTOFIELD_PSDEGROUPDETAILID = "psdegroupdetailid";
    public static final String FIELD_PSDEGROUPDETAILNAME = "PSDEGROUPDETAILNAME";
    protected static final String DTOFIELD_PSDEGROUPDETAILNAME = "psdegroupdetailname";
    public static final String FIELD_PSDEGROUPID = "PSDEGROUPID";
    protected static final String DTOFIELD_PSDEGROUPID = "psdegroupid";
    public static final String FIELD_PSDEGROUPNAME = "PSDEGROUPNAME";
    protected static final String DTOFIELD_PSDEGROUPNAME = "psdegroupname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
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
    public PSDEGroupDetailDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
        return this;
    }

    @JsonProperty(value="color")
    public void setColor(String color) {
        this._set(DTOFIELD_COLOR, color);
    }

    @JsonIgnore
    public String getColor() {
        Object objValue = this._get(DTOFIELD_COLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return this._contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        this._reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO color(String color) {
        this.setColor(color);
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
    public PSDEGroupDetailDTO createdate(Timestamp createDate) {
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
    public PSDEGroupDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="data")
    public void setData(String data) {
        this._set(DTOFIELD_DATA, data);
    }

    @JsonIgnore
    public String getData() {
        Object objValue = this._get(DTOFIELD_DATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return this._contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        this._reset(DTOFIELD_DATA);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="detag")
    public void setDETag(String dETag) {
        this._set(DTOFIELD_DETAG, dETag);
    }

    @JsonIgnore
    public String getDETag() {
        Object objValue = this._get(DTOFIELD_DETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDETagDirty() {
        return this._contains(DTOFIELD_DETAG);
    }

    @JsonIgnore
    public void resetDETag() {
        this._reset(DTOFIELD_DETAG);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO detag(String dETag) {
        this.setDETag(dETag);
        return this;
    }

    @JsonProperty(value="detag2")
    public void setDETag2(String dETag2) {
        this._set(DTOFIELD_DETAG2, dETag2);
    }

    @JsonIgnore
    public String getDETag2() {
        Object objValue = this._get(DTOFIELD_DETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDETag2Dirty() {
        return this._contains(DTOFIELD_DETAG2);
    }

    @JsonIgnore
    public void resetDETag2() {
        this._reset(DTOFIELD_DETAG2);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO detag2(String dETag2) {
        this.setDETag2(dETag2);
        return this;
    }

    @JsonProperty(value="detailparam")
    public void setDetailParam(String detailParam) {
        this._set(DTOFIELD_DETAILPARAM, detailParam);
    }

    @JsonIgnore
    public String getDetailParam() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParamDirty() {
        return this._contains(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public void resetDetailParam() {
        this._reset(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO detailparam(String detailParam) {
        this.setDetailParam(detailParam);
        return this;
    }

    @JsonProperty(value="detailparam2")
    public void setDetailParam2(String detailParam2) {
        this._set(DTOFIELD_DETAILPARAM2, detailParam2);
    }

    @JsonIgnore
    public String getDetailParam2() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParam2Dirty() {
        return this._contains(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public void resetDetailParam2() {
        this._reset(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO detailparam2(String detailParam2) {
        this.setDetailParam2(detailParam2);
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
    public PSDEGroupDetailDTO detailtag(String detailTag) {
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
    public PSDEGroupDetailDTO detailtag2(String detailTag2) {
        this.setDetailTag2(detailTag2);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSDEGroupDetailDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modcolor")
    public void setModColor(String modColor) {
        this._set(DTOFIELD_MODCOLOR, modColor);
    }

    @JsonIgnore
    public String getModColor() {
        Object objValue = this._get(DTOFIELD_MODCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModColorDirty() {
        return this._contains(DTOFIELD_MODCOLOR);
    }

    @JsonIgnore
    public void resetModColor() {
        this._reset(DTOFIELD_MODCOLOR);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO modcolor(String modColor) {
        this.setModColor(modColor);
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
    public PSDEGroupDetailDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdegroupdetailid")
    public void setPSDEGroupDetailId(String pSDEGroupDetailId) {
        this._set(DTOFIELD_PSDEGROUPDETAILID, pSDEGroupDetailId);
    }

    @JsonIgnore
    public String getPSDEGroupDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEGROUPDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGroupDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEGROUPDETAILID);
    }

    @JsonIgnore
    public void resetPSDEGroupDetailId() {
        this._reset(DTOFIELD_PSDEGROUPDETAILID);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO psdegroupdetailid(String pSDEGroupDetailId) {
        this.setPSDEGroupDetailId(pSDEGroupDetailId);
        return this;
    }

    @JsonProperty(value="psdegroupdetailname")
    public void setPSDEGroupDetailName(String pSDEGroupDetailName) {
        this._set(DTOFIELD_PSDEGROUPDETAILNAME, pSDEGroupDetailName);
    }

    @JsonIgnore
    public String getPSDEGroupDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEGROUPDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGroupDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEGROUPDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEGroupDetailName() {
        this._reset(DTOFIELD_PSDEGROUPDETAILNAME);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO psdegroupdetailname(String pSDEGroupDetailName) {
        this.setPSDEGroupDetailName(pSDEGroupDetailName);
        return this;
    }

    @JsonProperty(value="psdegroupid")
    public void setPSDEGroupId(String pSDEGroupId) {
        this._set(DTOFIELD_PSDEGROUPID, pSDEGroupId);
    }

    @JsonIgnore
    public String getPSDEGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEGROUPID);
    }

    @JsonIgnore
    public void resetPSDEGroupId() {
        this._reset(DTOFIELD_PSDEGROUPID);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO psdegroupid(String pSDEGroupId) {
        this.setPSDEGroupId(pSDEGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEGroupDetailDTO psdegroupid(PSDEGroupDTO pSDEGroup) {
        if (pSDEGroup == null) {
            this.setPSDEGroupId(null);
            this.setPSDEGroupName(null);
        } else {
            this.setPSDEGroupId(pSDEGroup.getPSDEGroupId());
            this.setPSDEGroupName(pSDEGroup.getPSDEGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdegroupname")
    public void setPSDEGroupName(String pSDEGroupName) {
        this._set(DTOFIELD_PSDEGROUPNAME, pSDEGroupName);
    }

    @JsonIgnore
    public String getPSDEGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEGroupName() {
        this._reset(DTOFIELD_PSDEGROUPNAME);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO psdegroupname(String pSDEGroupName) {
        this.setPSDEGroupName(pSDEGroupName);
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
    public PSDEGroupDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEGroupDetailDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setColor(null);
            this.setLogicName(null);
            this.setModColor(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSModuleName(null);
        } else {
            this.setColor(pSDataEntity.getColor());
            this.setLogicName(pSDataEntity.getLogicName());
            this.setModColor(pSDataEntity.getModColor());
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSModuleName(pSDataEntity.getPSModuleName());
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
    public PSDEGroupDetailDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEName(strName);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO name(String strName) {
        this.setPSDEName(strName);
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
    public PSDEGroupDetailDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSDEGroupDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEGroupDetailDTO updateman(String updateMan) {
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
    public PSDEGroupDetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEGroupDetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEGroupDetailDTO usertag(String userTag) {
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
    public PSDEGroupDetailDTO usertag2(String userTag2) {
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
    public PSDEGroupDetailDTO usertag3(String userTag3) {
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
    public PSDEGroupDetailDTO usertag4(String userTag4) {
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
    public PSDEGroupDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEGroupDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEGroupDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEGroupDetailId(strValue);
    }

    @JsonIgnore
    public PSDEGroupDetailDTO id(String strValue) {
        this.setPSDEGroupDetailId(strValue);
        return this;
    }
}
