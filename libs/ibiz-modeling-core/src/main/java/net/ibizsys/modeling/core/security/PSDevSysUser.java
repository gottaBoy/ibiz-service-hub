package net.ibizsys.modeling.core.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.ibizsys.model.PSModelEnums;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PSDevSysUser extends PSDevSlnUser implements IPSDevSysUser {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private String psDevSlnSysId;
    @JsonIgnore
    private String psDevSlnSysName;
    @JsonIgnore
    private String psDevSlnSysCodeName;
    @JsonIgnore
    private String psDevSlnSysLogicName;
    @JsonIgnore
    private String psSystemId;
    @JsonIgnore
    private String psSystemName;
    @JsonIgnore
    private String psSysModelInstId;
    @JsonIgnore
    private int curSysModelInstVer;
    @JsonIgnore
    private int activeSysModelInstVer;
    @JsonIgnore
    private int devSysState;

    public PSDevSysUser() {
        devSysState = PSModelEnums.DevSysState.UNINITIALIZED.value;
    }

    @Override
    public String getPSDevSlnSysId() {
        return psDevSlnSysId;
    }

    public void setPSDevSlnSysId(String psDevSlnSysId) {
        this.psDevSlnSysId = psDevSlnSysId;
    }

    @Override
    public String getPSDevSlnSysName() {
        return psDevSlnSysName;
    }

    public void setPSDevSlnSysName(String psDevSlnSysName) {
        this.psDevSlnSysName = psDevSlnSysName;
    }

    @Override
    public String getPSDevSlnSysCodeName() {
        return psDevSlnSysCodeName;
    }

    public void setPSDevSlnSysCodeName(String psDevSlnSysCodeName) {
        this.psDevSlnSysCodeName = psDevSlnSysCodeName;
    }

    @Override
    public String getPSDevSlnSysLogicName() {
        return psDevSlnSysLogicName;
    }

    public void setPSDevSlnSysLogicName(String psDevSlnSysLogicName) {
        this.psDevSlnSysLogicName = psDevSlnSysLogicName;
    }

    @Override
    public String getPSSystemId() {
        return psSystemId;
    }

    public void setPSSystemId(String psSystemId) {
        this.psSystemId = psSystemId;
    }

    @Override
    public String getPSSystemName() {
        return psSystemName == null || psSystemName.isEmpty() ? psDevSlnSysName : psSystemName;
    }

    public void setPSSystemName(String psSystemName) {
        this.psSystemName = psSystemName;
    }

    @Override
    public String getPSSysModelInstId() {
        return psSysModelInstId;
    }

    public void setPSSysModelInstId(String psSysModelInstId) {
        this.psSysModelInstId = psSysModelInstId;
    }

    @Override
    public int getActiveSysModelInstVer() {
        return activeSysModelInstVer;
    }

    public void setActiveSysModelInstVer(int activeSysModelInstVer) {
        this.activeSysModelInstVer = activeSysModelInstVer;
    }

    @Override
    public int getCurSysModelInstVer() {
        return curSysModelInstVer;
    }

    public void setCurSysModelInstVer(int curSysModelInstVer) {
        this.curSysModelInstVer = curSysModelInstVer;
    }

    @Override
    public int getDevSysState() {
        return devSysState;
    }

    public void setDevSysState(int devSysState) {
        this.devSysState = devSysState;
    }

    @Override
    public String getTargetType() {
        return TARGETTYPE_SYS;
    }
}