package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppPkgDTO
    extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PKGPARAM = "PKGPARAM";
    protected static final String DTOFIELD_PKGPARAM = "pkgparam";
    public static final String FIELD_PKGPARAM2 = "PKGPARAM2";
    protected static final String DTOFIELD_PKGPARAM2 = "pkgparam2";
    public static final String FIELD_PKGPARAM3 = "PKGPARAM3";
    protected static final String DTOFIELD_PKGPARAM3 = "pkgparam3";
    public static final String FIELD_PKGPARAM4 = "PKGPARAM4";
    protected static final String DTOFIELD_PKGPARAM4 = "pkgparam4";
    public static final String FIELD_PSAPPPKGID = "PSAPPPKGID";
    protected static final String DTOFIELD_PSAPPPKGID = "psapppkgid";
    public static final String FIELD_PSAPPPKGNAME = "PSAPPPKGNAME";
    protected static final String DTOFIELD_PSAPPPKGNAME = "psapppkgname";
    public static final String FIELD_PSPFPKGID = "PSPFPKGID";
    protected static final String DTOFIELD_PSPFPKGID = "pspfpkgid";
    public static final String FIELD_PSPFPKGNAME = "PSPFPKGNAME";
    protected static final String DTOFIELD_PSPFPKGNAME = "pspfpkgname";
    public static final String FIELD_PSPFPKGVERID = "PSPFPKGVERID";
    protected static final String DTOFIELD_PSPFPKGVERID = "pspfpkgverid";
    public static final String FIELD_PSPFPKGVERNAME = "PSPFPKGVERNAME";
    protected static final String DTOFIELD_PSPFPKGVERNAME = "pspfpkgvername";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
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


    @JsonProperty(value="codename")
    public void setCODENAME(String cODENAME) {
        this._set(DTOFIELD_CODENAME, cODENAME);
    }

    @JsonIgnore
    public String getCODENAME() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCODENAMEDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCODENAME() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSAppPkgDTO codename(String cODENAME) {
        this.setCODENAME(cODENAME);
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
    public PSAppPkgDTO createdate(String cREATEDATE) {
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
    public PSAppPkgDTO createman(String cREATEMAN) {
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
    public PSAppPkgDTO memo(String mEMO) {
        this.setMEMO(mEMO);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setORDERVALUE(Integer oRDERVALUE) {
        this._set(DTOFIELD_ORDERVALUE, oRDERVALUE);
    }

    @JsonIgnore
    public Integer getORDERVALUE() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isORDERVALUEDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetORDERVALUE() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSAppPkgDTO ordervalue(Integer oRDERVALUE) {
        this.setORDERVALUE(oRDERVALUE);
        return this;
    }

    @JsonProperty(value="pkgparam")
    public void setPKGPARAM(String pKGPARAM) {
        this._set(DTOFIELD_PKGPARAM, pKGPARAM);
    }

    @JsonIgnore
    public String getPKGPARAM() {
        Object objValue = this._get(DTOFIELD_PKGPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKGPARAMDirty() {
        return this._contains(DTOFIELD_PKGPARAM);
    }

    @JsonIgnore
    public void resetPKGPARAM() {
        this._reset(DTOFIELD_PKGPARAM);
    }

    @JsonIgnore
    public PSAppPkgDTO pkgparam(String pKGPARAM) {
        this.setPKGPARAM(pKGPARAM);
        return this;
    }

    @JsonProperty(value="pkgparam2")
    public void setPKGPARAM2(String pKGPARAM2) {
        this._set(DTOFIELD_PKGPARAM2, pKGPARAM2);
    }

    @JsonIgnore
    public String getPKGPARAM2() {
        Object objValue = this._get(DTOFIELD_PKGPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKGPARAM2Dirty() {
        return this._contains(DTOFIELD_PKGPARAM2);
    }

    @JsonIgnore
    public void resetPKGPARAM2() {
        this._reset(DTOFIELD_PKGPARAM2);
    }

    @JsonIgnore
    public PSAppPkgDTO pkgparam2(String pKGPARAM2) {
        this.setPKGPARAM2(pKGPARAM2);
        return this;
    }

    @JsonProperty(value="pkgparam3")
    public void setPKGPARAM3(String pKGPARAM3) {
        this._set(DTOFIELD_PKGPARAM3, pKGPARAM3);
    }

    @JsonIgnore
    public String getPKGPARAM3() {
        Object objValue = this._get(DTOFIELD_PKGPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKGPARAM3Dirty() {
        return this._contains(DTOFIELD_PKGPARAM3);
    }

    @JsonIgnore
    public void resetPKGPARAM3() {
        this._reset(DTOFIELD_PKGPARAM3);
    }

    @JsonIgnore
    public PSAppPkgDTO pkgparam3(String pKGPARAM3) {
        this.setPKGPARAM3(pKGPARAM3);
        return this;
    }

    @JsonProperty(value="pkgparam4")
    public void setPKGPARAM4(String pKGPARAM4) {
        this._set(DTOFIELD_PKGPARAM4, pKGPARAM4);
    }

    @JsonIgnore
    public String getPKGPARAM4() {
        Object objValue = this._get(DTOFIELD_PKGPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKGPARAM4Dirty() {
        return this._contains(DTOFIELD_PKGPARAM4);
    }

    @JsonIgnore
    public void resetPKGPARAM4() {
        this._reset(DTOFIELD_PKGPARAM4);
    }

    @JsonIgnore
    public PSAppPkgDTO pkgparam4(String pKGPARAM4) {
        this.setPKGPARAM4(pKGPARAM4);
        return this;
    }

    @JsonProperty(value="psapppkgid")
    public void setPSAPPPKGID(String pSAPPPKGID) {
        this._set(DTOFIELD_PSAPPPKGID, pSAPPPKGID);
    }

    @JsonIgnore
    public String getPSAPPPKGID() {
        Object objValue = this._get(DTOFIELD_PSAPPPKGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAPPPKGIDDirty() {
        return this._contains(DTOFIELD_PSAPPPKGID);
    }

    @JsonIgnore
    public void resetPSAPPPKGID() {
        this._reset(DTOFIELD_PSAPPPKGID);
    }

    @JsonIgnore
    public PSAppPkgDTO psapppkgid(String pSAPPPKGID) {
        this.setPSAPPPKGID(pSAPPPKGID);
        return this;
    }

    @JsonProperty(value="psapppkgname")
    public void setPSAPPPKGNAME(String pSAPPPKGNAME) {
        this._set(DTOFIELD_PSAPPPKGNAME, pSAPPPKGNAME);
    }

    @JsonIgnore
    public String getPSAPPPKGNAME() {
        Object objValue = this._get(DTOFIELD_PSAPPPKGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAPPPKGNAMEDirty() {
        return this._contains(DTOFIELD_PSAPPPKGNAME);
    }

    @JsonIgnore
    public void resetPSAPPPKGNAME() {
        this._reset(DTOFIELD_PSAPPPKGNAME);
    }

    @JsonIgnore
    public PSAppPkgDTO psapppkgname(String pSAPPPKGNAME) {
        this.setPSAPPPKGNAME(pSAPPPKGNAME);
        return this;
    }

    @JsonProperty(value="pspfpkgid")
    public void setPSPFPKGID(String pSPFPKGID) {
        this._set(DTOFIELD_PSPFPKGID, pSPFPKGID);
    }

    @JsonIgnore
    public String getPSPFPKGID() {
        Object objValue = this._get(DTOFIELD_PSPFPKGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPKGIDDirty() {
        return this._contains(DTOFIELD_PSPFPKGID);
    }

    @JsonIgnore
    public void resetPSPFPKGID() {
        this._reset(DTOFIELD_PSPFPKGID);
    }

    @JsonIgnore
    public PSAppPkgDTO pspfpkgid(String pSPFPKGID) {
        this.setPSPFPKGID(pSPFPKGID);
        return this;
    }

    @JsonProperty(value="pspfpkgname")
    public void setPSPFPKGNAME(String pSPFPKGNAME) {
        this._set(DTOFIELD_PSPFPKGNAME, pSPFPKGNAME);
    }

    @JsonIgnore
    public String getPSPFPKGNAME() {
        Object objValue = this._get(DTOFIELD_PSPFPKGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPKGNAMEDirty() {
        return this._contains(DTOFIELD_PSPFPKGNAME);
    }

    @JsonIgnore
    public void resetPSPFPKGNAME() {
        this._reset(DTOFIELD_PSPFPKGNAME);
    }

    @JsonIgnore
    public PSAppPkgDTO pspfpkgname(String pSPFPKGNAME) {
        this.setPSPFPKGNAME(pSPFPKGNAME);
        return this;
    }

    @JsonProperty(value="pspfpkgverid")
    public void setPSPFPKGVERID(String pSPFPKGVERID) {
        this._set(DTOFIELD_PSPFPKGVERID, pSPFPKGVERID);
    }

    @JsonIgnore
    public String getPSPFPKGVERID() {
        Object objValue = this._get(DTOFIELD_PSPFPKGVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPKGVERIDDirty() {
        return this._contains(DTOFIELD_PSPFPKGVERID);
    }

    @JsonIgnore
    public void resetPSPFPKGVERID() {
        this._reset(DTOFIELD_PSPFPKGVERID);
    }

    @JsonIgnore
    public PSAppPkgDTO pspfpkgverid(String pSPFPKGVERID) {
        this.setPSPFPKGVERID(pSPFPKGVERID);
        return this;
    }

    @JsonProperty(value="pspfpkgvername")
    public void setPSPFPKGVERNAME(String pSPFPKGVERNAME) {
        this._set(DTOFIELD_PSPFPKGVERNAME, pSPFPKGVERNAME);
    }

    @JsonIgnore
    public String getPSPFPKGVERNAME() {
        Object objValue = this._get(DTOFIELD_PSPFPKGVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPKGVERNAMEDirty() {
        return this._contains(DTOFIELD_PSPFPKGVERNAME);
    }

    @JsonIgnore
    public void resetPSPFPKGVERNAME() {
        this._reset(DTOFIELD_PSPFPKGVERNAME);
    }

    @JsonIgnore
    public PSAppPkgDTO pspfpkgvername(String pSPFPKGVERNAME) {
        this.setPSPFPKGVERNAME(pSPFPKGVERNAME);
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
    public PSAppPkgDTO pssysappid(String pSSYSAPPID) {
        this.setPSSYSAPPID(pSSYSAPPID);
        return this;
    }

    @JsonIgnore
    public PSAppPkgDTO pssysappid(PSSysAppDTO pSSYSAPP) {
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
    public PSAppPkgDTO pssysappname(String pSSYSAPPNAME) {
        this.setPSSYSAPPNAME(pSSYSAPPNAME);
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
    public PSAppPkgDTO updatedate(String uPDATEDATE) {
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
    public PSAppPkgDTO updateman(String uPDATEMAN) {
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
    public PSAppPkgDTO usercat(String uSERCAT) {
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
    public PSAppPkgDTO usertag(String uSERTAG) {
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
    public PSAppPkgDTO usertag2(String uSERTAG2) {
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
    public PSAppPkgDTO usertag3(String uSERTAG3) {
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
    public PSAppPkgDTO usertag4(String uSERTAG4) {
        this.setUSERTAG4(uSERTAG4);
        return this;
    }
}