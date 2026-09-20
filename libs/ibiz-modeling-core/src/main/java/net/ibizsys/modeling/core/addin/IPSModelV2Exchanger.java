package net.ibizsys.modeling.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IPSModelV2Exchanger extends IModelRTAddin {

    int PRIORITY_PRIMARY = 50;
    int PRIORITY_DEFAULT = 100;

    default int getPriority() {
        return PRIORITY_DEFAULT;
    }

    boolean prepareImport(Object[] args);

    boolean finishImport(Object[] args, Object result);

    boolean prepareExport(Object[] args);

    boolean finishExport(Object[] args, Object result);
}