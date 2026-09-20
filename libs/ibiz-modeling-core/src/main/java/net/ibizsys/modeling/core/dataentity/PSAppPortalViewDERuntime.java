package net.ibizsys.modeling.core.dataentity;

public class PSAppPortalViewDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSAPPPVPART"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}