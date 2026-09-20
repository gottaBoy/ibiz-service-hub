package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntime;

public interface IClusterSysUtilRuntimeContext
extends ISysUtilRuntimeContext {
    public IClusterSysUtilRuntime getModelRuntime();
}
