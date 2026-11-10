package net.ibizsys.central.cloud.saas.extension.runtime.dataentity.security;

import java.util.Objects;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;

/** Internal messages use their model-backed sender/receiver roles, not the legacy extension allow-all policy. */
public class InternalMessageAccessManager extends DataEntityAccessManagerBase {

    private static final String[] OWNERSHIP_FIELDS = {
        "sender", "receiver", "system_tag", "owner_type", "owner_id"
    };

    @Override
    protected boolean onTestDataAccessAction(IUserContext userContext, Object key, IEntityDTO input,
            String action) throws Exception {
        if (userContext == null) {
            return false;
        }
        if (testSuperuser(userContext)) {
            return super.onTestDataAccessAction(userContext, key, input, action);
        }
        if (!(userContext instanceof IEmployeeContext)) {
            return false;
        }
        if (!super.onTestDataAccessAction(userContext, key, input, action)) {
            return false;
        }
        IEmployeeContext employee = (IEmployeeContext) userContext;
        for (IPSDEUserRole role : getPSDEUserRoles(employee, action)) {
            if (role.isAllData()) {
                return true;
            }
        }
        if (!StringUtils.hasText(employee.getUserid()) || !StringUtils.hasText(employee.getTenant())
                || !StringUtils.hasText(employee.getDcsystemid())) {
            return false;
        }
        if (DataAccessActions.CREATE.equals(action)) {
            return testCreation(employee, input);
        }
        if (DataAccessActions.UPDATE.equals(action) && input != null) {
            if (key == null || (input.contains("id") && !Objects.equals(key, input.get("id")))) {
                return false;
            }
            IEntityDTO persisted = getDataEntityRuntime().getSimpleEntity(key);
            if (persisted == null) {
                return false;
            }
            for (String field : OWNERSHIP_FIELDS) {
                if (input.contains(field) && !Objects.equals(input.get(field), persisted.get(field))) {
                    return false;
                }
            }
        }
        return true;
    }

    protected boolean testCreation(IEmployeeContext employee, IEntityDTO input) {
        if (input == null || !Objects.equals(employee.getUserid(), input.get("sender"))
                || !Objects.equals(employee.getDcsystemid(), input.get("system_tag"))
                || !"PERSONAL".equals(input.get("owner_type"))) {
            return false;
        }
        if (input.contains("owner_id") && input.get("owner_id") != null
                && !Objects.equals(employee.getUserid(), input.get("owner_id"))) {
            return false;
        }
        Object receiver = input.get("receiver");
        if (!(receiver instanceof String) || !StringUtils.hasText((String) receiver)) {
            return false;
        }
        try {
            Employee recipient = getRecipient((String) receiver);
            if (recipient == null || !Objects.equals(receiver, recipient.getUserId())) {
                return false;
            }
            // EBSX EmployeeDTO exposes sys_person.DC as DOMAINS; SRFDCID is not a declared DTO field.
            String tenant = recipient.getDomains();
            return StringUtils.hasText(tenant) && Objects.equals(employee.getTenant(), tenant)
                    && (!StringUtils.hasText(recipient.getSrfdcid()) || Objects.equals(tenant, recipient.getSrfdcid()));
        } catch (Exception denied) {
            return false;
        }
    }

    protected Employee getRecipient(String id) {
        ICloudSaaSUtilRuntime saas = ((IServiceSystemRuntime) getSystemRuntime())
                .getSysUtilRuntime(ICloudSaaSUtilRuntime.class, false, false);
        return saas.getEmployee(id);
    }
}
