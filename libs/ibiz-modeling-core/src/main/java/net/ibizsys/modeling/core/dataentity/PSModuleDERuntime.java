package net.ibizsys.modeling.core.dataentity;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * Module runtime.
 *
 * <p>Exactly one ungrouped module per system carries the default flag. The
 * runtime enforces that invariant on create and update, and propagates model
 * group changes to the data entities of the module.</p>
 */
public class PSModuleDERuntime extends DataEntityRuntimeBase {

    private static final Log log = LogFactory.getLog(PSModuleDERuntime.class);

    @Override
    protected void onPrepareCreate(IEntityDTO iEntityDTO) throws Throwable {
        PSModuleDTO et = (PSModuleDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSModule(et, false);
        }
        super.onPrepareCreate(iEntityDTO);
    }

    @Override
    protected void onPrepareUpdate(IEntityDTO iEntityDTO) throws Throwable {
        PSModuleDTO et = (PSModuleDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSModule(et, true);
        }
        if (et.isPSSysModelGroupIdDirty()) {
            PSModuleDTO last = (PSModuleDTO) getLastEntityMust();
            String strPSSysModelGroupId = et.getPSSysModelGroupId();
            boolean bUpdate = DataTypeUtils.compare(last.getPSSysModelGroupId(), strPSSysModelGroupId, false) != 0L;
            if (bUpdate) {
                IPSDataEntityService iPSDataEntityService =
                        getSystemRuntime().getProxyDEService(IPSDataEntityService.class);
                List<PSDataEntityDTO> psDataEntityList = iPSDataEntityService.rawSelect(
                        new SearchContextDTO().all().count(false).eq("PSMODULEID", et.getPSModuleId()));
                if (!ObjectUtils.isEmpty(psDataEntityList)) {
                    for (PSDataEntityDTO psDataEntity : psDataEntityList) {
                        PSDataEntityDTO updatePSDataEntity = new PSDataEntityDTO();
                        updatePSDataEntity.setPSDataEntityId(psDataEntity.getPSDataEntityId());
                        updatePSDataEntity.setPSSysModelGroupId(et.getPSSysModelGroupId());
                        updatePSDataEntity.setPSSysModelGroupName(et.getPSSysModelGroupName());
                        iPSDataEntityService.update(updatePSDataEntity);
                    }
                }
            }
        }
        super.onPrepareUpdate(iEntityDTO);
    }

    protected void fillPSModule(PSModuleDTO et, boolean bUpdate) throws Throwable {
        if (!bUpdate) {
            if (et.getDefaultFlag() == null) {
                PSModuleDTO defaultPsModule = createDefaultModuleQuery(et.getPSSystemId());
                if (!rawSelect(defaultPsModule, true)) {
                    et.setDefaultFlag(1);
                }
            } else if (DataTypeUtils.getBooleanValue(et.getDefaultFlag(), false)
                    && !StringUtils.hasLength(et.getPSSysModelGroupId())) {
                PSModuleDTO defaultPsModule = createDefaultModuleQuery(et.getPSSystemId());
                if (rawSelect(defaultPsModule, true)) {
                    defaultPsModule.setDefaultFlag(0);
                    rawUpdate(Arrays.asList(defaultPsModule), true);
                }
            }
        } else if (DataTypeUtils.getBooleanValue(et.getDefaultFlag(), false)) {
            PSModuleDTO last = (PSModuleDTO) getLastEntityMust();
            String strPSSysModelGroupId = et.isPSSysModelGroupIdDirty()
                    ? et.getPSSysModelGroupId() : last.getPSSysModelGroupId();
            if (!StringUtils.hasLength(strPSSysModelGroupId)) {
                PSModuleDTO defaultPsModule = createDefaultModuleQuery(et.getPSSystemId());
                if (rawSelect(defaultPsModule, true)
                        && DataTypeUtils.compare(defaultPsModule.getPSModuleId(), et.getPSModuleId(), false) != 0L) {
                    defaultPsModule.setDefaultFlag(0);
                    rawUpdate(Arrays.asList(defaultPsModule), true);
                }
            }
        }
    }

    private static PSModuleDTO createDefaultModuleQuery(String strPSSystemId) {
        PSModuleDTO defaultPsModule = new PSModuleDTO();
        defaultPsModule.setPSSystemId(strPSSystemId);
        defaultPsModule.setDefaultFlag(1);
        defaultPsModule.setPSSysModelGroupId(null);
        return defaultPsModule;
    }
}