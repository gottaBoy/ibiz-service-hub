package net.ibizsys.central.plugin.cloud.service.client;

import java.util.Objects;

import net.ibizsys.central.cloud.core.cloudutil.ICloudPortalUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;

/**
 * Calls a Portal runtime hosted in the same trusted service process.
 */
public final class LocalCloudPortalClient implements ICloudPortalClient {
    private final ICloudPortalUtilRuntime portal;

    public LocalCloudPortalClient(ICloudPortalUtilRuntime portal) {
        this.portal = Objects.requireNonNull(portal);
    }

    @Override
    public PortalAsyncAction createAsyncAction(PortalAsyncAction action) {
        return portal.createAsyncAction(action.any());
    }

    @Override
    public PortalAsyncAction executeAsyncAction(String id, PortalAsyncAction action) {
        return portal.executeAsyncAction(id, action.any());
    }

    @Override
    public PortalAsyncAction errorAsyncAction(String id, PortalAsyncAction action) {
        return portal.errorAsyncAction(id, action.any());
    }

    @Override
    public PortalAsyncAction cancelAsyncAction(String id, PortalAsyncAction action) {
        return portal.cancelAsyncAction(id, action.any());
    }

    @Override
    public PortalAsyncAction finishAsyncAction(String id, PortalAsyncAction action) {
        return portal.finishAsyncAction(id, action.any());
    }

    @Override
    public PortalAsyncAction getAsyncAction(String id) {
        return portal.getAsyncAction(id);
    }

    @Override
    public void registerEmployee(Employee employee) {
        portal.registerEmployee(employee);
    }

    @Override
    public void notifyEmployee(String employeeId, String dcSystemId, PortalMessage message) {
        portal.notifyEmployee(employeeId, dcSystemId, message);
    }

    @Override
    public void notifyEmployees(String mode, String id, PortalMessage message) {
        portal.notifyEmployees(mode, id, message);
    }
}
