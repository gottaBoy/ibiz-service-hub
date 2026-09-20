package net.ibizsys.modeling.core.sysutil;

import java.util.Date;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.modeling.core.sysutil.IStudioSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IStudioSysUtilRuntimeContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class StudioSysUtilRuntimeBase
extends SysUtilRuntimeBase
implements IStudioSysUtilRuntime {
    private static final Log log = LogFactory.getLog(StudioSysUtilRuntimeBase.class);
    private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();
    @Autowired
    private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;

    protected ISysUtilRuntimeContext createModelRuntimeContext() {
        return new StudioSysUtilRuntimeContextBase<IStudioSysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()){

            @Override
            public IStudioSysUtilRuntime getModelRuntime() {
                return StudioSysUtilRuntimeBase.this.getSelf();
            }
        };
    }

    private StudioSysUtilRuntimeBase getSelf() {
        return this;
    }

    protected void onInit() throws Exception {
        this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
        super.onInit();
    }

    protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
        return this.deMethodPluginRuntimeRepo;
    }

    protected void prepareAddinRepo() throws Exception {
    }

    protected void onInstall() throws Exception {
        super.onInstall();
        this.onRegisterDEMethodPluginRuntimes();
    }

    protected void onRegisterDEMethodPluginRuntimes() throws Exception {
    }

    protected void onUninstall() throws Throwable {
        this.getDEMethodPluginRuntimeRepo().shutdown();
        super.onUninstall();
    }

    @Override
    public void sendConsole(String strTopic, String strContent) {
        this.sendConsole(strTopic, strContent, null, true);
    }

    @Override
    public void sendConsole(String strTopic, String strContent, String strLogger) {
        this.sendConsole(strTopic, strContent, strLogger, true);
    }

    @Override
    public void sendConsole(String strTopic, String strContent, String strLogger, boolean bAppendTime) {
        StringBuilder sb = new StringBuilder();
        if (bAppendTime) {
            sb.append(String.format("%1$tm-%1$td %1$tH:%1$tM:%1$tS ", new Date()));
        }
        sb.append(strContent);
        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strTopic, strLogger, sb.toString());
    }

    @Override
    public void sendConsole(String strTopic, String strContent, String strLogger, String strData, boolean bAppendTime) {
        StringBuilder sb = new StringBuilder();
        if (bAppendTime) {
            sb.append(String.format("%1$tm-%1$td %1$tH:%1$tM:%1$tS ", new Date()));
        }
        sb.append(strContent);
        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strTopic, strLogger, sb.toString(), strData);
    }

    @Override
    public void sendCommand(String strTopic, String strContent) {
        this.iSysCloudLogUtilRuntime.sendConsoleCommand(strTopic, null, strContent);
    }

    @Override
    public void sendCommand(String strTopic, String strCommandType, String strContent) {
        this.iSysCloudLogUtilRuntime.sendConsoleCommand(strTopic, strCommandType, strContent);
    }

    public static abstract class StudioSysUtilRuntimeContextBase<M extends IStudioSysUtilRuntime, C extends ISysUtilRuntimeContext>
    extends SysUtilRuntimeContextProxy<M, C>
    implements IStudioSysUtilRuntimeContext {
        public StudioSysUtilRuntimeContextBase(C superContext) {
            super(superContext);
        }
    }
}
