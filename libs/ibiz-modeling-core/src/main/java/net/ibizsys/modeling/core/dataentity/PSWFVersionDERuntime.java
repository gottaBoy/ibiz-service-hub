package net.ibizsys.modeling.core.dataentity;

public class PSWFVersionDERuntime extends DataEntityRuntimeBase2 {

    protected static final String[] batchActionDENames =
            new String[] {"PSWFPROCESS", "PSWFPROCPARAM", "PSWFPROCROLE",
                    "PSWFPROCSUBWF", "PSWFLINK", "PSWFLINKCOND",
                    "PSWFLINKROLE"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }
}