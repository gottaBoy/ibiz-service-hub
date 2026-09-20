package net.ibizsys.modeling.core.addin;

import java.util.Map;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * Deploy-center lifecycle operations.
 */
public interface IPSDCDeployCenterAgent extends IModelRTAddin {

    Object restartPSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    Object addPSDCCluster(Object cluster);

    Object removePSDCCluster(Object cluster);

    Object updatePSDCCluster(Object cluster);

    Object addPSDCMSPlatform(Object platform);

    Object removePSDCMSPlatform(Object platform);

    Object updatePSDCMSPlatform(Object platform);

    Object addPSDCMSPlatformNode(Object platformNode);

    Object removePSDCMSPlatformNode(Object platformNode);

    Object updatePSDCMSPlatformNode(Object platformNode);

    Object addPSDevSlnPipeline(Object pipeline);

    Object removePSDevSlnPipeline(Object pipeline);

    Object publishPSDevSlnPipeline(Object pipeline, Map<String, Object> params);

    Object buildPSDevSlnPipeline(Object pipeline, Map<String, Object> params);

    Object publishConfig(Map<String, Object> params);

    Object generateConfig(Map<String, Object> params);

    Object publishCredentials(Map<String, Object> params);

    Object publishPSDCMSPlatform(Object platform, Map<String, Object> params);

    Map<String, Object> getPSDevSlnPipelineConfig(Object pipeline,
            Map<String, Object> params);
}