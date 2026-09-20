package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import org.springframework.util.StringUtils;

public class PSDCRegistryItemDEAccessManager extends PSDCResourceDEAccessManager {
    private IDataEntityRuntime psDCRegistryRepoDataEntityRuntime;

    protected IDataEntityRuntime getPSDCRegistryRepoDataEntityRuntime() {
        if (psDCRegistryRepoDataEntityRuntime == null) {
            psDCRegistryRepoDataEntityRuntime = getSystemRuntime().getDataEntityRuntime("PSDCREGISTRYREPO");
        }
        return psDCRegistryRepoDataEntityRuntime;
    }

    @Override
    protected boolean isEnablePSDevCenterIdContext() {
        return true;
    }

    @Override
    protected String getPSDCIdFieldName() {
        return "PSDEVCENTERID";
    }

    @Override
    protected String getPSDevSlnIdFieldName() {
        return "PSDEVSLNID";
    }

    @Override
    protected IEntityDTO getSimpleEntity(Object key) throws Exception {
        IEntityDTO entity = super.getSimpleEntity(key);
        String registryRepoId = entity.getString("PSDCREGISTRYREPOID", null);
        if (!StringUtils.hasLength(registryRepoId)) {
            throw new Exception("未指定镜像仓库标识");
        }
        try {
            IEntityDTO registryRepo = getPSDCRegistryRepoDataEntityRuntime().get(registryRepoId);
            entity.set(getPSDCIdFieldName(), registryRepo.get(getPSDCIdFieldName()));
        } catch (Throwable ex) {
            throw new Exception(String.format("获取镜像仓库发生异常，%s", ex.getMessage()), ex);
        }
        return entity;
    }
}