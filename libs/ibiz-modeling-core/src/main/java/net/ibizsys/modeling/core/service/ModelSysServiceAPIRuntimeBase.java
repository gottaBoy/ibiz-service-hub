package net.ibizsys.modeling.core.service;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.service.SysRestServiceAPIRuntimeBase;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.SysServiceAPIRuntimeException;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.modeling.core.dataentity.service.ModelDEServiceAPIRuntime;
import net.ibizsys.modeling.core.util.Base64Helper;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * REST runtime for the modeling system service.
 */
public abstract class ModelSysServiceAPIRuntimeBase extends SysRestServiceAPIRuntimeBase {

    private static final Log LOG = LogFactory.getLog(ModelSysServiceAPIRuntimeBase.class);

    @Autowired
    private IV5CoreAPIClientRuntime v5CoreAPIClientRuntime;

    @Override
    protected IDEServiceAPIRuntime createDefaultDEServiceAPIRuntime() {
        return new ModelDEServiceAPIRuntime();
    }

    @RequestMapping(method = RequestMethod.POST,
            value = "/psdevslnsys/{psdevslnsysid}/getruntimenodes")
    public List<Map> getRuntimeNodes(@PathVariable("psdevslnsysid") String psdevslnsysid,
            @RequestBody Map map) {
        try {
            String srfkey = DataTypeUtils.asString(map.get("srfkey"), null);
            String srfparentkey = DataTypeUtils.asString(map.get("srfparentkey"), null);

            Entity entity = new Entity(map, false);
            entity.set("V6MODE", "true");
            entity.set("psdevslnsysid", psdevslnsysid);

            if ("#".equals(srfkey) && !ObjectUtils.isEmpty(srfparentkey)) {
                String[] items = srfparentkey.replace("__", "#").split("[#]");
                entity.set("srfdeid", items[0]);
                entity.set("srfkey", items[1]);
                return listModelRT(entity);
            }
            if (!ObjectUtils.isEmpty(srfkey) && !ObjectUtils.isEmpty(srfparentkey)) {
                entity.set("psmodelrtid", srfkey);
                return listModelRT(entity);
            }
            return new ArrayList<>();
        } catch (Throwable ex) {
            throw new SysServiceAPIRuntimeException((ISysServiceAPIRuntime) this,
                    String.format("\u83b7\u53d6\u6a21\u578b\u8fd0\u884c\u65f6\u53d1\u751f\u9519\u8bef\uff0c%1$s",
                            ex.getMessage()),
                    ex);
        }
    }

    protected List<Map> listModelRT(IEntity entity) throws Throwable {
        String url = String.format("%s/saps/remoteapi.jsp?srfdeid=%s&SRFCALL=%s&SRFV5MODE=TRUE",
                v5CoreAPIClientRuntime.getServiceUrl(), "PSMODELRT", "XG_LISTMODELRT");
        String userInfoUrlParams = getUserInfoUrlParams();
        if (StringUtils.hasLength(userInfoUrlParams)) {
            url = url + "&" + userInfoUrlParams;
        }

        IWebClientRep<?> response = v5CoreAPIClientRuntime.getWebClient()
                .post(url, null, null, null, entity, null, String.class, null);
        Map ret = (Map) WebClientBase.MAPPER.readValue((String) response.getBody(), Map.class);
        int result = DataTypeUtils.getIntegerValue(ret.get("ret"), 0);
        if (result != 0) {
            String errorInfo = DataTypeUtils.asString(ret.get("info"), null);
            LOG.error(errorInfo);
            if (StringUtils.hasLength(errorInfo) && errorInfo.contains("\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38")) {
                throw new Exception("\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38");
            }
            throw new Exception(String.valueOf(ret.get("info")));
        }

        Object item = ret.get("item");
        if (!(item instanceof Map)) {
            return null;
        }
        String modelList = DataTypeUtils.asString(((Map) item).get("SRFMODELLIST"), null);
        if (!StringUtils.hasLength(modelList)) {
            return null;
        }
        String json = new String(Base64Helper.decode(modelList), Charset.forName("GBK"));
        return JsonUtils.asList(json);
    }

    protected String getUserInfoUrlParams() throws Exception {
        Map<String, String> params = v5CoreAPIClientRuntime.fillUserInfoUrlParams(null);
        if (!ObjectUtils.isEmpty(params)) {
            return WebClientBase.getUrlParams(params, true);
        }
        return null;
    }
}