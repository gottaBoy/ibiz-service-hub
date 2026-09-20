package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.IMSPlatformSysUtilRuntime;

public interface IMSPlatformSysUtilRuntimeContext
extends ISysUtilRuntimeContext {
    public IMSPlatformSysUtilRuntime getModelRuntime();
}
