package net.ibizsys.modeling.core.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IPSModelCloner extends IModelRTAddin {

    int PRIORITY_PRIMARY = 50;
    int PRIORITY_DEFAULT = 100;

    default int getPriority() {
        return PRIORITY_DEFAULT;
    }

    default boolean isValid(Object[] args) {
        return true;
    }

    Object copy(Object[] args);

    Object paste(Object[] args);
}