package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.IStudioSysUtilRuntime;

public interface IStudioSysUtilRuntimeContext
extends ISysUtilRuntimeContext {
    public IStudioSysUtilRuntime getModelRuntime();
}
