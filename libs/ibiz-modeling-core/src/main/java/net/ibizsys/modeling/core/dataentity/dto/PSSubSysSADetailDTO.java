package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSubSysSADetailDTO extends PSModelDTOBase {
    public static final String FIELD_AFTERCODE = "AFTERCODE";
    protected static final String DTOFIELD_AFTERCODE = "aftercode";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DETAILID = "DETAILID";
    protected static final String DTOFIELD_DETAILID = "detailid";
    public static final String FIELD_DETAILPARAM = "DETAILPARAM";
    protected static final String DTOFIELD_DETAILPARAM = "detailparam";
    public static final String FIELD_DETAILPARAM2 = "DETAILPARAM2";
    protected static final String DTOFIELD_DETAILPARAM2 = "detailparam2";
    public static final String FIELD_DETAILPARAMS = "DETAILPARAMS";
    protected static final String DTOFIELD_DETAILPARAMS = "detailparams";
    public static final String FIELD_DETAILTAG = "DETAILTAG";
    protected static final String DTOFIELD_DETAILTAG = "detailtag";
    public static final String FIELD_DETAILTAG2 = "DETAILTAG2";
    protected static final String DTOFIELD_DETAILTAG2 = "detailtag2";
    public static final String FIELD_DETAILTYPE = "DETAILTYPE";
    protected static final String DTOFIELD_DETAILTYPE = "detailtype";
    public static final String FIELD_INPSSUBSYSSADEID = "INPSSUBSYSSADEID";
    protected static final String DTOFIELD_INPSSUBSYSSADEID = "inpssubsyssadeid";
    public static final String FIELD_INPSSUBSYSSADENAME = "INPSSUBSYSSADENAME";
    protected static final String DTOFIELD_INPSSUBSYSSADENAME = "inpssubsyssadename";
    public static final String FIELD_INPSSYSDYNAMODELID = "INPSSYSDYNAMODELID";
    protected static final String DTOFIELD_INPSSYSDYNAMODELID = "inpssysdynamodelid";
    public static final String FIELD_INPSSYSDYNAMODELNAME = "INPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_INPSSYSDYNAMODELNAME = "inpssysdynamodelname";
    public static final String FIELD_KEYFIELDNAME = "KEYFIELDNAME";
    protected static final String DTOFIELD_KEYFIELDNAME = "keyfieldname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_METHODCODE = "METHODCODE";
    protected static final String DTOFIELD_METHODCODE = "methodcode";
    public static final String FIELD_NEEDRESOURCEKEY = "NEEDRESOURCEKEY";
    protected static final String DTOFIELD_NEEDRESOURCEKEY = "needresourcekey";
    public static final String FIELD_NOSERVICECODENAME = "NOSERVICECODENAME";
    protected static final String DTOFIELD_NOSERVICECODENAME = "noservicecodename";
    public static final String FIELD_OUTPSSUBSYSSADEID = "OUTPSSUBSYSSADEID";
    protected static final String DTOFIELD_OUTPSSUBSYSSADEID = "outpssubsyssadeid";
    public static final String FIELD_OUTPSSUBSYSSADENAME = "OUTPSSUBSYSSADENAME";
    protected static final String DTOFIELD_OUTPSSUBSYSSADENAME = "outpssubsyssadename";
    public static final String FIELD_OUTPSSYSDYNAMODELID = "OUTPSSYSDYNAMODELID";
    protected static final String DTOFIELD_OUTPSSYSDYNAMODELID = "outpssysdynamodelid";
    public static final String FIELD_OUTPSSYSDYNAMODELNAME = "OUTPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_OUTPSSYSDYNAMODELNAME = "outpssysdynamodelname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSUBSYSSADENAME = "PSSUBSYSSADENAME";
    protected static final String DTOFIELD_PSSUBSYSSADENAME = "pssubsyssadename";
    public static final String FIELD_PSSUBSYSSADETAILID = "PSSUBSYSSADETAILID";
    protected static final String DTOFIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";
    public static final String FIELD_PSSUBSYSSADETAILNAME = "PSSUBSYSSADETAILNAME";
    protected static final String DTOFIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_REQUESTCONTENTTYPE = "REQUESTCONTENTTYPE";
    protected static final String DTOFIELD_REQUESTCONTENTTYPE = "requestcontenttype";
    public static final String FIELD_REQUESTMETHOD = "REQUESTMETHOD";
    protected static final String DTOFIELD_REQUESTMETHOD = "requestmethod";
    public static final String FIELD_REQUESTPARAMTYPE = "REQUESTPARAMTYPE";
    protected static final String DTOFIELD_REQUESTPARAMTYPE = "requestparamtype";
    public static final String FIELD_RETPSSUBSYSSADEID = "RETPSSUBSYSSADEID";
    protected static final String DTOFIELD_RETPSSUBSYSSADEID = "retpssubsyssadeid";
    public static final String FIELD_RETPSSUBSYSSADENAME = "RETPSSUBSYSSADENAME";
    protected static final String DTOFIELD_RETPSSUBSYSSADENAME = "retpssubsyssadename";
    public static final String FIELD_RETSTDDATATYPE = "RETSTDDATATYPE";
    protected static final String DTOFIELD_RETSTDDATATYPE = "retstddatatype";
    public static final String FIELD_RETVALTYPE = "RETVALTYPE";
    protected static final String DTOFIELD_RETVALTYPE = "retvaltype";
    public static final String FIELD_SERVICEURL = "SERVICEURL";
    protected static final String DTOFIELD_SERVICEURL = "serviceurl";
    public static final String FIELD_UNIQUETAG = "UNIQUETAG";
    protected static final String DTOFIELD_UNIQUETAG = "uniquetag";
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
    public static final String DTOFIELD_PSSUBSYSSADETAILPARAMS = "pssubsyssadetailparams";

    @JsonProperty(value="aftercode")
    public void setAfterCode(String afterCode) {
        this._set(DTOFIELD_AFTERCODE, afterCode);
    }

    @JsonIgnore
    public String getAfterCode() {
        Object objValue = this._get(DTOFIELD_AFTERCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterCodeDirty() {
        return this._contains(DTOFIELD_AFTERCODE);
    }

    @JsonIgnore
    public void resetAfterCode() {
        this._reset(DTOFIELD_AFTERCODE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO aftercode(String afterCode) {
        this.setAfterCode(afterCode);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO codename(String codeName) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        this.setCustomMode(customMode == null ? null : customMode.value);
        return this;
    }

    @JsonProperty(value="detailid")
    public void setDetailId(String detailId) {
        this._set(DTOFIELD_DETAILID, detailId);
    }

    @JsonIgnore
    public String getDetailId() {
        Object objValue = this._get(DTOFIELD_DETAILID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailIdDirty() {
        return this._contains(DTOFIELD_DETAILID);
    }

    @JsonIgnore
    public void resetDetailId() {
        this._reset(DTOFIELD_DETAILID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO detailid(String detailId) {
        this.setDetailId(detailId);
        return this;
    }

    @JsonProperty(value="detailparam")
    public void setDetailParam(String detailParam) {
        this._set(DTOFIELD_DETAILPARAM, detailParam);
    }

    @JsonIgnore
    public String getDetailParam() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO detailparam(String detailParam) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO detailparam2(String detailParam2) {
        this.setDetailParam2(detailParam2);
        return this;
    }

    @JsonProperty(value="detailparams")
    public void setDetailParams(String detailParams) {
        this._set(DTOFIELD_DETAILPARAMS, detailParams);
    }

    @JsonIgnore
    public String getDetailParams() {
        Object objValue = this._get(DTOFIELD_DETAILPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParamsDirty() {
        return this._contains(DTOFIELD_DETAILPARAMS);
    }

    @JsonIgnore
    public void resetDetailParams() {
        this._reset(DTOFIELD_DETAILPARAMS);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO detailparams(String detailParams) {
        this.setDetailParams(detailParams);
        return this;
    }

    @JsonProperty(value="detailtag")
    public void setDetailTag(String detailTag) {
        this._set(DTOFIELD_DETAILTAG, detailTag);
    }

    @JsonIgnore
    public String getDetailTag() {
        Object objValue = this._get(DTOFIELD_DETAILTAG);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO detailtag(String detailTag) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO detailtag2(String detailTag2) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO detailtype(String detailType) {
        this.setDetailType(detailType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO detailtype(PSModelEnums.SADEMethodType detailType) {
        this.setDetailType(detailType == null ? null : detailType.value);
        return this;
    }

    @JsonProperty(value="inpssubsyssadeid")
    public void setInPSSubSysSADEId(String inPSSubSysSADEId) {
        this._set(DTOFIELD_INPSSUBSYSSADEID, inPSSubSysSADEId);
    }

    @JsonIgnore
    public String getInPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_INPSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_INPSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetInPSSubSysSADEId() {
        this._reset(DTOFIELD_INPSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO inpssubsyssadeid(String inPSSubSysSADEId) {
        this.setInPSSubSysSADEId(inPSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO inpssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setInPSSubSysSADEId(null);
            this.setInPSSubSysSADEName(null);
        } else {
            this.setInPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setInPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="inpssubsyssadename")
    public void setInPSSubSysSADEName(String inPSSubSysSADEName) {
        this._set(DTOFIELD_INPSSUBSYSSADENAME, inPSSubSysSADEName);
    }

    @JsonIgnore
    public String getInPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_INPSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_INPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetInPSSubSysSADEName() {
        this._reset(DTOFIELD_INPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO inpssubsyssadename(String inPSSubSysSADEName) {
        this.setInPSSubSysSADEName(inPSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="inpssysdynamodelid")
    public void setInPSSysDynaModelId(String inPSSysDynaModelId) {
        this._set(DTOFIELD_INPSSYSDYNAMODELID, inPSSysDynaModelId);
    }

    @JsonIgnore
    public String getInPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_INPSSYSDYNAMODELID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_INPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetInPSSysDynaModelId() {
        this._reset(DTOFIELD_INPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO inpssysdynamodelid(String inPSSysDynaModelId) {
        this.setInPSSysDynaModelId(inPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO inpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setInPSSysDynaModelId(null);
            this.setInPSSysDynaModelName(null);
        } else {
            this.setInPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setInPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="inpssysdynamodelname")
    public void setInPSSysDynaModelName(String inPSSysDynaModelName) {
        this._set(DTOFIELD_INPSSYSDYNAMODELNAME, inPSSysDynaModelName);
    }

    @JsonIgnore
    public String getInPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_INPSSYSDYNAMODELNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_INPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetInPSSysDynaModelName() {
        this._reset(DTOFIELD_INPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO inpssysdynamodelname(String inPSSysDynaModelName) {
        this.setInPSSysDynaModelName(inPSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="keyfieldname")
    public void setKeyFieldName(String keyFieldName) {
        this._set(DTOFIELD_KEYFIELDNAME, keyFieldName);
    }

    @JsonIgnore
    public String getKeyFieldName() {
        Object objValue = this._get(DTOFIELD_KEYFIELDNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyFieldNameDirty() {
        return this._contains(DTOFIELD_KEYFIELDNAME);
    }

    @JsonIgnore
    public void resetKeyFieldName() {
        this._reset(DTOFIELD_KEYFIELDNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO keyfieldname(String keyFieldName) {
        this.setKeyFieldName(keyFieldName);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="methodcode")
    public void setMethodCode(String methodCode) {
        this._set(DTOFIELD_METHODCODE, methodCode);
    }

    @JsonIgnore
    public String getMethodCode() {
        Object objValue = this._get(DTOFIELD_METHODCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMethodCodeDirty() {
        return this._contains(DTOFIELD_METHODCODE);
    }

    @JsonIgnore
    public void resetMethodCode() {
        this._reset(DTOFIELD_METHODCODE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO methodcode(String methodCode) {
        this.setMethodCode(methodCode);
        return this;
    }

    @JsonProperty(value="needresourcekey")
    public void setNeedResourceKey(Integer needResourceKey) {
        this._set(DTOFIELD_NEEDRESOURCEKEY, needResourceKey);
    }

    @JsonIgnore
    public Integer getNeedResourceKey() {
        Object objValue = this._get(DTOFIELD_NEEDRESOURCEKEY);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNeedResourceKeyDirty() {
        return this._contains(DTOFIELD_NEEDRESOURCEKEY);
    }

    @JsonIgnore
    public void resetNeedResourceKey() {
        this._reset(DTOFIELD_NEEDRESOURCEKEY);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO needresourcekey(Integer needResourceKey) {
        this.setNeedResourceKey(needResourceKey);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO needresourcekey(Boolean needResourceKey) {
        this.setNeedResourceKey(needResourceKey == null ? null : (needResourceKey ? 1 : 0));
        return this;
    }

    @JsonProperty(value="noservicecodename")
    public void setNoServiceCodeName(Integer noServiceCodeName) {
        this._set(DTOFIELD_NOSERVICECODENAME, noServiceCodeName);
    }

    @JsonIgnore
    public Integer getNoServiceCodeName() {
        Object objValue = this._get(DTOFIELD_NOSERVICECODENAME);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoServiceCodeNameDirty() {
        return this._contains(DTOFIELD_NOSERVICECODENAME);
    }

    @JsonIgnore
    public void resetNoServiceCodeName() {
        this._reset(DTOFIELD_NOSERVICECODENAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO noservicecodename(Integer noServiceCodeName) {
        this.setNoServiceCodeName(noServiceCodeName);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO noservicecodename(Boolean noServiceCodeName) {
        this.setNoServiceCodeName(noServiceCodeName == null ? null : (noServiceCodeName ? 1 : 0));
        return this;
    }

    @JsonProperty(value="outpssubsyssadeid")
    public void setOutPSSubSysSADEId(String outPSSubSysSADEId) {
        this._set(DTOFIELD_OUTPSSUBSYSSADEID, outPSSubSysSADEId);
    }

    @JsonIgnore
    public String getOutPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_OUTPSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_OUTPSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetOutPSSubSysSADEId() {
        this._reset(DTOFIELD_OUTPSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO outpssubsyssadeid(String outPSSubSysSADEId) {
        this.setOutPSSubSysSADEId(outPSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO outpssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setOutPSSubSysSADEId(null);
            this.setOutPSSubSysSADEName(null);
        } else {
            this.setOutPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setOutPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="outpssubsyssadename")
    public void setOutPSSubSysSADEName(String outPSSubSysSADEName) {
        this._set(DTOFIELD_OUTPSSUBSYSSADENAME, outPSSubSysSADEName);
    }

    @JsonIgnore
    public String getOutPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_OUTPSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_OUTPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetOutPSSubSysSADEName() {
        this._reset(DTOFIELD_OUTPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO outpssubsyssadename(String outPSSubSysSADEName) {
        this.setOutPSSubSysSADEName(outPSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="outpssysdynamodelid")
    public void setOutPSSysDynaModelId(String outPSSysDynaModelId) {
        this._set(DTOFIELD_OUTPSSYSDYNAMODELID, outPSSysDynaModelId);
    }

    @JsonIgnore
    public String getOutPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDYNAMODELID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetOutPSSysDynaModelId() {
        this._reset(DTOFIELD_OUTPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO outpssysdynamodelid(String outPSSysDynaModelId) {
        this.setOutPSSysDynaModelId(outPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO outpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setOutPSSysDynaModelId(null);
            this.setOutPSSysDynaModelName(null);
        } else {
            this.setOutPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setOutPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="outpssysdynamodelname")
    public void setOutPSSysDynaModelName(String outPSSysDynaModelName) {
        this._set(DTOFIELD_OUTPSSYSDYNAMODELNAME, outPSSysDynaModelName);
    }

    @JsonIgnore
    public String getOutPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDYNAMODELNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetOutPSSysDynaModelName() {
        this._reset(DTOFIELD_OUTPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO outpssysdynamodelname(String outPSSysDynaModelName) {
        this.setOutPSSysDynaModelName(outPSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="psdeid")
    public void setPSDEId(String pSDEId) {
        this._set(DTOFIELD_PSDEID, pSDEId);
    }

    @JsonIgnore
    public String getPSDEId() {
        Object objValue = this._get(DTOFIELD_PSDEID);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssubsyssadeid")
    public void setPSSubSysSADEId(String pSSubSysSADEId) {
        this._set(DTOFIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }

    @JsonIgnore
    public String getPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetPSSubSysSADEId() {
        this._reset(DTOFIELD_PSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsyssadeid(String pSSubSysSADEId) {
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
        } else {
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadename")
    public void setPSSubSysSADEName(String pSSubSysSADEName) {
        this._set(DTOFIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }

    @JsonIgnore
    public String getPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADEName() {
        this._reset(DTOFIELD_PSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsyssadename(String pSSubSysSADEName) {
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="pssubsyssadetailid")
    public void setPSSubSysSADetailId(String pSSubSysSADetailId) {
        this._set(DTOFIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }

    @JsonIgnore
    public String getPSSubSysSADetailId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILID);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailId() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsyssadetailid(String pSSubSysSADetailId) {
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    @JsonProperty(value="pssubsyssadetailname")
    public void setPSSubSysSADetailName(String pSSubSysSADetailName) {
        this._set(DTOFIELD_PSSUBSYSSADETAILNAME, pSSubSysSADetailName);
    }

    @JsonIgnore
    public String getPSSubSysSADetailName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailName() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsyssadetailname(String pSSubSysSADetailName) {
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIId() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
        if (pSSubSysServiceAPI == null) {
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        } else {
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIName() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="requestcontenttype")
    public void setRequestContentType(String requestContentType) {
        this._set(DTOFIELD_REQUESTCONTENTTYPE, requestContentType);
    }

    @JsonIgnore
    public String getRequestContentType() {
        Object objValue = this._get(DTOFIELD_REQUESTCONTENTTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestContentTypeDirty() {
        return this._contains(DTOFIELD_REQUESTCONTENTTYPE);
    }

    @JsonIgnore
    public void resetRequestContentType() {
        this._reset(DTOFIELD_REQUESTCONTENTTYPE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO requestcontenttype(String requestContentType) {
        this.setRequestContentType(requestContentType);
        return this;
    }

    @JsonProperty(value="requestmethod")
    public void setRequestMethod(String requestMethod) {
        this._set(DTOFIELD_REQUESTMETHOD, requestMethod);
    }

    @JsonIgnore
    public String getRequestMethod() {
        Object objValue = this._get(DTOFIELD_REQUESTMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestMethodDirty() {
        return this._contains(DTOFIELD_REQUESTMETHOD);
    }

    @JsonIgnore
    public void resetRequestMethod() {
        this._reset(DTOFIELD_REQUESTMETHOD);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO requestmethod(String requestMethod) {
        this.setRequestMethod(requestMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO requestmethod(PSModelEnums.RequestMethod requestMethod) {
        this.setRequestMethod(requestMethod == null ? null : requestMethod.value);
        return this;
    }

    @JsonProperty(value="requestparamtype")
    public void setRequestParamType(String requestParamType) {
        this._set(DTOFIELD_REQUESTPARAMTYPE, requestParamType);
    }

    @JsonIgnore
    public String getRequestParamType() {
        Object objValue = this._get(DTOFIELD_REQUESTPARAMTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestParamTypeDirty() {
        return this._contains(DTOFIELD_REQUESTPARAMTYPE);
    }

    @JsonIgnore
    public void resetRequestParamType() {
        this._reset(DTOFIELD_REQUESTPARAMTYPE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO requestparamtype(String requestParamType) {
        this.setRequestParamType(requestParamType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO requestparamtype(PSModelEnums.ServiceReqParamType requestParamType) {
        this.setRequestParamType(requestParamType == null ? null : requestParamType.value);
        return this;
    }

    @JsonProperty(value="retpssubsyssadeid")
    public void setRetPSSubSysSADEId(String retPSSubSysSADEId) {
        this._set(DTOFIELD_RETPSSUBSYSSADEID, retPSSubSysSADEId);
    }

    @JsonIgnore
    public String getRetPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_RETPSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_RETPSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetRetPSSubSysSADEId() {
        this._reset(DTOFIELD_RETPSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retpssubsyssadeid(String retPSSubSysSADEId) {
        this.setRetPSSubSysSADEId(retPSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retpssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setRetPSSubSysSADEId(null);
            this.setRetPSSubSysSADEName(null);
        } else {
            this.setRetPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setRetPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="retpssubsyssadename")
    public void setRetPSSubSysSADEName(String retPSSubSysSADEName) {
        this._set(DTOFIELD_RETPSSUBSYSSADENAME, retPSSubSysSADEName);
    }

    @JsonIgnore
    public String getRetPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_RETPSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_RETPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetRetPSSubSysSADEName() {
        this._reset(DTOFIELD_RETPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retpssubsyssadename(String retPSSubSysSADEName) {
        this.setRetPSSubSysSADEName(retPSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="retstddatatype")
    public void setRetStdDataType(Integer retStdDataType) {
        this._set(DTOFIELD_RETSTDDATATYPE, retStdDataType);
    }

    @JsonIgnore
    public Integer getRetStdDataType() {
        Object objValue = this._get(DTOFIELD_RETSTDDATATYPE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRetStdDataTypeDirty() {
        return this._contains(DTOFIELD_RETSTDDATATYPE);
    }

    @JsonIgnore
    public void resetRetStdDataType() {
        this._reset(DTOFIELD_RETSTDDATATYPE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retstddatatype(Integer retStdDataType) {
        this.setRetStdDataType(retStdDataType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retstddatatype(PSModelEnums.StdDataType retStdDataType) {
        this.setRetStdDataType(retStdDataType == null ? null : retStdDataType.value);
        return this;
    }

    @JsonProperty(value="retvaltype")
    public void setRetValType(String retValType) {
        this._set(DTOFIELD_RETVALTYPE, retValType);
    }

    @JsonIgnore
    public String getRetValType() {
        Object objValue = this._get(DTOFIELD_RETVALTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetValTypeDirty() {
        return this._contains(DTOFIELD_RETVALTYPE);
    }

    @JsonIgnore
    public void resetRetValType() {
        this._reset(DTOFIELD_RETVALTYPE);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retvaltype(String retValType) {
        this.setRetValType(retValType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO retvaltype(PSModelEnums.SubSysSADetailRetType retValType) {
        this.setRetValType(retValType == null ? null : retValType.value);
        return this;
    }

    @JsonProperty(value="serviceurl")
    public void setServiceUrl(String serviceUrl) {
        this._set(DTOFIELD_SERVICEURL, serviceUrl);
    }

    @JsonIgnore
    public String getServiceUrl() {
        Object objValue = this._get(DTOFIELD_SERVICEURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceUrlDirty() {
        return this._contains(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public void resetServiceUrl() {
        this._reset(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO serviceurl(String serviceUrl) {
        this.setServiceUrl(serviceUrl);
        return this;
    }

    @JsonProperty(value="uniquetag")
    public void setUniqueTag(String uniqueTag) {
        this._set(DTOFIELD_UNIQUETAG, uniqueTag);
    }

    @JsonIgnore
    public String getUniqueTag() {
        Object objValue = this._get(DTOFIELD_UNIQUETAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagDirty() {
        return this._contains(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public void resetUniqueTag() {
        this._reset(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO uniquetag(String uniqueTag) {
        this.setUniqueTag(uniqueTag);
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO updateman(String updateMan) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO usertag(String userTag) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO usertag2(String userTag2) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO usertag3(String userTag3) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO usertag4(String userTag4) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSubSysSADetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSubSysSADetailName(strName);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO name(String strName) {
        this.setPSSubSysSADetailName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSubSysSADetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSubSysSADetailId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADetailDTO id(String strValue) {
        this.setPSSubSysSADetailId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSubSysSADetailParamDTO> getPSSubSysSADetailParams() {
        Object value = this._get(DTOFIELD_PSSUBSYSSADETAILPARAMS);
        if (value instanceof List) return (List)value;
        return null;
    }

    @JsonProperty(value="pssubsyssadetailparams")
    public void setPSSubSysSADetailParams(List<PSSubSysSADetailParamDTO> value) {
        this._set(DTOFIELD_PSSUBSYSSADETAILPARAMS, value);
    }

    @JsonIgnore
    public List<PSSubSysSADetailParamDTO> getPSSubSysSADetailParamsIf() {
        Object value = this._get(DTOFIELD_PSSUBSYSSADETAILPARAMS);
        if (!(value instanceof List)) {
            value = new ArrayList<>();
            this._set(DTOFIELD_PSSUBSYSSADETAILPARAMS, value);
        }
        return (List)value;
    }

}
