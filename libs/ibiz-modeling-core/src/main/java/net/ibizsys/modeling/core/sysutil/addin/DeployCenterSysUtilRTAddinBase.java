package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.CentralSysUtilRTAddinBase;
import net.ibizsys.modeling.core.sysutil.addin.IDeployCenterSysUtilRTAddin;
import net.ibizsys.runtime.IModelRuntimeContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class DeployCenterSysUtilRTAddinBase
extends CentralSysUtilRTAddinBase
implements IDeployCenterSysUtilRTAddin {
    private static final Log log = LogFactory.getLog(DeployCenterSysUtilRTAddinBase.class);

    @Override
    public void init(IDeployCenterSysUtilRuntimeContext ctx, Object addinData) throws Exception {
        super.init((IModelRuntimeContext)ctx, addinData);
    }

    protected IDeployCenterSysUtilRuntimeContext getContext() {
        return (IDeployCenterSysUtilRuntimeContext)super.getContext();
    }

    protected IDeployCenterSysUtilRuntime getSysUtilRuntime() {
        return this.getContext().getModelRuntime();
    }
}
