package net.ibizsys.modeling.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * Provider for deploy-center platform agents.
 */
public interface IPSDCMSPlatformProvider extends IModelRTAddin {

    IPSDCMSPlatformAgent createPSDCMSPlatformAgent(Object platform);
}