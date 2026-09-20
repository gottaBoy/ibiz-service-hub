package net.ibizsys.modeling.core.dataentity;

public class PSSysViewPanelDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSSYSVIEWPANELITEM", "PSPANELITEMLOGIC",
                    "PSSYSVIEWPANELLOGIC"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}