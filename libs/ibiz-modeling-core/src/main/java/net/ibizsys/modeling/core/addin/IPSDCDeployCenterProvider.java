package net.ibizsys.modeling.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * Provider for deploy-center agents.
 */
public interface IPSDCDeployCenterProvider extends IModelRTAddin {

    IPSDCDeployCenterAgent createPSDCDeployCenterAgent(Object deployCenter);
}