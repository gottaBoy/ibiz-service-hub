package net.ibizsys.modeling.core.database;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.database.SysDBSchemeRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * Database runtime used by the model repository.
 *
 * <p>The model repository service and DTO modules are optional at this layer.
 * Service references are therefore resolved as objects and invoked through a
 * small, explicit reflection adapter. This keeps the core module independent
 * while retaining the service contract used by the full modeling runtime.</p>
 */
public abstract class ModelSysDBSchemeRuntimeBase extends SysDBSchemeRuntimeBase {

    public static final String BATCHINSERT_X = "_MODEL_BATCHINSERT_%1$s";
    public static final String BATCHUPDATE_X = "_MODEL_BATCHUPDATE_%1$s";

    private final Map<String, String> psDevSlnSysDSTagMap = new HashMap<>();

    @Autowired(required = false)
    private List<Object> modelRepositoryServices;

    private Object psDevSlnSysService;
    private Object psSysModelInstService;

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    @Override
    public boolean isUpdateSchema() {
        return false;
    }

    @Override
    protected void onPush() throws Throwable {
        this.pushDynaDataSourceTag(this.getCurrentDynaDataSourceTag());
        super.onPush();
    }

    @Override
    protected void onPoll() throws Throwable {
        super.onPoll();
        this.pollDynaDataSourceTag();
    }

    protected String getCurrentDynaDataSourceTag() throws Exception {
        IPSDevSysUser devSysUser = PSDevSysUserHolder.peek();
        if (devSysUser != null) {
            String devSlnSysId = devSysUser.getPSDevSlnSysId();
            if (!StringUtils.hasLength(devSlnSysId)) {
                throw new Exception("未传入开发系统标识");
            }
            String dataSourceTag = this.psDevSlnSysDSTagMap.get(devSlnSysId);
            if (!StringUtils.hasLength(dataSourceTag)) {
                dataSourceTag = this.getDynaDataSourceTag(devSysUser);
                this.psDevSlnSysDSTagMap.put(devSlnSysId, dataSourceTag);
            }
            return dataSourceTag;
        }

        IAppContext appContext = ActionSessionManager.getAppContext();
        if (appContext == null) {
            throw new Exception("应用上下文对象无效");
        }
        String devSlnSysId = asString(appContext.get("PSDEVSLNSYS"));
        if (!StringUtils.hasLength(devSlnSysId)) {
            throw new Exception("未传入开发系统标识");
        }
        String dataSourceTag = this.psDevSlnSysDSTagMap.get(devSlnSysId);
        if (!StringUtils.hasLength(dataSourceTag)) {
            dataSourceTag = this.getDynaDataSourceTag(devSlnSysId);
            this.psDevSlnSysDSTagMap.put(devSlnSysId, dataSourceTag);
        }
        return dataSourceTag;
    }

    protected String getDynaDataSourceTag(String devSlnSysId) throws Exception {
        Object devSlnSys = this.getService(this.psDevSlnSysService,
                "IPSDevSlnSysService", "get", devSlnSysId, true);
        if (devSlnSys == null) {
            throw new Exception(String.format("无法获取指定开发系统[%s]", devSlnSysId));
        }

        String modelInstId = asString(readProperty(devSlnSys, "getPSSysModelInstId"));
        if (!StringUtils.hasLength(modelInstId)) {
            throw new Exception(String.format("开发系统[%s]未指定模型库实例", devSlnSysId));
        }
        Object modelInst = this.getService(this.psSysModelInstService,
                "IPSSysModelInstService", "get", modelInstId, true);
        if (modelInst == null) {
            throw new Exception(String.format("无法获取指定系统模型实例[%s]", modelInstId));
        }
        return this.registerDataSource(modelInst);
    }

    protected String getDynaDataSourceTag(IPSDevSysUser devSysUser) throws Exception {
        String devSlnSysId = devSysUser.getPSDevSlnSysId();
        String modelInstId = devSysUser.getPSSysModelInstId();
        if (!StringUtils.hasLength(modelInstId)) {
            Object devSlnSys = this.getService(this.psDevSlnSysService,
                    "IPSDevSlnSysService", "get", devSlnSysId, true);
            if (devSlnSys == null) {
                throw new Exception(String.format("无法获取指定开发系统[%s]", devSlnSysId));
            }
            modelInstId = asString(readProperty(devSlnSys, "getPSSysModelInstId"));
            if (!StringUtils.hasLength(modelInstId)) {
                throw new Exception(String.format("开发系统[%s]未指定模型库实例", devSlnSysId));
            }
        }

        Object modelInst = this.getService(this.psSysModelInstService,
                "IPSSysModelInstService", "get", modelInstId, true);
        if (modelInst == null) {
            throw new Exception(String.format("无法获取指定系统模型实例[%s]", modelInstId));
        }
        return this.registerDataSource(modelInst);
    }

    protected String registerDataSource(Object modelInst) {
        DataSource dataSource = new DataSource();
        this.fillDataSource(dataSource, modelInst);
        ServiceHub.getInstance().registerDynaDataSourceIf(this.getSystemRuntime(), dataSource);
        return dataSource.getDataSourceId();
    }

    protected void fillDataSource(DataSource dataSource, Object modelInst) {
        String modelInstId = asString(readProperty(modelInst, "getPSSysModelInstId"));
        dataSource.setDataSourceId(String.format("psmodelinst_%s",
                KeyValueUtils.genUniqueId(modelInstId)));
        dataSource.setDBType("MYSQL5");
        dataSource.setJdbcUrl(asString(readProperty(modelInst, "getConnStr")));
        if (StringUtils.hasLength(dataSource.getJdbcUrl())
                && !dataSource.getJdbcUrl().contains("allowMultiQueries=true")) {
            dataSource.setJdbcUrl(dataSource.getJdbcUrl() + "&allowMultiQueries=true");
        }
        dataSource.setUsername(asString(readProperty(modelInst, "getUserName")));
        dataSource.setPassword(asString(readProperty(modelInst, "getPassword")));
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    }

    @Override
    public Object insert(String tableName, Map<String, Object> paramMap,
            Map<String, Object> extParamMap) throws Throwable {
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        if (actionSession != null) {
            Object value = actionSession.getActionParam(
                    String.format(BATCHINSERT_X, tableName.toUpperCase()));
            if (value instanceof List<?>) {
                ((List<Object>) value).add(paramMap);
                return 1;
            }
        }
        return super.insert(tableName, paramMap, extParamMap);
    }

    @Override
    public Object update(String tableName, Map<String, Object> paramMap,
            Map<String, Object> extParamMap) throws Throwable {
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        if (actionSession != null) {
            Object value = actionSession.getActionParam(
                    String.format(BATCHUPDATE_X, tableName.toUpperCase()));
            if (value instanceof List<?>) {
                ((List<Object>) value).add(paramMap);
                return 1;
            }
        }
        return super.update(tableName, paramMap, extParamMap);
    }

    protected void setPSDevSlnSysService(Object service) {
        this.psDevSlnSysService = service;
    }

    protected void setPSSysModelInstService(Object service) {
        this.psSysModelInstService = service;
    }

    private Object getService(Object configuredService, String interfaceName,
            String methodName, Object... args) throws Exception {
        Object service = configuredService;
        if (service == null && modelRepositoryServices != null) {
            for (Object candidate : modelRepositoryServices) {
                if (candidate == null) {
                    continue;
                }
                for (Class<?> candidateInterface : candidate.getClass().getInterfaces()) {
                    if (candidateInterface.getSimpleName().equals(interfaceName)) {
                        service = candidate;
                        break;
                    }
                }
                if (service != null) {
                    break;
                }
            }
        }
        if (service == null) {
            throw new Exception(String.format("模型服务[%s]未注入", interfaceName));
        }
        try {
            Method method = findMethod(service.getClass(), methodName, args.length);
            if (method == null) {
                throw new Exception(String.format("模型服务[%s]未提供方法[%s]", interfaceName, methodName));
            }
            return method.invoke(service, args);
        } catch (InvocationTargetException ex) {
            Throwable cause = ex.getCause() == null ? ex : ex.getCause();
            throw new Exception(cause.getMessage(), cause);
        } catch (ReflectiveOperationException ex) {
            throw new Exception(String.format("调用模型服务[%s]发生异常，%s",
                    interfaceName, ex.getMessage()), ex);
        }
    }

    private static Method findMethod(Class<?> type, String name, int parameterCount) {
        for (Class<?> current = type; current != null; current = current.getSuperclass()) {
            for (Method method : current.getDeclaredMethods()) {
                if (method.getName().equals(name)
                        && method.getParameterCount() == parameterCount) {
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    return method;
                }
            }
        }
        return null;
    }

    private static Object readProperty(Object target, String methodName) {
        if (target == null) {
            return null;
        }
        try {
            Method method = findMethod(target.getClass(), methodName, 0);
            return method == null ? null : method.invoke(target);
        } catch (ReflectiveOperationException ex) {
            return null;
        }
    }

    private static String asString(Object value) {
        return value == null ? null : String.valueOf(value);
    }
}