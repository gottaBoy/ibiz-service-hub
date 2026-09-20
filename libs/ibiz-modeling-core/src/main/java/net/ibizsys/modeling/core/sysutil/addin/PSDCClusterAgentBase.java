package net.ibizsys.modeling.core.sysutil.addin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCClusterAgent;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;

/**
 * Common lifecycle wrapper for deploy-center cluster agents.
 *
 * <p>The full modeling service supplies DTO-backed task persistence. The core
 * module keeps the same extension hooks while using an in-memory task stack so
 * it remains usable without the optional DTO/service module.</p>
 */
public abstract class PSDCClusterAgentBase extends SysUtilRTAddinBase
        implements IPSDCClusterAgent {

    public static final String LOGCAT_CLUSTERAGENT = "CLUSTERAGENT";
    private static final ThreadLocal<Deque<String>> TASK_IDS =
            ThreadLocal.withInitial(ArrayDeque::new);

    @Autowired(required = false)
    private ISysCloudLogUtilRuntime sysCloudLogUtilRuntime;

    private String serviceUrl;

    @Override
    protected ISysUtilRuntime getSysUtilRuntime() {
        return (ISysUtilRuntime) getContext().getModelRuntime();
    }

    @Override
    protected void onInit() throws Exception {
        if (!StringUtils.hasLength(serviceUrl)) {
            serviceUrl = stringProperty(getAddinData(), "getUrl");
        }
        super.onInit();
    }

    @Override
    public String getName() {
        return firstText(stringProperty(getAddinData(), "getPSDCClusterName"),
                stringProperty(getAddinData(), "getName"));
    }

    protected Object getAddinDataObject() {
        return getAddinData();
    }

    protected String getServiceUrl() {
        return serviceUrl;
    }

    protected void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @Override
    public Object addService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) {
        return execute("增加集群服务发生异常", taskName("增加集群服务", platformNode), params,
                () -> onAddService(platformAgent, platformNode, params));
    }

    protected Object onAddService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object updateService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) {
        return execute("更新集群服务发生异常", taskName("更新集群服务", platformNode), params,
                () -> onUpdateService(platformAgent, platformNode, params));
    }

    protected Object onUpdateService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object restartService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) {
        String devSlnSysId = param(params, "PSDEVSLNSYSID");
        return execute("重启集群服务发生异常", taskName("重启集群服务", platformNode), params,
                () -> {
                    sendConsole(devSlnSysId, taskName("重启集群服务", platformNode), 20000);
                    return onRestartService(platformAgent, platformNode, params);
                });
    }

    protected Object onRestartService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object stopService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) {
        String devSlnSysId = param(params, "PSDEVSLNSYSID");
        return execute("停止集群服务发生异常", taskName("停止集群服务", platformNode), params,
                () -> {
                    sendConsole(devSlnSysId, taskName("停止集群服务", platformNode), 20000);
                    return onStopService(platformAgent, platformNode, params);
                });
    }

    protected Object onStopService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object refreshServicesState(IPSDCMSPlatformAgent platformAgent,
            List<?> platformNodes, Map<String, Object> params) {
        if (platformNodes == null || platformNodes.isEmpty()) {
            return null;
        }
        return execute("刷新集群服务状态发生异常", null, params,
                () -> onRefreshServicesState(platformAgent, platformNodes, params));
    }

    protected Object onRefreshServicesState(IPSDCMSPlatformAgent platformAgent,
            List<?> platformNodes, Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object removeService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) {
        String devSlnSysId = param(params, "PSDEVSLNSYSID");
        return execute("删除集群服务发生异常", taskName("删除集群服务", platformNode), params,
                () -> {
                    sendConsole(devSlnSysId, taskName("删除集群服务", platformNode), 20000);
                    return onRemoveService(platformAgent, platformNode, params);
                });
    }

    protected Object onRemoveService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object monitorService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) {
        return execute("监控集群服务发生异常", null, params,
                () -> onMonitorService(platformAgent, platformNode, params));
    }

    protected Object onMonitorService(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object runImage(IPSDCMSPlatformAgent platformAgent, String imageName,
            String imageTag, Map<String, String> env, Map<String, Object> params) {
        return execute("运行集群镜像发生异常", taskName("运行集群镜像", imageName), params,
                () -> onRunImage(platformAgent, imageName, imageTag, env, params));
    }

    protected Object onRunImage(IPSDCMSPlatformAgent platformAgent, String imageName,
            String imageTag, Map<String, String> env, Map<String, Object> params)
            throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object generateConfig(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            String config, Map<String, Object> params) {
        return execute("生成集群节点配置发生异常", null, params,
                () -> onGenerateConfig(platformAgent, platformNode, config, params));
    }

    protected Object onGenerateConfig(IPSDCMSPlatformAgent platformAgent, Object platformNode,
            String config, Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    protected String getPSDevCenterId() {
        return stringProperty(getAddinData(), "getPSDevCenterId");
    }

    protected String getLogCat() {
        return LOGCAT_CLUSTERAGENT;
    }

    protected String beginPSDCBKTask(String taskName, String devSlnId, String devSlnSysId) {
        String id = UUID.randomUUID().toString();
        TASK_IDS.get().push(id);
        return id;
    }

    protected void updateCurrentPSDCBKTask(String taskInfo) {
    }

    protected void finishCurrentPSDCBKTask(String taskInfo) {
        popTask();
    }

    protected void errorCurrentPSDCBKTask(String taskInfo) {
        popTask();
    }

    private <T> T execute(String errorMessage, String taskName, Map<String, Object> params,
            ThrowingSupplier<T> operation) {
        String taskId = null;
        try {
            taskId = beginPSDCBKTask(taskName, param(params, "PSDEVSLNID"),
                    param(params, "PSDEVSLNSYSID"));
            T result = operation.get();
            finishCurrentPSDCBKTask(null);
            return result;
        } catch (Throwable ex) {
            if (taskId != null) {
                errorCurrentPSDCBKTask(ex.getMessage());
            }
            String message = ex.getMessage() == null ? ex.getClass().getSimpleName()
                    : ex.getMessage();
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("%s，%s", errorMessage, message), ex);
        }
    }

    private void sendConsole(String devSlnSysId, String message, int level) {
        if (sysCloudLogUtilRuntime != null && StringUtils.hasLength(devSlnSysId)) {
            sysCloudLogUtilRuntime.sendConsoleMessage(devSlnSysId, "iBizCentral", true,
                    level, getLogCat(), message);
        }
    }

    private void popTask() {
        Deque<String> ids = TASK_IDS.get();
        ids.poll();
        if (ids.isEmpty()) {
            TASK_IDS.remove();
        }
    }

    private String taskName(String action, Object value) {
        String cluster = firstText(stringProperty(getAddinData(), "getPSDCClusterName"),
                getName());
        String item = firstText(stringProperty(value, "getPSDCMSPlatformNodeName"),
                stringProperty(value, "getName"), String.valueOf(value));
        return String.format("[%s]%s[%s]", cluster, action, item);
    }

    private static String param(Map<String, Object> params, String name) {
        if (params == null) {
            return null;
        }
        Object value = params.get(name);
        return value == null ? null : String.valueOf(value);
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
        Method method = findMethod(target.getClass(), methodName, args.length);
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }

    private static Method findMethod(Class<?> type, String name, int parameterCount) {
        for (Class<?> current = type; current != null; current = current.getSuperclass()) {
            for (Method method : current.getDeclaredMethods()) {
                if (method.getName().equals(name)
                        && method.getParameterCount() == parameterCount) {
                    try {
                        if (!method.trySetAccessible()) {
                            continue;
                        }
                    } catch (RuntimeException ex) {
                        continue;
                    }
                    return method;
                }
            }
        }
        return null;
    }

    @FunctionalInterface
    private interface ThrowingSupplier<T> {
        T get() throws Throwable;
    }
}