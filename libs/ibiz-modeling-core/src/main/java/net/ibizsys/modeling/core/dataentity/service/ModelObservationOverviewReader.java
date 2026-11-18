package net.ibizsys.modeling.core.dataentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.modeling.core.security.IPSDevUserBase;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAppContext;

final class ModelObservationOverviewReader {
    private static final String[] ENTITIES = {
        "PSSYSAPP", "PSDATAENTITY", "PSSYSSERVICEAPI", "PSSYSPFPLUGIN", "PSSYSSFPLUGIN"
    };

    ModelObservationOverviewDTO read(IDataEntityRuntime observation, IDataEntityRuntime parent,
            String root, IUserContext user, ISystemAccessManager access, IEntityDTO input) throws Throwable {
        String system = resolveSystem(root, user, access);
        input.set("psdevslnsysid", root);
        input.set("pssystemid", system);
        if (!observation.getDataEntityAccessManager().testDataAccessAction(
                user, parent, root, null, input, "READ")
                || !system.equals(input.get("pssystemid"))
                || !root.equals(input.get("psdevslnsysid"))) {
            throw denied();
        }
        List<IDataEntityRuntime> runtimes = new ArrayList<>();
        List<ISearchContextDTO> filters = new ArrayList<>();
        // Authorize every destination before allowing any count fetch.
        for (String entity : ENTITIES) {
            IDataEntityRuntime runtime = observation.getSystemRuntime().getDataEntityRuntime(entity);
            ISearchContextDTO filter = runtime.createSearchContext();
            filter.set("pssystemid", system);
            filter.eq("pssystemid", system);
            filter.setPageable(0, 1, 0);
            filter.count(true);
            if (!runtime.getDataEntityAccessManager().testDataAccessAction(
                    user, parent, root, filter, "READ")
                    || !system.equals(filter.get("pssystemid"))) {
                throw denied();
            }
            filter.setPageable(0, 1, 0);
            filter.count(true);
            runtimes.add(runtime);
            filters.add(filter);
        }
        long[] counts = new long[ENTITIES.length];
        for (int i = 0; i < ENTITIES.length; i++) {
            Object result = runtimes.get(i).fetchDataSet("CurSys", null, new Object[] { filters.get(i) });
            if (!(result instanceof Page<?>)) {
                throw new IllegalStateException("Overview dataset did not return a page");
            }
            Page<?> page = (Page<?>) result;
            long total = page.getTotalElements();
            if (page.getNumber() != 0 || page.getNumberOfElements() > 1
                    || total < 0 || total < page.getNumberOfElements()) {
                throw new IllegalStateException("Overview dataset returned an invalid count page");
            }
            counts[i] = total;
        }
        return new ModelObservationOverviewDTO(counts);
    }

    private String resolveSystem(String root, IUserContext user, ISystemAccessManager access) {
        requireRoot(root, user);
        if (access == null) {
            throw denied();
        }
        IPSDevUser actor = access.getCurrentPSDevUserMust();
        IPSDevUserBase resolved = access.getPSDevUserBase(IPSDevUserBase.TARGETTYPE_SYS, root);
        if (!(resolved instanceof IPSDevSysUser)) {
            throw denied();
        }
        IPSDevSysUser grant = (IPSDevSysUser) resolved;
        if (actor == null || actor.isExpired() || grant.isExpired() || grant.getAccMode() < 0
                || (!grant.isAdminMode() && (grant.getAccMode() & IPSDevUserBase.ACCMODE_READ) == 0)
                || !identifier(actor.getPSDevUserId()) || !identifier(actor.getPSDevCenterId())
                || !actor.getPSDevUserId().equalsIgnoreCase(grant.getPSDevUserId())
                || !actor.getPSDevCenterId().equalsIgnoreCase(grant.getPSDevCenterId())
                || !root.equalsIgnoreCase(grant.getPSDevSlnSysId())
                || !identifier(grant.getPSSystemId())) {
            throw denied();
        }
        return grant.getPSSystemId();
    }

    static void requireRoot(String root, IUserContext user) {
        IAppContext context = user == null ? null : user.getAppContext();
        Object requested = context == null ? null : context.get("PSDEVSLNSYS");
        if (!identifier(root) || !(requested instanceof String)
                || !identifier((String) requested) || !root.equalsIgnoreCase((String) requested)) {
            throw denied();
        }
    }

    private static boolean identifier(String value) {
        return StringUtils.hasText(value)
                && value.chars().noneMatch(c -> Character.isWhitespace(c) || Character.isISOControl(c));
    }

    private static ErrorException denied() {
        return new ErrorException("Overview is not authorized for this model library", Errors.ACCESSDENY);
    }
}
