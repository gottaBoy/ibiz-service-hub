package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.modeling.core.sysutil.IMSPlatformSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IMSPlatformSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.CentralSysUtilRTAddinBase;
import net.ibizsys.modeling.core.sysutil.addin.IMSPlatformSysUtilRTAddin;
import net.ibizsys.runtime.IModelRuntimeContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class MSPlatformSysUtilRTAddinBase
extends CentralSysUtilRTAddinBase
implements IMSPlatformSysUtilRTAddin {
    private static final Log log = LogFactory.getLog(MSPlatformSysUtilRTAddinBase.class);

    @Override
    public void init(IMSPlatformSysUtilRuntimeContext ctx, Object addinData) throws Exception {
        super.init((IModelRuntimeContext)ctx, addinData);
    }

    protected IMSPlatformSysUtilRuntimeContext getContext() {
        return (IMSPlatformSysUtilRuntimeContext)super.getContext();
    }

    protected IMSPlatformSysUtilRuntime getSysUtilRuntime() {
        return this.getContext().getModelRuntime();
    }
}
