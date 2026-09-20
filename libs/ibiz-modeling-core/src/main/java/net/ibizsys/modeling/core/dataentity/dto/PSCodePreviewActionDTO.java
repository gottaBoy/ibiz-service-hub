package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSCodePreviewActionDTO
    extends PSModelDTOBase {
    public static final String FIELD_ACTIONPARAM = "ACTIONPARAM";
    protected static final String DTOFIELD_ACTIONPARAM = "actionparam";
    public static final String FIELD_ACTIONPARAM2 = "ACTIONPARAM2";
    protected static final String DTOFIELD_ACTIONPARAM2 = "actionparam2";
    public static final String FIELD_ACTIONPARAM3 = "ACTIONPARAM3";
    protected static final String DTOFIELD_ACTIONPARAM3 = "actionparam3";
    public static final String FIELD_ACTIONPARAM4 = "ACTIONPARAM4";
    protected static final String DTOFIELD_ACTIONPARAM4 = "actionparam4";
    public static final String FIELD_ACTIONPARAM5 = "ACTIONPARAM5";
    protected static final String DTOFIELD_ACTIONPARAM5 = "actionparam5";
    public static final String FIELD_ACTIONPARAM6 = "ACTIONPARAM6";
    protected static final String DTOFIELD_ACTIONPARAM6 = "actionparam6";
    public static final String FIELD_ACTIONRESULT = "ACTIONRESULT";
    protected static final String DTOFIELD_ACTIONRESULT = "actionresult";
    public static final String FIELD_ACTIONSTATE = "ACTIONSTATE";
    protected static final String DTOFIELD_ACTIONSTATE = "actionstate";
    public static final String FIELD_BEGINTIME = "BEGINTIME";
    protected static final String DTOFIELD_BEGINTIME = "begintime";
    public static final String FIELD_CODEURL = "CODEURL";
    protected static final String DTOFIELD_CODEURL = "codeurl";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENDTIME = "ENDTIME";
    protected static final String DTOFIELD_ENDTIME = "endtime";
    public static final String FIELD_PREVIEWSTEP = "PREVIEWSTEP";
    protected static final String DTOFIELD_PREVIEWSTEP = "previewstep";
    public static final String FIELD_PSCODEPREVIEWACTIONID = "PSCODEPREVIEWACTIONID";
    protected static final String DTOFIELD_PSCODEPREVIEWACTIONID = "pscodepreviewactionid";
    public static final String FIELD_PSCODEPREVIEWACTIONNAME = "PSCODEPREVIEWACTIONNAME";
    protected static final String DTOFIELD_PSCODEPREVIEWACTIONNAME = "pscodepreviewactionname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDSCONSOLEID = "PSDSCONSOLEID";
    protected static final String DTOFIELD_PSDSCONSOLEID = "psdsconsoleid";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJTYPE = "PSOBJTYPE";
    protected static final String DTOFIELD_PSOBJTYPE = "psobjtype";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_TEMPLCODE = "TEMPLCODE";
    protected static final String DTOFIELD_TEMPLCODE = "templcode";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";


    @JsonProperty(value="actionparam")
    public void setACTIONPARAM(String aCTIONPARAM) {
        this._set(DTOFIELD_ACTIONPARAM, aCTIONPARAM);
    }

    @JsonIgnore
    public String getACTIONPARAM() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTIONPARAMDirty() {
        return this._contains(DTOFIELD_ACTIONPARAM);
    }

    @JsonIgnore
    public void resetACTIONPARAM() {
        this._reset(DTOFIELD_ACTIONPARAM);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionparam(String aCTIONPARAM) {
        this.setACTIONPARAM(aCTIONPARAM);
        return this;
    }

    @JsonProperty(value="actionparam2")
    public void setACTIONPARAM2(String aCTIONPARAM2) {
        this._set(DTOFIELD_ACTIONPARAM2, aCTIONPARAM2);
    }

    @JsonIgnore
    public String getACTIONPARAM2() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTIONPARAM2Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM2);
    }

    @JsonIgnore
    public void resetACTIONPARAM2() {
        this._reset(DTOFIELD_ACTIONPARAM2);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionparam2(String aCTIONPARAM2) {
        this.setACTIONPARAM2(aCTIONPARAM2);
        return this;
    }

    @JsonProperty(value="actionparam3")
    public void setACTIONPARAM3(String aCTIONPARAM3) {
        this._set(DTOFIELD_ACTIONPARAM3, aCTIONPARAM3);
    }

    @JsonIgnore
    public String getACTIONPARAM3() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTIONPARAM3Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM3);
    }

    @JsonIgnore
    public void resetACTIONPARAM3() {
        this._reset(DTOFIELD_ACTIONPARAM3);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionparam3(String aCTIONPARAM3) {
        this.setACTIONPARAM3(aCTIONPARAM3);
        return this;
    }

    @JsonProperty(value="actionparam4")
    public void setACTIONPARAM4(String aCTIONPARAM4) {
        this._set(DTOFIELD_ACTIONPARAM4, aCTIONPARAM4);
    }

    @JsonIgnore
    public String getACTIONPARAM4() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTIONPARAM4Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM4);
    }

    @JsonIgnore
    public void resetACTIONPARAM4() {
        this._reset(DTOFIELD_ACTIONPARAM4);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionparam4(String aCTIONPARAM4) {
        this.setACTIONPARAM4(aCTIONPARAM4);
        return this;
    }

    @JsonProperty(value="actionparam5")
    public void setACTIONPARAM5(Integer aCTIONPARAM5) {
        this._set(DTOFIELD_ACTIONPARAM5, aCTIONPARAM5);
    }

    @JsonIgnore
    public Integer getACTIONPARAM5() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isACTIONPARAM5Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM5);
    }

    @JsonIgnore
    public void resetACTIONPARAM5() {
        this._reset(DTOFIELD_ACTIONPARAM5);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionparam5(Integer aCTIONPARAM5) {
        this.setACTIONPARAM5(aCTIONPARAM5);
        return this;
    }

    @JsonProperty(value="actionparam6")
    public void setACTIONPARAM6(Integer aCTIONPARAM6) {
        this._set(DTOFIELD_ACTIONPARAM6, aCTIONPARAM6);
    }

    @JsonIgnore
    public Integer getACTIONPARAM6() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isACTIONPARAM6Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM6);
    }

    @JsonIgnore
    public void resetACTIONPARAM6() {
        this._reset(DTOFIELD_ACTIONPARAM6);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionparam6(Integer aCTIONPARAM6) {
        this.setACTIONPARAM6(aCTIONPARAM6);
        return this;
    }

    @JsonProperty(value="actionresult")
    public void setACTIONRESULT(String aCTIONRESULT) {
        this._set(DTOFIELD_ACTIONRESULT, aCTIONRESULT);
    }

    @JsonIgnore
    public String getACTIONRESULT() {
        Object objValue = this._get(DTOFIELD_ACTIONRESULT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTIONRESULTDirty() {
        return this._contains(DTOFIELD_ACTIONRESULT);
    }

    @JsonIgnore
    public void resetACTIONRESULT() {
        this._reset(DTOFIELD_ACTIONRESULT);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionresult(String aCTIONRESULT) {
        this.setACTIONRESULT(aCTIONRESULT);
        return this;
    }

    @JsonProperty(value="actionstate")
    public void setACTIONSTATE(Integer aCTIONSTATE) {
        this._set(DTOFIELD_ACTIONSTATE, aCTIONSTATE);
    }

    @JsonIgnore
    public Integer getACTIONSTATE() {
        Object objValue = this._get(DTOFIELD_ACTIONSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isACTIONSTATEDirty() {
        return this._contains(DTOFIELD_ACTIONSTATE);
    }

    @JsonIgnore
    public void resetACTIONSTATE() {
        this._reset(DTOFIELD_ACTIONSTATE);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO actionstate(Integer aCTIONSTATE) {
        this.setACTIONSTATE(aCTIONSTATE);
        return this;
    }

    @JsonProperty(value="begintime")
    public void setBEGINTIME(String bEGINTIME) {
        this._set(DTOFIELD_BEGINTIME, bEGINTIME);
    }

    @JsonIgnore
    public String getBEGINTIME() {
        Object objValue = this._get(DTOFIELD_BEGINTIME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBEGINTIMEDirty() {
        return this._contains(DTOFIELD_BEGINTIME);
    }

    @JsonIgnore
    public void resetBEGINTIME() {
        this._reset(DTOFIELD_BEGINTIME);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO begintime(String bEGINTIME) {
        this.setBEGINTIME(bEGINTIME);
        return this;
    }

    @JsonProperty(value="codeurl")
    public void setCODEURL(String cODEURL) {
        this._set(DTOFIELD_CODEURL, cODEURL);
    }

    @JsonIgnore
    public String getCODEURL() {
        Object objValue = this._get(DTOFIELD_CODEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCODEURLDirty() {
        return this._contains(DTOFIELD_CODEURL);
    }

    @JsonIgnore
    public void resetCODEURL() {
        this._reset(DTOFIELD_CODEURL);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO codeurl(String cODEURL) {
        this.setCODEURL(cODEURL);
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
    public PSCodePreviewActionDTO createdate(String cREATEDATE) {
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
    public PSCodePreviewActionDTO createman(String cREATEMAN) {
        this.setCREATEMAN(cREATEMAN);
        return this;
    }

    @JsonProperty(value="endtime")
    public void setENDTIME(String eNDTIME) {
        this._set(DTOFIELD_ENDTIME, eNDTIME);
    }

    @JsonIgnore
    public String getENDTIME() {
        Object objValue = this._get(DTOFIELD_ENDTIME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isENDTIMEDirty() {
        return this._contains(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public void resetENDTIME() {
        this._reset(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO endtime(String eNDTIME) {
        this.setENDTIME(eNDTIME);
        return this;
    }

    @JsonProperty(value="previewstep")
    public void setPREVIEWSTEP(String pREVIEWSTEP) {
        this._set(DTOFIELD_PREVIEWSTEP, pREVIEWSTEP);
    }

    @JsonIgnore
    public String getPREVIEWSTEP() {
        Object objValue = this._get(DTOFIELD_PREVIEWSTEP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPREVIEWSTEPDirty() {
        return this._contains(DTOFIELD_PREVIEWSTEP);
    }

    @JsonIgnore
    public void resetPREVIEWSTEP() {
        this._reset(DTOFIELD_PREVIEWSTEP);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO previewstep(String pREVIEWSTEP) {
        this.setPREVIEWSTEP(pREVIEWSTEP);
        return this;
    }

    @JsonProperty(value="pscodepreviewactionid")
    public void setPSCODEPREVIEWACTIONID(String pSCODEPREVIEWACTIONID) {
        this._set(DTOFIELD_PSCODEPREVIEWACTIONID, pSCODEPREVIEWACTIONID);
    }

    @JsonIgnore
    public String getPSCODEPREVIEWACTIONID() {
        Object objValue = this._get(DTOFIELD_PSCODEPREVIEWACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCODEPREVIEWACTIONIDDirty() {
        return this._contains(DTOFIELD_PSCODEPREVIEWACTIONID);
    }

    @JsonIgnore
    public void resetPSCODEPREVIEWACTIONID() {
        this._reset(DTOFIELD_PSCODEPREVIEWACTIONID);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO pscodepreviewactionid(String pSCODEPREVIEWACTIONID) {
        this.setPSCODEPREVIEWACTIONID(pSCODEPREVIEWACTIONID);
        return this;
    }

    @JsonProperty(value="pscodepreviewactionname")
    public void setPSCODEPREVIEWACTIONNAME(String pSCODEPREVIEWACTIONNAME) {
        this._set(DTOFIELD_PSCODEPREVIEWACTIONNAME, pSCODEPREVIEWACTIONNAME);
    }

    @JsonIgnore
    public String getPSCODEPREVIEWACTIONNAME() {
        Object objValue = this._get(DTOFIELD_PSCODEPREVIEWACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCODEPREVIEWACTIONNAMEDirty() {
        return this._contains(DTOFIELD_PSCODEPREVIEWACTIONNAME);
    }

    @JsonIgnore
    public void resetPSCODEPREVIEWACTIONNAME() {
        this._reset(DTOFIELD_PSCODEPREVIEWACTIONNAME);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO pscodepreviewactionname(String pSCODEPREVIEWACTIONNAME) {
        this.setPSCODEPREVIEWACTIONNAME(pSCODEPREVIEWACTIONNAME);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDEVSLNSYSID(String pSDEVSLNSYSID) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDEVSLNSYSID);
    }

    @JsonIgnore
    public String getPSDEVSLNSYSID() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEVSLNSYSIDDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDEVSLNSYSID() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO psdevslnsysid(String pSDEVSLNSYSID) {
        this.setPSDEVSLNSYSID(pSDEVSLNSYSID);
        return this;
    }

    @JsonProperty(value="psdsconsoleid")
    public void setPSDSCONSOLEID(String pSDSCONSOLEID) {
        this._set(DTOFIELD_PSDSCONSOLEID, pSDSCONSOLEID);
    }

    @JsonIgnore
    public String getPSDSCONSOLEID() {
        Object objValue = this._get(DTOFIELD_PSDSCONSOLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDSCONSOLEIDDirty() {
        return this._contains(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public void resetPSDSCONSOLEID() {
        this._reset(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO psdsconsoleid(String pSDSCONSOLEID) {
        this.setPSDSCONSOLEID(pSDSCONSOLEID);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDYNAINSTID(String pSDYNAINSTID) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDYNAINSTID);
    }

    @JsonIgnore
    public String getPSDYNAINSTID() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDYNAINSTIDDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDYNAINSTID() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO psdynainstid(String pSDYNAINSTID) {
        this.setPSDYNAINSTID(pSDYNAINSTID);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSOBJID(String pSOBJID) {
        this._set(DTOFIELD_PSOBJID, pSOBJID);
    }

    @JsonIgnore
    public String getPSOBJID() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSOBJIDDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSOBJID() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO psobjid(String pSOBJID) {
        this.setPSOBJID(pSOBJID);
        return this;
    }

    @JsonProperty(value="psobjtype")
    public void setPSOBJTYPE(String pSOBJTYPE) {
        this._set(DTOFIELD_PSOBJTYPE, pSOBJTYPE);
    }

    @JsonIgnore
    public String getPSOBJTYPE() {
        Object objValue = this._get(DTOFIELD_PSOBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSOBJTYPEDirty() {
        return this._contains(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public void resetPSOBJTYPE() {
        this._reset(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO psobjtype(String pSOBJTYPE) {
        this.setPSOBJTYPE(pSOBJTYPE);
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
    public PSCodePreviewActionDTO pssysappid(String pSSYSAPPID) {
        this.setPSSYSAPPID(pSSYSAPPID);
        return this;
    }

    @JsonProperty(value="pstaskserverid")
    public void setPSTASKSERVERID(String pSTASKSERVERID) {
        this._set(DTOFIELD_PSTASKSERVERID, pSTASKSERVERID);
    }

    @JsonIgnore
    public String getPSTASKSERVERID() {
        Object objValue = this._get(DTOFIELD_PSTASKSERVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSTASKSERVERIDDirty() {
        return this._contains(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public void resetPSTASKSERVERID() {
        this._reset(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO pstaskserverid(String pSTASKSERVERID) {
        this.setPSTASKSERVERID(pSTASKSERVERID);
        return this;
    }

    @JsonProperty(value="templcode")
    public void setTEMPLCODE(String tEMPLCODE) {
        this._set(DTOFIELD_TEMPLCODE, tEMPLCODE);
    }

    @JsonIgnore
    public String getTEMPLCODE() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTEMPLCODEDirty() {
        return this._contains(DTOFIELD_TEMPLCODE);
    }

    @JsonIgnore
    public void resetTEMPLCODE() {
        this._reset(DTOFIELD_TEMPLCODE);
    }

    @JsonIgnore
    public PSCodePreviewActionDTO templcode(String tEMPLCODE) {
        this.setTEMPLCODE(tEMPLCODE);
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
    public PSCodePreviewActionDTO updatedate(String uPDATEDATE) {
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
    public PSCodePreviewActionDTO updateman(String uPDATEMAN) {
        this.setUPDATEMAN(uPDATEMAN);
        return this;
    }
}