package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.IModelServerSysUtilRuntime;

public interface IModelServerSysUtilRuntimeContext
extends ISysUtilRuntimeContext {
    public IModelServerSysUtilRuntime getModelRuntime();
}
