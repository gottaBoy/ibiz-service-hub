package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSystemDTO
extends PSModelDTOBase {
    public static final String FIELD_ACCCTRLARCH = "ACCCTRLARCH";
    protected static final String DTOFIELD_ACCCTRLARCH = "accctrlarch";
    public static final String FIELD_AUTOCALCDERER = "AUTOCALCDERER";
    protected static final String DTOFIELD_AUTOCALCDERER = "autocalcderer";
    public static final String FIELD_BUGFIXS = "BUGFIXS";
    protected static final String DTOFIELD_BUGFIXS = "bugfixs";
    public static final String FIELD_CHECKMODELVER = "CHECKMODELVER";
    protected static final String DTOFIELD_CHECKMODELVER = "checkmodelver";
    public static final String FIELD_CLEMPTYTEXT = "CLEMPTYTEXT";
    protected static final String DTOFIELD_CLEMPTYTEXT = "clemptytext";
    public static final String FIELD_CLEMPTYTEXTPSLANRESID = "CLEMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_CLEMPTYTEXTPSLANRESID = "clemptytextpslanresid";
    public static final String FIELD_CLEMPTYTEXTPSLANRESNAME = "CLEMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_CLEMPTYTEXTPSLANRESNAME = "clemptytextpslanresname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAMEMODE = "CODENAMEMODE";
    protected static final String DTOFIELD_CODENAMEMODE = "codenamemode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLAPPENDDEITEMS = "CTRLAPPENDDEITEMS";
    protected static final String DTOFIELD_CTRLAPPENDDEITEMS = "ctrlappenddeitems";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DBTYPES = "DBTYPES";
    protected static final String DTOFIELD_DBTYPES = "dbtypes";
    public static final String FIELD_DEEXPMAXROWCNT = "DEEXPMAXROWCNT";
    protected static final String DTOFIELD_DEEXPMAXROWCNT = "deexpmaxrowcnt";
    public static final String FIELD_DEFPSSYSDEPLOYID = "DEFPSSYSDEPLOYID";
    protected static final String DTOFIELD_DEFPSSYSDEPLOYID = "defpssysdeployid";
    public static final String FIELD_DEFSFITEMWIDTH = "DEFSFITEMWIDTH";
    protected static final String DTOFIELD_DEFSFITEMWIDTH = "defsfitemwidth";
    public static final String FIELD_DEFSORTMODE = "DEFSORTMODE";
    protected static final String DTOFIELD_DEFSORTMODE = "defsortmode";
    public static final String FIELD_DEMSACTIONLOGICFLAG = "DEMSACTIONLOGICFLAG";
    protected static final String DTOFIELD_DEMSACTIONLOGICFLAG = "demsactionlogicflag";
    public static final String FIELD_DOMAINNAME = "DOMAINNAME";
    protected static final String DTOFIELD_DOMAINNAME = "domainname";
    public static final String FIELD_DTOFORMAT = "DTOFORMAT";
    protected static final String DTOFIELD_DTOFORMAT = "dtoformat";
    public static final String FIELD_ENABLEDBVALUEMODE = "ENABLEDBVALUEMODE";
    protected static final String DTOFIELD_ENABLEDBVALUEMODE = "enabledbvaluemode";
    public static final String FIELD_ENABLEDEDATAVER = "ENABLEDEDATAVER";
    protected static final String DTOFIELD_ENABLEDEDATAVER = "enablededataver";
    public static final String FIELD_ENABLEDEFRESTRICTEDUI = "ENABLEDEFRESTRICTEDUI";
    protected static final String DTOFIELD_ENABLEDEFRESTRICTEDUI = "enabledefrestrictedui";
    public static final String FIELD_ENABLEDERFKEY = "ENABLEDERFKEY";
    protected static final String DTOFIELD_ENABLEDERFKEY = "enablederfkey";
    public static final String FIELD_ENABLEMULTILAN = "ENABLEMULTILAN";
    protected static final String DTOFIELD_ENABLEMULTILAN = "enablemultilan";
    public static final String FIELD_ENABLEOPNAMEMODEL = "ENABLEOPNAMEMODEL";
    protected static final String DTOFIELD_ENABLEOPNAMEMODEL = "enableopnamemodel";
    public static final String FIELD_ENABLEPQL = "ENABLEPQL";
    protected static final String DTOFIELD_ENABLEPQL = "enablepql";
    public static final String FIELD_ENADEFLANRESCONTENT = "ENADEFLANRESCONTENT";
    protected static final String DTOFIELD_ENADEFLANRESCONTENT = "enadeflanrescontent";
    public static final String FIELD_INITDEDEFAULT = "INITDEDEFAULT";
    protected static final String DTOFIELD_INITDEDEFAULT = "initdedefault";
    public static final String FIELD_LANRESMAXTAG = "LANRESMAXTAG";
    protected static final String DTOFIELD_LANRESMAXTAG = "lanresmaxtag";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_LOWCODEMODE = "LOWCODEMODE";
    protected static final String DTOFIELD_LOWCODEMODE = "lowcodemode";
    public static final String FIELD_LOWCODEOPTION = "LOWCODEOPTION";
    protected static final String DTOFIELD_LOWCODEOPTION = "lowcodeoption";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELV2EXPMODE = "MODELV2EXPMODE";
    protected static final String DTOFIELD_MODELV2EXPMODE = "modelv2expmode";
    public static final String FIELD_NOVIEWMODE = "NOVIEWMODE";
    protected static final String DTOFIELD_NOVIEWMODE = "noviewmode";
    public static final String FIELD_PIAUTOSHOWCAPTION = "PIAUTOSHOWCAPTION";
    protected static final String DTOFIELD_PIAUTOSHOWCAPTION = "piautoshowcaption";
    public static final String FIELD_PSLANGUAGEID = "PSLANGUAGEID";
    protected static final String DTOFIELD_PSLANGUAGEID = "pslanguageid";
    public static final String FIELD_PSLANGUAGENAME = "PSLANGUAGENAME";
    protected static final String DTOFIELD_PSLANGUAGENAME = "pslanguagename";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSYSENGINECFGID = "PSSYSENGINECFGID";
    protected static final String DTOFIELD_PSSYSENGINECFGID = "pssysenginecfgid";
    public static final String FIELD_PSSYSENGINECFGNAME = "PSSYSENGINECFGNAME";
    protected static final String DTOFIELD_PSSYSENGINECFGNAME = "pssysenginecfgname";
    public static final String FIELD_PSSYSTEMID = "PSSYSTEMID";
    protected static final String DTOFIELD_PSSYSTEMID = "pssystemid";
    public static final String FIELD_PSSYSTEMNAME = "PSSYSTEMNAME";
    protected static final String DTOFIELD_PSSYSTEMNAME = "pssystemname";
    public static final String FIELD_PUBDBMODELFLAG = "PUBDBMODELFLAG";
    protected static final String DTOFIELD_PUBDBMODELFLAG = "pubdbmodelflag";
    public static final String FIELD_SAASMODE = "SAASMODE";
    protected static final String DTOFIELD_SAASMODE = "saasmode";
    public static final String FIELD_SCRIPTENGINE = "SCRIPTENGINE";
    protected static final String DTOFIELD_SCRIPTENGINE = "scriptengine";
    public static final String FIELD_SERVICEAPIFLAG = "SERVICEAPIFLAG";
    protected static final String DTOFIELD_SERVICEAPIFLAG = "serviceapiflag";
    public static final String FIELD_SIMACTIONLOGICS = "SIMACTIONLOGICS";
    protected static final String DTOFIELD_SIMACTIONLOGICS = "simactionlogics";
    public static final String FIELD_SRCPSSYSTEMID = "SRCPSSYSTEMID";
    protected static final String DTOFIELD_SRCPSSYSTEMID = "srcpssystemid";
    public static final String FIELD_SRCPSSYSTEMNAME = "SRCPSSYSTEMNAME";
    protected static final String DTOFIELD_SRCPSSYSTEMNAME = "srcpssystemname";
    public static final String FIELD_SSDEMSACTIONLOGICFLAG = "SSDEMSACTIONLOGICFLAG";
    protected static final String DTOFIELD_SSDEMSACTIONLOGICFLAG = "ssdemsactionlogicflag";
    public static final String FIELD_SYSFOLDER = "SYSFOLDER";
    protected static final String DTOFIELD_SYSFOLDER = "sysfolder";
    public static final String FIELD_SYSROWKEY = "SYSROWKEY";
    protected static final String DTOFIELD_SYSROWKEY = "sysrowkey";
    public static final String FIELD_SYSVER = "SYSVER";
    protected static final String DTOFIELD_SYSVER = "sysver";
    public static final String FIELD_TAGS = "TAGS";
    protected static final String DTOFIELD_TAGS = "tags";
    public static final String FIELD_TEMPLENGINE = "TEMPLENGINE";
    protected static final String DTOFIELD_TEMPLENGINE = "templengine";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_VIEWUAREGMODE = "VIEWUAREGMODE";
    protected static final String DTOFIELD_VIEWUAREGMODE = "viewuaregmode";

    @JsonProperty(value="accctrlarch")
    public void setAccCtrlArch(Integer accCtrlArch) {
        this._set(DTOFIELD_ACCCTRLARCH, accCtrlArch);
    }

    @JsonIgnore
    public Integer getAccCtrlArch() {
        Object objValue = this._get(DTOFIELD_ACCCTRLARCH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAccCtrlArchDirty() {
        return this._contains(DTOFIELD_ACCCTRLARCH);
    }

    @JsonIgnore
    public void resetAccCtrlArch() {
        this._reset(DTOFIELD_ACCCTRLARCH);
    }

    @JsonIgnore
    public PSSystemDTO accctrlarch(Integer accCtrlArch) {
        this.setAccCtrlArch(accCtrlArch);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO accctrlarch(PSModelEnums.AccCtrlArch accCtrlArch) {
        if (accCtrlArch == null) {
            this.setAccCtrlArch(null);
        } else {
            this.setAccCtrlArch(accCtrlArch.value);
        }
        return this;
    }

    @JsonProperty(value="autocalcderer")
    public void setAutoCalcDERER(Integer autoCalcDERER) {
        this._set(DTOFIELD_AUTOCALCDERER, autoCalcDERER);
    }

    @JsonIgnore
    public Integer getAutoCalcDERER() {
        Object objValue = this._get(DTOFIELD_AUTOCALCDERER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAutoCalcDERERDirty() {
        return this._contains(DTOFIELD_AUTOCALCDERER);
    }

    @JsonIgnore
    public void resetAutoCalcDERER() {
        this._reset(DTOFIELD_AUTOCALCDERER);
    }

    @JsonIgnore
    public PSSystemDTO autocalcderer(Integer autoCalcDERER) {
        this.setAutoCalcDERER(autoCalcDERER);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO autocalcderer(Boolean autoCalcDERER) {
        if (autoCalcDERER == null) {
            this.setAutoCalcDERER(null);
        } else {
            this.setAutoCalcDERER(autoCalcDERER != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="bugfixs")
    public void setBugFixs(Integer bugFixs) {
        this._set(DTOFIELD_BUGFIXS, bugFixs);
    }

    @JsonIgnore
    public Integer getBugFixs() {
        Object objValue = this._get(DTOFIELD_BUGFIXS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBugFixsDirty() {
        return this._contains(DTOFIELD_BUGFIXS);
    }

    @JsonIgnore
    public void resetBugFixs() {
        this._reset(DTOFIELD_BUGFIXS);
    }

    @JsonIgnore
    public PSSystemDTO bugfixs(Integer bugFixs) {
        this.setBugFixs(bugFixs);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO bugfixs(PSModelEnums.EngineBugFix[] bugFixs) {
        if (bugFixs == null || bugFixs.length == 0) {
            this.setBugFixs(null);
        } else {
            int _value = 0;
            for (PSModelEnums.EngineBugFix _item : bugFixs) {
                _value |= _item.value;
            }
            this.setBugFixs(_value);
        }
        return this;
    }

    @JsonProperty(value="checkmodelver")
    public void setCheckModelVer(Integer checkModelVer) {
        this._set(DTOFIELD_CHECKMODELVER, checkModelVer);
    }

    @JsonIgnore
    public Integer getCheckModelVer() {
        Object objValue = this._get(DTOFIELD_CHECKMODELVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckModelVerDirty() {
        return this._contains(DTOFIELD_CHECKMODELVER);
    }

    @JsonIgnore
    public void resetCheckModelVer() {
        this._reset(DTOFIELD_CHECKMODELVER);
    }

    @JsonIgnore
    public PSSystemDTO checkmodelver(Integer checkModelVer) {
        this.setCheckModelVer(checkModelVer);
        return this;
    }

    @JsonProperty(value="clemptytext")
    public void setCLEmptyText(String cLEmptyText) {
        this._set(DTOFIELD_CLEMPTYTEXT, cLEmptyText);
    }

    @JsonIgnore
    public String getCLEmptyText() {
        Object objValue = this._get(DTOFIELD_CLEMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLEmptyTextDirty() {
        return this._contains(DTOFIELD_CLEMPTYTEXT);
    }

    @JsonIgnore
    public void resetCLEmptyText() {
        this._reset(DTOFIELD_CLEMPTYTEXT);
    }

    @JsonIgnore
    public PSSystemDTO clemptytext(String cLEmptyText) {
        this.setCLEmptyText(cLEmptyText);
        return this;
    }

    @JsonProperty(value="clemptytextpslanresid")
    public void setCLEmptyTextPSLanResId(String cLEmptyTextPSLanResId) {
        this._set(DTOFIELD_CLEMPTYTEXTPSLANRESID, cLEmptyTextPSLanResId);
    }

    @JsonIgnore
    public String getCLEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_CLEMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_CLEMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetCLEmptyTextPSLanResId() {
        this._reset(DTOFIELD_CLEMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSSystemDTO clemptytextpslanresid(String cLEmptyTextPSLanResId) {
        this.setCLEmptyTextPSLanResId(cLEmptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO clemptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCLEmptyTextPSLanResId(null);
            this.setCLEmptyTextPSLanResName(null);
        } else {
            this.setCLEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCLEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="clemptytextpslanresname")
    public void setCLEmptyTextPSLanResName(String cLEmptyTextPSLanResName) {
        this._set(DTOFIELD_CLEMPTYTEXTPSLANRESNAME, cLEmptyTextPSLanResName);
    }

    @JsonIgnore
    public String getCLEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_CLEMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_CLEMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCLEmptyTextPSLanResName() {
        this._reset(DTOFIELD_CLEMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSSystemDTO clemptytextpslanresname(String cLEmptyTextPSLanResName) {
        this.setCLEmptyTextPSLanResName(cLEmptyTextPSLanResName);
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
    public PSSystemDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codenamemode")
    public void setCodeNameMode(String codeNameMode) {
        this._set(DTOFIELD_CODENAMEMODE, codeNameMode);
    }

    @JsonIgnore
    public String getCodeNameMode() {
        Object objValue = this._get(DTOFIELD_CODENAMEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameModeDirty() {
        return this._contains(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public void resetCodeNameMode() {
        this._reset(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public PSSystemDTO codenamemode(String codeNameMode) {
        this.setCodeNameMode(codeNameMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO codenamemode(PSModelEnums.CodeNameMode codeNameMode) {
        if (codeNameMode == null) {
            this.setCodeNameMode(null);
        } else {
            this.setCodeNameMode(codeNameMode.value);
        }
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
    public PSSystemDTO createdate(Timestamp createDate) {
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
    public PSSystemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlappenddeitems")
    public void setCtrlAppendDEItems(Integer ctrlAppendDEItems) {
        this._set(DTOFIELD_CTRLAPPENDDEITEMS, ctrlAppendDEItems);
    }

    @JsonIgnore
    public Integer getCtrlAppendDEItems() {
        Object objValue = this._get(DTOFIELD_CTRLAPPENDDEITEMS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlAppendDEItemsDirty() {
        return this._contains(DTOFIELD_CTRLAPPENDDEITEMS);
    }

    @JsonIgnore
    public void resetCtrlAppendDEItems() {
        this._reset(DTOFIELD_CTRLAPPENDDEITEMS);
    }

    @JsonIgnore
    public PSSystemDTO ctrlappenddeitems(Integer ctrlAppendDEItems) {
        this.setCtrlAppendDEItems(ctrlAppendDEItems);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO ctrlappenddeitems(Boolean ctrlAppendDEItems) {
        if (ctrlAppendDEItems == null) {
            this.setCtrlAppendDEItems(null);
        } else {
            this.setCtrlAppendDEItems(ctrlAppendDEItems != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDTO customcode(String customCode) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dbtypes")
    public void setDBTypes(String dBTypes) {
        this._set(DTOFIELD_DBTYPES, dBTypes);
    }

    @JsonIgnore
    public String getDBTypes() {
        Object objValue = this._get(DTOFIELD_DBTYPES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypesDirty() {
        return this._contains(DTOFIELD_DBTYPES);
    }

    @JsonIgnore
    public void resetDBTypes() {
        this._reset(DTOFIELD_DBTYPES);
    }

    @JsonIgnore
    public PSSystemDTO dbtypes(String dBTypes) {
        this.setDBTypes(dBTypes);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO dbtypes(PSModelEnums.DBType[] dBTypes) {
        if (dBTypes == null || dBTypes.length == 0) {
            this.setDBTypes(null);
        } else {
            String _value = "";
            for (PSModelEnums.DBType _item : dBTypes) {
                if (_value.length() > 0) {
                    _value = _value + ";";
                }
                _value = _value + _item.value;
            }
            this.setDBTypes(_value);
        }
        return this;
    }

    @JsonProperty(value="deexpmaxrowcnt")
    public void setDEExpMaxRowCnt(Integer dEExpMaxRowCnt) {
        this._set(DTOFIELD_DEEXPMAXROWCNT, dEExpMaxRowCnt);
    }

    @JsonIgnore
    public Integer getDEExpMaxRowCnt() {
        Object objValue = this._get(DTOFIELD_DEEXPMAXROWCNT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEExpMaxRowCntDirty() {
        return this._contains(DTOFIELD_DEEXPMAXROWCNT);
    }

    @JsonIgnore
    public void resetDEExpMaxRowCnt() {
        this._reset(DTOFIELD_DEEXPMAXROWCNT);
    }

    @JsonIgnore
    public PSSystemDTO deexpmaxrowcnt(Integer dEExpMaxRowCnt) {
        this.setDEExpMaxRowCnt(dEExpMaxRowCnt);
        return this;
    }

    @JsonProperty(value="defpssysdeployid")
    public void setDEFPSSysDeployId(String dEFPSSysDeployId) {
        this._set(DTOFIELD_DEFPSSYSDEPLOYID, dEFPSSysDeployId);
    }

    @JsonIgnore
    public String getDEFPSSysDeployId() {
        Object objValue = this._get(DTOFIELD_DEFPSSYSDEPLOYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFPSSysDeployIdDirty() {
        return this._contains(DTOFIELD_DEFPSSYSDEPLOYID);
    }

    @JsonIgnore
    public void resetDEFPSSysDeployId() {
        this._reset(DTOFIELD_DEFPSSYSDEPLOYID);
    }

    @JsonIgnore
    public PSSystemDTO defpssysdeployid(String dEFPSSysDeployId) {
        this.setDEFPSSysDeployId(dEFPSSysDeployId);
        return this;
    }

    @JsonProperty(value="defsfitemwidth")
    public void setDEFSFItemWidth(Integer dEFSFItemWidth) {
        this._set(DTOFIELD_DEFSFITEMWIDTH, dEFSFItemWidth);
    }

    @JsonIgnore
    public Integer getDEFSFItemWidth() {
        Object objValue = this._get(DTOFIELD_DEFSFITEMWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEFSFItemWidthDirty() {
        return this._contains(DTOFIELD_DEFSFITEMWIDTH);
    }

    @JsonIgnore
    public void resetDEFSFItemWidth() {
        this._reset(DTOFIELD_DEFSFITEMWIDTH);
    }

    @JsonIgnore
    public PSSystemDTO defsfitemwidth(Integer dEFSFItemWidth) {
        this.setDEFSFItemWidth(dEFSFItemWidth);
        return this;
    }

    @JsonProperty(value="defsortmode")
    public void setDEFSortMode(String dEFSortMode) {
        this._set(DTOFIELD_DEFSORTMODE, dEFSortMode);
    }

    @JsonIgnore
    public String getDEFSortMode() {
        Object objValue = this._get(DTOFIELD_DEFSORTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFSortModeDirty() {
        return this._contains(DTOFIELD_DEFSORTMODE);
    }

    @JsonIgnore
    public void resetDEFSortMode() {
        this._reset(DTOFIELD_DEFSORTMODE);
    }

    @JsonIgnore
    public PSSystemDTO defsortmode(String dEFSortMode) {
        this.setDEFSortMode(dEFSortMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO defsortmode(PSModelEnums.DEFSortMode dEFSortMode) {
        if (dEFSortMode == null) {
            this.setDEFSortMode(null);
        } else {
            this.setDEFSortMode(dEFSortMode.value);
        }
        return this;
    }

    @JsonProperty(value="demsactionlogicflag")
    public void setDEMSActionLogicFlag(Integer dEMSActionLogicFlag) {
        this._set(DTOFIELD_DEMSACTIONLOGICFLAG, dEMSActionLogicFlag);
    }

    @JsonIgnore
    public Integer getDEMSActionLogicFlag() {
        Object objValue = this._get(DTOFIELD_DEMSACTIONLOGICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEMSActionLogicFlagDirty() {
        return this._contains(DTOFIELD_DEMSACTIONLOGICFLAG);
    }

    @JsonIgnore
    public void resetDEMSActionLogicFlag() {
        this._reset(DTOFIELD_DEMSACTIONLOGICFLAG);
    }

    @JsonIgnore
    public PSSystemDTO demsactionlogicflag(Integer dEMSActionLogicFlag) {
        this.setDEMSActionLogicFlag(dEMSActionLogicFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO demsactionlogicflag(PSModelEnums.DEMSActionLogicMode dEMSActionLogicFlag) {
        if (dEMSActionLogicFlag == null) {
            this.setDEMSActionLogicFlag(null);
        } else {
            this.setDEMSActionLogicFlag(dEMSActionLogicFlag.value);
        }
        return this;
    }

    @JsonProperty(value="domainname")
    public void setDomainName(String domainName) {
        this._set(DTOFIELD_DOMAINNAME, domainName);
    }

    @JsonIgnore
    public String getDomainName() {
        Object objValue = this._get(DTOFIELD_DOMAINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDomainNameDirty() {
        return this._contains(DTOFIELD_DOMAINNAME);
    }

    @JsonIgnore
    public void resetDomainName() {
        this._reset(DTOFIELD_DOMAINNAME);
    }

    @JsonIgnore
    public PSSystemDTO domainname(String domainName) {
        this.setDomainName(domainName);
        return this;
    }

    @JsonProperty(value="dtoformat")
    public void setDTOFormat(String dTOFormat) {
        this._set(DTOFIELD_DTOFORMAT, dTOFormat);
    }

    @JsonIgnore
    public String getDTOFormat() {
        Object objValue = this._get(DTOFIELD_DTOFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDTOFormatDirty() {
        return this._contains(DTOFIELD_DTOFORMAT);
    }

    @JsonIgnore
    public void resetDTOFormat() {
        this._reset(DTOFIELD_DTOFORMAT);
    }

    @JsonIgnore
    public PSSystemDTO dtoformat(String dTOFormat) {
        this.setDTOFormat(dTOFormat);
        return this;
    }

    @JsonProperty(value="enabledbvaluemode")
    public void setEnableDBValueMode(Integer enableDBValueMode) {
        this._set(DTOFIELD_ENABLEDBVALUEMODE, enableDBValueMode);
    }

    @JsonIgnore
    public Integer getEnableDBValueMode() {
        Object objValue = this._get(DTOFIELD_ENABLEDBVALUEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDBValueModeDirty() {
        return this._contains(DTOFIELD_ENABLEDBVALUEMODE);
    }

    @JsonIgnore
    public void resetEnableDBValueMode() {
        this._reset(DTOFIELD_ENABLEDBVALUEMODE);
    }

    @JsonIgnore
    public PSSystemDTO enabledbvaluemode(Integer enableDBValueMode) {
        this.setEnableDBValueMode(enableDBValueMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enabledbvaluemode(Boolean enableDBValueMode) {
        if (enableDBValueMode == null) {
            this.setEnableDBValueMode(null);
        } else {
            this.setEnableDBValueMode(enableDBValueMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablededataver")
    public void setEnableDEDataVer(Integer enableDEDataVer) {
        this._set(DTOFIELD_ENABLEDEDATAVER, enableDEDataVer);
    }

    @JsonIgnore
    public Integer getEnableDEDataVer() {
        Object objValue = this._get(DTOFIELD_ENABLEDEDATAVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDEDataVerDirty() {
        return this._contains(DTOFIELD_ENABLEDEDATAVER);
    }

    @JsonIgnore
    public void resetEnableDEDataVer() {
        this._reset(DTOFIELD_ENABLEDEDATAVER);
    }

    @JsonIgnore
    public PSSystemDTO enablededataver(Integer enableDEDataVer) {
        this.setEnableDEDataVer(enableDEDataVer);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enablededataver(Boolean enableDEDataVer) {
        if (enableDEDataVer == null) {
            this.setEnableDEDataVer(null);
        } else {
            this.setEnableDEDataVer(enableDEDataVer != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabledefrestrictedui")
    public void setEnableDEFRestrictedUI(Integer enableDEFRestrictedUI) {
        this._set(DTOFIELD_ENABLEDEFRESTRICTEDUI, enableDEFRestrictedUI);
    }

    @JsonIgnore
    public Integer getEnableDEFRestrictedUI() {
        Object objValue = this._get(DTOFIELD_ENABLEDEFRESTRICTEDUI);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDEFRestrictedUIDirty() {
        return this._contains(DTOFIELD_ENABLEDEFRESTRICTEDUI);
    }

    @JsonIgnore
    public void resetEnableDEFRestrictedUI() {
        this._reset(DTOFIELD_ENABLEDEFRESTRICTEDUI);
    }

    @JsonIgnore
    public PSSystemDTO enabledefrestrictedui(Integer enableDEFRestrictedUI) {
        this.setEnableDEFRestrictedUI(enableDEFRestrictedUI);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enabledefrestrictedui(Boolean enableDEFRestrictedUI) {
        if (enableDEFRestrictedUI == null) {
            this.setEnableDEFRestrictedUI(null);
        } else {
            this.setEnableDEFRestrictedUI(enableDEFRestrictedUI != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablederfkey")
    public void setEnableDERFKey(Integer enableDERFKey) {
        this._set(DTOFIELD_ENABLEDERFKEY, enableDERFKey);
    }

    @JsonIgnore
    public Integer getEnableDERFKey() {
        Object objValue = this._get(DTOFIELD_ENABLEDERFKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDERFKeyDirty() {
        return this._contains(DTOFIELD_ENABLEDERFKEY);
    }

    @JsonIgnore
    public void resetEnableDERFKey() {
        this._reset(DTOFIELD_ENABLEDERFKEY);
    }

    @JsonIgnore
    public PSSystemDTO enablederfkey(Integer enableDERFKey) {
        this.setEnableDERFKey(enableDERFKey);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enablederfkey(Boolean enableDERFKey) {
        if (enableDERFKey == null) {
            this.setEnableDERFKey(null);
        } else {
            this.setEnableDERFKey(enableDERFKey != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablemultilan")
    public void setEnableMultiLan(Integer enableMultiLan) {
        this._set(DTOFIELD_ENABLEMULTILAN, enableMultiLan);
    }

    @JsonIgnore
    public Integer getEnableMultiLan() {
        Object objValue = this._get(DTOFIELD_ENABLEMULTILAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableMultiLanDirty() {
        return this._contains(DTOFIELD_ENABLEMULTILAN);
    }

    @JsonIgnore
    public void resetEnableMultiLan() {
        this._reset(DTOFIELD_ENABLEMULTILAN);
    }

    @JsonIgnore
    public PSSystemDTO enablemultilan(Integer enableMultiLan) {
        this.setEnableMultiLan(enableMultiLan);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enablemultilan(Boolean enableMultiLan) {
        if (enableMultiLan == null) {
            this.setEnableMultiLan(null);
        } else {
            this.setEnableMultiLan(enableMultiLan != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableopnamemodel")
    public void setEnableOPNameModel(Integer enableOPNameModel) {
        this._set(DTOFIELD_ENABLEOPNAMEMODEL, enableOPNameModel);
    }

    @JsonIgnore
    public Integer getEnableOPNameModel() {
        Object objValue = this._get(DTOFIELD_ENABLEOPNAMEMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableOPNameModelDirty() {
        return this._contains(DTOFIELD_ENABLEOPNAMEMODEL);
    }

    @JsonIgnore
    public void resetEnableOPNameModel() {
        this._reset(DTOFIELD_ENABLEOPNAMEMODEL);
    }

    @JsonIgnore
    public PSSystemDTO enableopnamemodel(Integer enableOPNameModel) {
        this.setEnableOPNameModel(enableOPNameModel);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enableopnamemodel(Boolean enableOPNameModel) {
        if (enableOPNameModel == null) {
            this.setEnableOPNameModel(null);
        } else {
            this.setEnableOPNameModel(enableOPNameModel != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablepql")
    public void setEnablePQL(Integer enablePQL) {
        this._set(DTOFIELD_ENABLEPQL, enablePQL);
    }

    @JsonIgnore
    public Integer getEnablePQL() {
        Object objValue = this._get(DTOFIELD_ENABLEPQL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePQLDirty() {
        return this._contains(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public void resetEnablePQL() {
        this._reset(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public PSSystemDTO enablepql(Integer enablePQL) {
        this.setEnablePQL(enablePQL);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enablepql(Boolean enablePQL) {
        if (enablePQL == null) {
            this.setEnablePQL(null);
        } else {
            this.setEnablePQL(enablePQL != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enadeflanrescontent")
    public void setEnaDefLanResContent(Integer enaDefLanResContent) {
        this._set(DTOFIELD_ENADEFLANRESCONTENT, enaDefLanResContent);
    }

    @JsonIgnore
    public Integer getEnaDefLanResContent() {
        Object objValue = this._get(DTOFIELD_ENADEFLANRESCONTENT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnaDefLanResContentDirty() {
        return this._contains(DTOFIELD_ENADEFLANRESCONTENT);
    }

    @JsonIgnore
    public void resetEnaDefLanResContent() {
        this._reset(DTOFIELD_ENADEFLANRESCONTENT);
    }

    @JsonIgnore
    public PSSystemDTO enadeflanrescontent(Integer enaDefLanResContent) {
        this.setEnaDefLanResContent(enaDefLanResContent);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO enadeflanrescontent(Boolean enaDefLanResContent) {
        if (enaDefLanResContent == null) {
            this.setEnaDefLanResContent(null);
        } else {
            this.setEnaDefLanResContent(enaDefLanResContent != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="initdedefault")
    public void setInitDEDefault(Integer initDEDefault) {
        this._set(DTOFIELD_INITDEDEFAULT, initDEDefault);
    }

    @JsonIgnore
    public Integer getInitDEDefault() {
        Object objValue = this._get(DTOFIELD_INITDEDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInitDEDefaultDirty() {
        return this._contains(DTOFIELD_INITDEDEFAULT);
    }

    @JsonIgnore
    public void resetInitDEDefault() {
        this._reset(DTOFIELD_INITDEDEFAULT);
    }

    @JsonIgnore
    public PSSystemDTO initdedefault(Integer initDEDefault) {
        this.setInitDEDefault(initDEDefault);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO initdedefault(Boolean initDEDefault) {
        if (initDEDefault == null) {
            this.setInitDEDefault(null);
        } else {
            this.setInitDEDefault(initDEDefault != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="lanresmaxtag")
    public void setLanResMaxTag(Integer lanResMaxTag) {
        this._set(DTOFIELD_LANRESMAXTAG, lanResMaxTag);
    }

    @JsonIgnore
    public Integer getLanResMaxTag() {
        Object objValue = this._get(DTOFIELD_LANRESMAXTAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLanResMaxTagDirty() {
        return this._contains(DTOFIELD_LANRESMAXTAG);
    }

    @JsonIgnore
    public void resetLanResMaxTag() {
        this._reset(DTOFIELD_LANRESMAXTAG);
    }

    @JsonIgnore
    public PSSystemDTO lanresmaxtag(Integer lanResMaxTag) {
        this.setLanResMaxTag(lanResMaxTag);
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
    public PSSystemDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="lowcodemode")
    public void setLowCodeMode(Integer lowCodeMode) {
        this._set(DTOFIELD_LOWCODEMODE, lowCodeMode);
    }

    @JsonIgnore
    public Integer getLowCodeMode() {
        Object objValue = this._get(DTOFIELD_LOWCODEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLowCodeModeDirty() {
        return this._contains(DTOFIELD_LOWCODEMODE);
    }

    @JsonIgnore
    public void resetLowCodeMode() {
        this._reset(DTOFIELD_LOWCODEMODE);
    }

    @JsonIgnore
    public PSSystemDTO lowcodemode(Integer lowCodeMode) {
        this.setLowCodeMode(lowCodeMode);
        return this;
    }

    @JsonProperty(value="lowcodeoption")
    public void setLowCodeOption(String lowCodeOption) {
        this._set(DTOFIELD_LOWCODEOPTION, lowCodeOption);
    }

    @JsonIgnore
    public String getLowCodeOption() {
        Object objValue = this._get(DTOFIELD_LOWCODEOPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLowCodeOptionDirty() {
        return this._contains(DTOFIELD_LOWCODEOPTION);
    }

    @JsonIgnore
    public void resetLowCodeOption() {
        this._reset(DTOFIELD_LOWCODEOPTION);
    }

    @JsonIgnore
    public PSSystemDTO lowcodeoption(String lowCodeOption) {
        this.setLowCodeOption(lowCodeOption);
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
    public PSSystemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelv2expmode")
    public void setModelV2ExpMode(Integer modelV2ExpMode) {
        this._set(DTOFIELD_MODELV2EXPMODE, modelV2ExpMode);
    }

    @JsonIgnore
    public Integer getModelV2ExpMode() {
        Object objValue = this._get(DTOFIELD_MODELV2EXPMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelV2ExpModeDirty() {
        return this._contains(DTOFIELD_MODELV2EXPMODE);
    }

    @JsonIgnore
    public void resetModelV2ExpMode() {
        this._reset(DTOFIELD_MODELV2EXPMODE);
    }

    @JsonIgnore
    public PSSystemDTO modelv2expmode(Integer modelV2ExpMode) {
        this.setModelV2ExpMode(modelV2ExpMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO modelv2expmode(PSModelEnums.ModelV2ExpMode[] modelV2ExpMode) {
        if (modelV2ExpMode == null || modelV2ExpMode.length == 0) {
            this.setModelV2ExpMode(null);
        } else {
            int _value = 0;
            for (PSModelEnums.ModelV2ExpMode _item : modelV2ExpMode) {
                _value |= _item.value;
            }
            this.setModelV2ExpMode(_value);
        }
        return this;
    }

    @JsonProperty(value="noviewmode")
    public void setNoViewMode(Integer noViewMode) {
        this._set(DTOFIELD_NOVIEWMODE, noViewMode);
    }

    @JsonIgnore
    public Integer getNoViewMode() {
        Object objValue = this._get(DTOFIELD_NOVIEWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoViewModeDirty() {
        return this._contains(DTOFIELD_NOVIEWMODE);
    }

    @JsonIgnore
    public void resetNoViewMode() {
        this._reset(DTOFIELD_NOVIEWMODE);
    }

    @JsonIgnore
    public PSSystemDTO noviewmode(Integer noViewMode) {
        this.setNoViewMode(noViewMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO noviewmode(Boolean noViewMode) {
        if (noViewMode == null) {
            this.setNoViewMode(null);
        } else {
            this.setNoViewMode(noViewMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="piautoshowcaption")
    public void setPIAutoShowCaption(Integer pIAutoShowCaption) {
        this._set(DTOFIELD_PIAUTOSHOWCAPTION, pIAutoShowCaption);
    }

    @JsonIgnore
    public Integer getPIAutoShowCaption() {
        Object objValue = this._get(DTOFIELD_PIAUTOSHOWCAPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPIAutoShowCaptionDirty() {
        return this._contains(DTOFIELD_PIAUTOSHOWCAPTION);
    }

    @JsonIgnore
    public void resetPIAutoShowCaption() {
        this._reset(DTOFIELD_PIAUTOSHOWCAPTION);
    }

    @JsonIgnore
    public PSSystemDTO piautoshowcaption(Integer pIAutoShowCaption) {
        this.setPIAutoShowCaption(pIAutoShowCaption);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO piautoshowcaption(Boolean pIAutoShowCaption) {
        if (pIAutoShowCaption == null) {
            this.setPIAutoShowCaption(null);
        } else {
            this.setPIAutoShowCaption(pIAutoShowCaption != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pslanguageid")
    public void setPSLanguageId(String pSLanguageId) {
        this._set(DTOFIELD_PSLANGUAGEID, pSLanguageId);
    }

    @JsonIgnore
    public String getPSLanguageId() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageIdDirty() {
        return this._contains(DTOFIELD_PSLANGUAGEID);
    }

    @JsonIgnore
    public void resetPSLanguageId() {
        this._reset(DTOFIELD_PSLANGUAGEID);
    }

    @JsonIgnore
    public PSSystemDTO pslanguageid(String pSLanguageId) {
        this.setPSLanguageId(pSLanguageId);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO pslanguageid(PSLanguageDTO pSLanguage) {
        if (pSLanguage == null) {
            this.setPSLanguageId(null);
            this.setPSLanguageName(null);
        } else {
            this.setPSLanguageId(pSLanguage.getPSLanguageId());
            this.setPSLanguageName(pSLanguage.getPSLanguageName());
        }
        return this;
    }

    @JsonProperty(value="pslanguagename")
    public void setPSLanguageName(String pSLanguageName) {
        this._set(DTOFIELD_PSLANGUAGENAME, pSLanguageName);
    }

    @JsonIgnore
    public String getPSLanguageName() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageNameDirty() {
        return this._contains(DTOFIELD_PSLANGUAGENAME);
    }

    @JsonIgnore
    public void resetPSLanguageName() {
        this._reset(DTOFIELD_PSLANGUAGENAME);
    }

    @JsonIgnore
    public PSSystemDTO pslanguagename(String pSLanguageName) {
        this.setPSLanguageName(pSLanguageName);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSSystemDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO pssfid(PSSFDTO pSSF) {
        if (pSSF == null) {
            this.setPSSFId(null);
            this.setPSSFName(null);
        } else {
            this.setPSSFId(pSSF.getPSSFId());
            this.setPSSFName(pSSF.getPSSFName());
        }
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFNameDirty() {
        return this._contains(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public void resetPSSFName() {
        this._reset(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public PSSystemDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonProperty(value="pssysenginecfgid")
    public void setPSSysEngineCfgId(String pSSysEngineCfgId) {
        this._set(DTOFIELD_PSSYSENGINECFGID, pSSysEngineCfgId);
    }

    @JsonIgnore
    public String getPSSysEngineCfgId() {
        Object objValue = this._get(DTOFIELD_PSSYSENGINECFGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEngineCfgIdDirty() {
        return this._contains(DTOFIELD_PSSYSENGINECFGID);
    }

    @JsonIgnore
    public void resetPSSysEngineCfgId() {
        this._reset(DTOFIELD_PSSYSENGINECFGID);
    }

    @JsonIgnore
    public PSSystemDTO pssysenginecfgid(String pSSysEngineCfgId) {
        this.setPSSysEngineCfgId(pSSysEngineCfgId);
        return this;
    }

    @JsonProperty(value="pssysenginecfgname")
    public void setPSSysEngineCfgName(String pSSysEngineCfgName) {
        this._set(DTOFIELD_PSSYSENGINECFGNAME, pSSysEngineCfgName);
    }

    @JsonIgnore
    public String getPSSysEngineCfgName() {
        Object objValue = this._get(DTOFIELD_PSSYSENGINECFGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEngineCfgNameDirty() {
        return this._contains(DTOFIELD_PSSYSENGINECFGNAME);
    }

    @JsonIgnore
    public void resetPSSysEngineCfgName() {
        this._reset(DTOFIELD_PSSYSENGINECFGNAME);
    }

    @JsonIgnore
    public PSSystemDTO pssysenginecfgname(String pSSysEngineCfgName) {
        this.setPSSysEngineCfgName(pSSysEngineCfgName);
        return this;
    }

    @Override
    @JsonProperty(value="pssystemid")
    public void setPSSystemId(String pSSystemId) {
        this._set(DTOFIELD_PSSYSTEMID, pSSystemId);
    }

    @Override
    @JsonIgnore
    public String getPSSystemId() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @Override
    @JsonIgnore
    public boolean isPSSystemIdDirty() {
        return this._contains(DTOFIELD_PSSYSTEMID);
    }

    @Override
    @JsonIgnore
    public void resetPSSystemId() {
        this._reset(DTOFIELD_PSSYSTEMID);
    }

    @JsonIgnore
    public PSSystemDTO pssystemid(String pSSystemId) {
        this.setPSSystemId(pSSystemId);
        return this;
    }

    @Override
    @JsonProperty(value="pssystemname")
    public void setPSSystemName(String pSSystemName) {
        this._set(DTOFIELD_PSSYSTEMNAME, pSSystemName);
    }

    @Override
    @JsonIgnore
    public String getPSSystemName() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @Override
    @JsonIgnore
    public boolean isPSSystemNameDirty() {
        return this._contains(DTOFIELD_PSSYSTEMNAME);
    }

    @Override
    @JsonIgnore
    public void resetPSSystemName() {
        this._reset(DTOFIELD_PSSYSTEMNAME);
    }

    @JsonIgnore
    public PSSystemDTO pssystemname(String pSSystemName) {
        this.setPSSystemName(pSSystemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSystemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSystemName(strName);
    }

    @JsonIgnore
    public PSSystemDTO name(String strName) {
        this.setPSSystemName(strName);
        return this;
    }

    @JsonProperty(value="pubdbmodelflag")
    public void setPubDBModelFlag(Integer pubDBModelFlag) {
        this._set(DTOFIELD_PUBDBMODELFLAG, pubDBModelFlag);
    }

    @JsonIgnore
    public Integer getPubDBModelFlag() {
        Object objValue = this._get(DTOFIELD_PUBDBMODELFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubDBModelFlagDirty() {
        return this._contains(DTOFIELD_PUBDBMODELFLAG);
    }

    @JsonIgnore
    public void resetPubDBModelFlag() {
        this._reset(DTOFIELD_PUBDBMODELFLAG);
    }

    @JsonIgnore
    public PSSystemDTO pubdbmodelflag(Integer pubDBModelFlag) {
        this.setPubDBModelFlag(pubDBModelFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO pubdbmodelflag(Boolean pubDBModelFlag) {
        if (pubDBModelFlag == null) {
            this.setPubDBModelFlag(null);
        } else {
            this.setPubDBModelFlag(pubDBModelFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="saasmode")
    public void setSaaSMode(Integer saaSMode) {
        this._set(DTOFIELD_SAASMODE, saaSMode);
    }

    @JsonIgnore
    public Integer getSaaSMode() {
        Object objValue = this._get(DTOFIELD_SAASMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSaaSModeDirty() {
        return this._contains(DTOFIELD_SAASMODE);
    }

    @JsonIgnore
    public void resetSaaSMode() {
        this._reset(DTOFIELD_SAASMODE);
    }

    @JsonIgnore
    public PSSystemDTO saasmode(Integer saaSMode) {
        this.setSaaSMode(saaSMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO saasmode(PSModelEnums.DESaaSMode saaSMode) {
        if (saaSMode == null) {
            this.setSaaSMode(null);
        } else {
            this.setSaaSMode(saaSMode.value);
        }
        return this;
    }

    @JsonProperty(value="scriptengine")
    public void setScriptEngine(String scriptEngine) {
        this._set(DTOFIELD_SCRIPTENGINE, scriptEngine);
    }

    @JsonIgnore
    public String getScriptEngine() {
        Object objValue = this._get(DTOFIELD_SCRIPTENGINE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isScriptEngineDirty() {
        return this._contains(DTOFIELD_SCRIPTENGINE);
    }

    @JsonIgnore
    public void resetScriptEngine() {
        this._reset(DTOFIELD_SCRIPTENGINE);
    }

    @JsonIgnore
    public PSSystemDTO scriptengine(String scriptEngine) {
        this.setScriptEngine(scriptEngine);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO scriptengine(PSModelEnums.ScriptEngine scriptEngine) {
        if (scriptEngine == null) {
            this.setScriptEngine(null);
        } else {
            this.setScriptEngine(scriptEngine.value);
        }
        return this;
    }

    @JsonProperty(value="serviceapiflag")
    public void setServiceAPIFlag(Integer serviceAPIFlag) {
        this._set(DTOFIELD_SERVICEAPIFLAG, serviceAPIFlag);
    }

    @JsonIgnore
    public Integer getServiceAPIFlag() {
        Object objValue = this._get(DTOFIELD_SERVICEAPIFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isServiceAPIFlagDirty() {
        return this._contains(DTOFIELD_SERVICEAPIFLAG);
    }

    @JsonIgnore
    public void resetServiceAPIFlag() {
        this._reset(DTOFIELD_SERVICEAPIFLAG);
    }

    @JsonIgnore
    public PSSystemDTO serviceapiflag(Integer serviceAPIFlag) {
        this.setServiceAPIFlag(serviceAPIFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO serviceapiflag(PSModelEnums.DEServiceAPIMode serviceAPIFlag) {
        if (serviceAPIFlag == null) {
            this.setServiceAPIFlag(null);
        } else {
            this.setServiceAPIFlag(serviceAPIFlag.value);
        }
        return this;
    }

    @JsonProperty(value="simactionlogics")
    public void setSimActionLogics(Integer simActionLogics) {
        this._set(DTOFIELD_SIMACTIONLOGICS, simActionLogics);
    }

    @JsonIgnore
    public Integer getSimActionLogics() {
        Object objValue = this._get(DTOFIELD_SIMACTIONLOGICS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSimActionLogicsDirty() {
        return this._contains(DTOFIELD_SIMACTIONLOGICS);
    }

    @JsonIgnore
    public void resetSimActionLogics() {
        this._reset(DTOFIELD_SIMACTIONLOGICS);
    }

    @JsonIgnore
    public PSSystemDTO simactionlogics(Integer simActionLogics) {
        this.setSimActionLogics(simActionLogics);
        return this;
    }

    @JsonProperty(value="srcpssystemid")
    public void setSrcPSSystemId(String srcPSSystemId) {
        this._set(DTOFIELD_SRCPSSYSTEMID, srcPSSystemId);
    }

    @JsonIgnore
    public String getSrcPSSystemId() {
        Object objValue = this._get(DTOFIELD_SRCPSSYSTEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSSystemIdDirty() {
        return this._contains(DTOFIELD_SRCPSSYSTEMID);
    }

    @JsonIgnore
    public void resetSrcPSSystemId() {
        this._reset(DTOFIELD_SRCPSSYSTEMID);
    }

    @JsonIgnore
    public PSSystemDTO srcpssystemid(String srcPSSystemId) {
        this.setSrcPSSystemId(srcPSSystemId);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO srcpssystemid(PSSystemDTO pSSystem) {
        if (pSSystem == null) {
            this.setSrcPSSystemId(null);
            this.setSrcPSSystemName(null);
        } else {
            this.setSrcPSSystemId(pSSystem.getPSSystemId());
            this.setSrcPSSystemName(pSSystem.getPSSystemName());
        }
        return this;
    }

    @JsonProperty(value="srcpssystemname")
    public void setSrcPSSystemName(String srcPSSystemName) {
        this._set(DTOFIELD_SRCPSSYSTEMNAME, srcPSSystemName);
    }

    @JsonIgnore
    public String getSrcPSSystemName() {
        Object objValue = this._get(DTOFIELD_SRCPSSYSTEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSSystemNameDirty() {
        return this._contains(DTOFIELD_SRCPSSYSTEMNAME);
    }

    @JsonIgnore
    public void resetSrcPSSystemName() {
        this._reset(DTOFIELD_SRCPSSYSTEMNAME);
    }

    @JsonIgnore
    public PSSystemDTO srcpssystemname(String srcPSSystemName) {
        this.setSrcPSSystemName(srcPSSystemName);
        return this;
    }

    @JsonProperty(value="ssdemsactionlogicflag")
    public void setSSDEMSActionLogicFlag(Integer sSDEMSActionLogicFlag) {
        this._set(DTOFIELD_SSDEMSACTIONLOGICFLAG, sSDEMSActionLogicFlag);
    }

    @JsonIgnore
    public Integer getSSDEMSActionLogicFlag() {
        Object objValue = this._get(DTOFIELD_SSDEMSACTIONLOGICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSSDEMSActionLogicFlagDirty() {
        return this._contains(DTOFIELD_SSDEMSACTIONLOGICFLAG);
    }

    @JsonIgnore
    public void resetSSDEMSActionLogicFlag() {
        this._reset(DTOFIELD_SSDEMSACTIONLOGICFLAG);
    }

    @JsonIgnore
    public PSSystemDTO ssdemsactionlogicflag(Integer sSDEMSActionLogicFlag) {
        this.setSSDEMSActionLogicFlag(sSDEMSActionLogicFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO ssdemsactionlogicflag(PSModelEnums.DEMSActionLogicMode sSDEMSActionLogicFlag) {
        if (sSDEMSActionLogicFlag == null) {
            this.setSSDEMSActionLogicFlag(null);
        } else {
            this.setSSDEMSActionLogicFlag(sSDEMSActionLogicFlag.value);
        }
        return this;
    }

    @JsonProperty(value="sysfolder")
    public void setSysFolder(String sysFolder) {
        this._set(DTOFIELD_SYSFOLDER, sysFolder);
    }

    @JsonIgnore
    public String getSysFolder() {
        Object objValue = this._get(DTOFIELD_SYSFOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysFolderDirty() {
        return this._contains(DTOFIELD_SYSFOLDER);
    }

    @JsonIgnore
    public void resetSysFolder() {
        this._reset(DTOFIELD_SYSFOLDER);
    }

    @JsonIgnore
    public PSSystemDTO sysfolder(String sysFolder) {
        this.setSysFolder(sysFolder);
        return this;
    }

    @JsonProperty(value="sysrowkey")
    public void setSysRowKey(String sysRowKey) {
        this._set(DTOFIELD_SYSROWKEY, sysRowKey);
    }

    @JsonIgnore
    public String getSysRowKey() {
        Object objValue = this._get(DTOFIELD_SYSROWKEY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysRowKeyDirty() {
        return this._contains(DTOFIELD_SYSROWKEY);
    }

    @JsonIgnore
    public void resetSysRowKey() {
        this._reset(DTOFIELD_SYSROWKEY);
    }

    @JsonIgnore
    public PSSystemDTO sysrowkey(String sysRowKey) {
        this.setSysRowKey(sysRowKey);
        return this;
    }

    @JsonProperty(value="sysver")
    public void setSysVer(String sysVer) {
        this._set(DTOFIELD_SYSVER, sysVer);
    }

    @JsonIgnore
    public String getSysVer() {
        Object objValue = this._get(DTOFIELD_SYSVER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysVerDirty() {
        return this._contains(DTOFIELD_SYSVER);
    }

    @JsonIgnore
    public void resetSysVer() {
        this._reset(DTOFIELD_SYSVER);
    }

    @JsonIgnore
    public PSSystemDTO sysver(String sysVer) {
        this.setSysVer(sysVer);
        return this;
    }

    @JsonProperty(value="tags")
    public void setTags(String tags) {
        this._set(DTOFIELD_TAGS, tags);
    }

    @JsonIgnore
    public String getTags() {
        Object objValue = this._get(DTOFIELD_TAGS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagsDirty() {
        return this._contains(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public void resetTags() {
        this._reset(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public PSSystemDTO tags(String tags) {
        this.setTags(tags);
        return this;
    }

    @JsonProperty(value="templengine")
    public void setTemplEngine(String templEngine) {
        this._set(DTOFIELD_TEMPLENGINE, templEngine);
    }

    @JsonIgnore
    public String getTemplEngine() {
        Object objValue = this._get(DTOFIELD_TEMPLENGINE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplEngineDirty() {
        return this._contains(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public void resetTemplEngine() {
        this._reset(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public PSSystemDTO templengine(String templEngine) {
        this.setTemplEngine(templEngine);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO templengine(PSModelEnums.PSTemplEngine templEngine) {
        if (templEngine == null) {
            this.setTemplEngine(null);
        } else {
            this.setTemplEngine(templEngine.value);
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
    public PSSystemDTO updatedate(Timestamp updateDate) {
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
    public PSSystemDTO updateman(String updateMan) {
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
    public PSSystemDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="viewuaregmode")
    public void setViewUARegMode(Integer viewUARegMode) {
        this._set(DTOFIELD_VIEWUAREGMODE, viewUARegMode);
    }

    @JsonIgnore
    public Integer getViewUARegMode() {
        Object objValue = this._get(DTOFIELD_VIEWUAREGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewUARegModeDirty() {
        return this._contains(DTOFIELD_VIEWUAREGMODE);
    }

    @JsonIgnore
    public void resetViewUARegMode() {
        this._reset(DTOFIELD_VIEWUAREGMODE);
    }

    @JsonIgnore
    public PSSystemDTO viewuaregmode(Integer viewUARegMode) {
        this.setViewUARegMode(viewUARegMode);
        return this;
    }

    @JsonIgnore
    public PSSystemDTO viewuaregmode(PSModelEnums.ViewUARegMode viewUARegMode) {
        if (viewUARegMode == null) {
            this.setViewUARegMode(null);
        } else {
            this.setViewUARegMode(viewUARegMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSystemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSystemId(strValue);
    }

    @JsonIgnore
    public PSSystemDTO id(String strValue) {
        this.setPSSystemId(strValue);
        return this;
    }
}
