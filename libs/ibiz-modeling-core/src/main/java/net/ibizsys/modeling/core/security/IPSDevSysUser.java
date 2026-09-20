package net.ibizsys.modeling.core.security;

public interface IPSDevSysUser extends IPSDevSlnUser {

    String getPSDevSlnSysId();

    String getPSDevSlnSysCodeName();

    String getPSDevSlnSysLogicName();

    String getPSDevSlnSysName();

    String getPSSystemId();

    String getPSSysModelInstId();

    String getPSSystemName();

    int getActiveSysModelInstVer();

    int getCurSysModelInstVer();

    int getDevSysState();
}