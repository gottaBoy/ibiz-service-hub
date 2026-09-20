package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

public interface IModelEnhancerSysUtilRuntimeContext extends ISysUtilRuntimeContext {

    @Override
    IModelEnhancerSysUtilRuntime getModelRuntime();
}