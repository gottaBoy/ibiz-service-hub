package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.runtime.security.IUserContext;
import org.springframework.util.StringUtils;

public class PSDevSlnSysDEAccessManager extends DataEntityAccessManagerBase {
    public static final String ACCESSACTION_MANAGE = "MANAGE";

    @Override
    protected boolean onTestDataAccessAction(
            IUserContext userContext, Object key, IEntityDTO inputEntityDTO, String accessAction) throws Exception {
        if ("CREATE".equals(accessAction) || "DELETE".equals(accessAction)) {
            String solutionId = inputEntityDTO == null ? null : inputEntityDTO.getString("PSDEVSLNID", "");
            return StringUtils.hasLength(solutionId)
                    && getSystemRuntime().getDataEntityRuntime("PSDEVSLN").getDataEntityAccessManager()
                            .testDataAccessAction(userContext, null, null, solutionId, null, "UPDATE");
        }
        IPSDevSysUser systemUser =
                (IPSDevSysUser) getSystemAccessManager().getPSDevUserBase("SYS", (String) key);
        if (systemUser == null) {
            return false;
        }
        if ("READ".equals(accessAction) && (systemUser.getAccMode() & 1) == 1) {
            return true;
        }
        if ("UPDATE".equals(accessAction) && (systemUser.getAccMode() & 2) == 2) {
            return true;
        }
        if (ACCESSACTION_MANAGE.equals(accessAction)
                && getSystemRuntime().getDataEntityRuntime("PSDEVSLN").getDataEntityAccessManager()
                        .testDataAccessAction(userContext, null, null, systemUser.getPSDevSlnId(), null, "UPDATE")) {
            return true;
        }
        return systemUser.isAdminMode();
    }
}