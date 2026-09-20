package net.ibizsys.modeling.core.dataentity.service;

import java.lang.reflect.Method;

import net.ibizsys.central.cloud.core.dataentity.service.DEServiceInvocationHandler;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEService;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;

public class PSModelDEServiceInvocationHandler<T> extends DEServiceInvocationHandler<T> {

    public PSModelDEServiceInvocationHandler(IDataEntityRuntimeContext dataEntityRuntimeContext,
            Class<T> serviceClass) throws Exception {
        super(dataEntityRuntimeContext, serviceClass);
    }

    protected void prepareRealDEService() throws Exception {
        if (IPSModelDEService.class.isAssignableFrom(getIntCls())) {
            PSModelDEServiceBase<IEntityDTO, ISearchContextDTO> realDEService =
                    new PSModelDEServiceBase<IEntityDTO, ISearchContextDTO>() {
                    };
            realDEService.init(getDataEntityRuntime().getSystemRuntime(), (IDataEntityRuntime) getDataEntityRuntime());
            setRealDEService((IDEService) realDEService);
            return;
        }
        super.prepareRealDEService();
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().equals(IDEService.class)
                || method.getDeclaringClass().equals(IProxyDEService.class)
                || method.getDeclaringClass().equals(IPSModelDEService.class)) {
            return method.invoke(getRealDEService(), args);
        }
        return getDataEntityRuntime().invokeMethod(method.getName(), args, null);
    }
}