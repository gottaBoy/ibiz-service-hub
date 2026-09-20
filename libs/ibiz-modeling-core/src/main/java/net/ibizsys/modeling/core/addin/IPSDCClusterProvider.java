package net.ibizsys.modeling.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * Provider for deploy-center cluster agents.
 */
public interface IPSDCClusterProvider extends IModelRTAddin {

    IPSDCClusterAgent createPSDCClusterAgent(Object cluster);
}