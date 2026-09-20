package net.ibizsys.modeling.core.dataentity;

public class PSDEDataQueryDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSDEDQJOIN", "PSDEDQCOND"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}