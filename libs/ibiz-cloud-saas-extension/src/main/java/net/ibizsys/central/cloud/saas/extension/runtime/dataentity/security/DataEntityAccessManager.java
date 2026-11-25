package net.ibizsys.central.cloud.saas.extension.runtime.dataentity.security;

import java.util.Objects;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;

public class DataEntityAccessManager extends DataEntityAccessManagerBase {

	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {
		if ("APP_VIEW_THEME".equalsIgnoreCase(getDataEntityRuntime().getName())) {
			if (!testViewThemeScope(iUserContext, objKey, inputEntityDTO, strAccessAction)) {
				return false;
			}
			return super.onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction);
		}
		if (DataAccessActions.CREATE.equals(strAccessAction)) {
			return true;
		}
		
		return true;
		//return super.onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction);
	}

	protected boolean testViewThemeScope(IUserContext user, Object key, IEntityDTO input, String action) {
		if (!(user instanceof IEmployeeContext) || user.isAnonymoususer()) {
			return false;
		}
		IEmployeeContext employee = (IEmployeeContext) user;
		String userId = employee.getUserid();
		String systemId = employee.getDcsystemid();
		if (userId == null || userId.trim().isEmpty() || systemId == null || systemId.trim().isEmpty()) {
			return false;
		}
		if (DataAccessActions.READ.equals(action)) {
			return true;
		}
		if (!DataAccessActions.CREATE.equals(action) && !DataAccessActions.UPDATE.equals(action)
				&& !DataAccessActions.DELETE.equals(action)) {
			return false;
		}
		Object actualKey = key;
		if (actualKey == null && input != null) {
			actualKey = input.get("id");
		}
		IEntityDTO stored = null;
		if (actualKey != null && getDataEntityRuntime().checkKeyState(actualKey) == CheckKeyStates.EXIST) {
			stored = getDataEntityRuntime().getSimpleEntity(actualKey);
		}
		boolean administrator = employee.isSystemadmin() || employee.isSuperuser();
		if (stored == null) {
			if (!DataAccessActions.CREATE.equals(action) || input == null) {
				return false;
			}
			if (input.get("system_tag") != null && !Objects.equals(systemId, input.get("system_tag"))) {
				return false;
			}
			if (input.get("create_man") != null && !Objects.equals(userId, input.get("create_man"))) {
				return false;
			}
			Object owner = input.get("owner_type");
			return owner == null || "PERSONAL".equals(owner) || (administrator && "SYSTEM".equals(owner));
		}
		if (!Objects.equals(systemId, stored.get("system_tag"))) {
			return false;
		}
		if (!administrator && (!Objects.equals(userId, stored.get("create_man"))
				|| !"PERSONAL".equals(stored.get("owner_type")))) {
			return false;
		}
		if (input != null) {
			for (String field : new String[] {"id", "create_man", "system_tag"}) {
				if (input.contains(field) && !Objects.equals(input.get(field), stored.get(field))) {
					return false;
				}
			}
			if (input.contains("owner_type")) {
				Object owner = input.get("owner_type");
				if (!"PERSONAL".equals(owner) && !"SYSTEM".equals(owner)) {
					return false;
				}
				if (!administrator && !Objects.equals(owner, stored.get("owner_type"))) {
					return false;
				}
			}
		}
		return true;
	}
}
