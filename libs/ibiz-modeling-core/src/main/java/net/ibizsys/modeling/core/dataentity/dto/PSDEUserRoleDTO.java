package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEUserRoleDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLDATAFLAG = "ALLDATAFLAG";
    protected static final String DTOFIELD_ALLDATAFLAG = "alldataflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_ENABLEORGDR = "ENABLEORGDR";
    protected static final String DTOFIELD_ENABLEORGDR = "enableorgdr";
    public static final String FIELD_ENABLESECBC = "ENABLESECBC";
    protected static final String DTOFIELD_ENABLESECBC = "enablesecbc";
    public static final String FIELD_ENABLESECDR = "ENABLESECDR";
    protected static final String DTOFIELD_ENABLESECDR = "enablesecdr";
    public static final String FIELD_ENABLEUSERDR = "ENABLEUSERDR";
    protected static final String DTOFIELD_ENABLEUSERDR = "enableuserdr";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORGDR = "ORGDR";
    protected static final String DTOFIELD_ORGDR = "orgdr";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUSERROLEID = "PSDEUSERROLEID";
    protected static final String DTOFIELD_PSDEUSERROLEID = "psdeuserroleid";
    public static final String FIELD_PSDEUSERROLENAME = "PSDEUSERROLENAME";
    protected static final String DTOFIELD_PSDEUSERROLENAME = "psdeuserrolename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUSERDRID = "PSSYSUSERDRID";
    protected static final String DTOFIELD_PSSYSUSERDRID = "pssysuserdrid";
    public static final String FIELD_PSSYSUSERDRID2 = "PSSYSUSERDRID2";
    protected static final String DTOFIELD_PSSYSUSERDRID2 = "pssysuserdrid2";
    public static final String FIELD_PSSYSUSERDRNAME = "PSSYSUSERDRNAME";
    protected static final String DTOFIELD_PSSYSUSERDRNAME = "pssysuserdrname";
    public static final String FIELD_PSSYSUSERDRNAME2 = "PSSYSUSERDRNAME2";
    protected static final String DTOFIELD_PSSYSUSERDRNAME2 = "pssysuserdrname2";
    public static final String FIELD_SECBC = "SECBC";
    protected static final String DTOFIELD_SECBC = "secbc";
    public static final String FIELD_SECDR = "SECDR";
    protected static final String DTOFIELD_SECDR = "secdr";
    public static final String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
    protected static final String DTOFIELD_SYSTEMFLAG = "systemflag";
    public static final String FIELD_SYSUSERDR2PARAM = "SYSUSERDR2PARAM";
    protected static final String DTOFIELD_SYSUSERDR2PARAM = "sysuserdr2param";
    public static final String FIELD_SYSUSERDRPARAM = "SYSUSERDRPARAM";
    protected static final String DTOFIELD_SYSUSERDRPARAM = "sysuserdrparam";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERROLETAG = "USERROLETAG";
    protected static final String DTOFIELD_USERROLETAG = "userroletag";
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
    public static final String DTOFIELD_PSDEOPPRIVROLES = "psdeopprivroles";

    @JsonProperty(value="alldataflag")
    public void setAllDataFlag(Integer allDataFlag) {
        this._set(DTOFIELD_ALLDATAFLAG, allDataFlag);
    }

    @JsonIgnore
    public Integer getAllDataFlag() {
        Object objValue = this._get(DTOFIELD_ALLDATAFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllDataFlagDirty() {
        return this._contains(DTOFIELD_ALLDATAFLAG);
    }

    @JsonIgnore
    public void resetAllDataFlag() {
        this._reset(DTOFIELD_ALLDATAFLAG);
    }

    @JsonIgnore
    public PSDEUserRoleDTO alldataflag(Integer allDataFlag) {
        this.setAllDataFlag(allDataFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO alldataflag(Boolean allDataFlag) {
        if (allDataFlag == null) {
            this.setAllDataFlag(null);
        } else {
            this.setAllDataFlag(allDataFlag != false ? 1 : 0);
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
    public PSDEUserRoleDTO createdate(Timestamp createDate) {
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
    public PSDEUserRoleDTO createman(String createMan) {
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
    public PSDEUserRoleDTO customcond(String customCond) {
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
    public PSDEUserRoleDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSDEUserRoleDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableorgdr")
    public void setEnableOrgDR(Integer enableOrgDR) {
        this._set(DTOFIELD_ENABLEORGDR, enableOrgDR);
    }

    @JsonIgnore
    public Integer getEnableOrgDR() {
        Object objValue = this._get(DTOFIELD_ENABLEORGDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableOrgDRDirty() {
        return this._contains(DTOFIELD_ENABLEORGDR);
    }

    @JsonIgnore
    public void resetEnableOrgDR() {
        this._reset(DTOFIELD_ENABLEORGDR);
    }

    @JsonIgnore
    public PSDEUserRoleDTO enableorgdr(Integer enableOrgDR) {
        this.setEnableOrgDR(enableOrgDR);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO enableorgdr(Boolean enableOrgDR) {
        if (enableOrgDR == null) {
            this.setEnableOrgDR(null);
        } else {
            this.setEnableOrgDR(enableOrgDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesecbc")
    public void setEnableSecBC(Integer enableSecBC) {
        this._set(DTOFIELD_ENABLESECBC, enableSecBC);
    }

    @JsonIgnore
    public Integer getEnableSecBC() {
        Object objValue = this._get(DTOFIELD_ENABLESECBC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSecBCDirty() {
        return this._contains(DTOFIELD_ENABLESECBC);
    }

    @JsonIgnore
    public void resetEnableSecBC() {
        this._reset(DTOFIELD_ENABLESECBC);
    }

    @JsonIgnore
    public PSDEUserRoleDTO enablesecbc(Integer enableSecBC) {
        this.setEnableSecBC(enableSecBC);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO enablesecbc(Boolean enableSecBC) {
        if (enableSecBC == null) {
            this.setEnableSecBC(null);
        } else {
            this.setEnableSecBC(enableSecBC != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesecdr")
    public void setEnableSecDR(Integer enableSecDR) {
        this._set(DTOFIELD_ENABLESECDR, enableSecDR);
    }

    @JsonIgnore
    public Integer getEnableSecDR() {
        Object objValue = this._get(DTOFIELD_ENABLESECDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSecDRDirty() {
        return this._contains(DTOFIELD_ENABLESECDR);
    }

    @JsonIgnore
    public void resetEnableSecDR() {
        this._reset(DTOFIELD_ENABLESECDR);
    }

    @JsonIgnore
    public PSDEUserRoleDTO enablesecdr(Integer enableSecDR) {
        this.setEnableSecDR(enableSecDR);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO enablesecdr(Boolean enableSecDR) {
        if (enableSecDR == null) {
            this.setEnableSecDR(null);
        } else {
            this.setEnableSecDR(enableSecDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableuserdr")
    public void setEnableUserDR(Integer enableUserDR) {
        this._set(DTOFIELD_ENABLEUSERDR, enableUserDR);
    }

    @JsonIgnore
    public Integer getEnableUserDR() {
        Object objValue = this._get(DTOFIELD_ENABLEUSERDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUserDRDirty() {
        return this._contains(DTOFIELD_ENABLEUSERDR);
    }

    @JsonIgnore
    public void resetEnableUserDR() {
        this._reset(DTOFIELD_ENABLEUSERDR);
    }

    @JsonIgnore
    public PSDEUserRoleDTO enableuserdr(Integer enableUserDR) {
        this.setEnableUserDR(enableUserDR);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO enableuserdr(Boolean enableUserDR) {
        if (enableUserDR == null) {
            this.setEnableUserDR(null);
        } else {
            this.setEnableUserDR(enableUserDR != false ? 1 : 0);
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
    public PSDEUserRoleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="orgdr")
    public void setOrgDR(Integer orgDR) {
        this._set(DTOFIELD_ORGDR, orgDR);
    }

    @JsonIgnore
    public Integer getOrgDR() {
        Object objValue = this._get(DTOFIELD_ORGDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrgDRDirty() {
        return this._contains(DTOFIELD_ORGDR);
    }

    @JsonIgnore
    public void resetOrgDR() {
        this._reset(DTOFIELD_ORGDR);
    }

    @JsonIgnore
    public PSDEUserRoleDTO orgdr(Integer orgDR) {
        this.setOrgDR(orgDR);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO orgdr(PSModelEnums.OrgScope[] orgDR) {
        if (orgDR == null || orgDR.length == 0) {
            this.setOrgDR(null);
        } else {
            int _value = 0;
            for (PSModelEnums.OrgScope _item : orgDR) {
                _value |= _item.value;
            }
            this.setOrgDR(_value);
        }
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
    public PSDEUserRoleDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEUserRoleDTO psdedsname(String pSDEDSName) {
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
    public PSDEUserRoleDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
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
    public PSDEUserRoleDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeuserroleid")
    public void setPSDEUserRoleId(String pSDEUserRoleId) {
        this._set(DTOFIELD_PSDEUSERROLEID, pSDEUserRoleId);
    }

    @JsonIgnore
    public String getPSDEUserRoleId() {
        Object objValue = this._get(DTOFIELD_PSDEUSERROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUserRoleIdDirty() {
        return this._contains(DTOFIELD_PSDEUSERROLEID);
    }

    @JsonIgnore
    public void resetPSDEUserRoleId() {
        this._reset(DTOFIELD_PSDEUSERROLEID);
    }

    @JsonIgnore
    public PSDEUserRoleDTO psdeuserroleid(String pSDEUserRoleId) {
        this.setPSDEUserRoleId(pSDEUserRoleId);
        return this;
    }

    @JsonProperty(value="psdeuserrolename")
    public void setPSDEUserRoleName(String pSDEUserRoleName) {
        this._set(DTOFIELD_PSDEUSERROLENAME, pSDEUserRoleName);
    }

    @JsonIgnore
    public String getPSDEUserRoleName() {
        Object objValue = this._get(DTOFIELD_PSDEUSERROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUserRoleNameDirty() {
        return this._contains(DTOFIELD_PSDEUSERROLENAME);
    }

    @JsonIgnore
    public void resetPSDEUserRoleName() {
        this._reset(DTOFIELD_PSDEUSERROLENAME);
    }

    @JsonIgnore
    public PSDEUserRoleDTO psdeuserrolename(String pSDEUserRoleName) {
        this.setPSDEUserRoleName(pSDEUserRoleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEUserRoleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEUserRoleName(strName);
    }

    @JsonIgnore
    public PSDEUserRoleDTO name(String strName) {
        this.setPSDEUserRoleName(strName);
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
    public PSDEUserRoleDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEUserRoleDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysuserdrid")
    public void setPSSysUserDRId(String pSSysUserDRId) {
        this._set(DTOFIELD_PSSYSUSERDRID, pSSysUserDRId);
    }

    @JsonIgnore
    public String getPSSysUserDRId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRID);
    }

    @JsonIgnore
    public void resetPSSysUserDRId() {
        this._reset(DTOFIELD_PSSYSUSERDRID);
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssysuserdrid(String pSSysUserDRId) {
        this.setPSSysUserDRId(pSSysUserDRId);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssysuserdrid(PSSysUserDRDTO pSSysUserDR) {
        if (pSSysUserDR == null) {
            this.setPSSysUserDRId(null);
            this.setPSSysUserDRName(null);
        } else {
            this.setPSSysUserDRId(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    @JsonProperty(value="pssysuserdrid2")
    public void setPSSysUserDRId2(String pSSysUserDRId2) {
        this._set(DTOFIELD_PSSYSUSERDRID2, pSSysUserDRId2);
    }

    @JsonIgnore
    public String getPSSysUserDRId2() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRID2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRId2Dirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRID2);
    }

    @JsonIgnore
    public void resetPSSysUserDRId2() {
        this._reset(DTOFIELD_PSSYSUSERDRID2);
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssysuserdrid2(String pSSysUserDRId2) {
        this.setPSSysUserDRId2(pSSysUserDRId2);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssysuserdrid2(PSSysUserDRDTO pSSysUserDR) {
        if (pSSysUserDR == null) {
            this.setPSSysUserDRId2(null);
            this.setPSSysUserDRName2(null);
        } else {
            this.setPSSysUserDRId2(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName2(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    @JsonProperty(value="pssysuserdrname")
    public void setPSSysUserDRName(String pSSysUserDRName) {
        this._set(DTOFIELD_PSSYSUSERDRNAME, pSSysUserDRName);
    }

    @JsonIgnore
    public String getPSSysUserDRName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRNAME);
    }

    @JsonIgnore
    public void resetPSSysUserDRName() {
        this._reset(DTOFIELD_PSSYSUSERDRNAME);
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssysuserdrname(String pSSysUserDRName) {
        this.setPSSysUserDRName(pSSysUserDRName);
        return this;
    }

    @JsonProperty(value="pssysuserdrname2")
    public void setPSSysUserDRName2(String pSSysUserDRName2) {
        this._set(DTOFIELD_PSSYSUSERDRNAME2, pSSysUserDRName2);
    }

    @JsonIgnore
    public String getPSSysUserDRName2() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRName2Dirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRNAME2);
    }

    @JsonIgnore
    public void resetPSSysUserDRName2() {
        this._reset(DTOFIELD_PSSYSUSERDRNAME2);
    }

    @JsonIgnore
    public PSDEUserRoleDTO pssysuserdrname2(String pSSysUserDRName2) {
        this.setPSSysUserDRName2(pSSysUserDRName2);
        return this;
    }

    @JsonProperty(value="secbc")
    public void setSecBC(String secBC) {
        this._set(DTOFIELD_SECBC, secBC);
    }

    @JsonIgnore
    public String getSecBC() {
        Object objValue = this._get(DTOFIELD_SECBC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSecBCDirty() {
        return this._contains(DTOFIELD_SECBC);
    }

    @JsonIgnore
    public void resetSecBC() {
        this._reset(DTOFIELD_SECBC);
    }

    @JsonIgnore
    public PSDEUserRoleDTO secbc(String secBC) {
        this.setSecBC(secBC);
        return this;
    }

    @JsonProperty(value="secdr")
    public void setSecDR(Integer secDR) {
        this._set(DTOFIELD_SECDR, secDR);
    }

    @JsonIgnore
    public Integer getSecDR() {
        Object objValue = this._get(DTOFIELD_SECDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSecDRDirty() {
        return this._contains(DTOFIELD_SECDR);
    }

    @JsonIgnore
    public void resetSecDR() {
        this._reset(DTOFIELD_SECDR);
    }

    @JsonIgnore
    public PSDEUserRoleDTO secdr(Integer secDR) {
        this.setSecDR(secDR);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO secdr(PSModelEnums.OrgScope[] secDR) {
        if (secDR == null || secDR.length == 0) {
            this.setSecDR(null);
        } else {
            int _value = 0;
            for (PSModelEnums.OrgScope _item : secDR) {
                _value |= _item.value;
            }
            this.setSecDR(_value);
        }
        return this;
    }

    @JsonProperty(value="systemflag")
    public void setSystemFlag(Integer systemFlag) {
        this._set(DTOFIELD_SYSTEMFLAG, systemFlag);
    }

    @JsonIgnore
    public Integer getSystemFlag() {
        Object objValue = this._get(DTOFIELD_SYSTEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSystemFlagDirty() {
        return this._contains(DTOFIELD_SYSTEMFLAG);
    }

    @JsonIgnore
    public void resetSystemFlag() {
        this._reset(DTOFIELD_SYSTEMFLAG);
    }

    @JsonIgnore
    public PSDEUserRoleDTO systemflag(Integer systemFlag) {
        this.setSystemFlag(systemFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO systemflag(Boolean systemFlag) {
        if (systemFlag == null) {
            this.setSystemFlag(null);
        } else {
            this.setSystemFlag(systemFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="sysuserdr2param")
    public void setSysUserDR2Param(String sysUserDR2Param) {
        this._set(DTOFIELD_SYSUSERDR2PARAM, sysUserDR2Param);
    }

    @JsonIgnore
    public String getSysUserDR2Param() {
        Object objValue = this._get(DTOFIELD_SYSUSERDR2PARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysUserDR2ParamDirty() {
        return this._contains(DTOFIELD_SYSUSERDR2PARAM);
    }

    @JsonIgnore
    public void resetSysUserDR2Param() {
        this._reset(DTOFIELD_SYSUSERDR2PARAM);
    }

    @JsonIgnore
    public PSDEUserRoleDTO sysuserdr2param(String sysUserDR2Param) {
        this.setSysUserDR2Param(sysUserDR2Param);
        return this;
    }

    @JsonProperty(value="sysuserdrparam")
    public void setSysUserDRParam(String sysUserDRParam) {
        this._set(DTOFIELD_SYSUSERDRPARAM, sysUserDRParam);
    }

    @JsonIgnore
    public String getSysUserDRParam() {
        Object objValue = this._get(DTOFIELD_SYSUSERDRPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysUserDRParamDirty() {
        return this._contains(DTOFIELD_SYSUSERDRPARAM);
    }

    @JsonIgnore
    public void resetSysUserDRParam() {
        this._reset(DTOFIELD_SYSUSERDRPARAM);
    }

    @JsonIgnore
    public PSDEUserRoleDTO sysuserdrparam(String sysUserDRParam) {
        this.setSysUserDRParam(sysUserDRParam);
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
    public PSDEUserRoleDTO updatedate(Timestamp updateDate) {
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
    public PSDEUserRoleDTO updateman(String updateMan) {
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
    public PSDEUserRoleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userroletag")
    public void setUserRoleTag(String userRoleTag) {
        this._set(DTOFIELD_USERROLETAG, userRoleTag);
    }

    @JsonIgnore
    public String getUserRoleTag() {
        Object objValue = this._get(DTOFIELD_USERROLETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserRoleTagDirty() {
        return this._contains(DTOFIELD_USERROLETAG);
    }

    @JsonIgnore
    public void resetUserRoleTag() {
        this._reset(DTOFIELD_USERROLETAG);
    }

    @JsonIgnore
    public PSDEUserRoleDTO userroletag(String userRoleTag) {
        this.setUserRoleTag(userRoleTag);
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
    public PSDEUserRoleDTO usertag(String userTag) {
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
    public PSDEUserRoleDTO usertag2(String userTag2) {
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
    public PSDEUserRoleDTO usertag3(String userTag3) {
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
    public PSDEUserRoleDTO usertag4(String userTag4) {
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
    public PSDEUserRoleDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUserRoleDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEUserRoleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEUserRoleId(strValue);
    }

    @JsonIgnore
    public PSDEUserRoleDTO id(String strValue) {
        this.setPSDEUserRoleId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEOPPrivRoleDTO> getPSDEOPPrivRoles() {
        Object list = this._get(DTOFIELD_PSDEOPPRIVROLES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeopprivroles")
    public void setPSDEOPPrivRoles(List<PSDEOPPrivRoleDTO> psdeopprivroles) {
        this._set(DTOFIELD_PSDEOPPRIVROLES, psdeopprivroles);
    }

    @JsonIgnore
    public List<PSDEOPPrivRoleDTO> getPSDEOPPrivRolesIf() {
        Object list = this._get(DTOFIELD_PSDEOPPRIVROLES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEOPPRIVROLES, list);
        }
        return (List) list;
    }
}
