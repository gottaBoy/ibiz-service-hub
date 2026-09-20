package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeContext;
import org.springframework.util.ObjectUtils;

public abstract class ModelEnhancerSysUtilRTAddinBase extends ModelSysUtilRTAddinBase
        implements IModelEnhancerSysUtilRTAddin {

    private String modelName;

    @Override
    public void init(IModelEnhancerSysUtilRuntimeContext context, Object addinData) throws Exception {
        super.init((IModelRuntimeContext) context, addinData);
    }

    protected IModelEnhancerSysUtilRuntimeContext getContext() {
        return (IModelEnhancerSysUtilRuntimeContext) super.getContext();
    }

    @Override
    protected IModelEnhancerSysUtilRuntime getSysUtilRuntime() {
        return getContext().getModelRuntime();
    }

    public String getModelName() {
        if (ObjectUtils.isEmpty(modelName) && !ObjectUtils.isEmpty(getAddinData())) {
            String[] items = String.valueOf(getAddinData()).split("[:]");
            modelName = items[items.length - 1];
        }
        return modelName;
    }
}