package net.ibizsys.modeling.core.security;

public interface IPSDevSlnUser extends IPSDevUserBase {

    int getAccMode();

    boolean isShareAccMode();

    boolean isMaintainAccMode();

    boolean isAdminMode();

    String getPSDevSlnId();
}