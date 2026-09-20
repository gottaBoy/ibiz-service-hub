package net.ibizsys.modeling.core.dataentity;

public class PSAppMenuDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSAPPMENUITEM", "PSAPPMENULOGIC"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}