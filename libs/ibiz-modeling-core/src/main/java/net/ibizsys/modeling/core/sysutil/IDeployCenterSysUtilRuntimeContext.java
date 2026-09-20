package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntime;

public interface IDeployCenterSysUtilRuntimeContext
extends ISysUtilRuntimeContext {
    public IDeployCenterSysUtilRuntime getModelRuntime();
}
