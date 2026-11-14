package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAppContext;
import org.springframework.util.StringUtils;

public class PSModelDEAccessManager extends DataEntityAccessManagerBase {
    private static final String APPCONTEXT_PSDEVSLNSYS = "PSDEVSLNSYS";
    // Kept for binary compatibility, not as an authorization or model-root fallback.
    public static final String DEFAULT_PSSYSTEMID = "2C40DFCD-0DF5-47BF-91A5-C45F810B0001";

    @Override
    public boolean testDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            Object key,
            IEntityDTO inputEntityDTO,
            String accessAction) throws Exception {
        IPSDevSysUser systemUser = getPSDevSysUser();
        if (!testModelAccess(systemUser, accessAction)) {
            return false;
        }
        if (inputEntityDTO != null) {
            inputEntityDTO.set("pssystemid", systemUser.getPSSystemId());
        }
        return true;
    }

    @Override
    public boolean testDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            ISearchContextDTO searchContextDTO,
            String accessAction) throws Exception {
        IPSDevSysUser systemUser = getPSDevSysUser();
        if (!testModelAccess(systemUser, accessAction)) {
            return false;
        }
        if (searchContextDTO != null) {
            searchContextDTO.set("pssystemid", systemUser.getPSSystemId());
        }
        return true;
    }

    private IPSDevSysUser getPSDevSysUser() throws Exception {
        IAppContext appContext = UserContext.getCurrentMust().getAppContext();
        if (appContext == null) {
            throw new ErrorException("应用上下文对象无效", Errors.ACCESSDENY);
        }
        Object root = appContext.get(APPCONTEXT_PSDEVSLNSYS);
        if (!(root instanceof String) || !isModelIdentifier((String) root)) {
            throw new ErrorException("未传入开发系统标识", Errors.ACCESSDENY);
        }
        String solutionSystemId = (String) root;
        IPSDevSysUser systemUser =
                (IPSDevSysUser) getSystemAccessManager().getPSDevUserBase("SYS", solutionSystemId);
        if (systemUser == null
                || !solutionSystemId.equalsIgnoreCase(systemUser.getPSDevSlnSysId())
                || !isModelIdentifier(systemUser.getPSSystemId())) {
            return null;
        }
        return systemUser;
    }

    private static boolean isModelIdentifier(String value) {
        return StringUtils.hasText(value)
                && value.chars().noneMatch(c -> Character.isWhitespace(c) || Character.isISOControl(c));
    }

    private boolean testModelAccess(IPSDevSysUser systemUser, String accessAction) {
        if (systemUser == null || systemUser.isExpired() || systemUser.getAccMode() < 0) {
            return false;
        }
        if ("READ".equals(accessAction) && (systemUser.getAccMode() & 1) == 1) {
            return true;
        }
        if (("CREATE".equals(accessAction) || "UPDATE".equals(accessAction) || "DELETE".equals(accessAction))
                && (systemUser.getAccMode() & 2) == 2) {
            return true;
        }
        return systemUser.isAdminMode();
    }
}
