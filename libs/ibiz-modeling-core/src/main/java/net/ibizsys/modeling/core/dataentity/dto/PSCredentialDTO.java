package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSCredentialDTO extends PSModelDTOBase {
    public static final String FIELD_ALLDCFLAG = "ALLDCFLAG";
    protected static final String DTOFIELD_ALLDCFLAG = "alldcflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREDENTIALDATA = "CREDENTIALDATA";
    protected static final String DTOFIELD_CREDENTIALDATA = "credentialdata";
    public static final String FIELD_CREDENTIALTAG = "CREDENTIALTAG";
    protected static final String DTOFIELD_CREDENTIALTAG = "credentialtag";
    public static final String FIELD_CREDENTIALTAG2 = "CREDENTIALTAG2";
    protected static final String DTOFIELD_CREDENTIALTAG2 = "credentialtag2";
    public static final String FIELD_CREDENTIALTYPE = "CREDENTIALTYPE";
    protected static final String DTOFIELD_CREDENTIALTYPE = "credentialtype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PASSWDDATA = "PASSWDDATA";
    protected static final String DTOFIELD_PASSWDDATA = "passwddata";
    public static final String FIELD_PSCREDENTIALID = "PSCREDENTIALID";
    protected static final String DTOFIELD_PSCREDENTIALID = "pscredentialid";
    public static final String FIELD_PSCREDENTIALNAME = "PSCREDENTIALNAME";
    protected static final String DTOFIELD_PSCREDENTIALNAME = "pscredentialname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSSVRDOMAINID = "PSSVRDOMAINID";
    protected static final String DTOFIELD_PSSVRDOMAINID = "pssvrdomainid";
    public static final String FIELD_PSSVRDOMAINNAME = "PSSVRDOMAINNAME";
    protected static final String DTOFIELD_PSSVRDOMAINNAME = "pssvrdomainname";
    public static final String FIELD_SYNCMODE = "SYNCMODE";
    protected static final String DTOFIELD_SYNCMODE = "syncmode";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="alldcflag")
    public void setAllDCFlag(Integer allDCFlag) {
        this._set(DTOFIELD_ALLDCFLAG, allDCFlag);
    }

    @JsonIgnore
    public Integer getAllDCFlag() {
        Object objValue = this._get(DTOFIELD_ALLDCFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllDCFlagDirty() {
        return this._contains(DTOFIELD_ALLDCFLAG);
    }

    @JsonIgnore
    public void resetAllDCFlag() {
        this._reset(DTOFIELD_ALLDCFLAG);
    }

    @JsonIgnore
    public PSCredentialDTO alldcflag(Integer allDCFlag) {
        this.setAllDCFlag(allDCFlag);
        return this;
    }

    @JsonIgnore
    public PSCredentialDTO alldcflag(Boolean allDCFlag) {
        this.setAllDCFlag(allDCFlag == null ? null : (allDCFlag ? 1 : 0));
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
    public PSCredentialDTO createdate(Timestamp createDate) {
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
    public PSCredentialDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="credentialdata")
    public void setCredentialData(String credentialData) {
        this._set(DTOFIELD_CREDENTIALDATA, credentialData);
    }

    @JsonIgnore
    public String getCredentialData() {
        Object objValue = this._get(DTOFIELD_CREDENTIALDATA);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCredentialDataDirty() {
        return this._contains(DTOFIELD_CREDENTIALDATA);
    }

    @JsonIgnore
    public void resetCredentialData() {
        this._reset(DTOFIELD_CREDENTIALDATA);
    }

    @JsonIgnore
    public PSCredentialDTO credentialdata(String credentialData) {
        this.setCredentialData(credentialData);
        return this;
    }

    @JsonProperty(value="credentialtag")
    public void setCredentialTag(String credentialTag) {
        this._set(DTOFIELD_CREDENTIALTAG, credentialTag);
    }

    @JsonIgnore
    public String getCredentialTag() {
        Object objValue = this._get(DTOFIELD_CREDENTIALTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCredentialTagDirty() {
        return this._contains(DTOFIELD_CREDENTIALTAG);
    }

    @JsonIgnore
    public void resetCredentialTag() {
        this._reset(DTOFIELD_CREDENTIALTAG);
    }

    @JsonIgnore
    public PSCredentialDTO credentialtag(String credentialTag) {
        this.setCredentialTag(credentialTag);
        return this;
    }

    @JsonProperty(value="credentialtag2")
    public void setCredentialTag2(String credentialTag2) {
        this._set(DTOFIELD_CREDENTIALTAG2, credentialTag2);
    }

    @JsonIgnore
    public String getCredentialTag2() {
        Object objValue = this._get(DTOFIELD_CREDENTIALTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCredentialTag2Dirty() {
        return this._contains(DTOFIELD_CREDENTIALTAG2);
    }

    @JsonIgnore
    public void resetCredentialTag2() {
        this._reset(DTOFIELD_CREDENTIALTAG2);
    }

    @JsonIgnore
    public PSCredentialDTO credentialtag2(String credentialTag2) {
        this.setCredentialTag2(credentialTag2);
        return this;
    }

    @JsonProperty(value="credentialtype")
    public void setCredentialType(String credentialType) {
        this._set(DTOFIELD_CREDENTIALTYPE, credentialType);
    }

    @JsonIgnore
    public String getCredentialType() {
        Object objValue = this._get(DTOFIELD_CREDENTIALTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCredentialTypeDirty() {
        return this._contains(DTOFIELD_CREDENTIALTYPE);
    }

    @JsonIgnore
    public void resetCredentialType() {
        this._reset(DTOFIELD_CREDENTIALTYPE);
    }

    @JsonIgnore
    public PSCredentialDTO credentialtype(String credentialType) {
        this.setCredentialType(credentialType);
        return this;
    }

    @JsonIgnore
    public PSCredentialDTO credentialtype(PSModelEnums.CredentialType credentialType) {
        this.setCredentialType(credentialType == null ? null : credentialType.value);
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
    public PSCredentialDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="passwd")
    public void setPasswd(String passwd) {
        this._set(DTOFIELD_PASSWD, passwd);
    }

    @JsonIgnore
    public String getPasswd() {
        Object objValue = this._get(DTOFIELD_PASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPasswdDirty() {
        return this._contains(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public void resetPasswd() {
        this._reset(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public PSCredentialDTO passwd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    @JsonProperty(value="passwddata")
    public void setPasswdData(String passwdData) {
        this._set(DTOFIELD_PASSWDDATA, passwdData);
    }

    @JsonIgnore
    public String getPasswdData() {
        Object objValue = this._get(DTOFIELD_PASSWDDATA);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPasswdDataDirty() {
        return this._contains(DTOFIELD_PASSWDDATA);
    }

    @JsonIgnore
    public void resetPasswdData() {
        this._reset(DTOFIELD_PASSWDDATA);
    }

    @JsonIgnore
    public PSCredentialDTO passwddata(String passwdData) {
        this.setPasswdData(passwdData);
        return this;
    }

    @JsonProperty(value="pscredentialid")
    public void setPSCredentialId(String pSCredentialId) {
        this._set(DTOFIELD_PSCREDENTIALID, pSCredentialId);
    }

    @JsonIgnore
    public String getPSCredentialId() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialIdDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public void resetPSCredentialId() {
        this._reset(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public PSCredentialDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonProperty(value="pscredentialname")
    public void setPSCredentialName(String pSCredentialName) {
        this._set(DTOFIELD_PSCREDENTIALNAME, pSCredentialName);
    }

    @JsonIgnore
    public String getPSCredentialName() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialNameDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public void resetPSCredentialName() {
        this._reset(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public PSCredentialDTO pscredentialname(String pSCredentialName) {
        this.setPSCredentialName(pSCredentialName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSCredentialDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSCredentialDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSCredentialDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSCredentialDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSCredentialDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSCredentialDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="pssvrdomainid")
    public void setPSSvrDomainId(String pSSvrDomainId) {
        this._set(DTOFIELD_PSSVRDOMAINID, pSSvrDomainId);
    }

    @JsonIgnore
    public String getPSSvrDomainId() {
        Object objValue = this._get(DTOFIELD_PSSVRDOMAINID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSvrDomainIdDirty() {
        return this._contains(DTOFIELD_PSSVRDOMAINID);
    }

    @JsonIgnore
    public void resetPSSvrDomainId() {
        this._reset(DTOFIELD_PSSVRDOMAINID);
    }

    @JsonIgnore
    public PSCredentialDTO pssvrdomainid(String pSSvrDomainId) {
        this.setPSSvrDomainId(pSSvrDomainId);
        return this;
    }

    @JsonProperty(value="pssvrdomainname")
    public void setPSSvrDomainName(String pSSvrDomainName) {
        this._set(DTOFIELD_PSSVRDOMAINNAME, pSSvrDomainName);
    }

    @JsonIgnore
    public String getPSSvrDomainName() {
        Object objValue = this._get(DTOFIELD_PSSVRDOMAINNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSvrDomainNameDirty() {
        return this._contains(DTOFIELD_PSSVRDOMAINNAME);
    }

    @JsonIgnore
    public void resetPSSvrDomainName() {
        this._reset(DTOFIELD_PSSVRDOMAINNAME);
    }

    @JsonIgnore
    public PSCredentialDTO pssvrdomainname(String pSSvrDomainName) {
        this.setPSSvrDomainName(pSSvrDomainName);
        return this;
    }

    @JsonProperty(value="syncmode")
    public void setSyncMode(Integer syncMode) {
        this._set(DTOFIELD_SYNCMODE, syncMode);
    }

    @JsonIgnore
    public Integer getSyncMode() {
        Object objValue = this._get(DTOFIELD_SYNCMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSyncModeDirty() {
        return this._contains(DTOFIELD_SYNCMODE);
    }

    @JsonIgnore
    public void resetSyncMode() {
        this._reset(DTOFIELD_SYNCMODE);
    }

    @JsonIgnore
    public PSCredentialDTO syncmode(Integer syncMode) {
        this.setSyncMode(syncMode);
        return this;
    }

    @JsonIgnore
    public PSCredentialDTO syncmode(PSModelEnums.CredentialSyncMode syncMode) {
        this.setSyncMode(syncMode == null ? null : syncMode.value);
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
    public PSCredentialDTO updatedate(Timestamp updateDate) {
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
    public PSCredentialDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="username")
    public void setUserName(String userName) {
        this._set(DTOFIELD_USERNAME, userName);
    }

    @JsonIgnore
    public String getUserName() {
        Object objValue = this._get(DTOFIELD_USERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserNameDirty() {
        return this._contains(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public void resetUserName() {
        this._reset(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public PSCredentialDTO username(String userName) {
        this.setUserName(userName);
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
    public PSCredentialDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSCredentialDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSCredentialName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSCredentialName(strName);
    }

    @JsonIgnore
    public PSCredentialDTO name(String strName) {
        this.setPSCredentialName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSCredentialId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSCredentialId(strValue);
    }

    @JsonIgnore
    public PSCredentialDTO id(String strValue) {
        this.setPSCredentialId(strValue);
        return this;
    }

}
