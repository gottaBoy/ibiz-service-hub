package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppDERSDTO
    extends PSModelDTOBase {
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_CHILDFILTER = "CHILDFILTER";
    protected static final String DTOFIELD_CHILDFILTER = "childfilter";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CPSAPPDATAENTITYID = "CPSAPPLOCALDEID";
    protected static final String DTOFIELD_CPSAPPDATAENTITYID = "cpsapplocaldeid";
    public static final String FIELD_CPSAPPDATAENTITYNAME = "CPSAPPLOCALDENAME";
    protected static final String DTOFIELD_CPSAPPDATAENTITYNAME = "cpsapplocaldename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSAPPDATAENTITYID = "PPSAPPLOCALDEID";
    protected static final String DTOFIELD_PPSAPPDATAENTITYID = "ppsapplocaldeid";
    public static final String FIELD_PPSAPPDATAENTITYNAME = "PPSAPPLOCALDENAME";
    protected static final String DTOFIELD_PPSAPPDATAENTITYNAME = "ppsapplocaldename";
    public static final String FIELD_PSAPPDERSID = "PSAPPDERSID";
    protected static final String DTOFIELD_PSAPPDERSID = "psappdersid";
    public static final String FIELD_PSAPPDERSNAME = "PSAPPDERSNAME";
    protected static final String DTOFIELD_PSAPPDERSNAME = "psappdersname";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_TYPEFILTER = "TYPEFILTER";
    protected static final String DTOFIELD_TYPEFILTER = "typefilter";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";


    @JsonProperty(value="arrayflag")
    public void setARRAYFLAG(Integer aRRAYFLAG) {
        this._set(DTOFIELD_ARRAYFLAG, aRRAYFLAG);
    }

    @JsonIgnore
    public Integer getARRAYFLAG() {
        Object objValue = this._get(DTOFIELD_ARRAYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isARRAYFLAGDirty() {
        return this._contains(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public void resetARRAYFLAG() {
        this._reset(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public PSAppDERSDTO arrayflag(Integer aRRAYFLAG) {
        this.setARRAYFLAG(aRRAYFLAG);
        return this;
    }

    @JsonIgnore
    public PSAppDERSDTO arrayflag(Boolean aRRAYFLAG) {
        if (aRRAYFLAG == null) {
            this.setARRAYFLAG(null);
        } else {
            this.setARRAYFLAG(aRRAYFLAG != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="childfilter")
    public void setCHILDFILTER(String cHILDFILTER) {
        this._set(DTOFIELD_CHILDFILTER, cHILDFILTER);
    }

    @JsonIgnore
    public String getCHILDFILTER() {
        Object objValue = this._get(DTOFIELD_CHILDFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCHILDFILTERDirty() {
        return this._contains(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public void resetCHILDFILTER() {
        this._reset(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public PSAppDERSDTO childfilter(String cHILDFILTER) {
        this.setCHILDFILTER(cHILDFILTER);
        return this;
    }

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
    public PSAppDERSDTO codename(String cODENAME) {
        this.setCODENAME(cODENAME);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCODENAME2(String cODENAME2) {
        this._set(DTOFIELD_CODENAME2, cODENAME2);
    }

    @JsonIgnore
    public String getCODENAME2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCODENAME2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCODENAME2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSAppDERSDTO codename2(String cODENAME2) {
        this.setCODENAME2(cODENAME2);
        return this;
    }

    @JsonProperty(value="cpsapplocaldeid")
    public void setCPSAPPDATAENTITYID(String cPSAPPDATAENTITYID) {
        this._set(DTOFIELD_CPSAPPDATAENTITYID, cPSAPPDATAENTITYID);
    }

    @JsonIgnore
    public String getCPSAPPDATAENTITYID() {
        Object objValue = this._get(DTOFIELD_CPSAPPDATAENTITYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSAPPDATAENTITYIDDirty() {
        return this._contains(DTOFIELD_CPSAPPDATAENTITYID);
    }

    @JsonIgnore
    public void resetCPSAPPDATAENTITYID() {
        this._reset(DTOFIELD_CPSAPPDATAENTITYID);
    }

    @JsonIgnore
    public PSAppDERSDTO cpsapplocaldeid(String cPSAPPDATAENTITYID) {
        this.setCPSAPPDATAENTITYID(cPSAPPDATAENTITYID);
        return this;
    }

    @JsonProperty(value="cpsapplocaldename")
    public void setCPSAPPDATAENTITYNAME(String cPSAPPDATAENTITYNAME) {
        this._set(DTOFIELD_CPSAPPDATAENTITYNAME, cPSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public String getCPSAPPDATAENTITYNAME() {
        Object objValue = this._get(DTOFIELD_CPSAPPDATAENTITYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSAPPDATAENTITYNAMEDirty() {
        return this._contains(DTOFIELD_CPSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public void resetCPSAPPDATAENTITYNAME() {
        this._reset(DTOFIELD_CPSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public PSAppDERSDTO cpsapplocaldename(String cPSAPPDATAENTITYNAME) {
        this.setCPSAPPDATAENTITYNAME(cPSAPPDATAENTITYNAME);
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
    public PSAppDERSDTO createdate(String cREATEDATE) {
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
    public PSAppDERSDTO createman(String cREATEMAN) {
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
    public PSAppDERSDTO memo(String mEMO) {
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
    public PSAppDERSDTO ordervalue(Integer oRDERVALUE) {
        this.setORDERVALUE(oRDERVALUE);
        return this;
    }

    @JsonProperty(value="ppsapplocaldeid")
    public void setPPSAPPDATAENTITYID(String pPSAPPDATAENTITYID) {
        this._set(DTOFIELD_PPSAPPDATAENTITYID, pPSAPPDATAENTITYID);
    }

    @JsonIgnore
    public String getPPSAPPDATAENTITYID() {
        Object objValue = this._get(DTOFIELD_PPSAPPDATAENTITYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAPPDATAENTITYIDDirty() {
        return this._contains(DTOFIELD_PPSAPPDATAENTITYID);
    }

    @JsonIgnore
    public void resetPPSAPPDATAENTITYID() {
        this._reset(DTOFIELD_PPSAPPDATAENTITYID);
    }

    @JsonIgnore
    public PSAppDERSDTO ppsapplocaldeid(String pPSAPPDATAENTITYID) {
        this.setPPSAPPDATAENTITYID(pPSAPPDATAENTITYID);
        return this;
    }

    @JsonProperty(value="ppsapplocaldename")
    public void setPPSAPPDATAENTITYNAME(String pPSAPPDATAENTITYNAME) {
        this._set(DTOFIELD_PPSAPPDATAENTITYNAME, pPSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public String getPPSAPPDATAENTITYNAME() {
        Object objValue = this._get(DTOFIELD_PPSAPPDATAENTITYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAPPDATAENTITYNAMEDirty() {
        return this._contains(DTOFIELD_PPSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public void resetPPSAPPDATAENTITYNAME() {
        this._reset(DTOFIELD_PPSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public PSAppDERSDTO ppsapplocaldename(String pPSAPPDATAENTITYNAME) {
        this.setPPSAPPDATAENTITYNAME(pPSAPPDATAENTITYNAME);
        return this;
    }

    @JsonProperty(value="psappdersid")
    public void setPSAPPDERSID(String pSAPPDERSID) {
        this._set(DTOFIELD_PSAPPDERSID, pSAPPDERSID);
    }

    @JsonIgnore
    public String getPSAPPDERSID() {
        Object objValue = this._get(DTOFIELD_PSAPPDERSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAPPDERSIDDirty() {
        return this._contains(DTOFIELD_PSAPPDERSID);
    }

    @JsonIgnore
    public void resetPSAPPDERSID() {
        this._reset(DTOFIELD_PSAPPDERSID);
    }

    @JsonIgnore
    public PSAppDERSDTO psappdersid(String pSAPPDERSID) {
        this.setPSAPPDERSID(pSAPPDERSID);
        return this;
    }

    @JsonProperty(value="psappdersname")
    public void setPSAPPDERSNAME(String pSAPPDERSNAME) {
        this._set(DTOFIELD_PSAPPDERSNAME, pSAPPDERSNAME);
    }

    @JsonIgnore
    public String getPSAPPDERSNAME() {
        Object objValue = this._get(DTOFIELD_PSAPPDERSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAPPDERSNAMEDirty() {
        return this._contains(DTOFIELD_PSAPPDERSNAME);
    }

    @JsonIgnore
    public void resetPSAPPDERSNAME() {
        this._reset(DTOFIELD_PSAPPDERSNAME);
    }

    @JsonIgnore
    public PSAppDERSDTO psappdersname(String pSAPPDERSNAME) {
        this.setPSAPPDERSNAME(pSAPPDERSNAME);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERID(String pSDERID) {
        this._set(DTOFIELD_PSDERID, pSDERID);
    }

    @JsonIgnore
    public String getPSDERID() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIDDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERID() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSAppDERSDTO psderid(String pSDERID) {
        this.setPSDERID(pSDERID);
        return this;
    }

    @JsonIgnore
    public PSAppDERSDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERID(null);
            this.setPSDERNAME(null);
        } else {
            this.setPSDERID(pSDER.getPSDERId());
            this.setPSDERNAME(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERNAME(String pSDERNAME) {
        this._set(DTOFIELD_PSDERNAME, pSDERNAME);
    }

    @JsonIgnore
    public String getPSDERNAME() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNAMEDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERNAME() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSAppDERSDTO psdername(String pSDERNAME) {
        this.setPSDERNAME(pSDERNAME);
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
    public PSAppDERSDTO pssysappid(String pSSYSAPPID) {
        this.setPSSYSAPPID(pSSYSAPPID);
        return this;
    }

    @JsonIgnore
    public PSAppDERSDTO pssysappid(PSSysAppDTO pSSYSAPP) {
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
    public PSAppDERSDTO pssysappname(String pSSYSAPPNAME) {
        this.setPSSYSAPPNAME(pSSYSAPPNAME);
        return this;
    }

    @JsonProperty(value="typefilter")
    public void setTYPEFILTER(String tYPEFILTER) {
        this._set(DTOFIELD_TYPEFILTER, tYPEFILTER);
    }

    @JsonIgnore
    public String getTYPEFILTER() {
        Object objValue = this._get(DTOFIELD_TYPEFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTYPEFILTERDirty() {
        return this._contains(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public void resetTYPEFILTER() {
        this._reset(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public PSAppDERSDTO typefilter(String tYPEFILTER) {
        this.setTYPEFILTER(tYPEFILTER);
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
    public PSAppDERSDTO updatedate(String uPDATEDATE) {
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
    public PSAppDERSDTO updateman(String uPDATEMAN) {
        this.setUPDATEMAN(uPDATEMAN);
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
    public PSAppDERSDTO usertag(String uSERTAG) {
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
    public PSAppDERSDTO usertag2(String uSERTAG2) {
        this.setUSERTAG2(uSERTAG2);
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
    public PSAppDERSDTO validflag(Integer vALIDFLAG) {
        this.setVALIDFLAG(vALIDFLAG);
        return this;
    }

    @JsonIgnore
    public PSAppDERSDTO validflag(Boolean vALIDFLAG) {
        if (vALIDFLAG == null) {
            this.setVALIDFLAG(null);
        } else {
            this.setVALIDFLAG(vALIDFLAG != false ? 1 : 0);
        }
        return this;
    }
}