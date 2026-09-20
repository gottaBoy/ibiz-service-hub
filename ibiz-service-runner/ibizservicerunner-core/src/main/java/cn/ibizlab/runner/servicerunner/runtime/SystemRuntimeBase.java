package cn.ibizlab.runner.servicerunner.runtime;

import cn.ibizlab.runner.servicerunner.harness.HarnessCoordinatorLocator;
import cn.ibizlab.runner.servicerunner.harness.HarnessChatRunExecutor;
import cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryWorker;
import cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryWorkerConfig;
import net.ibizsys.central.cloud.core.ServiceSystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.model.IPSDynaInstService;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.UUID;

public class SystemRuntimeBase extends ServiceSystemRuntime implements ISystemRuntime {

    private static final Log log = LogFactory.getLog(SystemRuntimeBase.class);

    private final Object harnessRecoveryWorkerLock = new Object();
    private volatile HarnessRecoveryWorker harnessRecoveryWorker;

    @Override
    protected void onInit() throws Exception {
        log.info("[HARNESS-DESERVICE] runner runtime init: registering Harness DEServices");
        this.registerDEServiceObjs();
        super.onInit();
        log.info("[HARNESS-DESERVICE] runner runtime init complete");
    }

    protected void registerDEServiceObjs() {
        registerHarnessDEService(
                "PSMODULES/ai/PSDATAENTITIES/ai_run.json",
                "cn.ibizlab.runner.servicerunner.harness.service.impl.AIRunServiceImpl");
        registerHarnessDEService(
                "PSMODULES/ai/PSDATAENTITIES/ai_run_step.json",
                "cn.ibizlab.runner.servicerunner.harness.service.impl.AIRunStepServiceImpl");
        registerHarnessDEService(
                "PSMODULES/ai/PSDATAENTITIES/ai_run_event.json",
                "cn.ibizlab.runner.servicerunner.harness.service.impl.AIRunEventServiceImpl");
    }

    protected void registerHarnessDEService(String dataEntityId, String serviceClassName) {
        log.info(String.format("[HARNESS-DESERVICE] register entityId=%1$s service=%2$s",
                dataEntityId, serviceClassName));
        this.registerDEServiceObj(dataEntityId, serviceClassName);
    }

    @Override
    public boolean isEnableDEService(IPSDataEntity dataEntity) {
        boolean enabled = super.isEnableDEService(dataEntity);
        if (isHarnessEntity(dataEntity.getId())) {
            log.info(String.format("[HARNESS-DESERVICE] enable check entityId=%1$s name=%2$s enabled=%3$s",
                    dataEntity.getId(), dataEntity.getName(), enabled));
        }
        return enabled;
    }

    @Override
    public IDEService getDEService(IDataEntityRuntime dataEntityRuntime) {
        if (isHarnessEntity(dataEntityRuntime.getId())) {
            log.info(String.format("[HARNESS-DESERVICE] resolve entityId=%1$s enabled=%2$s",
                    dataEntityRuntime.getId(), dataEntityRuntime.isEnableDEService()));
        }
        IDEService service = super.getDEService(dataEntityRuntime);
        if (isHarnessEntity(dataEntityRuntime.getId())) {
            log.info(String.format("[HARNESS-DESERVICE] resolved entityId=%1$s service=%2$s",
                    dataEntityRuntime.getId(), service == null ? null : service.getClass().getName()));
        }
        return service;
    }

    protected boolean isHarnessEntity(String dataEntityId) {
        return dataEntityId != null
                && dataEntityId.startsWith("PSMODULES/ai/PSDATAENTITIES/ai_run");
    }

    @Override
    protected void onStart() throws Exception {
        super.onStart();
        this.startHarnessRecoveryWorker();
    }

    protected void startHarnessRecoveryWorker() {
        synchronized (harnessRecoveryWorkerLock) {
            if (harnessRecoveryWorker != null
                    && harnessRecoveryWorker.isRunning()) {
                return;
            }
            HarnessRecoveryWorkerConfig config = HarnessRecoveryWorkerConfig.from(
                    this.getSystemRuntimeSetting(), createDefaultRecoveryWorkerId());
            if (!config.isEnabled()) {
                log.info("[HARNESS-RECOVERY] disabled");
                return;
            }
            HarnessRecoveryWorker worker = new HarnessRecoveryWorker(
                    config,
                    () -> HarnessCoordinatorLocator.getRequired().recover(
                            this,
                            config,
                            new HarnessChatRunExecutor(this)));
            worker.start();
            harnessRecoveryWorker = worker;
        }
    }

    protected void stopHarnessRecoveryWorker() {
        HarnessRecoveryWorker worker;
        synchronized (harnessRecoveryWorkerLock) {
            worker = harnessRecoveryWorker;
            harnessRecoveryWorker = null;
        }
        if (worker != null) {
            worker.stop();
        }
    }

    protected String createDefaultRecoveryWorkerId() {
        return "ibizservicerunner-" + UUID.randomUUID();
    }

    @Override
    protected void onShutdown() throws Exception {
        this.stopHarnessRecoveryWorker();
        super.onShutdown();
    }

    @Override
    public String getName() {
        return "IBizServiceRunner";
    }

    @Override
    protected IPSSystemService createPSSystemService() throws Exception {
        PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
        psModelServiceImpl.setPSModelFolderPath("/model", true);
        return psModelServiceImpl;
    }


}
