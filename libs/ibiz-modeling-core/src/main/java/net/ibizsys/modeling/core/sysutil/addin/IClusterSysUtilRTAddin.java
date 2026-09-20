package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.ISysUtilRTAddin;
import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntimeContext;

public interface IClusterSysUtilRTAddin
extends ISysUtilRTAddin {
    public void init(IClusterSysUtilRuntimeContext var1, Object var2) throws Exception;
}
