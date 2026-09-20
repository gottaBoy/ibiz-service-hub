package net.ibizsys.modeling.core.dataentity.security;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.security.IUserContext;

public class PSConfigDEAccessManager extends DataEntityAccessManagerBase {
    @Override
    public boolean testDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            Object key,
            IEntityDTO inputEntityDTO,
            String accessAction) throws Exception {
        return "READ".equals(accessAction);
    }

    @Override
    protected boolean onTestDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            ISearchContextDTO searchContextDTO,
            String accessAction) throws Exception {
        return true;
    }
}