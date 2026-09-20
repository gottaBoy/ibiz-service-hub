package net.ibizsys.modeling.core.ai;

import net.ibizsys.central.cloud.core.ai.DefaultSysAIChatAgentRuntimeBase;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import org.springframework.util.ObjectUtils;

/**
 * Default AI chat agent runtime used by the modeling service.
 */
public class DefaultSysAIChatAgentRuntime extends DefaultSysAIChatAgentRuntimeBase {

    public static final String PARAM_AIMODE = "aimode";

    @Override
    public String getAIPlatformType() {
        ISystemAccessManager systemAccessManager =
                (ISystemAccessManager) this.getSystemRuntime().getSystemAccessManager();
        IAuthenticationUser authenticationUser = AuthenticationUser.getCurrent();
        if (authenticationUser != null) {
            IPSDevUser devUser = systemAccessManager.getCurrentPSDevUserIf();
            if (devUser != null && !ObjectUtils.isEmpty(devUser.getUserTag())) {
                return String.format("ibizmodeling_%1$s", devUser.getUserTag()).toLowerCase();
            }
        }
        return super.getAIPlatformType();
    }

    @Override
    public String getAgentParam(String strName, String strDefault) {
        if (PARAM_AIMODE.equalsIgnoreCase(strName)) {
            ISystemAccessManager systemAccessManager =
                    (ISystemAccessManager) this.getSystemRuntime().getSystemAccessManager();
            IAuthenticationUser authenticationUser = AuthenticationUser.getCurrent();
            if (authenticationUser != null) {
                IPSDevUser devUser = systemAccessManager.getCurrentPSDevUserIf();
                if (devUser != null && !ObjectUtils.isEmpty(devUser.getUserTag())) {
                    return devUser.getUserTag().toLowerCase();
                }
            }
        }
        return super.getAgentParam(strName, strDefault);
    }
}