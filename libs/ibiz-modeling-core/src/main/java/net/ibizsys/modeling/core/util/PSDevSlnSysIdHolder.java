package net.ibizsys.modeling.core.util;

import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAppContext;

/**
 * Thread-local holder for the current dev-sln-sys context.
 *
 * <p>Resolves the active PSDevSlnSysId from the current user or the
 * application context, used during DSL export id resolution.</p>
 */
public final class PSDevSlnSysIdHolder {

    private PSDevSlnSysIdHolder() {
    }

    public static String peek() {
        IPSDevSysUser user = PSDevSysUserHolder.peek();
        if (user != null) {
            return user.getPSDevSlnSysId();
        }
        IAppContext ctx = ActionSessionManager.getAppContext();
        if (ctx == null) {
            return null;
        }
        return (String) ctx.get("PSDEVSLNSYS");
    }
}