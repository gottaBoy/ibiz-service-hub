package net.ibizsys.modeling.core.dataentity.service;

import java.util.Map;

import net.ibizsys.central.cloud.core.dataentity.service.DEServiceAPIRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;

public class ModelDEServiceAPIRuntime extends DEServiceAPIRuntime {

    protected Object[] getDataSetArgs(IPSDEServiceAPIMethod serviceAPIMethod,
            IDEServiceAPIRSRuntime serviceAPIRSRuntime, String parentKey, Object body) throws Exception {
        if (body instanceof Map) {
            Map map = (Map) body;
            if (!map.containsKey("size")) {
                map.put("size", SearchContextDTO.getMaxSize());
            }
        }
        return super.getDataSetArgs(serviceAPIMethod, serviceAPIRSRuntime, parentKey, body);
    }
}