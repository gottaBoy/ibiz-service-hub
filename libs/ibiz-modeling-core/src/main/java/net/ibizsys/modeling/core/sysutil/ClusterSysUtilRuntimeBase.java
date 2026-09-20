package net.ibizsys.modeling.core.sysutil;

import io.jsonwebtoken.lang.Assert;
import java.util.HashMap;
import java.util.Map;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.modeling.core.addin.IPSDCClusterAgent;
import net.ibizsys.modeling.core.addin.IPSDCClusterProvider;
import net.ibizsys.modeling.core.dataentity.dto.PSDCClusterDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCClusterService;
import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IClusterSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.IClusterSysUtilRTAddin;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.util.IAction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class ClusterSysUtilRuntimeBase
extends SysUtilRuntimeBase
implements IClusterSysUtilRuntime {
    private static final Log log = LogFactory.getLog(ClusterSysUtilRuntimeBase.class);
    private Map<String, IPSDCClusterProvider> psDCClusterProviderMap = null;
    private Map<String, IPSDCClusterProvider> psDCClusterProviderMap2 = new HashMap<String, IPSDCClusterProvider>();
    @Autowired
    private IPSDCClusterService iPSDCClusterService = null;
    private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

    protected ISysUtilRuntimeContext createModelRuntimeContext() {
        return new ClusterSysUtilRuntimeContextBase<IClusterSysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()){

            @Override
            public IClusterSysUtilRuntime getModelRuntime() {
                return ClusterSysUtilRuntimeBase.this.getSelf();
            }
        };
    }

    private ClusterSysUtilRuntimeBase getSelf() {
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
        this.prepareAddinRepo((IModelRuntimeContext)this.getModelRuntimeContext(), IClusterSysUtilRTAddin.class, null);
    }

    protected void onInstall() throws Exception {
        super.onInstall();
        this.psDCClusterProviderMap = this.getAddins(IPSDCClusterProvider.class, "PSDCCLUSTER:");
        this.onRegisterDEMethodPluginRuntimes();
    }

    protected void onRegisterDEMethodPluginRuntimes() throws Exception {
    }

    protected void onUninstall() throws Throwable {
        this.getDEMethodPluginRuntimeRepo().shutdown();
        if (!ObjectUtils.isEmpty(this.psDCClusterProviderMap)) {
            this.psDCClusterProviderMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psDCClusterProviderMap2)) {
            this.psDCClusterProviderMap2.clear();
        }
        super.onUninstall();
    }

    @Override
    public void registerPSDCClusterProvider(String strType, IPSDCClusterProvider iPSDCClusterProvider) {
        Assert.hasLength((String)strType, (String)"\u672a\u4f20\u5165\u96c6\u7fa4\u4e2d\u5fc3\u7c7b\u578b");
        Assert.notNull((Object)iPSDCClusterProvider, (String)"\u672a\u4f20\u5165\u96c6\u7fa4\u4e2d\u5fc3\u63d0\u4f9b\u5bf9\u8c61");
        Map<String, IPSDCClusterProvider> map = this.psDCClusterProviderMap2;
        synchronized (map) {
            this.psDCClusterProviderMap2.put(strType.toUpperCase(), iPSDCClusterProvider);
        }
    }

    @Override
    public boolean unregisterPSDCClusterProvider(String strType, IPSDCClusterProvider iPSDCClusterProvider) {
        Assert.hasLength((String)strType, (String)"\u672a\u4f20\u5165\u96c6\u7fa4\u4e2d\u5fc3\u7c7b\u578b");
        Assert.notNull((Object)iPSDCClusterProvider, (String)"\u672a\u4f20\u5165\u96c6\u7fa4\u4e2d\u5fc3\u63d0\u4f9b\u5bf9\u8c61");
        Map<String, IPSDCClusterProvider> map = this.psDCClusterProviderMap2;
        synchronized (map) {
            return this.psDCClusterProviderMap2.remove(strType.toUpperCase(), iPSDCClusterProvider);
        }
    }

    @Override
    public IPSDCClusterAgent getPSDCClusterAgent(final String strPSDCClusterId) {
        return (IPSDCClusterAgent)this.executeAction("\u83b7\u53d6\u96c6\u7fa4\u4ee3\u7406", new IAction(){

            public Object execute(Object[] args) throws Throwable {
                return ClusterSysUtilRuntimeBase.this.onGetPSDCClusterAgent(strPSDCClusterId);
            }
        }, null);
    }

    protected IPSDCClusterAgent onGetPSDCClusterAgent(String strPSDCClusterId) throws Throwable {
        PSDCClusterDTO psDCCluster = (PSDCClusterDTO)this.iPSDCClusterService.get(strPSDCClusterId, false);
        IPSDCClusterProvider iPSDCClusterProvider = null;
        if (StringUtils.hasLength((String)psDCCluster.getClusterType())) {
            Map<String, IPSDCClusterProvider> map = this.psDCClusterProviderMap2;
            synchronized (map) {
                iPSDCClusterProvider = this.psDCClusterProviderMap2.get(psDCCluster.getClusterType().toUpperCase());
            }
        }
        if (iPSDCClusterProvider == null) {
            iPSDCClusterProvider = this.psDCClusterProviderMap.get(psDCCluster.getClusterType());
            if (iPSDCClusterProvider == null) {
                iPSDCClusterProvider = this.psDCClusterProviderMap.get("K8S");
            }
            if (iPSDCClusterProvider == null) {
                throw new Exception(String.format("\u96c6\u7fa4[%s]\u63d0\u4f9b\u65b9\u65e0\u6548", psDCCluster.getPSDCClusterName()));
            }
        }
        IPSDCClusterAgent iPSDCClusterAgent = iPSDCClusterProvider.createPSDCClusterAgent(psDCCluster);
        iPSDCClusterAgent.init((IModelRuntimeContext)this.getModelRuntimeContext(), (Object)psDCCluster);
        return iPSDCClusterAgent;
    }

    protected String getCurrentPSDevCenterId() {
        return EmployeeContext.getCurrentMust().getTenant();
    }

    public static abstract class ClusterSysUtilRuntimeContextBase<M extends IClusterSysUtilRuntime, C extends ISysUtilRuntimeContext>
    extends SysUtilRuntimeContextProxy<M, C>
    implements IClusterSysUtilRuntimeContext {
        public ClusterSysUtilRuntimeContextBase(C superContext) {
            super(superContext);
        }
    }
}
