package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCClusterProvider;

/**
 * Base class for deploy-center cluster providers.
 */
public abstract class PSDCClusterProviderBase extends SysUtilRTAddinBase
        implements IPSDCClusterProvider {

    @Override
    protected ISysUtilRuntime getSysUtilRuntime() {
        return (ISysUtilRuntime) getContext().getModelRuntime();
    }
}