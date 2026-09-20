package net.ibizsys.modeling.core.dataentity;

public class PSDEFValueRuleDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSDEFVRCOND"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}