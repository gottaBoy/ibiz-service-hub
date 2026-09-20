package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.addin.IPSModelInitializer;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ExceptionUtils;
import org.springframework.util.Assert;

public abstract class PSModelInitializerBase extends ModelEnhancerSysUtilRTAddinBase
        implements IPSModelInitializer {

    @Override
    public boolean prepare(Object[] args, int prepareMode) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof IEntityDTO) {
                return onPrepare((IEntityDTO) args[0], args, prepareMode);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            SystemRuntimeException.rethrow((IModelRuntime) getSysUtilRuntime(), ex);
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("准备模型发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected boolean onPrepare(IEntityDTO entity, Object[] args, int prepareMode) throws Throwable {
        if (prepareMode == PREPAREMODE_DRAFT || prepareMode == PREPAREMODE_CREATE) {
            return onPrepare(entity, args, prepareMode == PREPAREMODE_DRAFT);
        }
        return false;
    }

    protected boolean onPrepare(IEntityDTO entity, Object[] args, boolean draftMode) throws Throwable {
        return false;
    }

    @Override
    public boolean initialize(Object[] args) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof IEntityDTO) {
                return onInitialize((IEntityDTO) args[0], args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            SystemRuntimeException.rethrow((IModelRuntime) getSysUtilRuntime(), ex);
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("初始化模型发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected boolean onInitialize(IEntityDTO entity, Object[] args) throws Throwable {
        return false;
    }

    protected boolean isCloudMode() {
        return false;
    }
}