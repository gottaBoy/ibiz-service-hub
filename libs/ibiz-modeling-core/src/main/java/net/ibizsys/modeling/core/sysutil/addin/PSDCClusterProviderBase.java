package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.modeling.core.addin.IPSDCClusterAgent;
import net.ibizsys.modeling.core.addin.IPSDCClusterProvider;
import net.ibizsys.modeling.core.dataentity.dto.PSDCClusterDTO;

/**
 * Base class for deploy-center cluster providers.
 */
public abstract class PSDCClusterProviderBase extends ClusterSysUtilRTAddinBase
        implements IPSDCClusterProvider {

    @Override
    public IPSDCClusterAgent createPSDCClusterAgent(Object cluster) {
        if (!(cluster instanceof PSDCClusterDTO)) {
            throw new IllegalArgumentException("Expected PSDCClusterDTO");
        }
        return createPSDCClusterAgent((PSDCClusterDTO) cluster);
    }

    public abstract IPSDCClusterAgent createPSDCClusterAgent(PSDCClusterDTO cluster);
}
