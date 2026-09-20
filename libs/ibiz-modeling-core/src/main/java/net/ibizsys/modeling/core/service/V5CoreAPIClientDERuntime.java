package net.ibizsys.modeling.core.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.SubSysServiceAPIDERuntime;
import net.ibizsys.central.service.SubSysServiceAPIDERuntimeException;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;

/**
 * V5 implementation of an external service API data-entity runtime.
 */
public class V5CoreAPIClientDERuntime extends SubSysServiceAPIDERuntime {

    private static final Log LOG = LogFactory.getLog(V5CoreAPIClientDERuntime.class);

    @Override
    protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod method,
            Map<String, Object> context, IDataEntityRuntime dataEntityRuntime,
            IPSDEAction action, Object[] args) throws Throwable {
        String url = String.format("%s/saps/remoteapi.jsp?srfdeid=%s&SRFCALL=%s&SRFV5MODE=TRUE",
                getSubSysServiceAPIRuntime().getServiceUrl(),
                dataEntityRuntime.getName(), action.getName());
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

        IWebClientRep<?> response = getSubSysServiceAPIRuntime().getWebClient()
                .post(url, null, null, null, entity, null, String.class, null);
        Map ret = (Map) WebClientBase.MAPPER.readValue((String) response.getBody(), Map.class);
        int result = DataTypeUtils.getIntegerValue(ret.get("ret"), 0);
        if (result != 0) {
            String errorInfo = DataTypeUtils.asString(ret.get("info"), null);
            LOG.error(errorInfo);
            if (StringUtils.hasLength(errorInfo) && errorInfo.contains("\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38")) {
                throw new SubSysServiceAPIDERuntimeException(
                        (ISubSysServiceAPIDERuntime) this,
                        "\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38");
            }
            throw new SubSysServiceAPIDERuntimeException(
                    (ISubSysServiceAPIDERuntime) this, String.valueOf(ret.get("info")));
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
        ISystemAccessManager accessManager =
                (ISystemAccessManager) getSystemRuntime().getSystemAccessManager();
        Map<String, String> params = new LinkedHashMap<>();
        params.put("SRFDCID", accessManager.getDefaultDCId());

        IAuthenticationUser authenticationUser = AuthenticationUser.getCurrent();
        IPSDevUser devUser = accessManager.getCurrentPSDevUserIf();
        if (authenticationUser != null && devUser != null) {
            params.put("SRFUSERID", devUser.getPSDevUserId());
            params.put("SRFUSERNAME", devUser.getPSDevUserName());
            params.put("SRFLOGINNAME", devUser.getLoginName());
            params.put("SRFDCID", devUser.getPSDevCenterId());
        }
        if (!ObjectUtils.isEmpty(params)) {
            return WebClientBase.getUrlParams(params, true);
        }
        return null;
    }
}