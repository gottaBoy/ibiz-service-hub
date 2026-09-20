package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSFDTO
extends PSModelDTOBase {
    public static final String FIELD_CLSFCUPPERCASE = "CLSFCUPPERCASE";
    protected static final String DTOFIELD_CLSFCUPPERCASE = "clsfcuppercase";
    public static final String FIELD_CLSPKGPARAMS = "CLSPKGPARAMS";
    protected static final String DTOFIELD_CLSPKGPARAMS = "clspkgparams";
    public static final String FIELD_CODEFLAG = "CODEFLAG";
    protected static final String DTOFIELD_CODEFLAG = "codeflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DOCFLAG = "DOCFLAG";
    protected static final String DTOFIELD_DOCFLAG = "docflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELFLAG = "MODELFLAG";
    protected static final String DTOFIELD_MODELFLAG = "modelflag";
    public static final String FIELD_PKGLOWERCASE = "PKGLOWERCASE";
    protected static final String DTOFIELD_PKGLOWERCASE = "pkglowercase";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_SLNFLAG = "SLNFLAG";
    protected static final String DTOFIELD_SLNFLAG = "slnflag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_V2FOLDER = "V2FOLDER";
    protected static final String DTOFIELD_V2FOLDER = "v2folder";
    public static final String FIELD_V2GITPATH = "V2GITPATH";
    protected static final String DTOFIELD_V2GITPATH = "v2gitpath";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="clsfcuppercase")
    public void setClsFCUpperCase(Integer clsFCUpperCase) {
        this._set(DTOFIELD_CLSFCUPPERCASE, clsFCUpperCase);
    }

    @JsonIgnore
    public Integer getClsFCUpperCase() {
        Object objValue = this._get(DTOFIELD_CLSFCUPPERCASE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isClsFCUpperCaseDirty() {
        return this._contains(DTOFIELD_CLSFCUPPERCASE);
    }

    @JsonIgnore
    public void resetClsFCUpperCase() {
        this._reset(DTOFIELD_CLSFCUPPERCASE);
    }

    @JsonIgnore
    public PSSFDTO clsfcuppercase(Integer clsFCUpperCase) {
        this.setClsFCUpperCase(clsFCUpperCase);
        return this;
    }

    @JsonIgnore
    public PSSFDTO clsfcuppercase(Boolean clsFCUpperCase) {
        if (clsFCUpperCase == null) {
            this.setClsFCUpperCase(null);
        } else {
            this.setClsFCUpperCase(clsFCUpperCase != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="clspkgparams")
    public void setClsPkgParams(String clsPkgParams) {
        this._set(DTOFIELD_CLSPKGPARAMS, clsPkgParams);
    }

    @JsonIgnore
    public String getClsPkgParams() {
        Object objValue = this._get(DTOFIELD_CLSPKGPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPkgParamsDirty() {
        return this._contains(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public void resetClsPkgParams() {
        this._reset(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public PSSFDTO clspkgparams(String clsPkgParams) {
        this.setClsPkgParams(clsPkgParams);
        return this;
    }

    @JsonProperty(value="codeflag")
    public void setCodeFlag(Integer codeFlag) {
        this._set(DTOFIELD_CODEFLAG, codeFlag);
    }

    @JsonIgnore
    public Integer getCodeFlag() {
        Object objValue = this._get(DTOFIELD_CODEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCodeFlagDirty() {
        return this._contains(DTOFIELD_CODEFLAG);
    }

    @JsonIgnore
    public void resetCodeFlag() {
        this._reset(DTOFIELD_CODEFLAG);
    }

    @JsonIgnore
    public PSSFDTO codeflag(Integer codeFlag) {
        this.setCodeFlag(codeFlag);
        return this;
    }

    @JsonIgnore
    public PSSFDTO codeflag(Boolean codeFlag) {
        if (codeFlag == null) {
            this.setCodeFlag(null);
        } else {
            this.setCodeFlag(codeFlag != false ? 1 : 0);
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
    public PSSFDTO createdate(Timestamp createDate) {
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
    public PSSFDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="docflag")
    public void setDocFlag(Integer docFlag) {
        this._set(DTOFIELD_DOCFLAG, docFlag);
    }

    @JsonIgnore
    public Integer getDocFlag() {
        Object objValue = this._get(DTOFIELD_DOCFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDocFlagDirty() {
        return this._contains(DTOFIELD_DOCFLAG);
    }

    @JsonIgnore
    public void resetDocFlag() {
        this._reset(DTOFIELD_DOCFLAG);
    }

    @JsonIgnore
    public PSSFDTO docflag(Integer docFlag) {
        this.setDocFlag(docFlag);
        return this;
    }

    @JsonIgnore
    public PSSFDTO docflag(Boolean docFlag) {
        if (docFlag == null) {
            this.setDocFlag(null);
        } else {
            this.setDocFlag(docFlag != false ? 1 : 0);
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
    public PSSFDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelflag")
    public void setModelFlag(Integer modelFlag) {
        this._set(DTOFIELD_MODELFLAG, modelFlag);
    }

    @JsonIgnore
    public Integer getModelFlag() {
        Object objValue = this._get(DTOFIELD_MODELFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelFlagDirty() {
        return this._contains(DTOFIELD_MODELFLAG);
    }

    @JsonIgnore
    public void resetModelFlag() {
        this._reset(DTOFIELD_MODELFLAG);
    }

    @JsonIgnore
    public PSSFDTO modelflag(Integer modelFlag) {
        this.setModelFlag(modelFlag);
        return this;
    }

    @JsonIgnore
    public PSSFDTO modelflag(Boolean modelFlag) {
        if (modelFlag == null) {
            this.setModelFlag(null);
        } else {
            this.setModelFlag(modelFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pkglowercase")
    public void setPkgLowerCase(Integer pkgLowerCase) {
        this._set(DTOFIELD_PKGLOWERCASE, pkgLowerCase);
    }

    @JsonIgnore
    public Integer getPkgLowerCase() {
        Object objValue = this._get(DTOFIELD_PKGLOWERCASE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPkgLowerCaseDirty() {
        return this._contains(DTOFIELD_PKGLOWERCASE);
    }

    @JsonIgnore
    public void resetPkgLowerCase() {
        this._reset(DTOFIELD_PKGLOWERCASE);
    }

    @JsonIgnore
    public PSSFDTO pkglowercase(Integer pkgLowerCase) {
        this.setPkgLowerCase(pkgLowerCase);
        return this;
    }

    @JsonIgnore
    public PSSFDTO pkglowercase(Boolean pkgLowerCase) {
        if (pkgLowerCase == null) {
            this.setPkgLowerCase(null);
        } else {
            this.setPkgLowerCase(pkgLowerCase != false ? 1 : 0);
        }
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
    public PSSFDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
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
    public PSSFDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSFName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSFName(strName);
    }

    @JsonIgnore
    public PSSFDTO name(String strName) {
        this.setPSSFName(strName);
        return this;
    }

    @JsonProperty(value="slnflag")
    public void setSlnFlag(Integer slnFlag) {
        this._set(DTOFIELD_SLNFLAG, slnFlag);
    }

    @JsonIgnore
    public Integer getSlnFlag() {
        Object objValue = this._get(DTOFIELD_SLNFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSlnFlagDirty() {
        return this._contains(DTOFIELD_SLNFLAG);
    }

    @JsonIgnore
    public void resetSlnFlag() {
        this._reset(DTOFIELD_SLNFLAG);
    }

    @JsonIgnore
    public PSSFDTO slnflag(Integer slnFlag) {
        this.setSlnFlag(slnFlag);
        return this;
    }

    @JsonIgnore
    public PSSFDTO slnflag(Boolean slnFlag) {
        if (slnFlag == null) {
            this.setSlnFlag(null);
        } else {
            this.setSlnFlag(slnFlag != false ? 1 : 0);
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
    public PSSFDTO updatedate(Timestamp updateDate) {
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
    public PSSFDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="v2folder")
    public void setV2Folder(String v2Folder) {
        this._set(DTOFIELD_V2FOLDER, v2Folder);
    }

    @JsonIgnore
    public String getV2Folder() {
        Object objValue = this._get(DTOFIELD_V2FOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2FolderDirty() {
        return this._contains(DTOFIELD_V2FOLDER);
    }

    @JsonIgnore
    public void resetV2Folder() {
        this._reset(DTOFIELD_V2FOLDER);
    }

    @JsonIgnore
    public PSSFDTO v2folder(String v2Folder) {
        this.setV2Folder(v2Folder);
        return this;
    }

    @JsonProperty(value="v2gitpath")
    public void setV2GitPath(String v2GitPath) {
        this._set(DTOFIELD_V2GITPATH, v2GitPath);
    }

    @JsonIgnore
    public String getV2GitPath() {
        Object objValue = this._get(DTOFIELD_V2GITPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2GitPathDirty() {
        return this._contains(DTOFIELD_V2GITPATH);
    }

    @JsonIgnore
    public void resetV2GitPath() {
        this._reset(DTOFIELD_V2GITPATH);
    }

    @JsonIgnore
    public PSSFDTO v2gitpath(String v2GitPath) {
        this.setV2GitPath(v2GitPath);
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
    public PSSFDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSFDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSFId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSFId(strValue);
    }

    @JsonIgnore
    public PSSFDTO id(String strValue) {
        this.setPSSFId(strValue);
        return this;
    }
}
