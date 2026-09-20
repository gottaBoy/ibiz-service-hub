package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSCodeServerActionDTO
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
    public static final String FIELD_ACTIONSTEP = "ACTIONSTEP";
    protected static final String DTOFIELD_ACTIONSTEP = "actionstep";
    public static final String FIELD_BEGINTIME = "BEGINTIME";
    protected static final String DTOFIELD_BEGINTIME = "begintime";
    public static final String FIELD_CODESERVERURL = "CODESERVERURL";
    protected static final String DTOFIELD_CODESERVERURL = "codeserverurl";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENDTIME = "ENDTIME";
    protected static final String DTOFIELD_ENDTIME = "endtime";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PSCODESERVERACTIONID = "PSCODESERVERACTIONID";
    protected static final String DTOFIELD_PSCODESERVERACTIONID = "pscodeserveractionid";
    public static final String FIELD_PSCODESERVERACTIONNAME = "PSCODESERVERACTIONNAME";
    protected static final String DTOFIELD_PSCODESERVERACTIONNAME = "pscodeserveractionname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDSCONSOLEID = "PSDSCONSOLEID";
    protected static final String DTOFIELD_PSDSCONSOLEID = "psdsconsoleid";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJTYPE = "PSOBJTYPE";
    protected static final String DTOFIELD_PSOBJTYPE = "psobjtype";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
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
    public PSCodeServerActionDTO actionparam(String aCTIONPARAM) {
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
    public PSCodeServerActionDTO actionparam2(String aCTIONPARAM2) {
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
    public PSCodeServerActionDTO actionparam3(String aCTIONPARAM3) {
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
    public PSCodeServerActionDTO actionparam4(String aCTIONPARAM4) {
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
    public PSCodeServerActionDTO actionparam5(Integer aCTIONPARAM5) {
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
    public PSCodeServerActionDTO actionparam6(Integer aCTIONPARAM6) {
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
    public PSCodeServerActionDTO actionresult(String aCTIONRESULT) {
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
    public PSCodeServerActionDTO actionstate(Integer aCTIONSTATE) {
        this.setACTIONSTATE(aCTIONSTATE);
        return this;
    }

    @JsonProperty(value="actionstep")
    public void setACTIONSTEP(String aCTIONSTEP) {
        this._set(DTOFIELD_ACTIONSTEP, aCTIONSTEP);
    }

    @JsonIgnore
    public String getACTIONSTEP() {
        Object objValue = this._get(DTOFIELD_ACTIONSTEP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTIONSTEPDirty() {
        return this._contains(DTOFIELD_ACTIONSTEP);
    }

    @JsonIgnore
    public void resetACTIONSTEP() {
        this._reset(DTOFIELD_ACTIONSTEP);
    }

    @JsonIgnore
    public PSCodeServerActionDTO actionstep(String aCTIONSTEP) {
        this.setACTIONSTEP(aCTIONSTEP);
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
    public PSCodeServerActionDTO begintime(String bEGINTIME) {
        this.setBEGINTIME(bEGINTIME);
        return this;
    }

    @JsonProperty(value="codeserverurl")
    public void setCODESERVERURL(String cODESERVERURL) {
        this._set(DTOFIELD_CODESERVERURL, cODESERVERURL);
    }

    @JsonIgnore
    public String getCODESERVERURL() {
        Object objValue = this._get(DTOFIELD_CODESERVERURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCODESERVERURLDirty() {
        return this._contains(DTOFIELD_CODESERVERURL);
    }

    @JsonIgnore
    public void resetCODESERVERURL() {
        this._reset(DTOFIELD_CODESERVERURL);
    }

    @JsonIgnore
    public PSCodeServerActionDTO codeserverurl(String cODESERVERURL) {
        this.setCODESERVERURL(cODESERVERURL);
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
    public PSCodeServerActionDTO createdate(String cREATEDATE) {
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
    public PSCodeServerActionDTO createman(String cREATEMAN) {
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
    public PSCodeServerActionDTO endtime(String eNDTIME) {
        this.setENDTIME(eNDTIME);
        return this;
    }

    @JsonProperty(value="passwd")
    public void setPASSWD(String pASSWD) {
        this._set(DTOFIELD_PASSWD, pASSWD);
    }

    @JsonIgnore
    public String getPASSWD() {
        Object objValue = this._get(DTOFIELD_PASSWD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPASSWDDirty() {
        return this._contains(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public void resetPASSWD() {
        this._reset(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public PSCodeServerActionDTO passwd(String pASSWD) {
        this.setPASSWD(pASSWD);
        return this;
    }

    @JsonProperty(value="pscodeserveractionid")
    public void setPSCODESERVERACTIONID(String pSCODESERVERACTIONID) {
        this._set(DTOFIELD_PSCODESERVERACTIONID, pSCODESERVERACTIONID);
    }

    @JsonIgnore
    public String getPSCODESERVERACTIONID() {
        Object objValue = this._get(DTOFIELD_PSCODESERVERACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCODESERVERACTIONIDDirty() {
        return this._contains(DTOFIELD_PSCODESERVERACTIONID);
    }

    @JsonIgnore
    public void resetPSCODESERVERACTIONID() {
        this._reset(DTOFIELD_PSCODESERVERACTIONID);
    }

    @JsonIgnore
    public PSCodeServerActionDTO pscodeserveractionid(String pSCODESERVERACTIONID) {
        this.setPSCODESERVERACTIONID(pSCODESERVERACTIONID);
        return this;
    }

    @JsonProperty(value="pscodeserveractionname")
    public void setPSCODESERVERACTIONNAME(String pSCODESERVERACTIONNAME) {
        this._set(DTOFIELD_PSCODESERVERACTIONNAME, pSCODESERVERACTIONNAME);
    }

    @JsonIgnore
    public String getPSCODESERVERACTIONNAME() {
        Object objValue = this._get(DTOFIELD_PSCODESERVERACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCODESERVERACTIONNAMEDirty() {
        return this._contains(DTOFIELD_PSCODESERVERACTIONNAME);
    }

    @JsonIgnore
    public void resetPSCODESERVERACTIONNAME() {
        this._reset(DTOFIELD_PSCODESERVERACTIONNAME);
    }

    @JsonIgnore
    public PSCodeServerActionDTO pscodeserveractionname(String pSCODESERVERACTIONNAME) {
        this.setPSCODESERVERACTIONNAME(pSCODESERVERACTIONNAME);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDEVSLNID(String pSDEVSLNID) {
        this._set(DTOFIELD_PSDEVSLNID, pSDEVSLNID);
    }

    @JsonIgnore
    public String getPSDEVSLNID() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEVSLNIDDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDEVSLNID() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSCodeServerActionDTO psdevslnid(String pSDEVSLNID) {
        this.setPSDEVSLNID(pSDEVSLNID);
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
    public PSCodeServerActionDTO psdsconsoleid(String pSDSCONSOLEID) {
        this.setPSDSCONSOLEID(pSDSCONSOLEID);
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
    public PSCodeServerActionDTO psobjid(String pSOBJID) {
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
    public PSCodeServerActionDTO psobjtype(String pSOBJTYPE) {
        this.setPSOBJTYPE(pSOBJTYPE);
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
    public PSCodeServerActionDTO pstaskserverid(String pSTASKSERVERID) {
        this.setPSTASKSERVERID(pSTASKSERVERID);
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
    public PSCodeServerActionDTO updatedate(String uPDATEDATE) {
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
    public PSCodeServerActionDTO updateman(String uPDATEMAN) {
        this.setUPDATEMAN(uPDATEMAN);
        return this;
    }
}