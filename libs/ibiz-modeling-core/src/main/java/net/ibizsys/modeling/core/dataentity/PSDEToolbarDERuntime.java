package net.ibizsys.modeling.core.dataentity;

public class PSDEToolbarDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSDETBITEM", "PSDETOOLBARLOGIC"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}