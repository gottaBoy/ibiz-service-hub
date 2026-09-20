package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.ISysUtilRTAddin;
import net.ibizsys.modeling.core.sysutil.IMSPlatformSysUtilRuntimeContext;

public interface IMSPlatformSysUtilRTAddin
extends ISysUtilRTAddin {
    public void init(IMSPlatformSysUtilRuntimeContext var1, Object var2) throws Exception;
}
