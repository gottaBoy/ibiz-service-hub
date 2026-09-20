package net.ibizsys.modeling.core.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.modeling.core.util.PSModels;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;

/**
 * Base runtime for the V5 core API client.
 */
public abstract class V5CoreAPIClientRuntimeBase extends SubSysServiceAPIRuntime
        implements IV5CoreAPIClientRuntime {

    private static final Log LOG = LogFactory.getLog(V5CoreAPIClientRuntimeBase.class);

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    @Override
    public String getServiceUrl() {
        String serviceUrl = super.getServiceUrl();
        return StringUtils.hasLength(serviceUrl) ? serviceUrl : "http://172.16.220.130:30088/SAPAAS";
    }

    @Override
    protected ISubSysServiceAPIDERuntime createSubSysServiceAPIDERuntime(
            IPSSubSysServiceAPIDE serviceAPIDE) throws Exception {
        return new V5CoreAPIClientDERuntime();
    }

    @Override
    public Map<String, ?> getHeaders() {
        IEmployeeContext employeeContext = EmployeeContext.getCurrent();
        if (employeeContext == null) {
            return super.getHeaders();
        }
        Map<String, Object> headers = new HashMap<>();
        Map<String, ?> globalHeaders = super.getHeaders();
        if (globalHeaders != null) {
            headers.putAll(globalHeaders);
        }
        return headers;
    }

    protected IAppContext getAppContext() {
        if (ActionSessionManager.getCurrentSession() != null) {
            return ActionSessionManager.getCurrentSession().getAppContext();
        }
        return UserContext.getCurrentMust().getAppContext();
    }

    @Override
    public Object invokeDEMethod(IDataEntityRuntime dataEntityRuntime,
            IPSDEAction action, Object[] args) throws Throwable {
        IAppContext appContext = getAppContext();
        return invokeDEMethod(appContext == null ? null : appContext.any(),
                dataEntityRuntime, action, args);
    }

    @Override
    public Object invokeDEMethod(Map<String, Object> context,
            IDataEntityRuntime dataEntityRuntime,
            IPSDEAction action, Object[] args) throws Throwable {
        return onInvokeDEMethod(context, dataEntityRuntime, action, args);
    }

    protected Object onInvokeDEMethod(Map<String, Object> context,
            IDataEntityRuntime dataEntityRuntime,
            IPSDEAction action, Object[] args) throws Throwable {
        String url = String.format("%s/saps/remoteapi.jsp?srfdeid=%s&SRFCALL=%s&SRFV5MODE=TRUE",
                getServiceUrl(), dataEntityRuntime.getName(), action.getName());

        if (PSModels.isModelInstDataEntity(dataEntityRuntime.getName())) {
            Map<String, String> params = new LinkedHashMap<>();
            IPSDevSysUser devSysUser = PSDevSysUserHolder.peek();
            if (devSysUser != null) {
                params.put("SRFPSDEVSLNSYSID", devSysUser.getPSDevSlnSysId());
            } else {
                    IAppContext appContext = UserContext.getCurrentMust().getAppContext();
                    if (appContext != null) {
                        String solutionSystemId = DataTypeUtils.asString(
                            appContext.get("PSDEVSLNSYS"), null);
                    if (StringUtils.hasLength(solutionSystemId)) {
                        params.put("SRFPSDEVSLNSYSID", solutionSystemId);
                    }
                }
            }
            if (!ObjectUtils.isEmpty(params)) {
                url = url + "&" + WebClientBase.getUrlParams(params, true);
            }
        }

        String userInfoUrlParams = getUserInfoUrlParams();
        if (StringUtils.hasLength(userInfoUrlParams)) {
            url = url + "&" + userInfoUrlParams;
        }

        IEntityDTO entity;
        Object firstArg = args == null || args.length == 0 ? null : args[0];
        if (firstArg instanceof IEntityDTO) {
            entity = (IEntityDTO) firstArg;
        } else if (firstArg instanceof IEntity) {
            entity = dataEntityRuntime.createEntity();
            ((IEntity) firstArg).copyTo(entity);
        } else {
            entity = dataEntityRuntime.createEntity();
            entity.set(dataEntityRuntime.getKeyPSDEField().getLowerCaseName(), firstArg);
        }

        IWebClientRep<?> response = getWebClient()
                .post(url, null, null, null, entity, null, String.class, null);
        Map ret = (Map) WebClientBase.MAPPER.readValue((String) response.getBody(), Map.class);
        int result = DataTypeUtils.getIntegerValue(ret.get("ret"), 0);
        if (result != 0) {
            String errorInfo = DataTypeUtils.asString(ret.get("info"), null);
            LOG.error(errorInfo);
            if (StringUtils.hasLength(errorInfo) && errorInfo.contains("\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38")) {
                throw new SubSysServiceAPIRuntimeException(
                        (net.ibizsys.central.service.ISubSysServiceAPIRuntime) this,
                        "\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38");
            }
            throw new SubSysServiceAPIRuntimeException(
                    (net.ibizsys.central.service.ISubSysServiceAPIRuntime) this,
                    String.valueOf(ret.get("info")));
        }

        Object item = ret.get("item");
        if (!(item instanceof Map)) {
            return null;
        }
        if (action.getPSDEActionReturnMust().getPSDEMethodDTO() != null) {
            return dataEntityRuntime.getDEMethodDTO(
                    action.getPSDEActionReturnMust().getPSDEMethodDTO(), item, false);
        }
        if (action.getPSDEActionInputMust().isOutput()
                && action.getPSDEActionInputMust().getPSDEMethodDTO() != null) {
            return dataEntityRuntime.getDEMethodDTO(
                    action.getPSDEActionInputMust().getPSDEMethodDTO(), item, false);
        }
        return null;
    }

    protected String getUserInfoUrlParams() throws Exception {
        Map<String, String> params = fillUserInfoUrlParams(null);
        if (!ObjectUtils.isEmpty(params)) {
            return WebClientBase.getUrlParams(params, true);
        }
        return null;
    }

    @Override
    public Map<String, String> fillUserInfoUrlParams(Map<String, String> params) {
        if (params == null) {
            params = new LinkedHashMap<>();
        }

        ISystemAccessManager accessManager =
                (ISystemAccessManager) getSystemRuntime().getSystemAccessManager();
        params.put("SRFDCID", accessManager.getDefaultDCId());

        IAuthenticationUser authenticationUser = AuthenticationUser.getCurrent();
        IPSDevUser devUser = accessManager.getCurrentPSDevUserIf();
        if (authenticationUser != null && devUser != null) {
            params.put("SRFUSERID", devUser.getPSDevUserId());
            params.put("SRFUSERNAME", devUser.getPSDevUserName());
            params.put("SRFLOGINNAME", devUser.getLoginName());
            params.put("SRFDCID", devUser.getPSDevCenterId());
        }
        return params;
    }
}