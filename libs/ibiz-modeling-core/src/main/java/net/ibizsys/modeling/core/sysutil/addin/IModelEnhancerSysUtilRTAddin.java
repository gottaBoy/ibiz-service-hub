package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.ISysUtilRTAddin;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntimeContext;

public interface IModelEnhancerSysUtilRTAddin extends ISysUtilRTAddin {

    void init(IModelEnhancerSysUtilRuntimeContext context, Object addinData) throws Exception;
}