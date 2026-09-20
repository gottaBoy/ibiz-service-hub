package net.ibizsys.modeling.core.dataentity;

public class PSDELogicDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSDELOGICPARAM", "PSDELOGICNODE", "PSDELOGICLINK",
                    "PSDELNPARAM", "PSDELLCOND"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}