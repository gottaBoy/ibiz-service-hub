package net.ibizsys.modeling.core.security;

public interface ISystemAccessManager extends net.ibizsys.central.cloud.core.security.ISystemAccessManager {

    IPSDevUser getCurrentPSDevUser();

    IPSDevUser getCurrentPSDevUserMust();

    IPSDevUser getCurrentPSDevUserIf();

    IPSDevUserBase getPSDevUserBase(String objectType, String objectId);

    String getDefaultDCId();

    IPSDevSysUser getCurrentPSDevSysUser(boolean tryMode);
}