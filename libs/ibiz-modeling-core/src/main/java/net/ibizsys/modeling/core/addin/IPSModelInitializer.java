package net.ibizsys.modeling.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IPSModelInitializer extends IModelRTAddin {

    int PRIORITY_PRIMARY = 50;
    int PRIORITY_DEFAULT = 100;

    int PREPAREMODE_DRAFT = 0;
    int PREPAREMODE_CREATE = 1;
    int PREPAREMODE_UPDATE = 2;

    default int getPriority() {
        return PRIORITY_DEFAULT;
    }

    boolean prepare(Object[] args, int mode);

    boolean initialize(Object[] args);
}