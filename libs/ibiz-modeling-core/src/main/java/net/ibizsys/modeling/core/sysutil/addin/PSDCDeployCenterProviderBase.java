package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterProvider;

/**
 * Base class for deploy-center providers.
 */
public abstract class PSDCDeployCenterProviderBase extends SysUtilRTAddinBase
        implements IPSDCDeployCenterProvider {

    @Override
    protected ISysUtilRuntime getSysUtilRuntime() {
        return (ISysUtilRuntime) getContext().getModelRuntime();
    }
}