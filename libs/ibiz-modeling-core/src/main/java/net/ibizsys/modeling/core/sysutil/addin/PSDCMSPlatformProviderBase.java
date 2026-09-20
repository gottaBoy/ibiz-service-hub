package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformProvider;

/**
 * Base class for deploy-center microservice platform providers.
 */
public abstract class PSDCMSPlatformProviderBase extends SysUtilRTAddinBase
        implements IPSDCMSPlatformProvider {

    @Override
    protected ISysUtilRuntime getSysUtilRuntime() {
        return (ISysUtilRuntime) getContext().getModelRuntime();
    }
}