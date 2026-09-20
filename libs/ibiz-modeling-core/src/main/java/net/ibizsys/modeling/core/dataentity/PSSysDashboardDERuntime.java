package net.ibizsys.modeling.core.dataentity;

public class PSSysDashboardDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSSYSDBPART", "PSSYSDASHBOARDLOGIC"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}