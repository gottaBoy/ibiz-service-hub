package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.security.DataEntityAccessManagerBase;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ExceptionUtils;
import org.springframework.util.StringUtils;

public class PSDevSlnMSDeployDEAccessManager extends DataEntityAccessManagerBase {
    private IDataEntityRuntime psDCMSPlatformDataEntityRuntime;
    private IDataEntityRuntime psDevSlnDataEntityRuntime;

    protected IDataEntityRuntime getPSDCMSPlatformDataEntityRuntime() {
        if (psDCMSPlatformDataEntityRuntime == null) {
            psDCMSPlatformDataEntityRuntime = getSystemRuntime().getDataEntityRuntime("PSDCMSPLATFORM");
        }
        return psDCMSPlatformDataEntityRuntime;
    }

    protected IDataEntityRuntime getPSDevSlnDataEntityRuntime() {
        if (psDevSlnDataEntityRuntime == null) {
            psDevSlnDataEntityRuntime = getSystemRuntime().getDataEntityRuntime("PSDEVSLN");
        }
        return psDevSlnDataEntityRuntime;
    }

    @Override
    protected boolean onTestDataAccessAction(
            IUserContext userContext, Object key, IEntityDTO inputEntityDTO, String accessAction) throws Exception {
        String lastPSDevSlnId;
        if ("CREATE".equals(accessAction)) {
            if (inputEntityDTO == null) {
                return false;
            }
            String platformId = inputEntityDTO.getString("PSDCMSPLATFORMID", null);
            return StringUtils.hasLength(platformId)
                    && getPSDCMSPlatformDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                            userContext, null, null, platformId, null, "UPDATE");
        }
        IEntityDTO entity = getSimpleEntity(key);
        String platformId = entity.getString("PSDCMSPLATFORMID", null);
        if (!StringUtils.hasLength(platformId)) {
            return false;
        }
        if ("DELETE".equals(accessAction)) {
            return getPSDCMSPlatformDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                    userContext, null, null, platformId, null, "UPDATE");
        }
        String mappedAction = "READ".equals(accessAction) ? "READ" : "UPDATE";
        if (StringUtils.hasLength(lastPSDevSlnId = entity.getString("PSDEVSLNID", null))) {
            if (inputEntityDTO != null && inputEntityDTO.contains("PSDEVSLNID")) {
                String newPSDevSlnId = inputEntityDTO.getString("PSDEVSLNID", null);
                if (!lastPSDevSlnId.equals(newPSDevSlnId)) {
                    lastPSDevSlnId = null;
                }
            }
            if (StringUtils.hasLength(lastPSDevSlnId)
                    && getPSDevSlnDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                            userContext, null, null, lastPSDevSlnId, null, mappedAction)) {
                return true;
            }
        }
        return getPSDCMSPlatformDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                userContext, null, null, platformId, null, mappedAction);
    }

    protected IEntityDTO getSimpleEntity(Object key) throws Exception {
        try {
            return (IEntityDTO) getDataEntityRuntime().get(key);
        } catch (Throwable ex) {
            ExceptionUtils.rethrowException(ex);
            throw new IllegalStateException("ExceptionUtils.rethrowException returned unexpectedly");
        }
    }
}