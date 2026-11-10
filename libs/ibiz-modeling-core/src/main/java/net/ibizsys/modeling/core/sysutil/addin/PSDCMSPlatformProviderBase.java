package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformProvider;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;

/**
 * Base class for deploy-center microservice platform providers.
 */
public abstract class PSDCMSPlatformProviderBase extends SysUtilRTAddinBase
        implements IPSDCMSPlatformProvider {

    @Override
    public IPSDCMSPlatformAgent createPSDCMSPlatformAgent(Object platform) {
        return createPSDCMSPlatformAgent((PSDCMSPlatformDTO) platform);
    }

    public abstract IPSDCMSPlatformAgent createPSDCMSPlatformAgent(PSDCMSPlatformDTO platform);

    @Override
    protected ISysUtilRuntime getSysUtilRuntime() {
        return (ISysUtilRuntime) getContext().getModelRuntime();
    }
}
