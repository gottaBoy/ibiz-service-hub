package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.security.IPSDevSlnUser;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.runtime.security.IUserContext;

public class PSDevSlnDEAccessManager extends DataEntityAccessManagerBase {
    @Override
    protected boolean onTestDataAccessAction(
            IUserContext userContext, Object key, IEntityDTO inputEntityDTO, String accessAction) throws Exception {
        IPSDevUser currentUser = getCurrentPSDevUser();
        if (currentUser != null && currentUser.isAdminMode()) {
            if (inputEntityDTO != null) {
                inputEntityDTO.put("PSDEVCENTERID", currentUser.getPSDevCenterId());
            }
            return true;
        }
        if ("CREATE".equals(accessAction)) {
            return false;
        }
        IPSDevSlnUser solutionUser =
                (IPSDevSlnUser) getSystemAccessManager().getPSDevUserBase("SLN", (String) key);
        if (solutionUser == null) {
            return false;
        }
        if ("READ".equals(accessAction) && (solutionUser.getAccMode() & 1) == 1) {
            return true;
        }
        if ("UPDATE".equals(accessAction) && (solutionUser.getAccMode() & 2) == 2) {
            return true;
        }
        return solutionUser.isAdminMode();
    }
}