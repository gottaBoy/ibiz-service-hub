package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.addin.IPSModelV2Exchanger;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Input;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Result;
import net.ibizsys.modeling.core.util.domain.ImportModelV2Input;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ExceptionUtils;
import org.springframework.util.Assert;

public abstract class PSModelV2ExchangerBase extends ModelEnhancerSysUtilRTAddinBase
        implements IPSModelV2Exchanger {

    @Override
    public boolean prepareImport(Object[] args) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof ImportModelV2Input) {
                return onPrepareImport((ImportModelV2Input) args[0], args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            SystemRuntimeException.rethrow((IModelRuntime) getSysUtilRuntime(), ex);
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("准备导入发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected boolean onPrepareImport(ImportModelV2Input input, Object[] args) throws Throwable {
        return false;
    }

    @Override
    public boolean finishImport(Object[] args, Object ret) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof ImportModelV2Input && ret instanceof IEntityDTO) {
                return onFinishImport((ImportModelV2Input) args[0], (IEntityDTO) ret, args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            SystemRuntimeException.rethrow((IModelRuntime) getSysUtilRuntime(), ex);
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("结束导入发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected boolean onFinishImport(ImportModelV2Input input, IEntityDTO importEntity,
                                     Object[] args) throws Throwable {
        return false;
    }

    @Override
    public boolean prepareExport(Object[] args) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof ExportModelV2Input) {
                return onPrepareExport((ExportModelV2Input) args[0], args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            SystemRuntimeException.rethrow((IModelRuntime) getSysUtilRuntime(), ex);
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("准备导出发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected boolean onPrepareExport(ExportModelV2Input input, Object[] args) throws Throwable {
        return false;
    }

    @Override
    public boolean finishExport(Object[] args, Object ret) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof ExportModelV2Input && ret instanceof ExportModelV2Result) {
                return onFinishExport((ExportModelV2Input) args[0],
                        (ExportModelV2Result) ret, args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            SystemRuntimeException.rethrow((IModelRuntime) getSysUtilRuntime(), ex);
            throw new SystemRuntimeException((ISystemRuntimeBase) getSystemRuntime(),
                    (IModelRuntime) getSysUtilRuntime(),
                    String.format("结束导出发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected boolean onFinishExport(ExportModelV2Input input, ExportModelV2Result result,
                                     Object[] args) throws Throwable {
        return false;
    }
}