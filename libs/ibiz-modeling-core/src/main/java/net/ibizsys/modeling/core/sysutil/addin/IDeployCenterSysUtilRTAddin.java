package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.ISysUtilRTAddin;
import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntimeContext;

public interface IDeployCenterSysUtilRTAddin
extends ISysUtilRTAddin {
    public void init(IDeployCenterSysUtilRuntimeContext var1, Object var2) throws Exception;
}
