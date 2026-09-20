package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.CentralSysUtilRTAddinBase;
import net.ibizsys.modeling.core.sysutil.addin.IClusterSysUtilRTAddin;
import net.ibizsys.runtime.IModelRuntimeContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class ClusterSysUtilRTAddinBase
extends CentralSysUtilRTAddinBase
implements IClusterSysUtilRTAddin {
    private static final Log log = LogFactory.getLog(ClusterSysUtilRTAddinBase.class);

    @Override
    public void init(IClusterSysUtilRuntimeContext ctx, Object addinData) throws Exception {
        super.init((IModelRuntimeContext)ctx, addinData);
    }

    protected IClusterSysUtilRuntimeContext getContext() {
        return (IClusterSysUtilRuntimeContext)super.getContext();
    }

    protected IClusterSysUtilRuntime getSysUtilRuntime() {
        return this.getContext().getModelRuntime();
    }
}
