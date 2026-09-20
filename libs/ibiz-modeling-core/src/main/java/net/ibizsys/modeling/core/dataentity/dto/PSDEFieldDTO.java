package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFieldDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_AUDITINFOFORMAT = "AUDITINFOFORMAT";
    protected static final String DTOFIELD_AUDITINFOFORMAT = "auditinfoformat";
    public static final String FIELD_BIZTAG = "BIZTAG";
    protected static final String DTOFIELD_BIZTAG = "biztag";
    public static final String FIELD_CHECKRECURSION = "CHECKRECURSION";
    protected static final String DTOFIELD_CHECKRECURSION = "checkrecursion";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COMPUTEEXP = "COMPUTEEXP";
    protected static final String DTOFIELD_COMPUTEEXP = "computeexp";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMEXPORTSCOPE = "CUSTOMEXPORTSCOPE";
    protected static final String DTOFIELD_CUSTOMEXPORTSCOPE = "customexportscope";
    public static final String FIELD_DBVALUEMODE = "DBVALUEMODE";
    protected static final String DTOFIELD_DBVALUEMODE = "dbvaluemode";
    public static final String FIELD_DBVALUEMODE2 = "DBVALUEMODE2";
    protected static final String DTOFIELD_DBVALUEMODE2 = "dbvaluemode2";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DEFTYPE = "DEFTYPE";
    protected static final String DTOFIELD_DEFTYPE = "deftype";
    public static final String FIELD_DERPSDEFID = "DERPSDEFID";
    protected static final String DTOFIELD_DERPSDEFID = "derpsdefid";
    public static final String FIELD_DERPSDEFNAME = "DERPSDEFNAME";
    protected static final String DTOFIELD_DERPSDEFNAME = "derpsdefname";
    public static final String FIELD_DUPCHECKMODE = "DUPCHECKMODE";
    protected static final String DTOFIELD_DUPCHECKMODE = "dupcheckmode";
    public static final String FIELD_DUPCHECKVALUES = "DUPCHECKVALUES";
    protected static final String DTOFIELD_DUPCHECKVALUES = "dupcheckvalues";
    public static final String FIELD_DUPCHECKPSDEFID = "DUPCHKPSDEFID";
    protected static final String DTOFIELD_DUPCHECKPSDEFID = "dupcheckpsdefid";
    public static final String FIELD_DUPCHECKPSDEFNAME = "DUPCHKPSDEFNAME";
    protected static final String DTOFIELD_DUPCHECKPSDEFNAME = "dupcheckpsdefname";
    public static final String FIELD_DEFAULTVALUETYPE = "DVT";
    protected static final String DTOFIELD_DEFAULTVALUETYPE = "defaultvaluetype";
    public static final String FIELD_ENABLEAUDIT = "ENABLEAUDIT";
    protected static final String DTOFIELD_ENABLEAUDIT = "enableaudit";
    public static final String FIELD_ENABLECOLPRIV = "ENABLECOLPRIV";
    protected static final String DTOFIELD_ENABLECOLPRIV = "enablecolpriv";
    public static final String FIELD_ENABLEQS = "ENABLEQS";
    protected static final String DTOFIELD_ENABLEQS = "enableqs";
    public static final String FIELD_ENABLETEMPDATA = "ENABLETEMPDATA";
    protected static final String DTOFIELD_ENABLETEMPDATA = "enabletempdata";
    public static final String FIELD_ENABLEUSERINPUT = "ENABLEUSERINPUT";
    protected static final String DTOFIELD_ENABLEUSERINPUT = "enableuserinput";
    public static final String FIELD_ENAWRITEBACK = "ENAWRITEBACK";
    protected static final String DTOFIELD_ENAWRITEBACK = "enawriteback";
    public static final String FIELD_EXPORTSCOPE = "EXPORTSCOPE";
    protected static final String DTOFIELD_EXPORTSCOPE = "exportscope";
    public static final String FIELD_EXPPSSYSTRANSLATORID = "EXPPSSYSTRANSLATORID";
    protected static final String DTOFIELD_EXPPSSYSTRANSLATORID = "exppssystranslatorid";
    public static final String FIELD_EXPPSSYSTRANSLATORNAME = "EXPPSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_EXPPSSYSTRANSLATORNAME = "exppssystranslatorname";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FIELDTAG = "FIELDTAG";
    protected static final String DTOFIELD_FIELDTAG = "fieldtag";
    public static final String FIELD_FIELDTAG2 = "FIELDTAG2";
    protected static final String DTOFIELD_FIELDTAG2 = "fieldtag2";
    public static final String FIELD_FKEY = "FKEY";
    protected static final String DTOFIELD_FKEY = "fkey";
    public static final String FIELD_FORMULAFIELDS = "FORMULAFIELDS";
    protected static final String DTOFIELD_FORMULAFIELDS = "formulafields";
    public static final String FIELD_FORMULAFORMAT = "FORMULAFORMAT";
    protected static final String DTOFIELD_FORMULAFORMAT = "formulaformat";
    public static final String FIELD_IMPORTKEY = "IMPORTKEY";
    protected static final String DTOFIELD_IMPORTKEY = "importkey";
    public static final String FIELD_IMPORTORDER = "IMPORTORDER";
    protected static final String DTOFIELD_IMPORTORDER = "importorder";
    public static final String FIELD_IMPORTTAG = "IMPORTTAG";
    protected static final String DTOFIELD_IMPORTTAG = "importtag";
    public static final String FIELD_IMPPSSYSTRANSLATORID = "IMPPSSYSTRANSLATORID";
    protected static final String DTOFIELD_IMPPSSYSTRANSLATORID = "imppssystranslatorid";
    public static final String FIELD_IMPPSSYSTRANSLATORNAME = "IMPPSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_IMPPSSYSTRANSLATORNAME = "imppssystranslatorname";
    public static final String FIELD_INDEXTYPE = "INDEXTYPE";
    protected static final String DTOFIELD_INDEXTYPE = "indextype";
    public static final String FIELD_JSFORMAT = "JSFORMAT";
    protected static final String DTOFIELD_JSFORMAT = "jsformat";
    public static final String FIELD_JSONFORMAT = "JSONFORMAT";
    protected static final String DTOFIELD_JSONFORMAT = "jsonformat";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_LNPSLANRESID = "LNPSLANRESID";
    protected static final String DTOFIELD_LNPSLANRESID = "lnpslanresid";
    public static final String FIELD_LNPSLANRESNAME = "LNPSLANRESNAME";
    protected static final String DTOFIELD_LNPSLANRESNAME = "lnpslanresname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAJORFIELD = "MAJORFIELD";
    protected static final String DTOFIELD_MAJORFIELD = "majorfield";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINSTRLENGTH = "MINSTRLENGTH";
    protected static final String DTOFIELD_MINSTRLENGTH = "minstrlength";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_MULTIFORMFIELD = "MULTIFORMFIELD";
    protected static final String DTOFIELD_MULTIFORMFIELD = "multiformfield";
    public static final String FIELD_NO2DUPCHKPSDEFID = "NO2DUPCHKPSDEFID";
    protected static final String DTOFIELD_NO2DUPCHKPSDEFID = "no2dupchkpsdefid";
    public static final String FIELD_NO2DUPCHKPSDEFNAME = "NO2DUPCHKPSDEFNAME";
    protected static final String DTOFIELD_NO2DUPCHKPSDEFNAME = "no2dupchkpsdefname";
    public static final String FIELD_NO3DUPCHKPSDEFID = "NO3DUPCHKPSDEFID";
    protected static final String DTOFIELD_NO3DUPCHKPSDEFID = "no3dupchkpsdefid";
    public static final String FIELD_NO3DUPCHKPSDEFNAME = "NO3DUPCHKPSDEFNAME";
    protected static final String DTOFIELD_NO3DUPCHKPSDEFNAME = "no3dupchkpsdefname";
    public static final String FIELD_NULLVALORDER = "NULLVALORDER";
    protected static final String DTOFIELD_NULLVALORDER = "nullvalorder";
    public static final String FIELD_O2MPSDERID = "O2MPSDERID";
    protected static final String DTOFIELD_O2MPSDERID = "o2mpsderid";
    public static final String FIELD_O2MPSDERNAME = "O2MPSDERNAME";
    protected static final String DTOFIELD_O2MPSDERNAME = "o2mpsdername";
    public static final String FIELD_O2OPSDERID = "O2OPSDERID";
    protected static final String DTOFIELD_O2OPSDERID = "o2opsderid";
    public static final String FIELD_O2OPSDERNAME = "O2OPSDERNAME";
    protected static final String DTOFIELD_O2OPSDERNAME = "o2opsdername";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PASTERESET = "PASTERESET";
    protected static final String DTOFIELD_PASTERESET = "pastereset";
    public static final String FIELD_PHYSICALFIELD = "PHYSICALFIELD";
    protected static final String DTOFIELD_PHYSICALFIELD = "physicalfield";
    public static final String FIELD_PKEY = "PKEY";
    protected static final String DTOFIELD_PKEY = "pkey";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PREDEFINEDTYPEPARAM = "PREDEFINEDTYPEPARAM";
    protected static final String DTOFIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINETYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDATATYPEID = "PSDATATYPEID";
    protected static final String DTOFIELD_PSDATATYPEID = "psdatatypeid";
    public static final String FIELD_PSDATATYPENAME = "PSDATATYPENAME";
    protected static final String DTOFIELD_PSDATATYPENAME = "psdatatypename";
    public static final String FIELD_PSDEFIELDID = "PSDEFIELDID";
    protected static final String DTOFIELD_PSDEFIELDID = "psdefieldid";
    public static final String FIELD_PSDEFIELDNAME = "PSDEFIELDNAME";
    protected static final String DTOFIELD_PSDEFIELDNAME = "psdefieldname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDETABLEID = "PSDETABLEID";
    protected static final String DTOFIELD_PSDETABLEID = "psdetableid";
    public static final String FIELD_PSSUBSYSSADEFIELDID = "PSSUBSYSSADEFIELDID";
    protected static final String DTOFIELD_PSSUBSYSSADEFIELDID = "pssubsyssadefieldid";
    public static final String FIELD_PSSUBSYSSADEFIELDNAME = "PSSUBSYSSADEFIELDNAME";
    protected static final String DTOFIELD_PSSUBSYSSADEFIELDNAME = "pssubsyssadefieldname";
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSYSDBCOLUMNID = "PSSYSDBCOLUMNID";
    protected static final String DTOFIELD_PSSYSDBCOLUMNID = "pssysdbcolumnid";
    public static final String FIELD_PSSYSSAMPLEVALUEID = "PSSYSSAMPLEVALUEID";
    protected static final String DTOFIELD_PSSYSSAMPLEVALUEID = "pssyssamplevalueid";
    public static final String FIELD_PSSYSSAMPLEVALUENAME = "PSSYSSAMPLEVALUENAME";
    protected static final String DTOFIELD_PSSYSSAMPLEVALUENAME = "pssyssamplevaluename";
    public static final String FIELD_PSSYSSEQUENCEID = "PSSYSSEQUENCEID";
    protected static final String DTOFIELD_PSSYSSEQUENCEID = "pssyssequenceid";
    public static final String FIELD_PSSYSSEQUENCENAME = "PSSYSSEQUENCENAME";
    protected static final String DTOFIELD_PSSYSSEQUENCENAME = "pssyssequencename";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_PSSYSUNITID = "PSSYSUNITID";
    protected static final String DTOFIELD_PSSYSUNITID = "pssysunitid";
    public static final String FIELD_PSSYSUNITNAME = "PSSYSUNITNAME";
    protected static final String DTOFIELD_PSSYSUNITNAME = "pssysunitname";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_QUERYCOLUMN = "QUERYCOLUMN";
    protected static final String DTOFIELD_QUERYCOLUMN = "querycolumn";
    public static final String FIELD_QUERYCS = "QUERYCS";
    protected static final String DTOFIELD_QUERYCS = "querycs";
    public static final String FIELD_READONLYMODE = "READONLYMODE";
    protected static final String DTOFIELD_READONLYMODE = "readonlymode";
    public static final String FIELD_REFPSSYSDYNAMODELID = "REFPSSYSDYNAMODELID";
    protected static final String DTOFIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";
    public static final String FIELD_REFPSSYSDYNAMODELNAME = "REFPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";
    public static final String FIELD_RESTRICTEDPSDEFID = "RESTRICTEDPSDEFID";
    protected static final String DTOFIELD_RESTRICTEDPSDEFID = "restrictedpsdefid";
    public static final String FIELD_RESTRICTEDPSDEFNAME = "RESTRICTEDPSDEFNAME";
    protected static final String DTOFIELD_RESTRICTEDPSDEFNAME = "restrictedpsdefname";
    public static final String FIELD_SEQUENCEMODE = "SEQUENCEMODE";
    protected static final String DTOFIELD_SEQUENCEMODE = "sequencemode";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_STATEFIELD = "STATEFIELD";
    protected static final String DTOFIELD_STATEFIELD = "statefield";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_STRINGCASE = "STRINGCASE";
    protected static final String DTOFIELD_STRINGCASE = "stringcase";
    public static final String FIELD_STRLENGTH = "STRLENGTH";
    protected static final String DTOFIELD_STRLENGTH = "strlength";
    public static final String FIELD_TABLENAME = "TABLENAME";
    protected static final String DTOFIELD_TABLENAME = "tablename";
    public static final String FIELD_TABLESCOPE = "TABLESCOPE";
    protected static final String DTOFIELD_TABLESCOPE = "tablescope";
    public static final String FIELD_TESTDATA = "TESTDATA";
    protected static final String DTOFIELD_TESTDATA = "testdata";
    public static final String FIELD_TRANSLATORMODE = "TRANSLATORMODE";
    protected static final String DTOFIELD_TRANSLATORMODE = "translatormode";
    public static final String FIELD_UNICODECHAR = "UNICODECHAR";
    protected static final String DTOFIELD_UNICODECHAR = "unicodechar";
    public static final String FIELD_UNIONKEYVALUE = "UNIONKEYVALUE";
    protected static final String DTOFIELD_UNIONKEYVALUE = "unionkeyvalue";
    public static final String FIELD_UNIT = "UNIT";
    protected static final String DTOFIELD_UNIT = "unit";
    public static final String FIELD_UNITWIDTH = "UNITWIDTH";
    protected static final String DTOFIELD_UNITWIDTH = "unitwidth";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPDATEOVMODE = "UPDATEOVMODE";
    protected static final String DTOFIELD_UPDATEOVMODE = "updateovmode";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_VALUEPSDEFID = "VALUEPSDEFID";
    protected static final String DTOFIELD_VALUEPSDEFID = "valuepsdefid";
    public static final String FIELD_VALUEPSDEFNAME = "VALUEPSDEFNAME";
    protected static final String DTOFIELD_VALUEPSDEFNAME = "valuepsdefname";
    public static final String FIELD_VIEWCOLLEVEL = "VIEWCOLLEVEL";
    protected static final String DTOFIELD_VIEWCOLLEVEL = "viewcollevel";

    @JsonProperty(value="allowempty")
    public void setAllowEmpty(Integer allowEmpty) {
        this._set(DTOFIELD_ALLOWEMPTY, allowEmpty);
    }

    @JsonIgnore
    public Integer getAllowEmpty() {
        Object objValue = this._get(DTOFIELD_ALLOWEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllowEmptyDirty() {
        return this._contains(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public void resetAllowEmpty() {
        this._reset(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public PSDEFieldDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="auditinfoformat")
    public void setAuditInfoFormat(String auditInfoFormat) {
        this._set(DTOFIELD_AUDITINFOFORMAT, auditInfoFormat);
    }

    @JsonIgnore
    public String getAuditInfoFormat() {
        Object objValue = this._get(DTOFIELD_AUDITINFOFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuditInfoFormatDirty() {
        return this._contains(DTOFIELD_AUDITINFOFORMAT);
    }

    @JsonIgnore
    public void resetAuditInfoFormat() {
        this._reset(DTOFIELD_AUDITINFOFORMAT);
    }

    @JsonIgnore
    public PSDEFieldDTO auditinfoformat(String auditInfoFormat) {
        this.setAuditInfoFormat(auditInfoFormat);
        return this;
    }

    @JsonProperty(value="biztag")
    public void setBizTag(String bizTag) {
        this._set(DTOFIELD_BIZTAG, bizTag);
    }

    @JsonIgnore
    public String getBizTag() {
        Object objValue = this._get(DTOFIELD_BIZTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBizTagDirty() {
        return this._contains(DTOFIELD_BIZTAG);
    }

    @JsonIgnore
    public void resetBizTag() {
        this._reset(DTOFIELD_BIZTAG);
    }

    @JsonIgnore
    public PSDEFieldDTO biztag(String bizTag) {
        this.setBizTag(bizTag);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO biztag(PSModelEnums.DEFBizTag bizTag) {
        if (bizTag == null) {
            this.setBizTag(null);
        } else {
            this.setBizTag(bizTag.value);
        }
        return this;
    }

    @JsonProperty(value="checkrecursion")
    public void setCheckRecursion(Integer checkRecursion) {
        this._set(DTOFIELD_CHECKRECURSION, checkRecursion);
    }

    @JsonIgnore
    public Integer getCheckRecursion() {
        Object objValue = this._get(DTOFIELD_CHECKRECURSION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckRecursionDirty() {
        return this._contains(DTOFIELD_CHECKRECURSION);
    }

    @JsonIgnore
    public void resetCheckRecursion() {
        this._reset(DTOFIELD_CHECKRECURSION);
    }

    @JsonIgnore
    public PSDEFieldDTO checkrecursion(Integer checkRecursion) {
        this.setCheckRecursion(checkRecursion);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO checkrecursion(Boolean checkRecursion) {
        if (checkRecursion == null) {
            this.setCheckRecursion(null);
        } else {
            this.setCheckRecursion(checkRecursion != false ? 1 : 0);
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
    public PSDEFieldDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="computeexp")
    public void setComputeExp(String computeExp) {
        this._set(DTOFIELD_COMPUTEEXP, computeExp);
    }

    @JsonIgnore
    public String getComputeExp() {
        Object objValue = this._get(DTOFIELD_COMPUTEEXP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isComputeExpDirty() {
        return this._contains(DTOFIELD_COMPUTEEXP);
    }

    @JsonIgnore
    public void resetComputeExp() {
        this._reset(DTOFIELD_COMPUTEEXP);
    }

    @JsonIgnore
    public PSDEFieldDTO computeexp(String computeExp) {
        this.setComputeExp(computeExp);
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
    public PSDEFieldDTO createdate(Timestamp createDate) {
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
    public PSDEFieldDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customexportscope")
    public void setCustomExportScope(Integer customExportScope) {
        this._set(DTOFIELD_CUSTOMEXPORTSCOPE, customExportScope);
    }

    @JsonIgnore
    public Integer getCustomExportScope() {
        Object objValue = this._get(DTOFIELD_CUSTOMEXPORTSCOPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomExportScopeDirty() {
        return this._contains(DTOFIELD_CUSTOMEXPORTSCOPE);
    }

    @JsonIgnore
    public void resetCustomExportScope() {
        this._reset(DTOFIELD_CUSTOMEXPORTSCOPE);
    }

    @JsonIgnore
    public PSDEFieldDTO customexportscope(Integer customExportScope) {
        this.setCustomExportScope(customExportScope);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO customexportscope(Boolean customExportScope) {
        if (customExportScope == null) {
            this.setCustomExportScope(null);
        } else {
            this.setCustomExportScope(customExportScope != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dbvaluemode")
    public void setDBValueMode(String dBValueMode) {
        this._set(DTOFIELD_DBVALUEMODE, dBValueMode);
    }

    @JsonIgnore
    public String getDBValueMode() {
        Object objValue = this._get(DTOFIELD_DBVALUEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBValueModeDirty() {
        return this._contains(DTOFIELD_DBVALUEMODE);
    }

    @JsonIgnore
    public void resetDBValueMode() {
        this._reset(DTOFIELD_DBVALUEMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO dbvaluemode(String dBValueMode) {
        this.setDBValueMode(dBValueMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO dbvaluemode(PSModelEnums.DBValueMode dBValueMode) {
        if (dBValueMode == null) {
            this.setDBValueMode(null);
        } else {
            this.setDBValueMode(dBValueMode.value);
        }
        return this;
    }

    @JsonProperty(value="dbvaluemode2")
    public void setDBValueMode2(String dBValueMode2) {
        this._set(DTOFIELD_DBVALUEMODE2, dBValueMode2);
    }

    @JsonIgnore
    public String getDBValueMode2() {
        Object objValue = this._get(DTOFIELD_DBVALUEMODE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBValueMode2Dirty() {
        return this._contains(DTOFIELD_DBVALUEMODE2);
    }

    @JsonIgnore
    public void resetDBValueMode2() {
        this._reset(DTOFIELD_DBVALUEMODE2);
    }

    @JsonIgnore
    public PSDEFieldDTO dbvaluemode2(String dBValueMode2) {
        this.setDBValueMode2(dBValueMode2);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO dbvaluemode2(PSModelEnums.DBValueMode dBValueMode2) {
        if (dBValueMode2 == null) {
            this.setDBValueMode2(null);
        } else {
            this.setDBValueMode2(dBValueMode2.value);
        }
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public void resetDefaultValue() {
        this._reset(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public PSDEFieldDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="deftype")
    public void setDEFType(Integer dEFType) {
        this._set(DTOFIELD_DEFTYPE, dEFType);
    }

    @JsonIgnore
    public Integer getDEFType() {
        Object objValue = this._get(DTOFIELD_DEFTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEFTypeDirty() {
        return this._contains(DTOFIELD_DEFTYPE);
    }

    @JsonIgnore
    public void resetDEFType() {
        this._reset(DTOFIELD_DEFTYPE);
    }

    @JsonIgnore
    public PSDEFieldDTO deftype(Integer dEFType) {
        this.setDEFType(dEFType);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO deftype(PSModelEnums.DEFType dEFType) {
        if (dEFType == null) {
            this.setDEFType(null);
        } else {
            this.setDEFType(dEFType.value);
        }
        return this;
    }

    @JsonProperty(value="derpsdefid")
    public void setDERPSDEFId(String dERPSDEFId) {
        this._set(DTOFIELD_DERPSDEFID, dERPSDEFId);
    }

    @JsonIgnore
    public String getDERPSDEFId() {
        Object objValue = this._get(DTOFIELD_DERPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDERPSDEFIdDirty() {
        return this._contains(DTOFIELD_DERPSDEFID);
    }

    @JsonIgnore
    public void resetDERPSDEFId() {
        this._reset(DTOFIELD_DERPSDEFID);
    }

    @JsonIgnore
    public PSDEFieldDTO derpsdefid(String dERPSDEFId) {
        this.setDERPSDEFId(dERPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO derpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDERPSDEFId(null);
            this.setDERPSDEFName(null);
        } else {
            this.setDERPSDEFId(pSDEField.getPSDEFieldId());
            this.setDERPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="derpsdefname")
    public void setDERPSDEFName(String dERPSDEFName) {
        this._set(DTOFIELD_DERPSDEFNAME, dERPSDEFName);
    }

    @JsonIgnore
    public String getDERPSDEFName() {
        Object objValue = this._get(DTOFIELD_DERPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDERPSDEFNameDirty() {
        return this._contains(DTOFIELD_DERPSDEFNAME);
    }

    @JsonIgnore
    public void resetDERPSDEFName() {
        this._reset(DTOFIELD_DERPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO derpsdefname(String dERPSDEFName) {
        this.setDERPSDEFName(dERPSDEFName);
        return this;
    }

    @JsonProperty(value="dupcheckmode")
    public void setDupCheckMode(String dupCheckMode) {
        this._set(DTOFIELD_DUPCHECKMODE, dupCheckMode);
    }

    @JsonIgnore
    public String getDupCheckMode() {
        Object objValue = this._get(DTOFIELD_DUPCHECKMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDupCheckModeDirty() {
        return this._contains(DTOFIELD_DUPCHECKMODE);
    }

    @JsonIgnore
    public void resetDupCheckMode() {
        this._reset(DTOFIELD_DUPCHECKMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO dupcheckmode(String dupCheckMode) {
        this.setDupCheckMode(dupCheckMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO dupcheckmode(PSModelEnums.DEFDupCheckMode dupCheckMode) {
        if (dupCheckMode == null) {
            this.setDupCheckMode(null);
        } else {
            this.setDupCheckMode(dupCheckMode.value);
        }
        return this;
    }

    @JsonProperty(value="dupcheckvalues")
    public void setDupCheckValues(String dupCheckValues) {
        this._set(DTOFIELD_DUPCHECKVALUES, dupCheckValues);
    }

    @JsonIgnore
    public String getDupCheckValues() {
        Object objValue = this._get(DTOFIELD_DUPCHECKVALUES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDupCheckValuesDirty() {
        return this._contains(DTOFIELD_DUPCHECKVALUES);
    }

    @JsonIgnore
    public void resetDupCheckValues() {
        this._reset(DTOFIELD_DUPCHECKVALUES);
    }

    @JsonIgnore
    public PSDEFieldDTO dupcheckvalues(String dupCheckValues) {
        this.setDupCheckValues(dupCheckValues);
        return this;
    }

    @JsonProperty(value="dupcheckpsdefid")
    public void setDupCheckPSDEFId(String dupCheckPSDEFId) {
        this._set(DTOFIELD_DUPCHECKPSDEFID, dupCheckPSDEFId);
        this._set(FIELD_DUPCHECKPSDEFID, dupCheckPSDEFId);
    }

    @JsonIgnore
    public String getDupCheckPSDEFId() {
        Object objValue = this._get(DTOFIELD_DUPCHECKPSDEFID);
        if (objValue == null && (objValue = this._get(FIELD_DUPCHECKPSDEFID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDupCheckPSDEFIdDirty() {
        if (this._contains(DTOFIELD_DUPCHECKPSDEFID)) {
            return true;
        }
        return this._contains(FIELD_DUPCHECKPSDEFID);
    }

    @JsonIgnore
    public void resetDupCheckPSDEFId() {
        this._reset(DTOFIELD_DUPCHECKPSDEFID);
        this._reset(FIELD_DUPCHECKPSDEFID);
    }

    @JsonIgnore
    public PSDEFieldDTO dupcheckpsdefid(String dupCheckPSDEFId) {
        this.setDupCheckPSDEFId(dupCheckPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO dupcheckpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDupCheckPSDEFId(null);
            this.setDupCheckPSDEFName(null);
        } else {
            this.setDupCheckPSDEFId(pSDEField.getPSDEFieldId());
            this.setDupCheckPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="dupcheckpsdefname")
    public void setDupCheckPSDEFName(String dupCheckPSDEFName) {
        this._set(DTOFIELD_DUPCHECKPSDEFNAME, dupCheckPSDEFName);
        this._set(FIELD_DUPCHECKPSDEFNAME, dupCheckPSDEFName);
    }

    @JsonIgnore
    public String getDupCheckPSDEFName() {
        Object objValue = this._get(DTOFIELD_DUPCHECKPSDEFNAME);
        if (objValue == null && (objValue = this._get(FIELD_DUPCHECKPSDEFNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDupCheckPSDEFNameDirty() {
        if (this._contains(DTOFIELD_DUPCHECKPSDEFNAME)) {
            return true;
        }
        return this._contains(FIELD_DUPCHECKPSDEFNAME);
    }

    @JsonIgnore
    public void resetDupCheckPSDEFName() {
        this._reset(DTOFIELD_DUPCHECKPSDEFNAME);
        this._reset(FIELD_DUPCHECKPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO dupcheckpsdefname(String dupCheckPSDEFName) {
        this.setDupCheckPSDEFName(dupCheckPSDEFName);
        return this;
    }

    @JsonProperty(value="defaultvaluetype")
    public void setDefaultValueType(String defaultValueType) {
        this._set(DTOFIELD_DEFAULTVALUETYPE, defaultValueType);
        this._set(FIELD_DEFAULTVALUETYPE, defaultValueType);
    }

    @JsonIgnore
    public String getDefaultValueType() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUETYPE);
        if (objValue == null && (objValue = this._get(FIELD_DEFAULTVALUETYPE)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueTypeDirty() {
        if (this._contains(DTOFIELD_DEFAULTVALUETYPE)) {
            return true;
        }
        return this._contains(FIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public void resetDefaultValueType() {
        this._reset(DTOFIELD_DEFAULTVALUETYPE);
        this._reset(FIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public PSDEFieldDTO defaultvaluetype(String defaultValueType) {
        this.setDefaultValueType(defaultValueType);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO defaultvaluetype(PSModelEnums.DEFDefaultValueType defaultValueType) {
        if (defaultValueType == null) {
            this.setDefaultValueType(null);
        } else {
            this.setDefaultValueType(defaultValueType.value);
        }
        return this;
    }

    @JsonProperty(value="enableaudit")
    public void setEnableAudit(Integer enableAudit) {
        this._set(DTOFIELD_ENABLEAUDIT, enableAudit);
    }

    @JsonIgnore
    public Integer getEnableAudit() {
        Object objValue = this._get(DTOFIELD_ENABLEAUDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAuditDirty() {
        return this._contains(DTOFIELD_ENABLEAUDIT);
    }

    @JsonIgnore
    public void resetEnableAudit() {
        this._reset(DTOFIELD_ENABLEAUDIT);
    }

    @JsonIgnore
    public PSDEFieldDTO enableaudit(Integer enableAudit) {
        this.setEnableAudit(enableAudit);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO enableaudit(PSModelEnums.DEFieldAuditLevel enableAudit) {
        if (enableAudit == null) {
            this.setEnableAudit(null);
        } else {
            this.setEnableAudit(enableAudit.value);
        }
        return this;
    }

    @JsonProperty(value="enablecolpriv")
    public void setEnableColPriv(Integer enableColPriv) {
        this._set(DTOFIELD_ENABLECOLPRIV, enableColPriv);
    }

    @JsonIgnore
    public Integer getEnableColPriv() {
        Object objValue = this._get(DTOFIELD_ENABLECOLPRIV);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableColPrivDirty() {
        return this._contains(DTOFIELD_ENABLECOLPRIV);
    }

    @JsonIgnore
    public void resetEnableColPriv() {
        this._reset(DTOFIELD_ENABLECOLPRIV);
    }

    @JsonIgnore
    public PSDEFieldDTO enablecolpriv(Integer enableColPriv) {
        this.setEnableColPriv(enableColPriv);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO enablecolpriv(Boolean enableColPriv) {
        if (enableColPriv == null) {
            this.setEnableColPriv(null);
        } else {
            this.setEnableColPriv(enableColPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableqs")
    public void setEnableQS(Integer enableQS) {
        this._set(DTOFIELD_ENABLEQS, enableQS);
    }

    @JsonIgnore
    public Integer getEnableQS() {
        Object objValue = this._get(DTOFIELD_ENABLEQS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableQSDirty() {
        return this._contains(DTOFIELD_ENABLEQS);
    }

    @JsonIgnore
    public void resetEnableQS() {
        this._reset(DTOFIELD_ENABLEQS);
    }

    @JsonIgnore
    public PSDEFieldDTO enableqs(Integer enableQS) {
        this.setEnableQS(enableQS);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO enableqs(Boolean enableQS) {
        if (enableQS == null) {
            this.setEnableQS(null);
        } else {
            this.setEnableQS(enableQS != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabletempdata")
    public void setEnableTempData(Integer enableTempData) {
        this._set(DTOFIELD_ENABLETEMPDATA, enableTempData);
    }

    @JsonIgnore
    public Integer getEnableTempData() {
        Object objValue = this._get(DTOFIELD_ENABLETEMPDATA);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableTempDataDirty() {
        return this._contains(DTOFIELD_ENABLETEMPDATA);
    }

    @JsonIgnore
    public void resetEnableTempData() {
        this._reset(DTOFIELD_ENABLETEMPDATA);
    }

    @JsonIgnore
    public PSDEFieldDTO enabletempdata(Integer enableTempData) {
        this.setEnableTempData(enableTempData);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO enabletempdata(Boolean enableTempData) {
        if (enableTempData == null) {
            this.setEnableTempData(null);
        } else {
            this.setEnableTempData(enableTempData != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableuserinput")
    public void setEnableUserInput(Integer enableUserInput) {
        this._set(DTOFIELD_ENABLEUSERINPUT, enableUserInput);
    }

    @JsonIgnore
    public Integer getEnableUserInput() {
        Object objValue = this._get(DTOFIELD_ENABLEUSERINPUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUserInputDirty() {
        return this._contains(DTOFIELD_ENABLEUSERINPUT);
    }

    @JsonIgnore
    public void resetEnableUserInput() {
        this._reset(DTOFIELD_ENABLEUSERINPUT);
    }

    @JsonIgnore
    public PSDEFieldDTO enableuserinput(Integer enableUserInput) {
        this.setEnableUserInput(enableUserInput);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO enableuserinput(PSModelEnums.UserInputMode[] enableUserInput) {
        if (enableUserInput == null || enableUserInput.length == 0) {
            this.setEnableUserInput(null);
        } else {
            int _value = 0;
            for (PSModelEnums.UserInputMode _item : enableUserInput) {
                _value |= _item.value;
            }
            this.setEnableUserInput(_value);
        }
        return this;
    }

    @JsonProperty(value="enawriteback")
    public void setEnaWriteBack(Integer enaWriteBack) {
        this._set(DTOFIELD_ENAWRITEBACK, enaWriteBack);
    }

    @JsonIgnore
    public Integer getEnaWriteBack() {
        Object objValue = this._get(DTOFIELD_ENAWRITEBACK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnaWriteBackDirty() {
        return this._contains(DTOFIELD_ENAWRITEBACK);
    }

    @JsonIgnore
    public void resetEnaWriteBack() {
        this._reset(DTOFIELD_ENAWRITEBACK);
    }

    @JsonIgnore
    public PSDEFieldDTO enawriteback(Integer enaWriteBack) {
        this.setEnaWriteBack(enaWriteBack);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO enawriteback(PSModelEnums.DEFWriteBackMode enaWriteBack) {
        if (enaWriteBack == null) {
            this.setEnaWriteBack(null);
        } else {
            this.setEnaWriteBack(enaWriteBack.value);
        }
        return this;
    }

    @JsonProperty(value="exportscope")
    public void setExportScope(Integer exportScope) {
        this._set(DTOFIELD_EXPORTSCOPE, exportScope);
    }

    @JsonIgnore
    public Integer getExportScope() {
        Object objValue = this._get(DTOFIELD_EXPORTSCOPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportScopeDirty() {
        return this._contains(DTOFIELD_EXPORTSCOPE);
    }

    @JsonIgnore
    public void resetExportScope() {
        this._reset(DTOFIELD_EXPORTSCOPE);
    }

    @JsonIgnore
    public PSDEFieldDTO exportscope(Integer exportScope) {
        this.setExportScope(exportScope);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO exportscope(PSModelEnums.DEExportModelScope[] exportScope) {
        if (exportScope == null || exportScope.length == 0) {
            this.setExportScope(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DEExportModelScope _item : exportScope) {
                _value |= _item.value;
            }
            this.setExportScope(_value);
        }
        return this;
    }

    @JsonProperty(value="exppssystranslatorid")
    public void setExpPSSysTranslatorId(String expPSSysTranslatorId) {
        this._set(DTOFIELD_EXPPSSYSTRANSLATORID, expPSSysTranslatorId);
    }

    @JsonIgnore
    public String getExpPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_EXPPSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExpPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_EXPPSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetExpPSSysTranslatorId() {
        this._reset(DTOFIELD_EXPPSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDEFieldDTO exppssystranslatorid(String expPSSysTranslatorId) {
        this.setExpPSSysTranslatorId(expPSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO exppssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setExpPSSysTranslatorId(null);
            this.setExpPSSysTranslatorName(null);
        } else {
            this.setExpPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setExpPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="exppssystranslatorname")
    public void setExpPSSysTranslatorName(String expPSSysTranslatorName) {
        this._set(DTOFIELD_EXPPSSYSTRANSLATORNAME, expPSSysTranslatorName);
    }

    @JsonIgnore
    public String getExpPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_EXPPSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExpPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_EXPPSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetExpPSSysTranslatorName() {
        this._reset(DTOFIELD_EXPPSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO exppssystranslatorname(String expPSSysTranslatorName) {
        this.setExpPSSysTranslatorName(expPSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="fieldtag")
    public void setFieldTag(String fieldTag) {
        this._set(DTOFIELD_FIELDTAG, fieldTag);
    }

    @JsonIgnore
    public String getFieldTag() {
        Object objValue = this._get(DTOFIELD_FIELDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldTagDirty() {
        return this._contains(DTOFIELD_FIELDTAG);
    }

    @JsonIgnore
    public void resetFieldTag() {
        this._reset(DTOFIELD_FIELDTAG);
    }

    @JsonIgnore
    public PSDEFieldDTO fieldtag(String fieldTag) {
        this.setFieldTag(fieldTag);
        return this;
    }

    @JsonProperty(value="fieldtag2")
    public void setFieldTag2(String fieldTag2) {
        this._set(DTOFIELD_FIELDTAG2, fieldTag2);
    }

    @JsonIgnore
    public String getFieldTag2() {
        Object objValue = this._get(DTOFIELD_FIELDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldTag2Dirty() {
        return this._contains(DTOFIELD_FIELDTAG2);
    }

    @JsonIgnore
    public void resetFieldTag2() {
        this._reset(DTOFIELD_FIELDTAG2);
    }

    @JsonIgnore
    public PSDEFieldDTO fieldtag2(String fieldTag2) {
        this.setFieldTag2(fieldTag2);
        return this;
    }

    @JsonProperty(value="fkey")
    public void setFKey(Integer fKey) {
        this._set(DTOFIELD_FKEY, fKey);
    }

    @JsonIgnore
    public Integer getFKey() {
        Object objValue = this._get(DTOFIELD_FKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFKeyDirty() {
        return this._contains(DTOFIELD_FKEY);
    }

    @JsonIgnore
    public void resetFKey() {
        this._reset(DTOFIELD_FKEY);
    }

    @JsonIgnore
    public PSDEFieldDTO fkey(Integer fKey) {
        this.setFKey(fKey);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO fkey(Boolean fKey) {
        if (fKey == null) {
            this.setFKey(null);
        } else {
            this.setFKey(fKey != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formulafields")
    public void setFormulaFields(String formulaFields) {
        this._set(DTOFIELD_FORMULAFIELDS, formulaFields);
    }

    @JsonIgnore
    public String getFormulaFields() {
        Object objValue = this._get(DTOFIELD_FORMULAFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormulaFieldsDirty() {
        return this._contains(DTOFIELD_FORMULAFIELDS);
    }

    @JsonIgnore
    public void resetFormulaFields() {
        this._reset(DTOFIELD_FORMULAFIELDS);
    }

    @JsonIgnore
    public PSDEFieldDTO formulafields(String formulaFields) {
        this.setFormulaFields(formulaFields);
        return this;
    }

    @JsonProperty(value="formulaformat")
    public void setFormulaFormat(String formulaFormat) {
        this._set(DTOFIELD_FORMULAFORMAT, formulaFormat);
    }

    @JsonIgnore
    public String getFormulaFormat() {
        Object objValue = this._get(DTOFIELD_FORMULAFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormulaFormatDirty() {
        return this._contains(DTOFIELD_FORMULAFORMAT);
    }

    @JsonIgnore
    public void resetFormulaFormat() {
        this._reset(DTOFIELD_FORMULAFORMAT);
    }

    @JsonIgnore
    public PSDEFieldDTO formulaformat(String formulaFormat) {
        this.setFormulaFormat(formulaFormat);
        return this;
    }

    @JsonProperty(value="importkey")
    public void setImportKey(Integer importKey) {
        this._set(DTOFIELD_IMPORTKEY, importKey);
    }

    @JsonIgnore
    public Integer getImportKey() {
        Object objValue = this._get(DTOFIELD_IMPORTKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isImportKeyDirty() {
        return this._contains(DTOFIELD_IMPORTKEY);
    }

    @JsonIgnore
    public void resetImportKey() {
        this._reset(DTOFIELD_IMPORTKEY);
    }

    @JsonIgnore
    public PSDEFieldDTO importkey(Integer importKey) {
        this.setImportKey(importKey);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO importkey(Boolean importKey) {
        if (importKey == null) {
            this.setImportKey(null);
        } else {
            this.setImportKey(importKey != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="importorder")
    public void setImportOrder(Integer importOrder) {
        this._set(DTOFIELD_IMPORTORDER, importOrder);
    }

    @JsonIgnore
    public Integer getImportOrder() {
        Object objValue = this._get(DTOFIELD_IMPORTORDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isImportOrderDirty() {
        return this._contains(DTOFIELD_IMPORTORDER);
    }

    @JsonIgnore
    public void resetImportOrder() {
        this._reset(DTOFIELD_IMPORTORDER);
    }

    @JsonIgnore
    public PSDEFieldDTO importorder(Integer importOrder) {
        this.setImportOrder(importOrder);
        return this;
    }

    @JsonProperty(value="importtag")
    public void setImportTag(String importTag) {
        this._set(DTOFIELD_IMPORTTAG, importTag);
    }

    @JsonIgnore
    public String getImportTag() {
        Object objValue = this._get(DTOFIELD_IMPORTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isImportTagDirty() {
        return this._contains(DTOFIELD_IMPORTTAG);
    }

    @JsonIgnore
    public void resetImportTag() {
        this._reset(DTOFIELD_IMPORTTAG);
    }

    @JsonIgnore
    public PSDEFieldDTO importtag(String importTag) {
        this.setImportTag(importTag);
        return this;
    }

    @JsonProperty(value="imppssystranslatorid")
    public void setImpPSSysTranslatorId(String impPSSysTranslatorId) {
        this._set(DTOFIELD_IMPPSSYSTRANSLATORID, impPSSysTranslatorId);
    }

    @JsonIgnore
    public String getImpPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_IMPPSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isImpPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_IMPPSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetImpPSSysTranslatorId() {
        this._reset(DTOFIELD_IMPPSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDEFieldDTO imppssystranslatorid(String impPSSysTranslatorId) {
        this.setImpPSSysTranslatorId(impPSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO imppssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setImpPSSysTranslatorId(null);
            this.setImpPSSysTranslatorName(null);
        } else {
            this.setImpPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setImpPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="imppssystranslatorname")
    public void setImpPSSysTranslatorName(String impPSSysTranslatorName) {
        this._set(DTOFIELD_IMPPSSYSTRANSLATORNAME, impPSSysTranslatorName);
    }

    @JsonIgnore
    public String getImpPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_IMPPSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isImpPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_IMPPSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetImpPSSysTranslatorName() {
        this._reset(DTOFIELD_IMPPSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO imppssystranslatorname(String impPSSysTranslatorName) {
        this.setImpPSSysTranslatorName(impPSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="indextype")
    public void setIndexType(Integer indexType) {
        this._set(DTOFIELD_INDEXTYPE, indexType);
    }

    @JsonIgnore
    public Integer getIndexType() {
        Object objValue = this._get(DTOFIELD_INDEXTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIndexTypeDirty() {
        return this._contains(DTOFIELD_INDEXTYPE);
    }

    @JsonIgnore
    public void resetIndexType() {
        this._reset(DTOFIELD_INDEXTYPE);
    }

    @JsonIgnore
    public PSDEFieldDTO indextype(Integer indexType) {
        this.setIndexType(indexType);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO indextype(Boolean indexType) {
        if (indexType == null) {
            this.setIndexType(null);
        } else {
            this.setIndexType(indexType != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="jsformat")
    public void setJSFormat(String jSFormat) {
        this._set(DTOFIELD_JSFORMAT, jSFormat);
    }

    @JsonIgnore
    public String getJSFormat() {
        Object objValue = this._get(DTOFIELD_JSFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJSFormatDirty() {
        return this._contains(DTOFIELD_JSFORMAT);
    }

    @JsonIgnore
    public void resetJSFormat() {
        this._reset(DTOFIELD_JSFORMAT);
    }

    @JsonIgnore
    public PSDEFieldDTO jsformat(String jSFormat) {
        this.setJSFormat(jSFormat);
        return this;
    }

    @JsonProperty(value="jsonformat")
    public void setJsonFormat(String jsonFormat) {
        this._set(DTOFIELD_JSONFORMAT, jsonFormat);
    }

    @JsonIgnore
    public String getJsonFormat() {
        Object objValue = this._get(DTOFIELD_JSONFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJsonFormatDirty() {
        return this._contains(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public void resetJsonFormat() {
        this._reset(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public PSDEFieldDTO jsonformat(String jsonFormat) {
        this.setJsonFormat(jsonFormat);
        return this;
    }

    @JsonProperty(value="length")
    public void setLength(Integer length) {
        this._set(DTOFIELD_LENGTH, length);
    }

    @JsonIgnore
    public Integer getLength() {
        Object objValue = this._get(DTOFIELD_LENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLengthDirty() {
        return this._contains(DTOFIELD_LENGTH);
    }

    @JsonIgnore
    public void resetLength() {
        this._reset(DTOFIELD_LENGTH);
    }

    @JsonIgnore
    public PSDEFieldDTO length(Integer length) {
        this.setLength(length);
        return this;
    }

    @JsonProperty(value="lnpslanresid")
    public void setLNPSLanResId(String lNPSLanResId) {
        this._set(DTOFIELD_LNPSLANRESID, lNPSLanResId);
    }

    @JsonIgnore
    public String getLNPSLanResId() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResIdDirty() {
        return this._contains(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public void resetLNPSLanResId() {
        this._reset(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public PSDEFieldDTO lnpslanresid(String lNPSLanResId) {
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO lnpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        } else {
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="lnpslanresname")
    public void setLNPSLanResName(String lNPSLanResName) {
        this._set(DTOFIELD_LNPSLANRESNAME, lNPSLanResName);
    }

    @JsonIgnore
    public String getLNPSLanResName() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResNameDirty() {
        return this._contains(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public void resetLNPSLanResName() {
        this._reset(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO lnpslanresname(String lNPSLanResName) {
        this.setLNPSLanResName(lNPSLanResName);
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
    public PSDEFieldDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="majorfield")
    public void setMajorField(Integer majorField) {
        this._set(DTOFIELD_MAJORFIELD, majorField);
    }

    @JsonIgnore
    public Integer getMajorField() {
        Object objValue = this._get(DTOFIELD_MAJORFIELD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMajorFieldDirty() {
        return this._contains(DTOFIELD_MAJORFIELD);
    }

    @JsonIgnore
    public void resetMajorField() {
        this._reset(DTOFIELD_MAJORFIELD);
    }

    @JsonIgnore
    public PSDEFieldDTO majorfield(Integer majorField) {
        this.setMajorField(majorField);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO majorfield(PSModelEnums.FieldMajorMode majorField) {
        if (majorField == null) {
            this.setMajorField(null);
        } else {
            this.setMajorField(majorField.value);
        }
        return this;
    }

    @JsonProperty(value="maxvalue")
    public void setMaxValue(String maxValue) {
        this._set(DTOFIELD_MAXVALUE, maxValue);
    }

    @JsonIgnore
    public String getMaxValue() {
        Object objValue = this._get(DTOFIELD_MAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaxValueDirty() {
        return this._contains(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public void resetMaxValue() {
        this._reset(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public PSDEFieldDTO maxvalue(String maxValue) {
        this.setMaxValue(maxValue);
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
    public PSDEFieldDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minstrlength")
    public void setMinStrLength(Integer minStrLength) {
        this._set(DTOFIELD_MINSTRLENGTH, minStrLength);
    }

    @JsonIgnore
    public Integer getMinStrLength() {
        Object objValue = this._get(DTOFIELD_MINSTRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinStrLengthDirty() {
        return this._contains(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public void resetMinStrLength() {
        this._reset(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public PSDEFieldDTO minstrlength(Integer minStrLength) {
        this.setMinStrLength(minStrLength);
        return this;
    }

    @JsonProperty(value="minvalue")
    public void setMinValue(String minValue) {
        this._set(DTOFIELD_MINVALUE, minValue);
    }

    @JsonIgnore
    public String getMinValue() {
        Object objValue = this._get(DTOFIELD_MINVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinValueDirty() {
        return this._contains(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public void resetMinValue() {
        this._reset(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public PSDEFieldDTO minvalue(String minValue) {
        this.setMinValue(minValue);
        return this;
    }

    @JsonProperty(value="multiformfield")
    public void setMultiFormField(Integer multiFormField) {
        this._set(DTOFIELD_MULTIFORMFIELD, multiFormField);
    }

    @JsonIgnore
    public Integer getMultiFormField() {
        Object objValue = this._get(DTOFIELD_MULTIFORMFIELD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMultiFormFieldDirty() {
        return this._contains(DTOFIELD_MULTIFORMFIELD);
    }

    @JsonIgnore
    public void resetMultiFormField() {
        this._reset(DTOFIELD_MULTIFORMFIELD);
    }

    @JsonIgnore
    public PSDEFieldDTO multiformfield(Integer multiFormField) {
        this.setMultiFormField(multiFormField);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO multiformfield(Boolean multiFormField) {
        if (multiFormField == null) {
            this.setMultiFormField(null);
        } else {
            this.setMultiFormField(multiFormField != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no2dupchkpsdefid")
    public void setNo2DupChkPSDEFId(String no2DupChkPSDEFId) {
        this._set(DTOFIELD_NO2DUPCHKPSDEFID, no2DupChkPSDEFId);
    }

    @JsonIgnore
    public String getNo2DupChkPSDEFId() {
        Object objValue = this._get(DTOFIELD_NO2DUPCHKPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2DupChkPSDEFIdDirty() {
        return this._contains(DTOFIELD_NO2DUPCHKPSDEFID);
    }

    @JsonIgnore
    public void resetNo2DupChkPSDEFId() {
        this._reset(DTOFIELD_NO2DUPCHKPSDEFID);
    }

    @JsonIgnore
    public PSDEFieldDTO no2dupchkpsdefid(String no2DupChkPSDEFId) {
        this.setNo2DupChkPSDEFId(no2DupChkPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO no2dupchkpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNo2DupChkPSDEFId(null);
            this.setNo2DupChkPSDEFName(null);
        } else {
            this.setNo2DupChkPSDEFId(pSDEField.getPSDEFieldId());
            this.setNo2DupChkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="no2dupchkpsdefname")
    public void setNo2DupChkPSDEFName(String no2DupChkPSDEFName) {
        this._set(DTOFIELD_NO2DUPCHKPSDEFNAME, no2DupChkPSDEFName);
    }

    @JsonIgnore
    public String getNo2DupChkPSDEFName() {
        Object objValue = this._get(DTOFIELD_NO2DUPCHKPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2DupChkPSDEFNameDirty() {
        return this._contains(DTOFIELD_NO2DUPCHKPSDEFNAME);
    }

    @JsonIgnore
    public void resetNo2DupChkPSDEFName() {
        this._reset(DTOFIELD_NO2DUPCHKPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO no2dupchkpsdefname(String no2DupChkPSDEFName) {
        this.setNo2DupChkPSDEFName(no2DupChkPSDEFName);
        return this;
    }

    @JsonProperty(value="no3dupchkpsdefid")
    public void setNo3DupChkPSDEFId(String no3DupChkPSDEFId) {
        this._set(DTOFIELD_NO3DUPCHKPSDEFID, no3DupChkPSDEFId);
    }

    @JsonIgnore
    public String getNo3DupChkPSDEFId() {
        Object objValue = this._get(DTOFIELD_NO3DUPCHKPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3DupChkPSDEFIdDirty() {
        return this._contains(DTOFIELD_NO3DUPCHKPSDEFID);
    }

    @JsonIgnore
    public void resetNo3DupChkPSDEFId() {
        this._reset(DTOFIELD_NO3DUPCHKPSDEFID);
    }

    @JsonIgnore
    public PSDEFieldDTO no3dupchkpsdefid(String no3DupChkPSDEFId) {
        this.setNo3DupChkPSDEFId(no3DupChkPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO no3dupchkpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNo3DupChkPSDEFId(null);
            this.setNo3DupChkPSDEFName(null);
        } else {
            this.setNo3DupChkPSDEFId(pSDEField.getPSDEFieldId());
            this.setNo3DupChkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="no3dupchkpsdefname")
    public void setNo3DupChkPSDEFName(String no3DupChkPSDEFName) {
        this._set(DTOFIELD_NO3DUPCHKPSDEFNAME, no3DupChkPSDEFName);
    }

    @JsonIgnore
    public String getNo3DupChkPSDEFName() {
        Object objValue = this._get(DTOFIELD_NO3DUPCHKPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3DupChkPSDEFNameDirty() {
        return this._contains(DTOFIELD_NO3DUPCHKPSDEFNAME);
    }

    @JsonIgnore
    public void resetNo3DupChkPSDEFName() {
        this._reset(DTOFIELD_NO3DUPCHKPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO no3dupchkpsdefname(String no3DupChkPSDEFName) {
        this.setNo3DupChkPSDEFName(no3DupChkPSDEFName);
        return this;
    }

    @JsonProperty(value="nullvalorder")
    public void setNullValOrder(String nullValOrder) {
        this._set(DTOFIELD_NULLVALORDER, nullValOrder);
    }

    @JsonIgnore
    public String getNullValOrder() {
        Object objValue = this._get(DTOFIELD_NULLVALORDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNullValOrderDirty() {
        return this._contains(DTOFIELD_NULLVALORDER);
    }

    @JsonIgnore
    public void resetNullValOrder() {
        this._reset(DTOFIELD_NULLVALORDER);
    }

    @JsonIgnore
    public PSDEFieldDTO nullvalorder(String nullValOrder) {
        this.setNullValOrder(nullValOrder);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO nullvalorder(PSModelEnums.DBNullValueOrderMode nullValOrder) {
        if (nullValOrder == null) {
            this.setNullValOrder(null);
        } else {
            this.setNullValOrder(nullValOrder.value);
        }
        return this;
    }

    @JsonProperty(value="o2mpsderid")
    public void setO2MPSDERId(String o2MPSDERId) {
        this._set(DTOFIELD_O2MPSDERID, o2MPSDERId);
    }

    @JsonIgnore
    public String getO2MPSDERId() {
        Object objValue = this._get(DTOFIELD_O2MPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isO2MPSDERIdDirty() {
        return this._contains(DTOFIELD_O2MPSDERID);
    }

    @JsonIgnore
    public void resetO2MPSDERId() {
        this._reset(DTOFIELD_O2MPSDERID);
    }

    @JsonIgnore
    public PSDEFieldDTO o2mpsderid(String o2MPSDERId) {
        this.setO2MPSDERId(o2MPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO o2mpsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setO2MPSDERId(null);
            this.setO2MPSDERName(null);
        } else {
            this.setO2MPSDERId(pSDER.getPSDERId());
            this.setO2MPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="o2mpsdername")
    public void setO2MPSDERName(String o2MPSDERName) {
        this._set(DTOFIELD_O2MPSDERNAME, o2MPSDERName);
    }

    @JsonIgnore
    public String getO2MPSDERName() {
        Object objValue = this._get(DTOFIELD_O2MPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isO2MPSDERNameDirty() {
        return this._contains(DTOFIELD_O2MPSDERNAME);
    }

    @JsonIgnore
    public void resetO2MPSDERName() {
        this._reset(DTOFIELD_O2MPSDERNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO o2mpsdername(String o2MPSDERName) {
        this.setO2MPSDERName(o2MPSDERName);
        return this;
    }

    @JsonProperty(value="o2opsderid")
    public void setO2OPSDERId(String o2OPSDERId) {
        this._set(DTOFIELD_O2OPSDERID, o2OPSDERId);
    }

    @JsonIgnore
    public String getO2OPSDERId() {
        Object objValue = this._get(DTOFIELD_O2OPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isO2OPSDERIdDirty() {
        return this._contains(DTOFIELD_O2OPSDERID);
    }

    @JsonIgnore
    public void resetO2OPSDERId() {
        this._reset(DTOFIELD_O2OPSDERID);
    }

    @JsonIgnore
    public PSDEFieldDTO o2opsderid(String o2OPSDERId) {
        this.setO2OPSDERId(o2OPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO o2opsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setO2OPSDERId(null);
            this.setO2OPSDERName(null);
        } else {
            this.setO2OPSDERId(pSDER.getPSDERId());
            this.setO2OPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="o2opsdername")
    public void setO2OPSDERName(String o2OPSDERName) {
        this._set(DTOFIELD_O2OPSDERNAME, o2OPSDERName);
    }

    @JsonIgnore
    public String getO2OPSDERName() {
        Object objValue = this._get(DTOFIELD_O2OPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isO2OPSDERNameDirty() {
        return this._contains(DTOFIELD_O2OPSDERNAME);
    }

    @JsonIgnore
    public void resetO2OPSDERName() {
        this._reset(DTOFIELD_O2OPSDERNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO o2opsdername(String o2OPSDERName) {
        this.setO2OPSDERName(o2OPSDERName);
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
    public PSDEFieldDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pastereset")
    public void setPasteReset(Integer pasteReset) {
        this._set(DTOFIELD_PASTERESET, pasteReset);
    }

    @JsonIgnore
    public Integer getPasteReset() {
        Object objValue = this._get(DTOFIELD_PASTERESET);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPasteResetDirty() {
        return this._contains(DTOFIELD_PASTERESET);
    }

    @JsonIgnore
    public void resetPasteReset() {
        this._reset(DTOFIELD_PASTERESET);
    }

    @JsonIgnore
    public PSDEFieldDTO pastereset(Integer pasteReset) {
        this.setPasteReset(pasteReset);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pastereset(Boolean pasteReset) {
        if (pasteReset == null) {
            this.setPasteReset(null);
        } else {
            this.setPasteReset(pasteReset != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="physicalfield")
    public void setPhysicalField(Integer physicalField) {
        this._set(DTOFIELD_PHYSICALFIELD, physicalField);
    }

    @JsonIgnore
    public Integer getPhysicalField() {
        Object objValue = this._get(DTOFIELD_PHYSICALFIELD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPhysicalFieldDirty() {
        return this._contains(DTOFIELD_PHYSICALFIELD);
    }

    @JsonIgnore
    public void resetPhysicalField() {
        this._reset(DTOFIELD_PHYSICALFIELD);
    }

    @JsonIgnore
    public PSDEFieldDTO physicalfield(Integer physicalField) {
        this.setPhysicalField(physicalField);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO physicalfield(Boolean physicalField) {
        if (physicalField == null) {
            this.setPhysicalField(null);
        } else {
            this.setPhysicalField(physicalField != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pkey")
    public void setPKey(Integer pKey) {
        this._set(DTOFIELD_PKEY, pKey);
    }

    @JsonIgnore
    public Integer getPKey() {
        Object objValue = this._get(DTOFIELD_PKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPKeyDirty() {
        return this._contains(DTOFIELD_PKEY);
    }

    @JsonIgnore
    public void resetPKey() {
        this._reset(DTOFIELD_PKEY);
    }

    @JsonIgnore
    public PSDEFieldDTO pkey(Integer pKey) {
        this.setPKey(pKey);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pkey(PSModelEnums.FieldPKeyMode pKey) {
        if (pKey == null) {
            this.setPKey(null);
        } else {
            this.setPKey(pKey.value);
        }
        return this;
    }

    @JsonProperty(value="precision")
    public void setPrecision(Integer precision) {
        this._set(DTOFIELD_PRECISION, precision);
        this._set(FIELD_PRECISION, precision);
    }

    @JsonIgnore
    public Integer getPrecision() {
        Object objValue = this._get(DTOFIELD_PRECISION);
        if (objValue == null && (objValue = this._get(FIELD_PRECISION)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrecisionDirty() {
        if (this._contains(DTOFIELD_PRECISION)) {
            return true;
        }
        return this._contains(FIELD_PRECISION);
    }

    @JsonIgnore
    public void resetPrecision() {
        this._reset(DTOFIELD_PRECISION);
        this._reset(FIELD_PRECISION);
    }

    @JsonIgnore
    public PSDEFieldDTO precision(Integer precision) {
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2() {
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated
    public void setPrecision2(Integer precision2) {
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty() {
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2() {
        this.resetPrecision();
    }

    @JsonProperty(value="predefinedtypeparam")
    public void setPredefinedTypeParam(String predefinedTypeParam) {
        this._set(DTOFIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }

    @JsonIgnore
    public String getPredefinedTypeParam() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeParamDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public void resetPredefinedTypeParam() {
        this._reset(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public PSDEFieldDTO predefinedtypeparam(String predefinedTypeParam) {
        this.setPredefinedTypeParam(predefinedTypeParam);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
        this._set(FIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null && (objValue = this._get(FIELD_PREDEFINEDTYPE)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        if (this._contains(DTOFIELD_PREDEFINEDTYPE)) {
            return true;
        }
        return this._contains(FIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
        this._reset(FIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSDEFieldDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO predefinedtype(PSModelEnums.PredefinedFieldType predefinedType) {
        if (predefinedType == null) {
            this.setPredefinedType(null);
        } else {
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPreDefineType() {
        return this.getPredefinedType();
    }

    @JsonIgnore
    @Deprecated
    public void setPreDefineType(String preDefineType) {
        this.setPredefinedType(preDefineType);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPreDefineTypeDirty() {
        return this.isPredefinedTypeDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPreDefineType() {
        this.resetPredefinedType();
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSDEFieldDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdatatypeid")
    public void setPSDataTypeId(String pSDataTypeId) {
        this._set(DTOFIELD_PSDATATYPEID, pSDataTypeId);
    }

    @JsonIgnore
    public String getPSDataTypeId() {
        Object objValue = this._get(DTOFIELD_PSDATATYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDataTypeIdDirty() {
        return this._contains(DTOFIELD_PSDATATYPEID);
    }

    @JsonIgnore
    public void resetPSDataTypeId() {
        this._reset(DTOFIELD_PSDATATYPEID);
    }

    @JsonIgnore
    public PSDEFieldDTO psdatatypeid(String pSDataTypeId) {
        this.setPSDataTypeId(pSDataTypeId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO psdatatypeid(PSDEFDataTypeDTO pSDEFDataType) {
        if (pSDEFDataType == null) {
            this.setPSDataTypeId(null);
            this.setPSDataTypeName(null);
        } else {
            this.setPSDataTypeId(pSDEFDataType.getPSDEFDataTypeId());
            this.setPSDataTypeName(pSDEFDataType.getPSDEFDataTypeName());
        }
        return this;
    }

    @JsonProperty(value="psdatatypename")
    public void setPSDataTypeName(String pSDataTypeName) {
        this._set(DTOFIELD_PSDATATYPENAME, pSDataTypeName);
    }

    @JsonIgnore
    public String getPSDataTypeName() {
        Object objValue = this._get(DTOFIELD_PSDATATYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDataTypeNameDirty() {
        return this._contains(DTOFIELD_PSDATATYPENAME);
    }

    @JsonIgnore
    public void resetPSDataTypeName() {
        this._reset(DTOFIELD_PSDATATYPENAME);
    }

    @JsonIgnore
    public PSDEFieldDTO psdatatypename(String pSDataTypeName) {
        this.setPSDataTypeName(pSDataTypeName);
        return this;
    }

    @JsonProperty(value="psdefieldid")
    public void setPSDEFieldId(String pSDEFieldId) {
        this._set(DTOFIELD_PSDEFIELDID, pSDEFieldId);
    }

    @JsonIgnore
    public String getPSDEFieldId() {
        Object objValue = this._get(DTOFIELD_PSDEFIELDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFieldIdDirty() {
        return this._contains(DTOFIELD_PSDEFIELDID);
    }

    @JsonIgnore
    public void resetPSDEFieldId() {
        this._reset(DTOFIELD_PSDEFIELDID);
    }

    @JsonIgnore
    public PSDEFieldDTO psdefieldid(String pSDEFieldId) {
        this.setPSDEFieldId(pSDEFieldId);
        return this;
    }

    @JsonProperty(value="psdefieldname")
    public void setPSDEFieldName(String pSDEFieldName) {
        this._set(DTOFIELD_PSDEFIELDNAME, pSDEFieldName);
    }

    @JsonIgnore
    public String getPSDEFieldName() {
        Object objValue = this._get(DTOFIELD_PSDEFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFieldNameDirty() {
        return this._contains(DTOFIELD_PSDEFIELDNAME);
    }

    @JsonIgnore
    public void resetPSDEFieldName() {
        this._reset(DTOFIELD_PSDEFIELDNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO psdefieldname(String pSDEFieldName) {
        this.setPSDEFieldName(pSDEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFieldName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFieldName(strName);
    }

    @JsonIgnore
    public PSDEFieldDTO name(String strName) {
        this.setPSDEFieldName(strName);
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
    public PSDEFieldDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSSubSysSADEId(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSSubSysSADEId(pSDataEntity.getPSSubSysSADEId());
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
    public PSDEFieldDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDEFieldDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="psdetableid")
    public void setPSDETableId(String pSDETableId) {
        this._set(DTOFIELD_PSDETABLEID, pSDETableId);
    }

    @JsonIgnore
    public String getPSDETableId() {
        Object objValue = this._get(DTOFIELD_PSDETABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETableIdDirty() {
        return this._contains(DTOFIELD_PSDETABLEID);
    }

    @JsonIgnore
    public void resetPSDETableId() {
        this._reset(DTOFIELD_PSDETABLEID);
    }

    @JsonIgnore
    public PSDEFieldDTO psdetableid(String pSDETableId) {
        this.setPSDETableId(pSDETableId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO psdetableid(PSDEDBTableDTO pSDEDBTable) {
        if (pSDEDBTable == null) {
            this.setPSDETableId(null);
        } else {
            this.setPSDETableId(pSDEDBTable.getPSDEDBTableId());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadefieldid")
    public void setPSSubSysSADEFieldId(String pSSubSysSADEFieldId) {
        this._set(DTOFIELD_PSSUBSYSSADEFIELDID, pSSubSysSADEFieldId);
    }

    @JsonIgnore
    public String getPSSubSysSADEFieldId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEFIELDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEFieldIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEFIELDID);
    }

    @JsonIgnore
    public void resetPSSubSysSADEFieldId() {
        this._reset(DTOFIELD_PSSUBSYSSADEFIELDID);
    }

    @JsonIgnore
    public PSDEFieldDTO pssubsyssadefieldid(String pSSubSysSADEFieldId) {
        this.setPSSubSysSADEFieldId(pSSubSysSADEFieldId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssubsyssadefieldid(PSSubSysSADEFieldDTO pSSubSysSADEField) {
        if (pSSubSysSADEField == null) {
            this.setPSSubSysSADEFieldId(null);
            this.setPSSubSysSADEFieldName(null);
        } else {
            this.setPSSubSysSADEFieldId(pSSubSysSADEField.getPSSubSysSADEFieldId());
            this.setPSSubSysSADEFieldName(pSSubSysSADEField.getPSSubSysSADEFieldName());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadefieldname")
    public void setPSSubSysSADEFieldName(String pSSubSysSADEFieldName) {
        this._set(DTOFIELD_PSSUBSYSSADEFIELDNAME, pSSubSysSADEFieldName);
    }

    @JsonIgnore
    public String getPSSubSysSADEFieldName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEFieldNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEFIELDNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADEFieldName() {
        this._reset(DTOFIELD_PSSUBSYSSADEFIELDNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO pssubsyssadefieldname(String pSSubSysSADEFieldName) {
        this.setPSSubSysSADEFieldName(pSSubSysSADEFieldName);
        return this;
    }

    @JsonProperty(value="pssubsyssadeid")
    public void setPSSubSysSADEId(String pSSubSysSADEId) {
        this._set(DTOFIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }

    @JsonIgnore
    public String getPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEID);
        if (objValue == null) {
            return null;
        }
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
    public PSDEFieldDTO pssubsyssadeid(String pSSubSysSADEId) {
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    @JsonProperty(value="pssysdbcolumnid")
    public void setPSSysDBColumnId(String pSSysDBColumnId) {
        this._set(DTOFIELD_PSSYSDBCOLUMNID, pSSysDBColumnId);
    }

    @JsonIgnore
    public String getPSSysDBColumnId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBCOLUMNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBColumnIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBCOLUMNID);
    }

    @JsonIgnore
    public void resetPSSysDBColumnId() {
        this._reset(DTOFIELD_PSSYSDBCOLUMNID);
    }

    @JsonIgnore
    public PSDEFieldDTO pssysdbcolumnid(String pSSysDBColumnId) {
        this.setPSSysDBColumnId(pSSysDBColumnId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssysdbcolumnid(PSSysDBColumnDTO pSSysDBColumn) {
        if (pSSysDBColumn == null) {
            this.setPSSysDBColumnId(null);
        } else {
            this.setPSSysDBColumnId(pSSysDBColumn.getPSSysDBColumnId());
        }
        return this;
    }

    @JsonProperty(value="pssyssamplevalueid")
    public void setPSSysSampleValueId(String pSSysSampleValueId) {
        this._set(DTOFIELD_PSSYSSAMPLEVALUEID, pSSysSampleValueId);
    }

    @JsonIgnore
    public String getPSSysSampleValueId() {
        Object objValue = this._get(DTOFIELD_PSSYSSAMPLEVALUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSampleValueIdDirty() {
        return this._contains(DTOFIELD_PSSYSSAMPLEVALUEID);
    }

    @JsonIgnore
    public void resetPSSysSampleValueId() {
        this._reset(DTOFIELD_PSSYSSAMPLEVALUEID);
    }

    @JsonIgnore
    public PSDEFieldDTO pssyssamplevalueid(String pSSysSampleValueId) {
        this.setPSSysSampleValueId(pSSysSampleValueId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssyssamplevalueid(PSSysSampleValueDTO pSSysSampleValue) {
        if (pSSysSampleValue == null) {
            this.setPSSysSampleValueId(null);
            this.setPSSysSampleValueName(null);
        } else {
            this.setPSSysSampleValueId(pSSysSampleValue.getPSSysSampleValueId());
            this.setPSSysSampleValueName(pSSysSampleValue.getPSSysSampleValueName());
        }
        return this;
    }

    @JsonProperty(value="pssyssamplevaluename")
    public void setPSSysSampleValueName(String pSSysSampleValueName) {
        this._set(DTOFIELD_PSSYSSAMPLEVALUENAME, pSSysSampleValueName);
    }

    @JsonIgnore
    public String getPSSysSampleValueName() {
        Object objValue = this._get(DTOFIELD_PSSYSSAMPLEVALUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSampleValueNameDirty() {
        return this._contains(DTOFIELD_PSSYSSAMPLEVALUENAME);
    }

    @JsonIgnore
    public void resetPSSysSampleValueName() {
        this._reset(DTOFIELD_PSSYSSAMPLEVALUENAME);
    }

    @JsonIgnore
    public PSDEFieldDTO pssyssamplevaluename(String pSSysSampleValueName) {
        this.setPSSysSampleValueName(pSSysSampleValueName);
        return this;
    }

    @JsonProperty(value="pssyssequenceid")
    public void setPSSysSequenceId(String pSSysSequenceId) {
        this._set(DTOFIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }

    @JsonIgnore
    public String getPSSysSequenceId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public void resetPSSysSequenceId() {
        this._reset(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public PSDEFieldDTO pssyssequenceid(String pSSysSequenceId) {
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssyssequenceid(PSSysSequenceDTO pSSysSequence) {
        if (pSSysSequence == null) {
            this.setPSSysSequenceId(null);
            this.setPSSysSequenceName(null);
        } else {
            this.setPSSysSequenceId(pSSysSequence.getPSSysSequenceId());
            this.setPSSysSequenceName(pSSysSequence.getPSSysSequenceName());
        }
        return this;
    }

    @JsonProperty(value="pssyssequencename")
    public void setPSSysSequenceName(String pSSysSequenceName) {
        this._set(DTOFIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }

    @JsonIgnore
    public String getPSSysSequenceName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public void resetPSSysSequenceName() {
        this._reset(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public PSDEFieldDTO pssyssequencename(String pSSysSequenceName) {
        this.setPSSysSequenceName(pSSysSequenceName);
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
    public PSDEFieldDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
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
    public PSDEFieldDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="pssysunitid")
    public void setPSSysUnitId(String pSSysUnitId) {
        this._set(DTOFIELD_PSSYSUNITID, pSSysUnitId);
    }

    @JsonIgnore
    public String getPSSysUnitId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNITID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUnitIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNITID);
    }

    @JsonIgnore
    public void resetPSSysUnitId() {
        this._reset(DTOFIELD_PSSYSUNITID);
    }

    @JsonIgnore
    public PSDEFieldDTO pssysunitid(String pSSysUnitId) {
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssysunitid(PSSysUnitDTO pSSysUnit) {
        if (pSSysUnit == null) {
            this.setPSSysUnitId(null);
            this.setPSSysUnitName(null);
        } else {
            this.setPSSysUnitId(pSSysUnit.getPSSysUnitId());
            this.setPSSysUnitName(pSSysUnit.getPSSysUnitName());
        }
        return this;
    }

    @JsonProperty(value="pssysunitname")
    public void setPSSysUnitName(String pSSysUnitName) {
        this._set(DTOFIELD_PSSYSUNITNAME, pSSysUnitName);
    }

    @JsonIgnore
    public String getPSSysUnitName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNITNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUnitNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNITNAME);
    }

    @JsonIgnore
    public void resetPSSysUnitName() {
        this._reset(DTOFIELD_PSSYSUNITNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO pssysunitname(String pSSysUnitName) {
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    @JsonProperty(value="pssysvalueruleid")
    public void setPSSysValueRuleId(String pSSysValueRuleId) {
        this._set(DTOFIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }

    @JsonIgnore
    public String getPSSysValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSSysValueRuleId() {
        this._reset(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public PSDEFieldDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
        if (pSSysValueRule == null) {
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        } else {
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="pssysvaluerulename")
    public void setPSSysValueRuleName(String pSSysValueRuleName) {
        this._set(DTOFIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }

    @JsonIgnore
    public String getPSSysValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSSysValueRuleName() {
        this._reset(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public PSDEFieldDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonProperty(value="querycolumn")
    public void setQueryColumn(Integer queryColumn) {
        this._set(DTOFIELD_QUERYCOLUMN, queryColumn);
    }

    @JsonIgnore
    public Integer getQueryColumn() {
        Object objValue = this._get(DTOFIELD_QUERYCOLUMN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isQueryColumnDirty() {
        return this._contains(DTOFIELD_QUERYCOLUMN);
    }

    @JsonIgnore
    public void resetQueryColumn() {
        this._reset(DTOFIELD_QUERYCOLUMN);
    }

    @JsonIgnore
    public PSDEFieldDTO querycolumn(Integer queryColumn) {
        this.setQueryColumn(queryColumn);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO querycolumn(Boolean queryColumn) {
        if (queryColumn == null) {
            this.setQueryColumn(null);
        } else {
            this.setQueryColumn(queryColumn != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="querycs")
    public void setQueryCS(String queryCS) {
        this._set(DTOFIELD_QUERYCS, queryCS);
    }

    @JsonIgnore
    public String getQueryCS() {
        Object objValue = this._get(DTOFIELD_QUERYCS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueryCSDirty() {
        return this._contains(DTOFIELD_QUERYCS);
    }

    @JsonIgnore
    public void resetQueryCS() {
        this._reset(DTOFIELD_QUERYCS);
    }

    @JsonIgnore
    public PSDEFieldDTO querycs(String queryCS) {
        this.setQueryCS(queryCS);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO querycs(PSModelEnums.DEFQueryCSMode[] queryCS) {
        if (queryCS == null || queryCS.length == 0) {
            this.setQueryCS(null);
        } else {
            String _value = "";
            for (PSModelEnums.DEFQueryCSMode _item : queryCS) {
                if (_value.length() > 0) {
                    _value = _value + ";";
                }
                _value = _value + _item.value;
            }
            this.setQueryCS(_value);
        }
        return this;
    }

    @JsonProperty(value="readonlymode")
    public void setReadOnlyMode(Integer readOnlyMode) {
        this._set(DTOFIELD_READONLYMODE, readOnlyMode);
    }

    @JsonIgnore
    public Integer getReadOnlyMode() {
        Object objValue = this._get(DTOFIELD_READONLYMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReadOnlyModeDirty() {
        return this._contains(DTOFIELD_READONLYMODE);
    }

    @JsonIgnore
    public void resetReadOnlyMode() {
        this._reset(DTOFIELD_READONLYMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO readonlymode(Integer readOnlyMode) {
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO readonlymode(PSModelEnums.DEFReadOnlyMode[] readOnlyMode) {
        if (readOnlyMode == null || readOnlyMode.length == 0) {
            this.setReadOnlyMode(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DEFReadOnlyMode _item : readOnlyMode) {
                _value |= _item.value;
            }
            this.setReadOnlyMode(_value);
        }
        return this;
    }

    @JsonProperty(value="refpssysdynamodelid")
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId) {
        this._set(DTOFIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }

    @JsonIgnore
    public String getRefPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetRefPSSysDynaModelId() {
        this._reset(DTOFIELD_REFPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEFieldDTO refpssysdynamodelid(String refPSSysDynaModelId) {
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO refpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        } else {
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="refpssysdynamodelname")
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName) {
        this._set(DTOFIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }

    @JsonIgnore
    public String getRefPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetRefPSSysDynaModelName() {
        this._reset(DTOFIELD_REFPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO refpssysdynamodelname(String refPSSysDynaModelName) {
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="restrictedpsdefid")
    public void setRestrictedPSDEFId(String restrictedPSDEFId) {
        this._set(DTOFIELD_RESTRICTEDPSDEFID, restrictedPSDEFId);
    }

    @JsonIgnore
    public String getRestrictedPSDEFId() {
        Object objValue = this._get(DTOFIELD_RESTRICTEDPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRestrictedPSDEFIdDirty() {
        return this._contains(DTOFIELD_RESTRICTEDPSDEFID);
    }

    @JsonIgnore
    public void resetRestrictedPSDEFId() {
        this._reset(DTOFIELD_RESTRICTEDPSDEFID);
    }

    @JsonIgnore
    public PSDEFieldDTO restrictedpsdefid(String restrictedPSDEFId) {
        this.setRestrictedPSDEFId(restrictedPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO restrictedpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setRestrictedPSDEFId(null);
            this.setRestrictedPSDEFName(null);
        } else {
            this.setRestrictedPSDEFId(pSDEField.getPSDEFieldId());
            this.setRestrictedPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="restrictedpsdefname")
    public void setRestrictedPSDEFName(String restrictedPSDEFName) {
        this._set(DTOFIELD_RESTRICTEDPSDEFNAME, restrictedPSDEFName);
    }

    @JsonIgnore
    public String getRestrictedPSDEFName() {
        Object objValue = this._get(DTOFIELD_RESTRICTEDPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRestrictedPSDEFNameDirty() {
        return this._contains(DTOFIELD_RESTRICTEDPSDEFNAME);
    }

    @JsonIgnore
    public void resetRestrictedPSDEFName() {
        this._reset(DTOFIELD_RESTRICTEDPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO restrictedpsdefname(String restrictedPSDEFName) {
        this.setRestrictedPSDEFName(restrictedPSDEFName);
        return this;
    }

    @JsonProperty(value="sequencemode")
    public void setSequenceMode(String sequenceMode) {
        this._set(DTOFIELD_SEQUENCEMODE, sequenceMode);
    }

    @JsonIgnore
    public String getSequenceMode() {
        Object objValue = this._get(DTOFIELD_SEQUENCEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSequenceModeDirty() {
        return this._contains(DTOFIELD_SEQUENCEMODE);
    }

    @JsonIgnore
    public void resetSequenceMode() {
        this._reset(DTOFIELD_SEQUENCEMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO sequencemode(String sequenceMode) {
        this.setSequenceMode(sequenceMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO sequencemode(PSModelEnums.DEFSequenceMode sequenceMode) {
        if (sequenceMode == null) {
            this.setSequenceMode(null);
        } else {
            this.setSequenceMode(sequenceMode.value);
        }
        return this;
    }

    @JsonProperty(value="servicecodename")
    public void setServiceCodeName(String serviceCodeName) {
        this._set(DTOFIELD_SERVICECODENAME, serviceCodeName);
    }

    @JsonIgnore
    public String getServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SERVICECODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceCodeNameDirty() {
        return this._contains(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public void resetServiceCodeName() {
        this._reset(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public PSDEFieldDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    @JsonProperty(value="statefield")
    public void setStateField(String stateField) {
        this._set(DTOFIELD_STATEFIELD, stateField);
    }

    @JsonIgnore
    public String getStateField() {
        Object objValue = this._get(DTOFIELD_STATEFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStateFieldDirty() {
        return this._contains(DTOFIELD_STATEFIELD);
    }

    @JsonIgnore
    public void resetStateField() {
        this._reset(DTOFIELD_STATEFIELD);
    }

    @JsonIgnore
    public PSDEFieldDTO statefield(String stateField) {
        this.setStateField(stateField);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO statefield(PSModelEnums.DEMSFieldMode stateField) {
        if (stateField == null) {
            this.setStateField(null);
        } else {
            this.setStateField(stateField.value);
        }
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStdDataTypeDirty() {
        return this._contains(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public void resetStdDataType() {
        this._reset(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public PSDEFieldDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="stringcase")
    public void setStringCase(String stringCase) {
        this._set(DTOFIELD_STRINGCASE, stringCase);
    }

    @JsonIgnore
    public String getStringCase() {
        Object objValue = this._get(DTOFIELD_STRINGCASE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStringCaseDirty() {
        return this._contains(DTOFIELD_STRINGCASE);
    }

    @JsonIgnore
    public void resetStringCase() {
        this._reset(DTOFIELD_STRINGCASE);
    }

    @JsonIgnore
    public PSDEFieldDTO stringcase(String stringCase) {
        this.setStringCase(stringCase);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO stringcase(PSModelEnums.StringCaseMode stringCase) {
        if (stringCase == null) {
            this.setStringCase(null);
        } else {
            this.setStringCase(stringCase.value);
        }
        return this;
    }

    @JsonProperty(value="strlength")
    public void setStrLength(Integer strLength) {
        this._set(DTOFIELD_STRLENGTH, strLength);
    }

    @JsonIgnore
    public Integer getStrLength() {
        Object objValue = this._get(DTOFIELD_STRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStrLengthDirty() {
        return this._contains(DTOFIELD_STRLENGTH);
    }

    @JsonIgnore
    public void resetStrLength() {
        this._reset(DTOFIELD_STRLENGTH);
    }

    @JsonIgnore
    public PSDEFieldDTO strlength(Integer strLength) {
        this.setStrLength(strLength);
        return this;
    }

    @JsonProperty(value="tablename")
    public void setTableName(String tableName) {
        this._set(DTOFIELD_TABLENAME, tableName);
    }

    @JsonIgnore
    public String getTableName() {
        Object objValue = this._get(DTOFIELD_TABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableNameDirty() {
        return this._contains(DTOFIELD_TABLENAME);
    }

    @JsonIgnore
    public void resetTableName() {
        this._reset(DTOFIELD_TABLENAME);
    }

    @JsonIgnore
    public PSDEFieldDTO tablename(String tableName) {
        this.setTableName(tableName);
        return this;
    }

    @JsonProperty(value="tablescope")
    public void setTableScope(String tableScope) {
        this._set(DTOFIELD_TABLESCOPE, tableScope);
    }

    @JsonIgnore
    public String getTableScope() {
        Object objValue = this._get(DTOFIELD_TABLESCOPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableScopeDirty() {
        return this._contains(DTOFIELD_TABLESCOPE);
    }

    @JsonIgnore
    public void resetTableScope() {
        this._reset(DTOFIELD_TABLESCOPE);
    }

    @JsonIgnore
    public PSDEFieldDTO tablescope(String tableScope) {
        this.setTableScope(tableScope);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO tablescope(PSModelEnums.DEDBTableType tableScope) {
        if (tableScope == null) {
            this.setTableScope(null);
        } else {
            this.setTableScope(tableScope.value);
        }
        return this;
    }

    @JsonProperty(value="testdata")
    public void setTestData(String testData) {
        this._set(DTOFIELD_TESTDATA, testData);
    }

    @JsonIgnore
    public String getTestData() {
        Object objValue = this._get(DTOFIELD_TESTDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestDataDirty() {
        return this._contains(DTOFIELD_TESTDATA);
    }

    @JsonIgnore
    public void resetTestData() {
        this._reset(DTOFIELD_TESTDATA);
    }

    @JsonIgnore
    public PSDEFieldDTO testdata(String testData) {
        this.setTestData(testData);
        return this;
    }

    @JsonProperty(value="translatormode")
    public void setTranslatorMode(String translatorMode) {
        this._set(DTOFIELD_TRANSLATORMODE, translatorMode);
    }

    @JsonIgnore
    public String getTranslatorMode() {
        Object objValue = this._get(DTOFIELD_TRANSLATORMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTranslatorModeDirty() {
        return this._contains(DTOFIELD_TRANSLATORMODE);
    }

    @JsonIgnore
    public void resetTranslatorMode() {
        this._reset(DTOFIELD_TRANSLATORMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO translatormode(String translatorMode) {
        this.setTranslatorMode(translatorMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO translatormode(PSModelEnums.DEFTranslatorMode translatorMode) {
        if (translatorMode == null) {
            this.setTranslatorMode(null);
        } else {
            this.setTranslatorMode(translatorMode.value);
        }
        return this;
    }

    @JsonProperty(value="unicodechar")
    public void setUnicodeChar(Integer unicodeChar) {
        this._set(DTOFIELD_UNICODECHAR, unicodeChar);
    }

    @JsonIgnore
    public Integer getUnicodeChar() {
        Object objValue = this._get(DTOFIELD_UNICODECHAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUnicodeCharDirty() {
        return this._contains(DTOFIELD_UNICODECHAR);
    }

    @JsonIgnore
    public void resetUnicodeChar() {
        this._reset(DTOFIELD_UNICODECHAR);
    }

    @JsonIgnore
    public PSDEFieldDTO unicodechar(Integer unicodeChar) {
        this.setUnicodeChar(unicodeChar);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO unicodechar(Boolean unicodeChar) {
        if (unicodeChar == null) {
            this.setUnicodeChar(null);
        } else {
            this.setUnicodeChar(unicodeChar != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="unionkeyvalue")
    public void setUnionKeyValue(String unionKeyValue) {
        this._set(DTOFIELD_UNIONKEYVALUE, unionKeyValue);
    }

    @JsonIgnore
    public String getUnionKeyValue() {
        Object objValue = this._get(DTOFIELD_UNIONKEYVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUnionKeyValueDirty() {
        return this._contains(DTOFIELD_UNIONKEYVALUE);
    }

    @JsonIgnore
    public void resetUnionKeyValue() {
        this._reset(DTOFIELD_UNIONKEYVALUE);
    }

    @JsonIgnore
    public PSDEFieldDTO unionkeyvalue(String unionKeyValue) {
        this.setUnionKeyValue(unionKeyValue);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO unionkeyvalue(PSModelEnums.UnionKeyValueMode unionKeyValue) {
        if (unionKeyValue == null) {
            this.setUnionKeyValue(null);
        } else {
            this.setUnionKeyValue(unionKeyValue.value);
        }
        return this;
    }

    @JsonProperty(value="unit")
    public void setUnit(String unit) {
        this._set(DTOFIELD_UNIT, unit);
    }

    @JsonIgnore
    public String getUnit() {
        Object objValue = this._get(DTOFIELD_UNIT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUnitDirty() {
        return this._contains(DTOFIELD_UNIT);
    }

    @JsonIgnore
    public void resetUnit() {
        this._reset(DTOFIELD_UNIT);
    }

    @JsonIgnore
    public PSDEFieldDTO unit(String unit) {
        this.setUnit(unit);
        return this;
    }

    @JsonProperty(value="unitwidth")
    public void setUnitWidth(Integer unitWidth) {
        this._set(DTOFIELD_UNITWIDTH, unitWidth);
    }

    @JsonIgnore
    public Integer getUnitWidth() {
        Object objValue = this._get(DTOFIELD_UNITWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUnitWidthDirty() {
        return this._contains(DTOFIELD_UNITWIDTH);
    }

    @JsonIgnore
    public void resetUnitWidth() {
        this._reset(DTOFIELD_UNITWIDTH);
    }

    @JsonIgnore
    public PSDEFieldDTO unitwidth(Integer unitWidth) {
        this.setUnitWidth(unitWidth);
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
    public PSDEFieldDTO updatedate(Timestamp updateDate) {
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
    public PSDEFieldDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="updateovmode")
    public void setUpdateOVMode(String updateOVMode) {
        this._set(DTOFIELD_UPDATEOVMODE, updateOVMode);
    }

    @JsonIgnore
    public String getUpdateOVMode() {
        Object objValue = this._get(DTOFIELD_UPDATEOVMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateOVModeDirty() {
        return this._contains(DTOFIELD_UPDATEOVMODE);
    }

    @JsonIgnore
    public void resetUpdateOVMode() {
        this._reset(DTOFIELD_UPDATEOVMODE);
    }

    @JsonIgnore
    public PSDEFieldDTO updateovmode(String updateOVMode) {
        this.setUpdateOVMode(updateOVMode);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO updateovmode(PSModelEnums.OldValueUpdateMode updateOVMode) {
        if (updateOVMode == null) {
            this.setUpdateOVMode(null);
        } else {
            this.setUpdateOVMode(updateOVMode.value);
        }
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
    public PSDEFieldDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
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
    public PSDEFieldDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDEFieldDTO usertag(String userTag) {
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
    public PSDEFieldDTO usertag2(String userTag2) {
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
    public PSDEFieldDTO usertag3(String userTag3) {
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
    public PSDEFieldDTO usertag4(String userTag4) {
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
    public PSDEFieldDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valueformat")
    public void setValueFormat(String valueFormat) {
        this._set(DTOFIELD_VALUEFORMAT, valueFormat);
    }

    @JsonIgnore
    public String getValueFormat() {
        Object objValue = this._get(DTOFIELD_VALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFormatDirty() {
        return this._contains(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public void resetValueFormat() {
        this._reset(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public PSDEFieldDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonProperty(value="valuepsdefid")
    public void setValuePSDEFId(String valuePSDEFId) {
        this._set(DTOFIELD_VALUEPSDEFID, valuePSDEFId);
    }

    @JsonIgnore
    public String getValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public void resetValuePSDEFId() {
        this._reset(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public PSDEFieldDTO valuepsdefid(String valuePSDEFId) {
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO valuepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        } else {
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="valuepsdefname")
    public void setValuePSDEFName(String valuePSDEFName) {
        this._set(DTOFIELD_VALUEPSDEFNAME, valuePSDEFName);
    }

    @JsonIgnore
    public String getValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetValuePSDEFName() {
        this._reset(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFieldDTO valuepsdefname(String valuePSDEFName) {
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonProperty(value="viewcollevel")
    public void setViewColLevel(Integer viewColLevel) {
        this._set(DTOFIELD_VIEWCOLLEVEL, viewColLevel);
    }

    @JsonIgnore
    public Integer getViewColLevel() {
        Object objValue = this._get(DTOFIELD_VIEWCOLLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewColLevelDirty() {
        return this._contains(DTOFIELD_VIEWCOLLEVEL);
    }

    @JsonIgnore
    public void resetViewColLevel() {
        this._reset(DTOFIELD_VIEWCOLLEVEL);
    }

    @JsonIgnore
    public PSDEFieldDTO viewcollevel(Integer viewColLevel) {
        this.setViewColLevel(viewColLevel);
        return this;
    }

    @JsonIgnore
    public PSDEFieldDTO viewcollevel(PSModelEnums.DEFieldViewColLevel viewColLevel) {
        if (viewColLevel == null) {
            this.setViewColLevel(null);
        } else {
            this.setViewColLevel(viewColLevel.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFieldId(strValue);
    }

    @JsonIgnore
    public PSDEFieldDTO id(String strValue) {
        this.setPSDEFieldId(strValue);
        return this;
    }
}
