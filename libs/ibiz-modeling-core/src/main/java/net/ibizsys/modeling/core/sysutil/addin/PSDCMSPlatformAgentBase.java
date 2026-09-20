package net.ibizsys.modeling.core.sysutil.addin;

import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigEntity;
import net.ibizsys.modeling.core.addin.IPSDCClusterAgent;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;

/**
 * Common base implementation for microservice-platform deploy-center agents.
 */
public abstract class PSDCMSPlatformAgentBase extends MSPlatformSysUtilRTAddinBase
        implements IPSDCMSPlatformAgent {

    public static final String LOGCAT_MSPLATFORMAGENT = "MSPLATFORMAGENT";
    public static final String CONFIG_CLUSTER_NAMESPACE = "cluster.namespace";
    @Deprecated
    public static final String CONFIG_STACK_NAMESPACE = "stack.namespace";
    public static final String CONFIG_CLUSTER_NETWORK = "cluster.network";

    private static final ThreadLocal<Deque<String>> TASK_IDS =
            ThreadLocal.withInitial(ArrayDeque::new);

    private final IConfigEntity config = new ConfigEntity("");
    private String clusterNamespace;

    @Autowired(required = false)
    private IClusterSysUtilRuntime clusterSysUtilRuntime;

    @Override
    protected void onInit() throws Exception {
        prepareConfig();
        super.onInit();
    }

    protected void prepareConfig() throws Exception {
        String userParams = stringProperty(getAddinData(), "getUserParams");
        if (StringUtils.hasLength(userParams)) {
            Properties properties = new Properties();
            properties.load(new StringReader(userParams));
            for (String key : properties.stringPropertyNames()) {
                config.set(key, properties.getProperty(key));
            }
        }
        clusterNamespace = calcClusterNamespace();
    }

    protected IConfigEntity getConfig() {
        return config;
    }

    protected boolean isEnableDeployCenter() {
        return config.getBoolean("deploycenter", Boolean.FALSE);
    }

    @Override
    public String getName() {
        return firstText(stringProperty(getAddinData(), "getPSDCMSPlatformName"),
                stringProperty(getAddinData(), "getName"));
    }

    @Override
    public String getClusterNamespace() {
        return clusterNamespace;
    }

    protected String calcClusterNamespace() {
        String namespace = stringProperty(getAddinData(), "getClusterNamespace");
        if (StringUtils.hasLength(namespace)) {
            return namespace;
        }
        namespace = config.getString(CONFIG_CLUSTER_NAMESPACE, null);
        if (StringUtils.hasLength(namespace)) {
            return namespace;
        }
        return config.getString(CONFIG_STACK_NAMESPACE, getName());
    }

    @Override
    public String getNetwork(Object platformNode) {
        return config.getString(CONFIG_CLUSTER_NETWORK, null);
    }

    @Override
    public void addPSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        execute("增加微服务平台节点发生异常", platformNode, params, () -> {
            onAddPSDCMSPlatformNode(platformNode, params);
            return null;
        });
    }

    protected void onAddPSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        requireCluster();
        throw new Exception("没有实现");
    }

    @Override
    public void updatePSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        execute("更新微服务平台节点发生异常", platformNode, params, () -> {
            onUpdatePSDCMSPlatformNode(platformNode, params);
            return null;
        });
    }

    protected void onUpdatePSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        requireCluster();
        throw new Exception("没有实现");
    }

    @Override
    public void restartPSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        execute("重启微服务平台节点发生异常", platformNode, params, () -> {
            onRestartPSDCMSPlatformNode(platformNode, params);
            return null;
        });
    }

    protected void onRestartPSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        if (isEnableDeployCenter()) {
            throw new Exception("没有实现");
        }
        getPSDCClusterAgent().restartService(this, platformNode, params);
    }

    @Override
    public void stopPSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        execute("停止微服务平台节点发生异常", platformNode, params, () -> {
            onStopPSDCMSPlatformNode(platformNode, params);
            return null;
        });
    }

    protected void onStopPSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        getPSDCClusterAgent().stopService(this, platformNode, params);
    }

    @Override
    public void refreshPSDCMSPlatformNodesState(List<?> platformNodes,
            Map<String, Object> params) {
        if (platformNodes == null || platformNodes.isEmpty()) {
            return;
        }
        execute("更新微服务平台节点状态发生异常", null, params, () -> {
            onRefreshPSDCMSPlatformNodesState(platformNodes, params);
            return null;
        });
    }

    protected void onRefreshPSDCMSPlatformNodesState(List<?> platformNodes,
            Map<String, Object> params) throws Throwable {
        getPSDCClusterAgent().refreshServicesState(this, platformNodes, params);
    }

    @Override
    public void removePSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        execute("删除微服务平台节点发生异常", platformNode, params, () -> {
            onRemovePSDCMSPlatformNode(platformNode, params);
            return null;
        });
    }

    protected void onRemovePSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        getPSDCClusterAgent().removeService(this, platformNode, params);
    }

    @Override
    public void monitorPSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        execute("监控微服务平台节点发生异常", platformNode, params, () -> {
            onMonitorPSDCMSPlatformNode(platformNode, params);
            return null;
        });
    }

    protected void onMonitorPSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        getPSDCClusterAgent().monitorService(this, platformNode, params);
    }

    @Override
    public Object runImage(String imageName, String imageTag, Map<String, String> env,
            Map<String, Object> params) {
        return execute("运行镜像发生异常", imageName, params,
                () -> onRunImage(imageName, imageTag, env, params));
    }

    protected Object onRunImage(String imageName, String imageTag, Map<String, String> env,
            Map<String, Object> params) throws Throwable {
        return getPSDCClusterAgent().runImage(this, imageName, imageTag, env, params);
    }

    @Override
    public void publishConfig(Map<String, Object> params) {
        execute("发布微服务平台配置发生异常", null, params, () -> {
            onPublishConfig(params);
            return null;
        });
    }

    protected void onPublishConfig(Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public void publishConfig(Object deployment, Map<String, Object> params) {
        execute("发布解决方案微服务平台配置发生异常", deployment, params, () -> {
            onPublishConfig(deployment, params);
            if (isEnableDeployCenter()) {
                String slnId = stringProperty(deployment, "getPSDevSlnId");
                if (StringUtils.hasLength(slnId)) {
                    getPSDevSln(slnId);
                }
                throw new Exception("没有实现");
            }
            return null;
        });
    }

    protected void onPublishConfig(Object deployment, Map<String, Object> params)
            throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object generateConfig(String configPath, Map<String, Object> params) {
        return execute("生成微服务平台配置发生异常", null, params,
                () -> onGenerateConfig(configPath, params));
    }

    protected Object onGenerateConfig(String configPath, Map<String, Object> params)
            throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    protected String getPSDevCenterId() {
        return stringProperty(getAddinData(), "getPSDevCenterId");
    }

    protected void fillEnvironments(List<String> envList, String params) {
        if (envList == null || !StringUtils.hasLength(params)) {
            return;
        }
        boolean yamlLoaded = false;
        try {
            Object value = new Yaml().load(params);
            if (value instanceof Map<?, ?>) {
                Map<?, ?> map = (Map<?, ?>) value;
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    mergeEnvironment(envList, String.valueOf(entry.getKey()),
                            entry.getValue() == null ? "" : String.valueOf(entry.getValue()));
                }
                yamlLoaded = true;
            }
        } catch (Throwable ex) {
            // Fall back to java.util.Properties for legacy environment strings.
        }
        if (!yamlLoaded) {
            try {
                Properties properties = new Properties();
                properties.load(new StringReader(params));
                for (String key : properties.stringPropertyNames()) {
                    mergeEnvironment(envList, key, properties.getProperty(key));
                }
            } catch (Throwable ex) {
                // Invalid optional environment input is ignored like the reference runtime.
            }
        }
    }

    private static void mergeEnvironment(List<String> envList, String key, String value) {
        String environment = String.format("%s=%s", key, value);
        String prefix = key + "=";
        for (int i = 0; i < envList.size(); i++) {
            if (envList.get(i).startsWith(prefix)) {
                envList.set(i, environment);
                return;
            }
        }
        envList.add(environment);
    }

    protected IPSDCClusterAgent getPSDCClusterAgent(String clusterId) {
        if (clusterSysUtilRuntime == null) {
            throw new IllegalStateException("未配置集群运行时");
        }
        return clusterSysUtilRuntime.getPSDCClusterAgent(clusterId);
    }

    private IPSDCClusterAgent getPSDCClusterAgent() {
        String clusterId = stringProperty(getAddinData(), "getPSDCClusterId");
        if (!StringUtils.hasLength(clusterId)) {
            throw new IllegalStateException(String.format("微服务平台[%s]未指定集群", getName()));
        }
        IPSDCClusterAgent agent = getPSDCClusterAgent(clusterId);
        if (agent == null) {
            throw new IllegalStateException(String.format("未找到集群代理[%s]", clusterId));
        }
        return agent;
    }

    @Override
    protected String beginPSDCBKTask(String taskName, String devSlnId,
            String devSlnSysId) {
        String id = UUID.randomUUID().toString();
        TASK_IDS.get().push(id);
        return id;
    }

    @Override
    protected void updateCurrentPSDCBKTask(String taskInfo) {
    }

    @Override
    protected void finishCurrentPSDCBKTask(String taskInfo) {
        popTask();
    }

    @Override
    protected void errorCurrentPSDCBKTask(String taskInfo) {
        popTask();
    }

    private void popTask() {
        Deque<String> ids = TASK_IDS.get();
        ids.poll();
        if (ids.isEmpty()) {
            TASK_IDS.remove();
        }
    }

    private <T> T execute(String errorMessage, Object taskValue,
            Map<String, Object> params, ThrowingSupplier<T> operation) {
        String taskId = null;
        try {
            taskId = beginPSDCBKTask(taskName(taskValue), param(params, "PSDEVSLNID"),
                    param(params, "PSDEVSLNSYSID"));
            T result = operation.get();
            finishCurrentPSDCBKTask(null);
            return result;
        } catch (Throwable ex) {
            if (taskId != null) {
                errorCurrentPSDCBKTask(ex.getMessage());
            }
            String detail = ex.getMessage() == null ? ex.getClass().getSimpleName()
                    : ex.getMessage();
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("%s，%s", errorMessage, detail), ex);
        }
    }

    private String taskName(Object value) {
        String platform = getName();
        String item = firstText(stringProperty(value, "getPSDCMSPlatformNodeName"),
                stringProperty(value, "getServiceName"),
                stringProperty(value, "getName"),
                value == null ? null : String.valueOf(value));
        return String.format("[%s]%s", platform, item == null ? "" : item);
    }

    private static String param(Map<String, Object> params, String name) {
        if (params == null) {
            return null;
        }
        Object value = params.get(name);
        return value == null ? null : String.valueOf(value);
    }

    private void requireCluster() {
        String clusterId = stringProperty(getAddinData(), "getPSDCClusterId");
        if (!StringUtils.hasLength(clusterId)) {
            throw new IllegalStateException(String.format("微服务平台[%s]未指定集群", getName()));
        }
    }

    protected String getLogCat() {
        return LOGCAT_MSPLATFORMAGENT;
    }

    private static String firstText(String... values) {
        for (String value : values) {
            if (StringUtils.hasLength(value)) {
                return value;
            }
        }
        return null;
    }

    private static String stringProperty(Object target, String methodName) {
        Object value = invoke(target, methodName);
        return value == null ? null : String.valueOf(value);
    }

    private static Object invoke(Object target, String methodName, Object... args) {
        if (target == null) {
            return null;
        }
        Method method = findMethod(target.getClass(), methodName, args);
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException | RuntimeException ex) {
            return null;
        }
    }

    private static Method findMethod(Class<?> type, String name, Object... args) {
        for (Class<?> current = type; current != null; current = current.getSuperclass()) {
            for (Method method : current.getDeclaredMethods()) {
                if (method.getName().equals(name)
                        && isCompatible(method.getParameterTypes(), args)
                        && makeAccessible(method)) {
                    return method;
                }
            }
        }
        for (Method method : type.getMethods()) {
            if (method.getName().equals(name)
                    && isCompatible(method.getParameterTypes(), args)
                    && makeAccessible(method)) {
                return method;
            }
        }
        return null;
    }

    private static boolean makeAccessible(Method method) {
        try {
            return method.trySetAccessible();
        } catch (RuntimeException ex) {
            return false;
        }
    }

    private static boolean isCompatible(Class<?>[] parameterTypes, Object[] args) {
        if (parameterTypes.length != args.length) {
            return false;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (args[i] == null) {
                if (parameterTypes[i].isPrimitive()) {
                    return false;
                }
                continue;
            }
            if (!wrap(parameterTypes[i]).isAssignableFrom(args[i].getClass())) {
                return false;
            }
        }
        return true;
    }

    private static Class<?> wrap(Class<?> type) {
        if (!type.isPrimitive()) {
            return type;
        }
        if (type == boolean.class) {
            return Boolean.class;
        }
        if (type == byte.class) {
            return Byte.class;
        }
        if (type == short.class) {
            return Short.class;
        }
        if (type == int.class) {
            return Integer.class;
        }
        if (type == long.class) {
            return Long.class;
        }
        if (type == float.class) {
            return Float.class;
        }
        if (type == double.class) {
            return Double.class;
        }
        if (type == char.class) {
            return Character.class;
        }
        return type;
    }

    @FunctionalInterface
    private interface ThrowingSupplier<T> {
        T get() throws Throwable;
    }
}