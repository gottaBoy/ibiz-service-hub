package net.ibizsys.modeling.core.sysutil.addin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.UUID;

import org.springframework.util.StringUtils;

import net.ibizsys.modeling.core.addin.IPSDCDeployCenterAgent;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;

/**
 * Common base implementation for deploy-center agents.
 *
 * <p>The add-in data is intentionally kept as an object. This allows the core
 * module to work with the optional modeling DTO module without a hard source
 * dependency on its generated classes.</p>
 */
public abstract class PSDCDeployCenterAgentBase extends DeployCenterSysUtilRTAddinBase
        implements IPSDCDeployCenterAgent {

    public static final String LOGCAT_DEPLOYCENTERAGENT = "DEPLOYCENTERAGENT";
    public static final String FIELD_CFGUSERNAME = "cfgusername";
    public static final String FIELD_CFGPASSWORD = "cfgpassword";

    private static final ThreadLocal<Deque<String>> TASK_IDS =
            ThreadLocal.withInitial(ArrayDeque::new);

    private String serviceUrl;

    @Override
    protected void onInit() throws Exception {
        if (!StringUtils.hasLength(serviceUrl)) {
            serviceUrl = firstText(stringProperty(getAddinData(), "getAPIUrl"),
                    stringProperty(getAddinData(), "getUrl"));
        }
        prepareConfigRepository();
        super.onInit();
    }

    /**
     * Fills the deploy-center configuration repository fields from the
     * configured developer-center repository when those fields are absent.
     */
    protected void prepareConfigRepository() throws Exception {
        String svnId = stringProperty(getAddinData(), "getCfgPSDevCenterSVNId");
        if (!StringUtils.hasLength(svnId)) {
            return;
        }
        try {
            Object svn = getPSDevCenterSVN(svnId);
            if (svn == null || StringUtils.hasLength(
                    stringProperty(getAddinData(), "getCfgUrl"))) {
                return;
            }
            setProperty(getAddinData(), "setCfgUrl", stringProperty(svn, "getGitPath"));
            setProperty(getAddinData(), "setCfgBranch", stringProperty(svn, "getGitBranch"));

            String credentialId = stringProperty(getAddinData(), "getCfgPSCredentialId");
            String gitUserId = stringProperty(svn, "getPSGitUserId");
            if (!StringUtils.hasLength(credentialId) && StringUtils.hasLength(gitUserId)) {
                Object gitUser = getPSGitUser(gitUserId);
                if (gitUser != null) {
                    setProperty(getAddinData(), FIELD_CFGUSERNAME,
                            stringProperty(gitUser, "getUserName"));
                    setProperty(getAddinData(), FIELD_CFGPASSWORD,
                            stringProperty(gitUser, "getPasswd"));
                }
            }
        } catch (Throwable ex) {
            throw new Exception(String.format("获取配置仓库信息发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected String getServiceUrl() {
        return serviceUrl;
    }

    protected void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @Override
    public String getName() {
        return firstText(stringProperty(getAddinData(), "getPSDCDeployCenterName"),
                stringProperty(getAddinData(), "getName"));
    }

    @Override
    public Object restartPSDCMSPlatformNode(Object platformNode, Map<String, Object> params) {
        if (platformNode == null) {
            return null;
        }
        try {
            return onRestartPSDCMSPlatformNode(platformNode, params);
        } catch (Throwable ex) {
            throw wrap("重启微服务平台节点发生异常", ex);
        }
    }

    protected Object onRestartPSDCMSPlatformNode(Object platformNode,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object addPSDCCluster(Object cluster) {
        return null;
    }

    @Override
    public Object removePSDCCluster(Object cluster) {
        return null;
    }

    @Override
    public Object updatePSDCCluster(Object cluster) {
        return null;
    }

    @Override
    public Object addPSDCMSPlatform(Object platform) {
        return null;
    }

    @Override
    public Object removePSDCMSPlatform(Object platform) {
        return null;
    }

    @Override
    public Object updatePSDCMSPlatform(Object platform) {
        return null;
    }

    @Override
    public Object addPSDCMSPlatformNode(Object platformNode) {
        if (platformNode == null) {
            return null;
        }
        try {
            return onAddPSDCMSPlatformNode(platformNode);
        } catch (Throwable ex) {
            throw wrap("添加微服务平台节点发生异常", ex);
        }
    }

    protected Object onAddPSDCMSPlatformNode(Object platformNode) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object removePSDCMSPlatformNode(Object platformNode) {
        return null;
    }

    @Override
    public Object updatePSDCMSPlatformNode(Object platformNode) {
        return null;
    }

    @Override
    public Object addPSDevSlnPipeline(Object pipeline) {
        return null;
    }

    @Override
    public Object removePSDevSlnPipeline(Object pipeline) {
        return null;
    }

    @Override
    public Object publishPSDevSlnPipeline(Object pipeline, Map<String, Object> params) {
        try {
            return onPublishPSDevSlnPipeline(pipeline, params);
        } catch (Throwable ex) {
            throw wrap("发布开发方案流水线发生异常", ex);
        }
    }

    protected Object onPublishPSDevSlnPipeline(Object pipeline,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object buildPSDevSlnPipeline(Object pipeline, Map<String, Object> params) {
        try {
            return onBuildPSDevSlnPipeline(pipeline, params);
        } catch (Throwable ex) {
            throw wrap("构建开发方案流水线发生异常", ex);
        }
    }

    protected Object onBuildPSDevSlnPipeline(Object pipeline,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Map<String, Object> getPSDevSlnPipelineConfig(Object pipeline,
            Map<String, Object> params) {
        try {
            return onGetPSDevSlnPipelineConfig(pipeline, params);
        } catch (Throwable ex) {
            throw wrap("获取开发方案流水线配置发生异常", ex);
        }
    }

    protected Map<String, Object> onGetPSDevSlnPipelineConfig(Object pipeline,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object publishConfig(Map<String, Object> params) {
        try {
            return onPublishConfig(params);
        } catch (Throwable ex) {
            throw wrap("发布部署中心配置发生异常", ex);
        }
    }

    protected Object onPublishConfig(Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object generateConfig(Map<String, Object> params) {
        try {
            return onGenerateConfig(params);
        } catch (Throwable ex) {
            throw wrap("生成部署中心配置发生异常", ex);
        }
    }

    protected Object onGenerateConfig(Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object publishCredentials(Map<String, Object> params) {
        try {
            return onPublishCredentials(params);
        } catch (Throwable ex) {
            throw wrap("发布部署中心凭证发生异常", ex);
        }
    }

    protected Object onPublishCredentials(Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    public Object publishPSDCMSPlatform(Object platform, Map<String, Object> params) {
        try {
            return onPublishPSDCMSPlatform(platform, params);
        } catch (Throwable ex) {
            throw wrap("发布微服务平台配置发生异常", ex);
        }
    }

    protected Object onPublishPSDCMSPlatform(Object platform,
            Map<String, Object> params) throws Throwable {
        throw new Exception("没有实现");
    }

    @Override
    protected String getPSDevCenterId() {
        return stringProperty(getAddinData(), "getPSDevCenterId");
    }

    protected String getContent(String template, Map<String, Object> params) throws Exception {
        return getTemplateContent(template, params);
    }

    protected String getLogCat() {
        return LOGCAT_DEPLOYCENTERAGENT;
    }

    /*
     * Keep the task hooks usable in a core-only runtime. The full service
     * module may provide persistent task handling through a different base.
     */
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

    private SystemRuntimeException wrap(String message, Throwable ex) {
        String detail = ex.getMessage() == null ? ex.getClass().getSimpleName()
                : ex.getMessage();
        return new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                (IModelRuntime) getSysUtilRuntime(),
                String.format("%s，%s", message, detail), ex);
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

    private static boolean setProperty(Object target, String propertyOrSetter, Object value) {
        if (target == null) {
            return false;
        }
        String setter = propertyOrSetter.startsWith("set") ? propertyOrSetter
                : "set" + Character.toUpperCase(propertyOrSetter.charAt(0))
                        + propertyOrSetter.substring(1);
        if (invokePresent(target, setter, value)) {
            return true;
        }
        return invokePresent(target, "set", propertyOrSetter, value);
    }

    private static boolean invokePresent(Object target, String methodName, Object... args) {
        Method method = findMethod(target.getClass(), methodName, args);
        if (method == null) {
            return false;
        }
        try {
            method.invoke(target, args);
            return true;
        } catch (IllegalAccessException | InvocationTargetException | RuntimeException ex) {
            return false;
        }
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
            Class<?> parameterType = wrap(parameterTypes[i]);
            if (!parameterType.isAssignableFrom(args[i].getClass())) {
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
}