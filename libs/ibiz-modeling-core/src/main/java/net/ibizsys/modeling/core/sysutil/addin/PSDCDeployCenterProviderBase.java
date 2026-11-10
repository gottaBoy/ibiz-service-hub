package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterAgent;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterProvider;
import net.ibizsys.modeling.core.dataentity.dto.PSDCDeployCenterDTO;

/**
 * Base class for deploy-center providers.
 */
public abstract class PSDCDeployCenterProviderBase extends SysUtilRTAddinBase
        implements IPSDCDeployCenterProvider {

    @Override
    public IPSDCDeployCenterAgent createPSDCDeployCenterAgent(Object deployCenter) {
        if (deployCenter instanceof PSDCDeployCenterDTO) {
            return createPSDCDeployCenterAgent((PSDCDeployCenterDTO) deployCenter);
        }
        throw new IllegalArgumentException("Expected PSDCDeployCenterDTO");
    }

    public abstract IPSDCDeployCenterAgent createPSDCDeployCenterAgent(
            PSDCDeployCenterDTO deployCenter);

    @Override
    protected ISysUtilRuntime getSysUtilRuntime() {
        return (ISysUtilRuntime) getContext().getModelRuntime();
    }
}
