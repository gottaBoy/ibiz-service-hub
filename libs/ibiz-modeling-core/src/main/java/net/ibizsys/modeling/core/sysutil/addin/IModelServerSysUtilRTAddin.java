package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.ISysUtilRTAddin;
import net.ibizsys.modeling.core.sysutil.IModelServerSysUtilRuntimeContext;

public interface IModelServerSysUtilRTAddin
extends ISysUtilRTAddin {
    public void init(IModelServerSysUtilRuntimeContext var1, Object var2) throws Exception;
}
