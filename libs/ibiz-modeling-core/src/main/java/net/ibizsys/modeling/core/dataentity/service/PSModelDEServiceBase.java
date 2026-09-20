package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.cloud.core.dataentity.service.ProxyDEServiceBase;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

public abstract class PSModelDEServiceBase<T extends IEntityDTO, F extends ISearchContextDTO>
        extends ProxyDEServiceBase<T, F>
        implements IPSModelDEService<T, F> {

    public String getDataEntityId() {
        return getDataEntityRuntime().getId();
    }

    public IEntityDTO createEntityDTO(IPSDEMethodDTO methodDTO) {
        return new EntityDTO();
    }

    public ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO methodDTO) {
        return new SearchContextDTO();
    }
}