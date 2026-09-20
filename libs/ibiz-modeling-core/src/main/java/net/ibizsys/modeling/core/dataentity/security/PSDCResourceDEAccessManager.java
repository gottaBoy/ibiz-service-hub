package net.ibizsys.modeling.core.dataentity.security;

import java.util.List;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ExceptionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class PSDCResourceDEAccessManager extends DataEntityAccessManagerBase {
    private String psdcIdFieldName;
    private String psDevSlnIdFieldName;
    private IDataEntityRuntime psDevSlnDataEntityRuntime;
    private IDataEntityRuntime psDevCenterDataEntityRuntime;

    @Override
    protected void onInit() throws Exception {
        super.onInit();
       List<? extends IPSDERBase> minorDERs = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
       findContextFields(minorDERs, false);
        IDataEntityRuntime inheritRuntime = (IDataEntityRuntime) this.getDataEntityRuntime().getInheritDataEntityRuntime();
       if (inheritRuntime != null) {
           findContextFields(inheritRuntime.getPSDataEntity().getMinorPSDERs(), true);
       }
    }

    private void findContextFields(List<? extends IPSDERBase> derList, boolean inherited) {
        if (ObjectUtils.isEmpty(derList)) {
            return;
        }
        for (IPSDERBase der : derList) {
            if (!(der instanceof IPSDER1N) || ((((IPSDER1N) der).getMasterRS()) & 4) != 4) {
                continue;
            }
            IPSDER1N der1n = (IPSDER1N) der;
            String majorName = der1n.getMajorPSDataEntityMust().getName();
            if ("PSDEVCENTER".equals(majorName) && (!inherited || !StringUtils.hasLength(psdcIdFieldName))) {
                psdcIdFieldName = der1n.getPSPickupDEFieldMust().getName();
            } else if ("PSDEVSLN".equals(majorName)
                    && (!inherited || !StringUtils.hasLength(psDevSlnIdFieldName))) {
                psDevSlnIdFieldName = der1n.getPSPickupDEFieldMust().getName();
            }
        }
    }

    protected String getPSDCIdFieldName() {
        return psdcIdFieldName;
    }

    protected String getPSDevSlnIdFieldName() {
        return psDevSlnIdFieldName;
    }

    protected IDataEntityRuntime getPSDevSlnDataEntityRuntime() {
        if (psDevSlnDataEntityRuntime == null) {
            psDevSlnDataEntityRuntime = getSystemRuntime().getDataEntityRuntime("PSDEVSLN");
        }
        return psDevSlnDataEntityRuntime;
    }

    protected IDataEntityRuntime getPSDevCenterDataEntityRuntime() {
        if (psDevCenterDataEntityRuntime == null) {
            psDevCenterDataEntityRuntime = getSystemRuntime().getDataEntityRuntime("PSDEVCENTER");
        }
        return psDevCenterDataEntityRuntime;
    }

    @Override
    public boolean testDataAccessAction(
            IUserContext userContext,
            IDataEntityRuntime parentDataEntityRuntime,
            String parentKey,
            Object key,
            IEntityDTO inputEntityDTO,
            String accessAction) throws Exception {
        String lastPSDevSlnId;
        if ("CREATE".equals(accessAction)) {
            if (inputEntityDTO == null) {
                return false;
            }
            String psDevCenterId = inputEntityDTO.getString(
                    getPSDCIdFieldName(),
                    getCurrentPSDevUser() == null ? null : getCurrentPSDevUser().getPSDevCenterId());
            if (!StringUtils.hasLength(psDevCenterId)) {
                return false;
            }
            if (getPSDevCenterDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                    userContext, null, null, psDevCenterId, null, "UPDATE")) {
                inputEntityDTO.set(getPSDCIdFieldName(), psDevCenterId);
                return true;
            }
            return false;
        }

        IEntityDTO entity = getSimpleEntity(key);
        String psDevCenterId = entity.getString(
                getPSDCIdFieldName(),
                getCurrentPSDevUser() == null ? null : getCurrentPSDevUser().getPSDevCenterId());
        if (!StringUtils.hasLength(psDevCenterId)) {
            return false;
        }
        if ("DELETE".equals(accessAction)) {
            return getPSDevCenterDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                    userContext, null, null, psDevCenterId, null, "UPDATE");
        }

        String mappedAction = "READ".equals(accessAction) ? "READ" : "UPDATE";
        if (StringUtils.hasLength(getPSDevSlnIdFieldName())
                && StringUtils.hasLength(lastPSDevSlnId = entity.getString(getPSDevSlnIdFieldName(), null))) {
            if (inputEntityDTO != null && inputEntityDTO.contains(getPSDevSlnIdFieldName())) {
                String newPSDevSlnId = inputEntityDTO.getString(getPSDevSlnIdFieldName(), null);
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
        return getPSDevCenterDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(
                userContext, null, null, psDevCenterId, null, mappedAction);
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