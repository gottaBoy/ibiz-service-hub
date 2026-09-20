package net.ibizsys.modeling.core.addin;

import java.util.List;
import java.util.Map;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * Deploy-center cluster operations.
 *
 * <p>DTOs are represented as objects until the optional modeling DTO module is
 * restored; the operation contract remains source-compatible for callers.</p>
 */
public interface IPSDCClusterAgent extends IModelRTAddin {

    Object addService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params);

    Object updateService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params);

    Object restartService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params);

    Object stopService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params);

    Object refreshServicesState(IPSDCMSPlatformAgent platformAgent,
            List<?> platformNodes, Map<String, Object> params);

    Object removeService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params);

    Object runImage(IPSDCMSPlatformAgent platformAgent, String imageName,
            String imageTag, Map<String, String> env, Map<String, Object> params);

    Object generateConfig(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            String config, Map<String, Object> params);

    Object monitorService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params);
}