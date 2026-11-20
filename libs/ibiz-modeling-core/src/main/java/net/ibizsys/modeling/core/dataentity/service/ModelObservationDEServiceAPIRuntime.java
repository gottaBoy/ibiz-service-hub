package net.ibizsys.modeling.core.dataentity.service;

import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;

/**
 * Candidate-only binding for the exact system overview action.
 */
public class ModelObservationDEServiceAPIRuntime extends ModelDEServiceAPIRuntime {
    public static boolean supportsOverviewMethod(IPSDEServiceAPIMethod method) {
        if (method == null || !"SysOverviewCnt".equalsIgnoreCase(method.getCodeName())
                || !"DEACTION".equals(method.getMethodType())
                || !"POST".equals(method.getRequestMethod())
                || !"READ".equals(method.getDataAccessAction())
                || method.getPSDEServiceAPIMethodReturn() == null
                || !"DTO".equals(method.getPSDEServiceAPIMethodReturn().getType())) {
            return false;
        }
        IPSDEAction action = method.getPSDEAction();
        return action != null && "SysOverviewCnt".equalsIgnoreCase(action.getCodeName())
                && "READ".equals(action.getDataAccessAction())
                && !action.isBatchAction() && action.getPSDEActionInput() != null
                && "DTO".equals(action.getPSDEActionInput().getType())
                && !action.getPSDEActionInput().isOutput()
                && action.getPSDEActionReturn() != null
                && "DTO".equals(action.getPSDEActionReturn().getType());
    }

    @Override
    protected Object onExecuteAction(String scope, IDEServiceAPIRSRuntime relationship,
            String parentKey, IPSDEServiceAPIMethod method, Object body, String key, Object tag)
            throws Throwable {
        if (!"MODELOBSERVATION".equals(getDataEntityRuntime().getName())
                || !"SysOverviewCnt".equalsIgnoreCase(method.getCodeName())) {
            return super.onExecuteAction(scope, relationship, parentKey, method, body, key, tag);
        }
        if (!supportsOverviewMethod(method)
                || key != null || !(body instanceof Map<?, ?>)
                || relationship == null || relationship.getMajorDEServiceAPIRuntime() == null
                || relationship.getMinorDEServiceAPIRuntime() != this) {
            throw unsupported();
        }
        IDataEntityRuntime parent = relationship.getMajorDEServiceAPIRuntime().getDataEntityRuntime();
        if (parent == null || !"PSDEVSLNSYS".equals(parent.getName())
                || relationship.getPSDEServiceAPIRS() == null
                || relationship.getPSDEServiceAPIRS().getParentIdPSDEField() == null
                || !"PSDEVSLNSYSID".equalsIgnoreCase(
                        relationship.getPSDEServiceAPIRS().getParentIdPSDEField().getName())
                || !(getSystemAccessManager() instanceof ISystemAccessManager)) {
            throw unsupported();
        }
        ModelObservationOverviewReader.requireRoot(parentKey, UserContext.getCurrent());
        // This operation has no user-controlled selection or counter input.
        Object[] args = getActionArgs(method, relationship, parentKey, new LinkedHashMap<>(), null);
        if (args == null || args.length != 1 || !(args[0] instanceof IEntityDTO)) {
            throw unsupported();
        }
        return new ModelObservationOverviewReader().read(getDataEntityRuntime(), parent, parentKey,
                UserContext.getCurrent(), (ISystemAccessManager) getSystemAccessManager(),
                (IEntityDTO) args[0]);
    }

    private static ErrorException unsupported() {
        return new ErrorException("Overview requires a reviewed single-DTO candidate binding",
                Errors.ACCESSDENY);
    }
}
