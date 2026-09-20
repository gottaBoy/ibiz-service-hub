package net.ibizsys.modeling.core.security;

public interface IPSDevUser extends IPSDevUserBase {

    int getAccMode();

    String getPSDCInstId();

    boolean isShareAccMode();

    boolean isMaintainAccMode();

    boolean isDefaultMode();

    boolean isAdminMode();

    String getPSDCType();

    int getPSDCLevel();
}