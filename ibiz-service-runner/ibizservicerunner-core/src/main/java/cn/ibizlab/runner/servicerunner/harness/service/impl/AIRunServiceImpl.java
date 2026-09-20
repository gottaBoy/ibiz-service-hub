package cn.ibizlab.runner.servicerunner.harness.service.impl;

import cn.ibizlab.runner.servicerunner.harness.HarnessCoordinator;
import cn.ibizlab.runner.servicerunner.harness.HarnessCoordinatorLocator;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.service.IAIRunService;
import cn.ibizlab.runner.servicerunner.runtime.SystemRuntime;
import net.ibizsys.central.ISystemGateway;
import net.ibizsys.central.dataentity.service.DEServiceBase;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.PostConstruct;

@Service
public class AIRunServiceImpl extends DEServiceBase<AIRunDTO, SearchContextDTO> implements IAIRunService {

    private static final Log log = LogFactory.getLog(AIRunServiceImpl.class);

    @Autowired(required = false)
    private ISystemGateway systemGateway;

    @Autowired
    @Lazy
    private HarnessCoordinator harnessCoordinator;

    @PostConstruct
    private void postConstruct() throws Exception {
        log.info(String.format("[HARNESS-DESERVICE] bean postConstruct entityId=%1$s systemGateway=%2$s",
                getDataEntityId(), systemGateway == null ? null : systemGateway.getClass().getName()));
        if (systemGateway != null && !systemGateway.isMultiInstanceMode(SystemRuntime.class)) {
            IDEService service = systemGateway.getDEService(SystemRuntime.class, getDataEntityId(), true);
            log.info(String.format("[HARNESS-DESERVICE] bean lookup entityId=%1$s multiInstance=%2$s existing=%3$s",
                    getDataEntityId(), systemGateway.isMultiInstanceMode(SystemRuntime.class),
                    service == null ? null : service.getClass().getName()));
            if (service == null || service.getClass() == AIRunServiceImpl.class) {
                systemGateway.registerDEService(SystemRuntime.class, getDataEntityId(), this);
                log.info(String.format("[HARNESS-DESERVICE] bean registered entityId=%1$s service=%2$s",
                        getDataEntityId(), getClass().getName()));
            }
        }
    }

    @Override
    protected void onPrepare() {
        super.onPrepare();
        log.info(String.format("[HARNESS-DESERVICE] onPrepare entityId=%1$s runtimeId=%2$s enabled=%3$s",
                getDataEntityId(), getDataEntityRuntime().getId(), getDataEntityRuntime().isEnableDEService()));
        try {
                getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_CREATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext context, IPSDEAction action, Object[] args, Object actionData) throws Throwable {
                    return getHarnessCoordinator().createRun(context, action, args, actionData);
                }
            });
            getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_UPDATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext context, IPSDEAction action, Object[] args, Object actionData) throws Throwable {
                    return getHarnessCoordinator().updateRun(context, action, args, actionData);
                }
            });
            getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_SAVE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext context, IPSDEAction action, Object[] args, Object actionData) throws Throwable {
                    throw new UnsupportedOperationException("AI_RUN Save is not supported; use Create, Update, or append an event");
                }
            });
            getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_REMOVE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext context, IPSDEAction action, Object[] args, Object actionData) throws Throwable {
                    return context.executeActionReal(action, args, actionData);
                }
            });
            getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GET, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext context, IPSDEAction action, Object[] args, Object actionData) throws Throwable {
                    return context.executeActionReal(action, args, actionData);
                }
            });
            getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETDRAFT, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext context, IPSDEAction action, Object[] args, Object actionData) throws Throwable {
                    return context.executeActionReal(action, args, actionData);
                }
            });
            getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_DEFAULT, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext context, IPSDEDataSet dataSet, Object[] args, Object actionData) throws Throwable {
                    return context.fetchDataSetReal(dataSet, args, actionData);
                }
            });
        } catch (Throwable e) {
            throw new RuntimeException("Failed to prepare AI_RUN service", e);
        }
    }

    private HarnessCoordinator getHarnessCoordinator() {
        return harnessCoordinator != null ? harnessCoordinator : HarnessCoordinatorLocator.getRequired();
    }
}
