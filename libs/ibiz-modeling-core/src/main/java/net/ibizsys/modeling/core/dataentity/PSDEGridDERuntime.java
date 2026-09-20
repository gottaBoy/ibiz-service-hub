package net.ibizsys.modeling.core.dataentity;

public class PSDEGridDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSDEGRIDCOL", "PSDEGEIUPDATE", "PSDEGEIUDETAIL",
                    "PSDEGRIDLOGIC", "PSDEGEIVR"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}