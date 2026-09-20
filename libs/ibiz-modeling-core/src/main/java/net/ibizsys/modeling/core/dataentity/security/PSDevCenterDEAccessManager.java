package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.runtime.security.IUserContext;
import org.springframework.util.ObjectUtils;

public class PSDevCenterDEAccessManager extends DataEntityAccessManagerBase {
    @Override
    protected boolean onTestDataAccessAction(
            IUserContext userContext, Object key, IEntityDTO inputEntityDTO, String accessAction) throws Exception {
        if ("CREATE".equals(accessAction) || "DELETE".equals(accessAction) || ObjectUtils.isEmpty(key)) {
            return false;
        }
        IPSDevUser currentUser = getCurrentPSDevUser();
        if (currentUser == null || ObjectUtils.isEmpty(currentUser.getPSDevCenterId())
                || !currentUser.getPSDevCenterId().equals(key)) {
            return false;
        }
        return "READ".equals(accessAction) || currentUser.isAdminMode();
    }
}