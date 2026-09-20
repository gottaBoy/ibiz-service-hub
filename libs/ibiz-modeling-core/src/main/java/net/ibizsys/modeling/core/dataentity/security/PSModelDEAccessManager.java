package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.IAppContext;
import org.springframework.util.StringUtils;

public class PSModelDEAccessManager extends DataEntityAccessManagerBase {
    private static final String APPCONTEXT_PSDEVSLNSYS = "PSDEVSLNSYS";
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
        if (inputEntityDTO != null) {
            inputEntityDTO.set("pssystemid", DEFAULT_PSSYSTEMID);
        }
        return testModelAccess(systemUser, accessAction);
    }

    @Override
    public boolean testDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            ISearchContextDTO searchContextDTO,
            String accessAction) throws Exception {
        IPSDevSysUser systemUser = getPSDevSysUser();
        if (searchContextDTO != null) {
            searchContextDTO.set("pssystemid", DEFAULT_PSSYSTEMID);
        }
        return testModelAccess(systemUser, accessAction);
    }

    private IPSDevSysUser getPSDevSysUser() throws Exception {
        IAppContext appContext = UserContext.getCurrentMust().getAppContext();
        if (appContext == null) {
            throw new Exception("应用上下文对象无效");
        }
        String solutionSystemId = (String) appContext.get(APPCONTEXT_PSDEVSLNSYS);
        if (!StringUtils.hasLength(solutionSystemId)) {
            throw new Exception("未传入开发系统标识");
        }
        return (IPSDevSysUser) getSystemAccessManager().getPSDevUserBase("SYS", solutionSystemId);
    }

    private boolean testModelAccess(IPSDevSysUser systemUser, String accessAction) {
        if (systemUser == null) {
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