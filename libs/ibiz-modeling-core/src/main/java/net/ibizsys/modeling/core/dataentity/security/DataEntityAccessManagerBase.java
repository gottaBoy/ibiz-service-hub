package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.runtime.security.IUserContext;

public abstract class DataEntityAccessManagerBase extends DataEntityAccessManager {
    private boolean enablePSDevCenterIdContext;

    @Override
    protected void onInit() throws Exception {
        if (!"PSDEVCENTER".equals(this.getDataEntityRuntime().getName())) {
            this.enablePSDevCenterIdContext =
                    this.getDataEntityRuntime().getPSDEField("PSDEVCENTERID") != null
                            || this.getDataEntityRuntime().getPSDEField("PSDCID") != null;
        }
        super.onInit();
    }

    protected boolean isEnablePSDevCenterIdContext() {
        return enablePSDevCenterIdContext;
    }

    protected boolean testSuperuser(IUserContext userContext) {
        return false;
    }

    protected boolean onTestDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            ISearchContextDTO searchContextDTO,
            String accessAction) throws Exception {
        IPSDevUser currentUser;
        if (parentDataEntityRuntime != null) {
            return parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(
                    userContext, null, null, parentKey, null, "READ");
        }
        if (isEnablePSDevCenterIdContext()
                && searchContextDTO != null
                && (currentUser = getCurrentPSDevUser()) != null) {
            searchContextDTO.set("psdevcenterid", currentUser.getPSDevCenterId());
        }
        return true;
    }

    @Override
    public ISystemAccessManager getSystemAccessManager() {
        return (ISystemAccessManager) super.getSystemAccessManager();
    }

    protected IPSDevUser getCurrentPSDevUser() {
        ISystemAccessManager systemAccessManager = getSystemAccessManager();
        return systemAccessManager == null ? null : systemAccessManager.getCurrentPSDevUserIf();
    }
}