package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppResourceDTO
    extends PSModelDTOBase {
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CONTENTPSLANRESID = "CONTENTPSLANRESID";
    protected static final String DTOFIELD_CONTENTPSLANRESID = "contentpslanresid";
    public static final String FIELD_CONTENTPSLANRESNAME = "CONTENTPSLANRESNAME";
    protected static final String DTOFIELD_CONTENTPSLANRESNAME = "contentpslanresname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPRESOURCEID = "PSAPPRESOURCEID";
    protected static final String DTOFIELD_PSAPPRESOURCEID = "psappresourceid";
    public static final String FIELD_PSAPPRESOURCENAME = "PSAPPRESOURCENAME";
    protected static final String DTOFIELD_PSAPPRESOURCENAME = "psappresourcename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_RESOURCETYPE = "RESOURCETYPE";
    protected static final String DTOFIELD_RESOURCETYPE = "resourcetype";
    public static final String FIELD_RESTAG = "RESTAG";
    protected static final String DTOFIELD_RESTAG = "restag";
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


    @JsonProperty(value="content")
    public void setCONTENT(String cONTENT) {
        this._set(DTOFIELD_CONTENT, cONTENT);
    }

    @JsonIgnore
    public String getCONTENT() {
        Object objValue = this._get(DTOFIELD_CONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCONTENTDirty() {
        return this._contains(DTOFIELD_CONTENT);
    }

    @JsonIgnore
    public void resetCONTENT() {
        this._reset(DTOFIELD_CONTENT);
    }

    @JsonIgnore
    public PSAppResourceDTO content(String cONTENT) {
        this.setCONTENT(cONTENT);
        return this;
    }

    @JsonProperty(value="contentpslanresid")
    public void setCONTENTPSLANRESID(String cONTENTPSLANRESID) {
        this._set(DTOFIELD_CONTENTPSLANRESID, cONTENTPSLANRESID);
    }

    @JsonIgnore
    public String getCONTENTPSLANRESID() {
        Object objValue = this._get(DTOFIELD_CONTENTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCONTENTPSLANRESIDDirty() {
        return this._contains(DTOFIELD_CONTENTPSLANRESID);
    }

    @JsonIgnore
    public void resetCONTENTPSLANRESID() {
        this._reset(DTOFIELD_CONTENTPSLANRESID);
    }

    @JsonIgnore
    public PSAppResourceDTO contentpslanresid(String cONTENTPSLANRESID) {
        this.setCONTENTPSLANRESID(cONTENTPSLANRESID);
        return this;
    }

    @JsonIgnore
    public PSAppResourceDTO contentpslanresid(PSLanguageResDTO cONTENTPSLANRES) {
        if (cONTENTPSLANRES == null) {
            this.setCONTENTPSLANRESID(null);
            this.setCONTENTPSLANRESNAME(null);
        } else {
            this.setCONTENTPSLANRESID(cONTENTPSLANRES.getPSLanguageResId());
            this.setCONTENTPSLANRESNAME(cONTENTPSLANRES.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="contentpslanresname")
    public void setCONTENTPSLANRESNAME(String cONTENTPSLANRESNAME) {
        this._set(DTOFIELD_CONTENTPSLANRESNAME, cONTENTPSLANRESNAME);
    }

    @JsonIgnore
    public String getCONTENTPSLANRESNAME() {
        Object objValue = this._get(DTOFIELD_CONTENTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCONTENTPSLANRESNAMEDirty() {
        return this._contains(DTOFIELD_CONTENTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCONTENTPSLANRESNAME() {
        this._reset(DTOFIELD_CONTENTPSLANRESNAME);
    }

    @JsonIgnore
    public PSAppResourceDTO contentpslanresname(String cONTENTPSLANRESNAME) {
        this.setCONTENTPSLANRESNAME(cONTENTPSLANRESNAME);
        return this;
    }

    @JsonProperty(value="createdate")
    public void setCREATEDATE(String cREATEDATE) {
        this._set(DTOFIELD_CREATEDATE, cREATEDATE);
    }

    @JsonIgnore
    public String getCREATEDATE() {
        Object objValue = this._get(DTOFIELD_CREATEDATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCREATEDATEDirty() {
        return this._contains(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public void resetCREATEDATE() {
        this._reset(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public PSAppResourceDTO createdate(String cREATEDATE) {
        this.setCREATEDATE(cREATEDATE);
        return this;
    }

    @JsonProperty(value="createman")
    public void setCREATEMAN(String cREATEMAN) {
        this._set(DTOFIELD_CREATEMAN, cREATEMAN);
    }

    @JsonIgnore
    public String getCREATEMAN() {
        Object objValue = this._get(DTOFIELD_CREATEMAN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCREATEMANDirty() {
        return this._contains(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public void resetCREATEMAN() {
        this._reset(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public PSAppResourceDTO createman(String cREATEMAN) {
        this.setCREATEMAN(cREATEMAN);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMEMO(String mEMO) {
        this._set(DTOFIELD_MEMO, mEMO);
    }

    @JsonIgnore
    public String getMEMO() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMEMODirty() {
        return this._contains(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public void resetMEMO() {
        this._reset(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public PSAppResourceDTO memo(String mEMO) {
        this.setMEMO(mEMO);
        return this;
    }

    @JsonProperty(value="psappresourceid")
    public void setPSAPPRESOURCEID(String pSAPPRESOURCEID) {
        this._set(DTOFIELD_PSAPPRESOURCEID, pSAPPRESOURCEID);
    }

    @JsonIgnore
    public String getPSAPPRESOURCEID() {
        Object objValue = this._get(DTOFIELD_PSAPPRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAPPRESOURCEIDDirty() {
        return this._contains(DTOFIELD_PSAPPRESOURCEID);
    }

    @JsonIgnore
    public void resetPSAPPRESOURCEID() {
        this._reset(DTOFIELD_PSAPPRESOURCEID);
    }

    @JsonIgnore
    public PSAppResourceDTO psappresourceid(String pSAPPRESOURCEID) {
        this.setPSAPPRESOURCEID(pSAPPRESOURCEID);
        return this;
    }

    @JsonProperty(value="psappresourcename")
    public void setPSAPPRESOURCENAME(String pSAPPRESOURCENAME) {
        this._set(DTOFIELD_PSAPPRESOURCENAME, pSAPPRESOURCENAME);
    }

    @JsonIgnore
    public String getPSAPPRESOURCENAME() {
        Object objValue = this._get(DTOFIELD_PSAPPRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAPPRESOURCENAMEDirty() {
        return this._contains(DTOFIELD_PSAPPRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSAPPRESOURCENAME() {
        this._reset(DTOFIELD_PSAPPRESOURCENAME);
    }

    @JsonIgnore
    public PSAppResourceDTO psappresourcename(String pSAPPRESOURCENAME) {
        this.setPSAPPRESOURCENAME(pSAPPRESOURCENAME);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSYSAPPID(String pSSYSAPPID) {
        this._set(DTOFIELD_PSSYSAPPID, pSSYSAPPID);
    }

    @JsonIgnore
    public String getPSSYSAPPID() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSYSAPPIDDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSYSAPPID() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSAppResourceDTO pssysappid(String pSSYSAPPID) {
        this.setPSSYSAPPID(pSSYSAPPID);
        return this;
    }

    @JsonIgnore
    public PSAppResourceDTO pssysappid(PSSysAppDTO pSSYSAPP) {
        if (pSSYSAPP == null) {
            this.setPSSYSAPPID(null);
            this.setPSSYSAPPNAME(null);
        } else {
            this.setPSSYSAPPID(pSSYSAPP.getPSSysAppId());
            this.setPSSYSAPPNAME(pSSYSAPP.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSYSAPPNAME(String pSSYSAPPNAME) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSYSAPPNAME);
    }

    @JsonIgnore
    public String getPSSYSAPPNAME() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSYSAPPNAMEDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSYSAPPNAME() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSAppResourceDTO pssysappname(String pSSYSAPPNAME) {
        this.setPSSYSAPPNAME(pSSYSAPPNAME);
        return this;
    }

    @JsonProperty(value="resourcetype")
    public void setRESOURCETYPE(String rESOURCETYPE) {
        this._set(DTOFIELD_RESOURCETYPE, rESOURCETYPE);
    }

    @JsonIgnore
    public String getRESOURCETYPE() {
        Object objValue = this._get(DTOFIELD_RESOURCETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRESOURCETYPEDirty() {
        return this._contains(DTOFIELD_RESOURCETYPE);
    }

    @JsonIgnore
    public void resetRESOURCETYPE() {
        this._reset(DTOFIELD_RESOURCETYPE);
    }

    @JsonIgnore
    public PSAppResourceDTO resourcetype(String rESOURCETYPE) {
        this.setRESOURCETYPE(rESOURCETYPE);
        return this;
    }

    @JsonProperty(value="restag")
    public void setRESTAG(String rESTAG) {
        this._set(DTOFIELD_RESTAG, rESTAG);
    }

    @JsonIgnore
    public String getRESTAG() {
        Object objValue = this._get(DTOFIELD_RESTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRESTAGDirty() {
        return this._contains(DTOFIELD_RESTAG);
    }

    @JsonIgnore
    public void resetRESTAG() {
        this._reset(DTOFIELD_RESTAG);
    }

    @JsonIgnore
    public PSAppResourceDTO restag(String rESTAG) {
        this.setRESTAG(rESTAG);
        return this;
    }

    @JsonProperty(value="updatedate")
    public void setUPDATEDATE(String uPDATEDATE) {
        this._set(DTOFIELD_UPDATEDATE, uPDATEDATE);
    }

    @JsonIgnore
    public String getUPDATEDATE() {
        Object objValue = this._get(DTOFIELD_UPDATEDATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUPDATEDATEDirty() {
        return this._contains(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public void resetUPDATEDATE() {
        this._reset(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public PSAppResourceDTO updatedate(String uPDATEDATE) {
        this.setUPDATEDATE(uPDATEDATE);
        return this;
    }

    @JsonProperty(value="updateman")
    public void setUPDATEMAN(String uPDATEMAN) {
        this._set(DTOFIELD_UPDATEMAN, uPDATEMAN);
    }

    @JsonIgnore
    public String getUPDATEMAN() {
        Object objValue = this._get(DTOFIELD_UPDATEMAN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUPDATEMANDirty() {
        return this._contains(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public void resetUPDATEMAN() {
        this._reset(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public PSAppResourceDTO updateman(String uPDATEMAN) {
        this.setUPDATEMAN(uPDATEMAN);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUSERCAT(String uSERCAT) {
        this._set(DTOFIELD_USERCAT, uSERCAT);
    }

    @JsonIgnore
    public String getUSERCAT() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUSERCATDirty() {
        return this._contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUSERCAT() {
        this._reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSAppResourceDTO usercat(String uSERCAT) {
        this.setUSERCAT(uSERCAT);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUSERTAG(String uSERTAG) {
        this._set(DTOFIELD_USERTAG, uSERTAG);
    }

    @JsonIgnore
    public String getUSERTAG() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUSERTAGDirty() {
        return this._contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUSERTAG() {
        this._reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSAppResourceDTO usertag(String uSERTAG) {
        this.setUSERTAG(uSERTAG);
        return this;
    }

    @JsonProperty(value="usertag2")
    public void setUSERTAG2(String uSERTAG2) {
        this._set(DTOFIELD_USERTAG2, uSERTAG2);
    }

    @JsonIgnore
    public String getUSERTAG2() {
        Object objValue = this._get(DTOFIELD_USERTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUSERTAG2Dirty() {
        return this._contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUSERTAG2() {
        this._reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSAppResourceDTO usertag2(String uSERTAG2) {
        this.setUSERTAG2(uSERTAG2);
        return this;
    }

    @JsonProperty(value="usertag3")
    public void setUSERTAG3(String uSERTAG3) {
        this._set(DTOFIELD_USERTAG3, uSERTAG3);
    }

    @JsonIgnore
    public String getUSERTAG3() {
        Object objValue = this._get(DTOFIELD_USERTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUSERTAG3Dirty() {
        return this._contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUSERTAG3() {
        this._reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSAppResourceDTO usertag3(String uSERTAG3) {
        this.setUSERTAG3(uSERTAG3);
        return this;
    }

    @JsonProperty(value="usertag4")
    public void setUSERTAG4(String uSERTAG4) {
        this._set(DTOFIELD_USERTAG4, uSERTAG4);
    }

    @JsonIgnore
    public String getUSERTAG4() {
        Object objValue = this._get(DTOFIELD_USERTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUSERTAG4Dirty() {
        return this._contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUSERTAG4() {
        this._reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSAppResourceDTO usertag4(String uSERTAG4) {
        this.setUSERTAG4(uSERTAG4);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setVALIDFLAG(Integer vALIDFLAG) {
        this._set(DTOFIELD_VALIDFLAG, vALIDFLAG);
    }

    @JsonIgnore
    public Integer getVALIDFLAG() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isVALIDFLAGDirty() {
        return this._contains(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public void resetVALIDFLAG() {
        this._reset(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public PSAppResourceDTO validflag(Integer vALIDFLAG) {
        this.setVALIDFLAG(vALIDFLAG);
        return this;
    }

    @JsonIgnore
    public PSAppResourceDTO validflag(Boolean vALIDFLAG) {
        if (vALIDFLAG == null) {
            this.setVALIDFLAG(null);
        } else {
            this.setVALIDFLAG(vALIDFLAG != false ? 1 : 0);
        }
        return this;
    }
}