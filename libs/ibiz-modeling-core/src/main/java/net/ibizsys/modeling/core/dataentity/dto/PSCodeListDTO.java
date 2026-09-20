package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSCodeListDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLTEXT = "ALLTEXT";
    protected static final String DTOFIELD_ALLTEXT = "alltext";
    public static final String FIELD_ALLTEXTPSLANRESID = "ALLTEXTPSLANRESID";
    protected static final String DTOFIELD_ALLTEXTPSLANRESID = "alltextpslanresid";
    public static final String FIELD_ALLTEXTPSLANRESNAME = "ALLTEXTPSLANRESNAME";
    protected static final String DTOFIELD_ALLTEXTPSLANRESNAME = "alltextpslanresname";
    public static final String FIELD_BEGINVALUEPSDEFID = "BEGINVALUEPSDEFID";
    protected static final String DTOFIELD_BEGINVALUEPSDEFID = "beginvaluepsdefid";
    public static final String FIELD_BEGINVALUEPSDEFNAME = "BEGINVALUEPSDEFNAME";
    protected static final String DTOFIELD_BEGINVALUEPSDEFNAME = "beginvaluepsdefname";
    public static final String FIELD_BKCOLORPSDEFID = "BKCOLORPSDEFID";
    protected static final String DTOFIELD_BKCOLORPSDEFID = "bkcolorpsdefid";
    public static final String FIELD_BKCOLORPSDEFNAME = "BKCOLORPSDEFNAME";
    protected static final String DTOFIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";
    public static final String FIELD_CACHECAT = "CACHECAT";
    protected static final String DTOFIELD_CACHECAT = "cachecat";
    public static final String FIELD_CACHETAG = "CACHETAG";
    protected static final String DTOFIELD_CACHETAG = "cachetag";
    public static final String FIELD_CACHETIMEOUT = "CACHETIMEOUT";
    protected static final String DTOFIELD_CACHETIMEOUT = "cachetimeout";
    public static final String FIELD_CLSPSDEFID = "CLSPSDEFID";
    protected static final String DTOFIELD_CLSPSDEFID = "clspsdefid";
    public static final String FIELD_CLSPSDEFNAME = "CLSPSDEFNAME";
    protected static final String DTOFIELD_CLSPSDEFNAME = "clspsdefname";
    public static final String FIELD_CLTYPE = "CLTYPE";
    protected static final String DTOFIELD_CLTYPE = "cltype";
    public static final String FIELD_CODELISTSN = "CODELISTSN";
    protected static final String DTOFIELD_CODELISTSN = "codelistsn";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLORPSDEFID = "COLORPSDEFID";
    protected static final String DTOFIELD_COLORPSDEFID = "colorpsdefid";
    public static final String FIELD_COLORPSDEFNAME = "COLORPSDEFNAME";
    protected static final String DTOFIELD_COLORPSDEFNAME = "colorpsdefname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_DATAPSDEFID = "DATAPSDEFID";
    protected static final String DTOFIELD_DATAPSDEFID = "datapsdefid";
    public static final String FIELD_DATAPSDEFNAME = "DATAPSDEFNAME";
    protected static final String DTOFIELD_DATAPSDEFNAME = "datapsdefname";
    public static final String FIELD_DISABLEPSDEFID = "DISABLEPSDEFID";
    protected static final String DTOFIELD_DISABLEPSDEFID = "disablepsdefid";
    public static final String FIELD_DISABLEPSDEFNAME = "DISABLEPSDEFNAME";
    protected static final String DTOFIELD_DISABLEPSDEFNAME = "disablepsdefname";
    public static final String FIELD_DSCONDITIONS = "DSCONDITIONS";
    protected static final String DTOFIELD_DSCONDITIONS = "dsconditions";
    public static final String FIELD_EMPTYTEXT = "EMPTYTEXT";
    protected static final String DTOFIELD_EMPTYTEXT = "emptytext";
    public static final String FIELD_EMPTYTEXTPSLANRESID = "EMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";
    public static final String FIELD_EMPTYTEXTPSLANRESNAME = "EMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";
    public static final String FIELD_ENABLECACHE = "ENABLECACHE";
    protected static final String DTOFIELD_ENABLECACHE = "enablecache";
    public static final String FIELD_ENABLEDYNASYS = "ENABLEDYNASYS";
    protected static final String DTOFIELD_ENABLEDYNASYS = "enabledynasys";
    public static final String FIELD_ENDVALUEPSDEFID = "ENDVALUEPSDEFID";
    protected static final String DTOFIELD_ENDVALUEPSDEFID = "endvaluepsdefid";
    public static final String FIELD_ENDVALUEPSDEFNAME = "ENDVALUEPSDEFNAME";
    protected static final String DTOFIELD_ENDVALUEPSDEFNAME = "endvaluepsdefname";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_ICONCLSPSDEFID = "ICONCLSPSDEFID";
    protected static final String DTOFIELD_ICONCLSPSDEFID = "iconclspsdefid";
    public static final String FIELD_ICONCLSPSDEFNAME = "ICONCLSPSDEFNAME";
    protected static final String DTOFIELD_ICONCLSPSDEFNAME = "iconclspsdefname";
    public static final String FIELD_ICONCLSXPSDEFID = "ICONCLSXPSDEFID";
    protected static final String DTOFIELD_ICONCLSXPSDEFID = "iconclsxpsdefid";
    public static final String FIELD_ICONCLSXPSDEFNAME = "ICONCLSXPSDEFNAME";
    protected static final String DTOFIELD_ICONCLSXPSDEFNAME = "iconclsxpsdefname";
    public static final String FIELD_ICONPATHPSDEFID = "ICONPATHPSDEFID";
    protected static final String DTOFIELD_ICONPATHPSDEFID = "iconpathpsdefid";
    public static final String FIELD_ICONPATHPSDEFNAME = "ICONPATHPSDEFNAME";
    protected static final String DTOFIELD_ICONPATHPSDEFNAME = "iconpathpsdefname";
    public static final String FIELD_ICONPATHXPSDEFID = "ICONPATHXPSDEFID";
    protected static final String DTOFIELD_ICONPATHXPSDEFID = "iconpathxpsdefid";
    public static final String FIELD_ICONPATHXPSDEFNAME = "ICONPATHXPSDEFNAME";
    protected static final String DTOFIELD_ICONPATHXPSDEFNAME = "iconpathxpsdefname";
    public static final String FIELD_INCBEGINVALUE = "INCBEGINVALUE";
    protected static final String DTOFIELD_INCBEGINVALUE = "incbeginvalue";
    public static final String FIELD_INCENDVALUE = "INCENDVALUE";
    protected static final String DTOFIELD_INCENDVALUE = "incendvalue";
    public static final String FIELD_LINKPSDEVIEWID = "LINKPSDEVIEWID";
    protected static final String DTOFIELD_LINKPSDEVIEWID = "linkpsdeviewid";
    public static final String FIELD_LINKPSDEVIEWNAME = "LINKPSDEVIEWNAME";
    protected static final String DTOFIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORSORTDIR = "MINORSORTDIR";
    protected static final String DTOFIELD_MINORSORTDIR = "minorsortdir";
    public static final String FIELD_MINORSORTPSDEFID = "MINORSORTPSDEFID";
    protected static final String DTOFIELD_MINORSORTPSDEFID = "minorsortpsdefid";
    public static final String FIELD_MINORSORTPSDEFNAME = "MINORSORTPSDEFNAME";
    protected static final String DTOFIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";
    public static final String FIELD_MODCOLOR = "MODCOLOR";
    protected static final String DTOFIELD_MODCOLOR = "modcolor";
    public static final String FIELD_NOVALUEEMPTY = "NOVALUEEMPTY";
    protected static final String DTOFIELD_NOVALUEEMPTY = "novalueempty";
    public static final String FIELD_NUMBERITEM = "NUMBERITEM";
    protected static final String DTOFIELD_NUMBERITEM = "numberitem";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_ORMODE = "ORMODE";
    protected static final String DTOFIELD_ORMODE = "ormode";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSCODELISTTEMPLID = "PSCODELISTTEMPLID";
    protected static final String DTOFIELD_PSCODELISTTEMPLID = "pscodelisttemplid";
    public static final String FIELD_PSCODELISTTEMPLNAME = "PSCODELISTTEMPLNAME";
    protected static final String DTOFIELD_PSCODELISTTEMPLNAME = "pscodelisttemplname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMSLOGICID = "PSDEMSLOGICID";
    protected static final String DTOFIELD_PSDEMSLOGICID = "psdemslogicid";
    public static final String FIELD_PSDEMSLOGICNAME = "PSDEMSLOGICNAME";
    protected static final String DTOFIELD_PSDEMSLOGICNAME = "psdemslogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDYNACODELISTID = "PSDYNACODELISTID";
    protected static final String DTOFIELD_PSDYNACODELISTID = "psdynacodelistid";
    public static final String FIELD_PSDYNACODELISTNAME = "PSDYNACODELISTNAME";
    protected static final String DTOFIELD_PSDYNACODELISTNAME = "psdynacodelistname";
    public static final String FIELD_PSDYNAINSTNAME = "PSDYNAINSTNAME";
    protected static final String DTOFIELD_PSDYNAINSTNAME = "psdynainstname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PVALUEPSDEFID = "PVALUEPSDEFID";
    protected static final String DTOFIELD_PVALUEPSDEFID = "pvaluepsdefid";
    public static final String FIELD_PVALUEPSDEFNAME = "PVALUEPSDEFNAME";
    protected static final String DTOFIELD_PVALUEPSDEFNAME = "pvaluepsdefname";
    public static final String FIELD_SEPERATOR = "SEPERATOR";
    protected static final String DTOFIELD_SEPERATOR = "seperator";
    public static final String FIELD_SYSREFFLAG = "SYSREFFLAG";
    protected static final String DTOFIELD_SYSREFFLAG = "sysrefflag";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
    public static final String FIELD_THRESHOLDGROUPFLAG = "THRESHOLDGROUPFLAG";
    protected static final String DTOFIELD_THRESHOLDGROUPFLAG = "thresholdgroupflag";
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
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERREFFLAG = "USERREFFLAG";
    protected static final String DTOFIELD_USERREFFLAG = "userrefflag";
    public static final String FIELD_USERSCOPE = "USERSCOPE";
    protected static final String DTOFIELD_USERSCOPE = "userscope";
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
    public static final String FIELD_VALUEPSDEFID = "VALUEPSDEFID";
    protected static final String DTOFIELD_VALUEPSDEFID = "valuepsdefid";
    public static final String FIELD_VALUEPSDEFNAME = "VALUEPSDEFNAME";
    protected static final String DTOFIELD_VALUEPSDEFNAME = "valuepsdefname";
    public static final String FIELD_VALUESEPERATOR = "VALUESEPERATOR";
    protected static final String DTOFIELD_VALUESEPERATOR = "valueseperator";
    public static final String DTOFIELD_PSCODEITEMS = "pscodeitems";

    @JsonProperty(value="alltext")
    public void setAllText(String allText) {
        this._set(DTOFIELD_ALLTEXT, allText);
    }

    @JsonIgnore
    public String getAllText() {
        Object objValue = this._get(DTOFIELD_ALLTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAllTextDirty() {
        return this._contains(DTOFIELD_ALLTEXT);
    }

    @JsonIgnore
    public void resetAllText() {
        this._reset(DTOFIELD_ALLTEXT);
    }

    @JsonIgnore
    public PSCodeListDTO alltext(String allText) {
        this.setAllText(allText);
        return this;
    }

    @JsonProperty(value="alltextpslanresid")
    public void setAllTextPSLanResId(String allTextPSLanResId) {
        this._set(DTOFIELD_ALLTEXTPSLANRESID, allTextPSLanResId);
    }

    @JsonIgnore
    public String getAllTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_ALLTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAllTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_ALLTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetAllTextPSLanResId() {
        this._reset(DTOFIELD_ALLTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSCodeListDTO alltextpslanresid(String allTextPSLanResId) {
        this.setAllTextPSLanResId(allTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO alltextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setAllTextPSLanResId(null);
            this.setAllTextPSLanResName(null);
        } else {
            this.setAllTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setAllTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="alltextpslanresname")
    public void setAllTextPSLanResName(String allTextPSLanResName) {
        this._set(DTOFIELD_ALLTEXTPSLANRESNAME, allTextPSLanResName);
    }

    @JsonIgnore
    public String getAllTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_ALLTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAllTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_ALLTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetAllTextPSLanResName() {
        this._reset(DTOFIELD_ALLTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSCodeListDTO alltextpslanresname(String allTextPSLanResName) {
        this.setAllTextPSLanResName(allTextPSLanResName);
        return this;
    }

    @JsonProperty(value="beginvaluepsdefid")
    public void setBeginValuePSDEFId(String beginValuePSDEFId) {
        this._set(DTOFIELD_BEGINVALUEPSDEFID, beginValuePSDEFId);
    }

    @JsonIgnore
    public String getBeginValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_BEGINVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_BEGINVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetBeginValuePSDEFId() {
        this._reset(DTOFIELD_BEGINVALUEPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO beginvaluepsdefid(String beginValuePSDEFId) {
        this.setBeginValuePSDEFId(beginValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO beginvaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBeginValuePSDEFId(null);
            this.setBeginValuePSDEFName(null);
        } else {
            this.setBeginValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="beginvaluepsdefname")
    public void setBeginValuePSDEFName(String beginValuePSDEFName) {
        this._set(DTOFIELD_BEGINVALUEPSDEFNAME, beginValuePSDEFName);
    }

    @JsonIgnore
    public String getBeginValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_BEGINVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_BEGINVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetBeginValuePSDEFName() {
        this._reset(DTOFIELD_BEGINVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO beginvaluepsdefname(String beginValuePSDEFName) {
        this.setBeginValuePSDEFName(beginValuePSDEFName);
        return this;
    }

    @JsonProperty(value="bkcolorpsdefid")
    public void setBKColorPSDEFId(String bKColorPSDEFId) {
        this._set(DTOFIELD_BKCOLORPSDEFID, bKColorPSDEFId);
    }

    @JsonIgnore
    public String getBKColorPSDEFId() {
        Object objValue = this._get(DTOFIELD_BKCOLORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorPSDEFIdDirty() {
        return this._contains(DTOFIELD_BKCOLORPSDEFID);
    }

    @JsonIgnore
    public void resetBKColorPSDEFId() {
        this._reset(DTOFIELD_BKCOLORPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO bkcolorpsdefid(String bKColorPSDEFId) {
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO bkcolorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBKColorPSDEFId(null);
            this.setBKColorPSDEFName(null);
        } else {
            this.setBKColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setBKColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="bkcolorpsdefname")
    public void setBKColorPSDEFName(String bKColorPSDEFName) {
        this._set(DTOFIELD_BKCOLORPSDEFNAME, bKColorPSDEFName);
    }

    @JsonIgnore
    public String getBKColorPSDEFName() {
        Object objValue = this._get(DTOFIELD_BKCOLORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorPSDEFNameDirty() {
        return this._contains(DTOFIELD_BKCOLORPSDEFNAME);
    }

    @JsonIgnore
    public void resetBKColorPSDEFName() {
        this._reset(DTOFIELD_BKCOLORPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO bkcolorpsdefname(String bKColorPSDEFName) {
        this.setBKColorPSDEFName(bKColorPSDEFName);
        return this;
    }

    @JsonProperty(value="cachecat")
    public void setCacheCat(String cacheCat) {
        this._set(DTOFIELD_CACHECAT, cacheCat);
    }

    @JsonIgnore
    public String getCacheCat() {
        Object objValue = this._get(DTOFIELD_CACHECAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheCatDirty() {
        return this._contains(DTOFIELD_CACHECAT);
    }

    @JsonIgnore
    public void resetCacheCat() {
        this._reset(DTOFIELD_CACHECAT);
    }

    @JsonIgnore
    public PSCodeListDTO cachecat(String cacheCat) {
        this.setCacheCat(cacheCat);
        return this;
    }

    @JsonProperty(value="cachetag")
    public void setCacheTag(String cacheTag) {
        this._set(DTOFIELD_CACHETAG, cacheTag);
    }

    @JsonIgnore
    public String getCacheTag() {
        Object objValue = this._get(DTOFIELD_CACHETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheTagDirty() {
        return this._contains(DTOFIELD_CACHETAG);
    }

    @JsonIgnore
    public void resetCacheTag() {
        this._reset(DTOFIELD_CACHETAG);
    }

    @JsonIgnore
    public PSCodeListDTO cachetag(String cacheTag) {
        this.setCacheTag(cacheTag);
        return this;
    }

    @JsonProperty(value="cachetimeout")
    public void setCacheTimeout(Integer cacheTimeout) {
        this._set(DTOFIELD_CACHETIMEOUT, cacheTimeout);
    }

    @JsonIgnore
    public Integer getCacheTimeout() {
        Object objValue = this._get(DTOFIELD_CACHETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCacheTimeoutDirty() {
        return this._contains(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public void resetCacheTimeout() {
        this._reset(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public PSCodeListDTO cachetimeout(Integer cacheTimeout) {
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    @JsonProperty(value="clspsdefid")
    public void setClsPSDEFId(String clsPSDEFId) {
        this._set(DTOFIELD_CLSPSDEFID, clsPSDEFId);
    }

    @JsonIgnore
    public String getClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public void resetClsPSDEFId() {
        this._reset(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO clspsdefid(String clsPSDEFId) {
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO clspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        } else {
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="clspsdefname")
    public void setClsPSDEFName(String clsPSDEFName) {
        this._set(DTOFIELD_CLSPSDEFNAME, clsPSDEFName);
    }

    @JsonIgnore
    public String getClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetClsPSDEFName() {
        this._reset(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO clspsdefname(String clsPSDEFName) {
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    @JsonProperty(value="cltype")
    public void setCLType(String cLType) {
        this._set(DTOFIELD_CLTYPE, cLType);
    }

    @JsonIgnore
    public String getCLType() {
        Object objValue = this._get(DTOFIELD_CLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLTypeDirty() {
        return this._contains(DTOFIELD_CLTYPE);
    }

    @JsonIgnore
    public void resetCLType() {
        this._reset(DTOFIELD_CLTYPE);
    }

    @JsonIgnore
    public PSCodeListDTO cltype(String cLType) {
        this.setCLType(cLType);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO cltype(PSModelEnums.CodeListType cLType) {
        if (cLType == null) {
            this.setCLType(null);
        } else {
            this.setCLType(cLType.value);
        }
        return this;
    }

    @JsonProperty(value="codelistsn")
    public void setCodeListSN(String codeListSN) {
        this._set(DTOFIELD_CODELISTSN, codeListSN);
    }

    @JsonIgnore
    public String getCodeListSN() {
        Object objValue = this._get(DTOFIELD_CODELISTSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeListSNDirty() {
        return this._contains(DTOFIELD_CODELISTSN);
    }

    @JsonIgnore
    public void resetCodeListSN() {
        this._reset(DTOFIELD_CODELISTSN);
    }

    @JsonIgnore
    public PSCodeListDTO codelistsn(String codeListSN) {
        this.setCodeListSN(codeListSN);
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
    public PSCodeListDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="colorpsdefid")
    public void setColorPSDEFId(String colorPSDEFId) {
        this._set(DTOFIELD_COLORPSDEFID, colorPSDEFId);
    }

    @JsonIgnore
    public String getColorPSDEFId() {
        Object objValue = this._get(DTOFIELD_COLORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorPSDEFIdDirty() {
        return this._contains(DTOFIELD_COLORPSDEFID);
    }

    @JsonIgnore
    public void resetColorPSDEFId() {
        this._reset(DTOFIELD_COLORPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO colorpsdefid(String colorPSDEFId) {
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO colorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setColorPSDEFId(null);
            this.setColorPSDEFName(null);
        } else {
            this.setColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="colorpsdefname")
    public void setColorPSDEFName(String colorPSDEFName) {
        this._set(DTOFIELD_COLORPSDEFNAME, colorPSDEFName);
    }

    @JsonIgnore
    public String getColorPSDEFName() {
        Object objValue = this._get(DTOFIELD_COLORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorPSDEFNameDirty() {
        return this._contains(DTOFIELD_COLORPSDEFNAME);
    }

    @JsonIgnore
    public void resetColorPSDEFName() {
        this._reset(DTOFIELD_COLORPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO colorpsdefname(String colorPSDEFName) {
        this.setColorPSDEFName(colorPSDEFName);
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
    public PSCodeListDTO createdate(Timestamp createDate) {
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
    public PSCodeListDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSCodeListDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="customtype")
    public void setCustomType(String customType) {
        this._set(DTOFIELD_CUSTOMTYPE, customType);
    }

    @JsonIgnore
    public String getCustomType() {
        Object objValue = this._get(DTOFIELD_CUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public void resetCustomType() {
        this._reset(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public PSCodeListDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="datapsdefid")
    public void setDataPSDEFId(String dataPSDEFId) {
        this._set(DTOFIELD_DATAPSDEFID, dataPSDEFId);
    }

    @JsonIgnore
    public String getDataPSDEFId() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFIdDirty() {
        return this._contains(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public void resetDataPSDEFId() {
        this._reset(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO datapsdefid(String dataPSDEFId) {
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO datapsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        } else {
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="datapsdefname")
    public void setDataPSDEFName(String dataPSDEFName) {
        this._set(DTOFIELD_DATAPSDEFNAME, dataPSDEFName);
    }

    @JsonIgnore
    public String getDataPSDEFName() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFNameDirty() {
        return this._contains(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public void resetDataPSDEFName() {
        this._reset(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO datapsdefname(String dataPSDEFName) {
        this.setDataPSDEFName(dataPSDEFName);
        return this;
    }

    @JsonProperty(value="disablepsdefid")
    public void setDisablePSDEFId(String disablePSDEFId) {
        this._set(DTOFIELD_DISABLEPSDEFID, disablePSDEFId);
    }

    @JsonIgnore
    public String getDisablePSDEFId() {
        Object objValue = this._get(DTOFIELD_DISABLEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDisablePSDEFIdDirty() {
        return this._contains(DTOFIELD_DISABLEPSDEFID);
    }

    @JsonIgnore
    public void resetDisablePSDEFId() {
        this._reset(DTOFIELD_DISABLEPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO disablepsdefid(String disablePSDEFId) {
        this.setDisablePSDEFId(disablePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO disablepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDisablePSDEFId(null);
            this.setDisablePSDEFName(null);
        } else {
            this.setDisablePSDEFId(pSDEField.getPSDEFieldId());
            this.setDisablePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="disablepsdefname")
    public void setDisablePSDEFName(String disablePSDEFName) {
        this._set(DTOFIELD_DISABLEPSDEFNAME, disablePSDEFName);
    }

    @JsonIgnore
    public String getDisablePSDEFName() {
        Object objValue = this._get(DTOFIELD_DISABLEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDisablePSDEFNameDirty() {
        return this._contains(DTOFIELD_DISABLEPSDEFNAME);
    }

    @JsonIgnore
    public void resetDisablePSDEFName() {
        this._reset(DTOFIELD_DISABLEPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO disablepsdefname(String disablePSDEFName) {
        this.setDisablePSDEFName(disablePSDEFName);
        return this;
    }

    @JsonProperty(value="dsconditions")
    public void setDSConditions(String dSConditions) {
        this._set(DTOFIELD_DSCONDITIONS, dSConditions);
    }

    @JsonIgnore
    public String getDSConditions() {
        Object objValue = this._get(DTOFIELD_DSCONDITIONS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSConditionsDirty() {
        return this._contains(DTOFIELD_DSCONDITIONS);
    }

    @JsonIgnore
    public void resetDSConditions() {
        this._reset(DTOFIELD_DSCONDITIONS);
    }

    @JsonIgnore
    public PSCodeListDTO dsconditions(String dSConditions) {
        this.setDSConditions(dSConditions);
        return this;
    }

    @JsonProperty(value="emptytext")
    public void setEmptyText(String emptyText) {
        this._set(DTOFIELD_EMPTYTEXT, emptyText);
    }

    @JsonIgnore
    public String getEmptyText() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextDirty() {
        return this._contains(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public void resetEmptyText() {
        this._reset(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public PSCodeListDTO emptytext(String emptyText) {
        this.setEmptyText(emptyText);
        return this;
    }

    @JsonProperty(value="emptytextpslanresid")
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResId() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSCodeListDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        } else {
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="emptytextpslanresname")
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResName() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSCodeListDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    @JsonProperty(value="enablecache")
    public void setEnableCache(Integer enableCache) {
        this._set(DTOFIELD_ENABLECACHE, enableCache);
    }

    @JsonIgnore
    public Integer getEnableCache() {
        Object objValue = this._get(DTOFIELD_ENABLECACHE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCacheDirty() {
        return this._contains(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public void resetEnableCache() {
        this._reset(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public PSCodeListDTO enablecache(Integer enableCache) {
        this.setEnableCache(enableCache);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO enablecache(Boolean enableCache) {
        if (enableCache == null) {
            this.setEnableCache(null);
        } else {
            this.setEnableCache(enableCache != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabledynasys")
    public void setEnableDynaSys(Integer enableDynaSys) {
        this._set(DTOFIELD_ENABLEDYNASYS, enableDynaSys);
    }

    @JsonIgnore
    public Integer getEnableDynaSys() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNASYS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaSysDirty() {
        return this._contains(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public void resetEnableDynaSys() {
        this._reset(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public PSCodeListDTO enabledynasys(Integer enableDynaSys) {
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO enabledynasys(PSModelEnums.DynaSysMode enableDynaSys) {
        if (enableDynaSys == null) {
            this.setEnableDynaSys(null);
        } else {
            this.setEnableDynaSys(enableDynaSys.value);
        }
        return this;
    }

    @JsonProperty(value="endvaluepsdefid")
    public void setEndValuePSDEFId(String endValuePSDEFId) {
        this._set(DTOFIELD_ENDVALUEPSDEFID, endValuePSDEFId);
    }

    @JsonIgnore
    public String getEndValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_ENDVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_ENDVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetEndValuePSDEFId() {
        this._reset(DTOFIELD_ENDVALUEPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO endvaluepsdefid(String endValuePSDEFId) {
        this.setEndValuePSDEFId(endValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO endvaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setEndValuePSDEFId(null);
            this.setEndValuePSDEFName(null);
        } else {
            this.setEndValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setEndValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="endvaluepsdefname")
    public void setEndValuePSDEFName(String endValuePSDEFName) {
        this._set(DTOFIELD_ENDVALUEPSDEFNAME, endValuePSDEFName);
    }

    @JsonIgnore
    public String getEndValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_ENDVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_ENDVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetEndValuePSDEFName() {
        this._reset(DTOFIELD_ENDVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO endvaluepsdefname(String endValuePSDEFName) {
        this.setEndValuePSDEFName(endValuePSDEFName);
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
    public PSCodeListDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="iconclspsdefid")
    public void setIconClsPSDEFId(String iconClsPSDEFId) {
        this._set(DTOFIELD_ICONCLSPSDEFID, iconClsPSDEFId);
    }

    @JsonIgnore
    public String getIconClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONCLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONCLSPSDEFID);
    }

    @JsonIgnore
    public void resetIconClsPSDEFId() {
        this._reset(DTOFIELD_ICONCLSPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO iconclspsdefid(String iconClsPSDEFId) {
        this.setIconClsPSDEFId(iconClsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO iconclspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconClsPSDEFId(null);
            this.setIconClsPSDEFName(null);
        } else {
            this.setIconClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconclspsdefname")
    public void setIconClsPSDEFName(String iconClsPSDEFName) {
        this._set(DTOFIELD_ICONCLSPSDEFNAME, iconClsPSDEFName);
    }

    @JsonIgnore
    public String getIconClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONCLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONCLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconClsPSDEFName() {
        this._reset(DTOFIELD_ICONCLSPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO iconclspsdefname(String iconClsPSDEFName) {
        this.setIconClsPSDEFName(iconClsPSDEFName);
        return this;
    }

    @JsonProperty(value="iconclsxpsdefid")
    public void setIconClsXPSDEFId(String iconClsXPSDEFId) {
        this._set(DTOFIELD_ICONCLSXPSDEFID, iconClsXPSDEFId);
    }

    @JsonIgnore
    public String getIconClsXPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONCLSXPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsXPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONCLSXPSDEFID);
    }

    @JsonIgnore
    public void resetIconClsXPSDEFId() {
        this._reset(DTOFIELD_ICONCLSXPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO iconclsxpsdefid(String iconClsXPSDEFId) {
        this.setIconClsXPSDEFId(iconClsXPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO iconclsxpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconClsXPSDEFId(null);
            this.setIconClsXPSDEFName(null);
        } else {
            this.setIconClsXPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconClsXPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconclsxpsdefname")
    public void setIconClsXPSDEFName(String iconClsXPSDEFName) {
        this._set(DTOFIELD_ICONCLSXPSDEFNAME, iconClsXPSDEFName);
    }

    @JsonIgnore
    public String getIconClsXPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONCLSXPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsXPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONCLSXPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconClsXPSDEFName() {
        this._reset(DTOFIELD_ICONCLSXPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO iconclsxpsdefname(String iconClsXPSDEFName) {
        this.setIconClsXPSDEFName(iconClsXPSDEFName);
        return this;
    }

    @JsonProperty(value="iconpathpsdefid")
    public void setIconPathPSDEFId(String iconPathPSDEFId) {
        this._set(DTOFIELD_ICONPATHPSDEFID, iconPathPSDEFId);
    }

    @JsonIgnore
    public String getIconPathPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONPATHPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONPATHPSDEFID);
    }

    @JsonIgnore
    public void resetIconPathPSDEFId() {
        this._reset(DTOFIELD_ICONPATHPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO iconpathpsdefid(String iconPathPSDEFId) {
        this.setIconPathPSDEFId(iconPathPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO iconpathpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconPathPSDEFId(null);
            this.setIconPathPSDEFName(null);
        } else {
            this.setIconPathPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPathPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconpathpsdefname")
    public void setIconPathPSDEFName(String iconPathPSDEFName) {
        this._set(DTOFIELD_ICONPATHPSDEFNAME, iconPathPSDEFName);
    }

    @JsonIgnore
    public String getIconPathPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONPATHPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONPATHPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconPathPSDEFName() {
        this._reset(DTOFIELD_ICONPATHPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO iconpathpsdefname(String iconPathPSDEFName) {
        this.setIconPathPSDEFName(iconPathPSDEFName);
        return this;
    }

    @JsonProperty(value="iconpathxpsdefid")
    public void setIconPathXPSDEFId(String iconPathXPSDEFId) {
        this._set(DTOFIELD_ICONPATHXPSDEFID, iconPathXPSDEFId);
    }

    @JsonIgnore
    public String getIconPathXPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONPATHXPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathXPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONPATHXPSDEFID);
    }

    @JsonIgnore
    public void resetIconPathXPSDEFId() {
        this._reset(DTOFIELD_ICONPATHXPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO iconpathxpsdefid(String iconPathXPSDEFId) {
        this.setIconPathXPSDEFId(iconPathXPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO iconpathxpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconPathXPSDEFId(null);
            this.setIconPathXPSDEFName(null);
        } else {
            this.setIconPathXPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPathXPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconpathxpsdefname")
    public void setIconPathXPSDEFName(String iconPathXPSDEFName) {
        this._set(DTOFIELD_ICONPATHXPSDEFNAME, iconPathXPSDEFName);
    }

    @JsonIgnore
    public String getIconPathXPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONPATHXPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathXPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONPATHXPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconPathXPSDEFName() {
        this._reset(DTOFIELD_ICONPATHXPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO iconpathxpsdefname(String iconPathXPSDEFName) {
        this.setIconPathXPSDEFName(iconPathXPSDEFName);
        return this;
    }

    @JsonProperty(value="incbeginvalue")
    public void setIncBeginValue(Integer incBeginValue) {
        this._set(DTOFIELD_INCBEGINVALUE, incBeginValue);
    }

    @JsonIgnore
    public Integer getIncBeginValue() {
        Object objValue = this._get(DTOFIELD_INCBEGINVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncBeginValueDirty() {
        return this._contains(DTOFIELD_INCBEGINVALUE);
    }

    @JsonIgnore
    public void resetIncBeginValue() {
        this._reset(DTOFIELD_INCBEGINVALUE);
    }

    @JsonIgnore
    public PSCodeListDTO incbeginvalue(Integer incBeginValue) {
        this.setIncBeginValue(incBeginValue);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO incbeginvalue(PSModelEnums.ThresholdIncValueMode incBeginValue) {
        if (incBeginValue == null) {
            this.setIncBeginValue(null);
        } else {
            this.setIncBeginValue(incBeginValue.value);
        }
        return this;
    }

    @JsonProperty(value="incendvalue")
    public void setIncEndValue(Integer incEndValue) {
        this._set(DTOFIELD_INCENDVALUE, incEndValue);
    }

    @JsonIgnore
    public Integer getIncEndValue() {
        Object objValue = this._get(DTOFIELD_INCENDVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncEndValueDirty() {
        return this._contains(DTOFIELD_INCENDVALUE);
    }

    @JsonIgnore
    public void resetIncEndValue() {
        this._reset(DTOFIELD_INCENDVALUE);
    }

    @JsonIgnore
    public PSCodeListDTO incendvalue(Integer incEndValue) {
        this.setIncEndValue(incEndValue);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO incendvalue(PSModelEnums.ThresholdIncValueMode incEndValue) {
        if (incEndValue == null) {
            this.setIncEndValue(null);
        } else {
            this.setIncEndValue(incEndValue.value);
        }
        return this;
    }

    @JsonProperty(value="linkpsdeviewid")
    public void setLinkPSDEViewId(String linkPSDEViewId) {
        this._set(DTOFIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }

    @JsonIgnore
    public String getLinkPSDEViewId() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public void resetLinkPSDEViewId() {
        this._reset(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public PSCodeListDTO linkpsdeviewid(String linkPSDEViewId) {
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO linkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        } else {
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="linkpsdeviewname")
    public void setLinkPSDEViewName(String linkPSDEViewName) {
        this._set(DTOFIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }

    @JsonIgnore
    public String getLinkPSDEViewName() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetLinkPSDEViewName() {
        this._reset(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSCodeListDTO linkpsdeviewname(String linkPSDEViewName) {
        this.setLinkPSDEViewName(linkPSDEViewName);
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
    public PSCodeListDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorsortdir")
    public void setMinorSortDir(String minorSortDir) {
        this._set(DTOFIELD_MINORSORTDIR, minorSortDir);
    }

    @JsonIgnore
    public String getMinorSortDir() {
        Object objValue = this._get(DTOFIELD_MINORSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortDirDirty() {
        return this._contains(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public void resetMinorSortDir() {
        this._reset(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public PSCodeListDTO minorsortdir(String minorSortDir) {
        this.setMinorSortDir(minorSortDir);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO minorsortdir(PSModelEnums.SortDir minorSortDir) {
        if (minorSortDir == null) {
            this.setMinorSortDir(null);
        } else {
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    @JsonProperty(value="minorsortpsdefid")
    public void setMinorSortPSDEFId(String minorSortPSDEFId) {
        this._set(DTOFIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }

    @JsonIgnore
    public String getMinorSortPSDEFId() {
        Object objValue = this._get(DTOFIELD_MINORSORTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty() {
        return this._contains(DTOFIELD_MINORSORTPSDEFID);
    }

    @JsonIgnore
    public void resetMinorSortPSDEFId() {
        this._reset(DTOFIELD_MINORSORTPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO minorsortpsdefid(String minorSortPSDEFId) {
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO minorsortpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        } else {
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="minorsortpsdefname")
    public void setMinorSortPSDEFName(String minorSortPSDEFName) {
        this._set(DTOFIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }

    @JsonIgnore
    public String getMinorSortPSDEFName() {
        Object objValue = this._get(DTOFIELD_MINORSORTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty() {
        return this._contains(DTOFIELD_MINORSORTPSDEFNAME);
    }

    @JsonIgnore
    public void resetMinorSortPSDEFName() {
        this._reset(DTOFIELD_MINORSORTPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO minorsortpsdefname(String minorSortPSDEFName) {
        this.setMinorSortPSDEFName(minorSortPSDEFName);
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
    public PSCodeListDTO modcolor(String modColor) {
        this.setModColor(modColor);
        return this;
    }

    @JsonProperty(value="novalueempty")
    public void setNoValueEmpty(Integer noValueEmpty) {
        this._set(DTOFIELD_NOVALUEEMPTY, noValueEmpty);
    }

    @JsonIgnore
    public Integer getNoValueEmpty() {
        Object objValue = this._get(DTOFIELD_NOVALUEEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoValueEmptyDirty() {
        return this._contains(DTOFIELD_NOVALUEEMPTY);
    }

    @JsonIgnore
    public void resetNoValueEmpty() {
        this._reset(DTOFIELD_NOVALUEEMPTY);
    }

    @JsonIgnore
    public PSCodeListDTO novalueempty(Integer noValueEmpty) {
        this.setNoValueEmpty(noValueEmpty);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO novalueempty(Boolean noValueEmpty) {
        if (noValueEmpty == null) {
            this.setNoValueEmpty(null);
        } else {
            this.setNoValueEmpty(noValueEmpty != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="numberitem")
    public void setNumberItem(Integer numberItem) {
        this._set(DTOFIELD_NUMBERITEM, numberItem);
    }

    @JsonIgnore
    public Integer getNumberItem() {
        Object objValue = this._get(DTOFIELD_NUMBERITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNumberItemDirty() {
        return this._contains(DTOFIELD_NUMBERITEM);
    }

    @JsonIgnore
    public void resetNumberItem() {
        this._reset(DTOFIELD_NUMBERITEM);
    }

    @JsonIgnore
    public PSCodeListDTO numberitem(Integer numberItem) {
        this.setNumberItem(numberItem);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO numberitem(Boolean numberItem) {
        if (numberItem == null) {
            this.setNumberItem(null);
        } else {
            this.setNumberItem(numberItem != false ? 1 : 0);
        }
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
    public PSCodeListDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ormode")
    public void setOrMode(String orMode) {
        this._set(DTOFIELD_ORMODE, orMode);
    }

    @JsonIgnore
    public String getOrMode() {
        Object objValue = this._get(DTOFIELD_ORMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrModeDirty() {
        return this._contains(DTOFIELD_ORMODE);
    }

    @JsonIgnore
    public void resetOrMode() {
        this._reset(DTOFIELD_ORMODE);
    }

    @JsonIgnore
    public PSCodeListDTO ormode(String orMode) {
        this.setOrMode(orMode);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO ormode(PSModelEnums.DesignCodeListOrMode orMode) {
        if (orMode == null) {
            this.setOrMode(null);
        } else {
            this.setOrMode(orMode.value);
        }
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSCodeListDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO predefinedtype(PSModelEnums.PredefinedCodeListType predefinedType) {
        if (predefinedType == null) {
            this.setPredefinedType(null);
        } else {
            this.setPredefinedType(predefinedType.value);
        }
        return this;
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
    public PSCodeListDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
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
    public PSCodeListDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSCodeListName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSCodeListName(strName);
    }

    @JsonIgnore
    public PSCodeListDTO name(String strName) {
        this.setPSCodeListName(strName);
        return this;
    }

    @JsonProperty(value="pscodelisttemplid")
    public void setPSCodeListTemplId(String pSCodeListTemplId) {
        this._set(DTOFIELD_PSCODELISTTEMPLID, pSCodeListTemplId);
    }

    @JsonIgnore
    public String getPSCodeListTemplId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListTemplIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTTEMPLID);
    }

    @JsonIgnore
    public void resetPSCodeListTemplId() {
        this._reset(DTOFIELD_PSCODELISTTEMPLID);
    }

    @JsonIgnore
    public PSCodeListDTO pscodelisttemplid(String pSCodeListTemplId) {
        this.setPSCodeListTemplId(pSCodeListTemplId);
        return this;
    }

    @JsonProperty(value="pscodelisttemplname")
    public void setPSCodeListTemplName(String pSCodeListTemplName) {
        this._set(DTOFIELD_PSCODELISTTEMPLNAME, pSCodeListTemplName);
    }

    @JsonIgnore
    public String getPSCodeListTemplName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListTemplNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSCodeListTemplName() {
        this._reset(DTOFIELD_PSCODELISTTEMPLNAME);
    }

    @JsonIgnore
    public PSCodeListDTO pscodelisttemplname(String pSCodeListTemplName) {
        this.setPSCodeListTemplName(pSCodeListTemplName);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSCodeListDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSCodeListDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSCodeListDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemslogicid")
    public void setPSDEMSLogicId(String pSDEMSLogicId) {
        this._set(DTOFIELD_PSDEMSLOGICID, pSDEMSLogicId);
    }

    @JsonIgnore
    public String getPSDEMSLogicId() {
        Object objValue = this._get(DTOFIELD_PSDEMSLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMSLogicIdDirty() {
        return this._contains(DTOFIELD_PSDEMSLOGICID);
    }

    @JsonIgnore
    public void resetPSDEMSLogicId() {
        this._reset(DTOFIELD_PSDEMSLOGICID);
    }

    @JsonIgnore
    public PSCodeListDTO psdemslogicid(String pSDEMSLogicId) {
        this.setPSDEMSLogicId(pSDEMSLogicId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO psdemslogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDEMSLogicId(null);
            this.setPSDEMSLogicName(null);
        } else {
            this.setPSDEMSLogicId(pSDELogic.getPSDELogicId());
            this.setPSDEMSLogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdemslogicname")
    public void setPSDEMSLogicName(String pSDEMSLogicName) {
        this._set(DTOFIELD_PSDEMSLOGICNAME, pSDEMSLogicName);
    }

    @JsonIgnore
    public String getPSDEMSLogicName() {
        Object objValue = this._get(DTOFIELD_PSDEMSLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMSLogicNameDirty() {
        return this._contains(DTOFIELD_PSDEMSLOGICNAME);
    }

    @JsonIgnore
    public void resetPSDEMSLogicName() {
        this._reset(DTOFIELD_PSDEMSLOGICNAME);
    }

    @JsonIgnore
    public PSCodeListDTO psdemslogicname(String pSDEMSLogicName) {
        this.setPSDEMSLogicName(pSDEMSLogicName);
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
    public PSCodeListDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdynacodelistid")
    public void setPSDynaCodeListId(String pSDynaCodeListId) {
        this._set(DTOFIELD_PSDYNACODELISTID, pSDynaCodeListId);
    }

    @JsonIgnore
    public String getPSDynaCodeListId() {
        Object objValue = this._get(DTOFIELD_PSDYNACODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaCodeListIdDirty() {
        return this._contains(DTOFIELD_PSDYNACODELISTID);
    }

    @JsonIgnore
    public void resetPSDynaCodeListId() {
        this._reset(DTOFIELD_PSDYNACODELISTID);
    }

    @JsonIgnore
    public PSCodeListDTO psdynacodelistid(String pSDynaCodeListId) {
        this.setPSDynaCodeListId(pSDynaCodeListId);
        return this;
    }

    @JsonProperty(value="psdynacodelistname")
    public void setPSDynaCodeListName(String pSDynaCodeListName) {
        this._set(DTOFIELD_PSDYNACODELISTNAME, pSDynaCodeListName);
    }

    @JsonIgnore
    public String getPSDynaCodeListName() {
        Object objValue = this._get(DTOFIELD_PSDYNACODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaCodeListNameDirty() {
        return this._contains(DTOFIELD_PSDYNACODELISTNAME);
    }

    @JsonIgnore
    public void resetPSDynaCodeListName() {
        this._reset(DTOFIELD_PSDYNACODELISTNAME);
    }

    @JsonIgnore
    public PSCodeListDTO psdynacodelistname(String pSDynaCodeListName) {
        this.setPSDynaCodeListName(pSDynaCodeListName);
        return this;
    }

    @JsonProperty(value="psdynainstname")
    public void setPSDynaInstName(String pSDynaInstName) {
        this._set(DTOFIELD_PSDYNAINSTNAME, pSDynaInstName);
    }

    @JsonIgnore
    public String getPSDynaInstName() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstNameDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTNAME);
    }

    @JsonIgnore
    public void resetPSDynaInstName() {
        this._reset(DTOFIELD_PSDYNAINSTNAME);
    }

    @JsonIgnore
    public PSCodeListDTO psdynainstname(String pSDynaInstName) {
        this.setPSDynaInstName(pSDynaInstName);
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
    public PSCodeListDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setModColor(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setModColor(pSModule.getColor());
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
    public PSCodeListDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSCodeListDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSCodeListDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSCodeListDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSCodeListDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSCodeListDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSCodeListDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
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
    public PSCodeListDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSCodeListDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pvaluepsdefid")
    public void setPValuePSDEFId(String pValuePSDEFId) {
        this._set(DTOFIELD_PVALUEPSDEFID, pValuePSDEFId);
    }

    @JsonIgnore
    public String getPValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_PVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_PVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetPValuePSDEFId() {
        this._reset(DTOFIELD_PVALUEPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO pvaluepsdefid(String pValuePSDEFId) {
        this.setPValuePSDEFId(pValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO pvaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPValuePSDEFId(null);
            this.setPValuePSDEFName(null);
        } else {
            this.setPValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setPValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="pvaluepsdefname")
    public void setPValuePSDEFName(String pValuePSDEFName) {
        this._set(DTOFIELD_PVALUEPSDEFNAME, pValuePSDEFName);
    }

    @JsonIgnore
    public String getPValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_PVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_PVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetPValuePSDEFName() {
        this._reset(DTOFIELD_PVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO pvaluepsdefname(String pValuePSDEFName) {
        this.setPValuePSDEFName(pValuePSDEFName);
        return this;
    }

    @JsonProperty(value="seperator")
    public void setSeperator(String seperator) {
        this._set(DTOFIELD_SEPERATOR, seperator);
    }

    @JsonIgnore
    public String getSeperator() {
        Object objValue = this._get(DTOFIELD_SEPERATOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeperatorDirty() {
        return this._contains(DTOFIELD_SEPERATOR);
    }

    @JsonIgnore
    public void resetSeperator() {
        this._reset(DTOFIELD_SEPERATOR);
    }

    @JsonIgnore
    public PSCodeListDTO seperator(String seperator) {
        this.setSeperator(seperator);
        return this;
    }

    @JsonProperty(value="sysrefflag")
    public void setSysRefFlag(Integer sysRefFlag) {
        this._set(DTOFIELD_SYSREFFLAG, sysRefFlag);
    }

    @JsonIgnore
    public Integer getSysRefFlag() {
        Object objValue = this._get(DTOFIELD_SYSREFFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSysRefFlagDirty() {
        return this._contains(DTOFIELD_SYSREFFLAG);
    }

    @JsonIgnore
    public void resetSysRefFlag() {
        this._reset(DTOFIELD_SYSREFFLAG);
    }

    @JsonIgnore
    public PSCodeListDTO sysrefflag(Integer sysRefFlag) {
        this.setSysRefFlag(sysRefFlag);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO sysrefflag(Boolean sysRefFlag) {
        if (sysRefFlag == null) {
            this.setSysRefFlag(null);
        } else {
            this.setSysRefFlag(sysRefFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSCodeListDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSCodeListDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    @JsonProperty(value="thresholdgroupflag")
    public void setThresholdGroupFlag(Integer thresholdGroupFlag) {
        this._set(DTOFIELD_THRESHOLDGROUPFLAG, thresholdGroupFlag);
    }

    @JsonIgnore
    public Integer getThresholdGroupFlag() {
        Object objValue = this._get(DTOFIELD_THRESHOLDGROUPFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isThresholdGroupFlagDirty() {
        return this._contains(DTOFIELD_THRESHOLDGROUPFLAG);
    }

    @JsonIgnore
    public void resetThresholdGroupFlag() {
        this._reset(DTOFIELD_THRESHOLDGROUPFLAG);
    }

    @JsonIgnore
    public PSCodeListDTO thresholdgroupflag(Integer thresholdGroupFlag) {
        this.setThresholdGroupFlag(thresholdGroupFlag);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO thresholdgroupflag(Boolean thresholdGroupFlag) {
        if (thresholdGroupFlag == null) {
            this.setThresholdGroupFlag(null);
        } else {
            this.setThresholdGroupFlag(thresholdGroupFlag != false ? 1 : 0);
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
    public PSCodeListDTO updatedate(Timestamp updateDate) {
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
    public PSCodeListDTO updateman(String updateMan) {
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
    public PSCodeListDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSCodeListDTO userdata(String userData) {
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
    public PSCodeListDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSCodeListDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="userrefflag")
    public void setUserRefFlag(Integer userRefFlag) {
        this._set(DTOFIELD_USERREFFLAG, userRefFlag);
    }

    @JsonIgnore
    public Integer getUserRefFlag() {
        Object objValue = this._get(DTOFIELD_USERREFFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserRefFlagDirty() {
        return this._contains(DTOFIELD_USERREFFLAG);
    }

    @JsonIgnore
    public void resetUserRefFlag() {
        this._reset(DTOFIELD_USERREFFLAG);
    }

    @JsonIgnore
    public PSCodeListDTO userrefflag(Integer userRefFlag) {
        this.setUserRefFlag(userRefFlag);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO userrefflag(Boolean userRefFlag) {
        if (userRefFlag == null) {
            this.setUserRefFlag(null);
        } else {
            this.setUserRefFlag(userRefFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="userscope")
    public void setUserScope(Integer userScope) {
        this._set(DTOFIELD_USERSCOPE, userScope);
    }

    @JsonIgnore
    public Integer getUserScope() {
        Object objValue = this._get(DTOFIELD_USERSCOPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserScopeDirty() {
        return this._contains(DTOFIELD_USERSCOPE);
    }

    @JsonIgnore
    public void resetUserScope() {
        this._reset(DTOFIELD_USERSCOPE);
    }

    @JsonIgnore
    public PSCodeListDTO userscope(Integer userScope) {
        this.setUserScope(userScope);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO userscope(Boolean userScope) {
        if (userScope == null) {
            this.setUserScope(null);
        } else {
            this.setUserScope(userScope != false ? 1 : 0);
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
    public PSCodeListDTO usertag(String userTag) {
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
    public PSCodeListDTO usertag2(String userTag2) {
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
    public PSCodeListDTO usertag3(String userTag3) {
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
    public PSCodeListDTO usertag4(String userTag4) {
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
    public PSCodeListDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
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
    public PSCodeListDTO valuepsdefid(String valuePSDEFId) {
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSCodeListDTO valuepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSCodeListDTO valuepsdefname(String valuePSDEFName) {
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonProperty(value="valueseperator")
    public void setValueSeperator(String valueSeperator) {
        this._set(DTOFIELD_VALUESEPERATOR, valueSeperator);
    }

    @JsonIgnore
    public String getValueSeperator() {
        Object objValue = this._get(DTOFIELD_VALUESEPERATOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueSeperatorDirty() {
        return this._contains(DTOFIELD_VALUESEPERATOR);
    }

    @JsonIgnore
    public void resetValueSeperator() {
        this._reset(DTOFIELD_VALUESEPERATOR);
    }

    @JsonIgnore
    public PSCodeListDTO valueseperator(String valueSeperator) {
        this.setValueSeperator(valueSeperator);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSCodeListId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSCodeListId(strValue);
    }

    @JsonIgnore
    public PSCodeListDTO id(String strValue) {
        this.setPSCodeListId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSCodeItemDTO> getPSCodeItems() {
        Object list = this._get(DTOFIELD_PSCODEITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pscodeitems")
    public void setPSCodeItems(List<PSCodeItemDTO> pscodeitems) {
        this._set(DTOFIELD_PSCODEITEMS, pscodeitems);
    }

    @JsonIgnore
    public List<PSCodeItemDTO> getPSCodeItemsIf() {
        Object list = this._get(DTOFIELD_PSCODEITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSCODEITEMS, list);
        }
        return (List) list;
    }
}
