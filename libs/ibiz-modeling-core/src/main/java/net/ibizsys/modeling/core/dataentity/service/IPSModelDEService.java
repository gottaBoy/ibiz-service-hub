package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Input;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Result;
import net.ibizsys.modeling.core.util.domain.ImportModelV2Input;

public interface IPSModelDEService<T extends IEntityDTO, F extends ISearchContextDTO>
        extends IProxyDEService<T, F> {

    default void initModel(T entity) throws Throwable {
        ((IDataEntityRuntime) getDataEntityRuntime()).initModel(entity);
    }

    default ExportModelV2Result exportModelV2(ExportModelV2Input input) throws Throwable {
        return ((IDataEntityRuntime) getDataEntityRuntime()).exportModelV2(input);
    }

    default void importModelV2(ImportModelV2Input input) throws Throwable {
        ((IDataEntityRuntime) getDataEntityRuntime()).importModelV2(input);
    }
}