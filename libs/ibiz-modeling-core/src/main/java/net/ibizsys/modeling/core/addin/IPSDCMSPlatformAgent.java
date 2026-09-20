package net.ibizsys.modeling.core.addin;

import java.util.List;
import java.util.Map;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * Deploy-center platform operations.
 */
public interface IPSDCMSPlatformAgent extends IModelRTAddin {

    String CONFIG_IGNORE_CALLBACK = "ignore_callback";

    String getClusterNamespace();

    void addPSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    void updatePSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    void removePSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    void restartPSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    void stopPSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    void refreshPSDCMSPlatformNodesState(List<?> platformNodes,
            Map<String, Object> params);

    void monitorPSDCMSPlatformNode(Object platformNode, Map<String, Object> params);

    String getServiceName(Object platformNode);

    String getNetwork(Object platformNode);

    String getAlias(Object platformNode);

    List<String> getEnvironments(Object platformNode, Object registryItem);

    List<String> getHostAliases(Object platformNode, Object registryItem);

    void publishConfig(Map<String, Object> params);

    void publishConfig(Object deployment, Map<String, Object> params);

    Object runImage(String imageName, String imageTag, Map<String, String> env,
            Map<String, Object> params);

    Object generateConfig(String config, Map<String, Object> params);
}