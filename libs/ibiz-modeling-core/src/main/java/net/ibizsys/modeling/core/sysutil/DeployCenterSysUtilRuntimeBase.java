package net.ibizsys.modeling.core.sysutil;

import io.jsonwebtoken.lang.Assert;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterAgent;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterProvider;
import net.ibizsys.modeling.core.dataentity.dto.PSDCDeployCenterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCDeployCenterService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnPipelineService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.IDeployCenterSysUtilRTAddin;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.util.IAction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class DeployCenterSysUtilRuntimeBase
extends SysUtilRuntimeBase
implements IDeployCenterSysUtilRuntime {
    private static final Log log = LogFactory.getLog(DeployCenterSysUtilRuntimeBase.class);
    private Map<String, IPSDCDeployCenterProvider> psDCDeployCenterProviderMap = null;
    private Map<String, IPSDCDeployCenterProvider> psDCDeployCenterProviderMap2 = new HashMap<String, IPSDCDeployCenterProvider>();
    @Autowired
    private IPSDCDeployCenterService iPSDCDeployCenterService = null;
    @Autowired
    private IPSDevSlnService iPSDevSlnService = null;
    @Autowired
    private IPSDevSlnPipelineService iPSDevSlnPipelineService = null;
    private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

    protected ISysUtilRuntimeContext createModelRuntimeContext() {
        return new DeployCenterSysUtilRuntimeContextBase<IDeployCenterSysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()){

            @Override
            public IDeployCenterSysUtilRuntime getModelRuntime() {
                return DeployCenterSysUtilRuntimeBase.this.getSelf();
            }
        };
    }

    private DeployCenterSysUtilRuntimeBase getSelf() {
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
        this.prepareAddinRepo((IModelRuntimeContext)this.getModelRuntimeContext(), IDeployCenterSysUtilRTAddin.class, null);
    }

    protected void onInstall() throws Exception {
        super.onInstall();
        this.psDCDeployCenterProviderMap = this.getAddins(IPSDCDeployCenterProvider.class, "PSDCDEPLOYCENTER:");
        this.onRegisterDEMethodPluginRuntimes();
    }

    protected void onRegisterDEMethodPluginRuntimes() throws Exception {
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDCDEPLOYCENTER", "PUBCONFIG", new IDEActionPluginRuntime(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.doPubConfig((PSDCDeployCenterDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNPIPELINE", "PUBCONFIG", new IDEActionPluginRuntime(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.doPubConfig((PSDevSlnPipelineDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNPIPELINE", "BUILD", new IDEActionPluginRuntime(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.doBuild((PSDevSlnPipelineDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNPIPELINE", "PUBCONFIGANDBUILD", new IDEActionPluginRuntime(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.doPubConfigAndBuild((PSDevSlnPipelineDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNPIPELINE", "VIEWCONFIG", new IDEActionPluginRuntime(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.doViewConfig((PSDevSlnPipelineDTO)((Object)args[0]));
            }
        });
    }

    protected Object doPubConfig(PSDCDeployCenterDTO dto) throws Throwable {
        return this.getPSDCDeployCenterAgent(dto.getPSDCDeployCenterId()).publishConfig(null);
    }

    protected Object doPubConfig(PSDevSlnPipelineDTO dto) throws Throwable {
        PSDevSlnPipelineDTO psDevSlnPipelineDTO = (PSDevSlnPipelineDTO)this.iPSDevSlnPipelineService.get(dto.getPSDevSlnPipelineId());
        String strPSDCDeployCenterId = psDevSlnPipelineDTO.getPSDCDeployCenterId();
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(psDevSlnPipelineDTO.getPSDevSlnId());
            strPSDCDeployCenterId = psDevSlnDTO.getPSDCDeployCenterId();
        }
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u9ed8\u8ba4\u90e8\u7f72\u4e2d\u5fc3", new Object[0]));
        }
        Map<String, Object> params = this.getPSDevSlnPipelineParams(dto, psDevSlnPipelineDTO);
        return this.getPSDCDeployCenterAgent(strPSDCDeployCenterId).publishPSDevSlnPipeline(psDevSlnPipelineDTO, params);
    }

    protected Object doBuild(PSDevSlnPipelineDTO dto) throws Throwable {
        PSDevSlnPipelineDTO psDevSlnPipelineDTO = (PSDevSlnPipelineDTO)this.iPSDevSlnPipelineService.get(dto.getPSDevSlnPipelineId());
        String strPSDCDeployCenterId = psDevSlnPipelineDTO.getPSDCDeployCenterId();
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(psDevSlnPipelineDTO.getPSDevSlnId());
            strPSDCDeployCenterId = psDevSlnDTO.getPSDCDeployCenterId();
        }
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u9ed8\u8ba4\u90e8\u7f72\u4e2d\u5fc3", new Object[0]));
        }
        Map<String, Object> params = this.getPSDevSlnPipelineParams(dto, psDevSlnPipelineDTO);
        return this.getPSDCDeployCenterAgent(strPSDCDeployCenterId).buildPSDevSlnPipeline(psDevSlnPipelineDTO, params);
    }

    protected Object doPubConfigAndBuild(PSDevSlnPipelineDTO dto) throws Throwable {
        PSDevSlnPipelineDTO psDevSlnPipelineDTO = (PSDevSlnPipelineDTO)this.iPSDevSlnPipelineService.get(dto.getPSDevSlnPipelineId());
        String strPSDCDeployCenterId = psDevSlnPipelineDTO.getPSDCDeployCenterId();
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(psDevSlnPipelineDTO.getPSDevSlnId());
            strPSDCDeployCenterId = psDevSlnDTO.getPSDCDeployCenterId();
        }
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u9ed8\u8ba4\u90e8\u7f72\u4e2d\u5fc3", new Object[0]));
        }
        Map<String, Object> params = this.getPSDevSlnPipelineParams(dto, psDevSlnPipelineDTO);
        this.getPSDCDeployCenterAgent(strPSDCDeployCenterId).publishPSDevSlnPipeline(psDevSlnPipelineDTO, params);
        return this.getPSDCDeployCenterAgent(strPSDCDeployCenterId).buildPSDevSlnPipeline(psDevSlnPipelineDTO, params);
    }

    protected PSDevSlnPipelineDTO doViewConfig(PSDevSlnPipelineDTO dto) throws Throwable {
        PSDevSlnPipelineDTO psDevSlnPipelineDTO = (PSDevSlnPipelineDTO)this.iPSDevSlnPipelineService.get(dto.getPSDevSlnPipelineId());
        String strPSDCDeployCenterId = psDevSlnPipelineDTO.getPSDCDeployCenterId();
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(psDevSlnPipelineDTO.getPSDevSlnId());
            strPSDCDeployCenterId = psDevSlnDTO.getPSDCDeployCenterId();
        }
        if (!StringUtils.hasLength((String)strPSDCDeployCenterId)) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u9ed8\u8ba4\u90e8\u7f72\u4e2d\u5fc3", new Object[0]));
        }
        Map<String, Object> params = this.getPSDevSlnPipelineParams(dto, psDevSlnPipelineDTO);
        Map<String, Object> configs = this.getPSDCDeployCenterAgent(strPSDCDeployCenterId).getPSDevSlnPipelineConfig(psDevSlnPipelineDTO, params);
        if (configs.containsKey("config")) {
            dto.set("config", String.valueOf(configs.get("config")));
        }
        return dto;
    }

    protected Map<String, Object> getPSDevSlnPipelineParams(PSDevSlnPipelineDTO dto, PSDevSlnPipelineDTO psDevSlnPipelineDTO) {
        Map srfactionparam;
        List srfactionparams;
        HashMap<String, Object> params = new HashMap<String, Object>();
        String pipelineParams = null;
        if (dto.contains("srfactionparam") && dto.get("srfactionparam") instanceof List && (srfactionparams = (List)dto.get("srfactionparam")).size() > 0 && srfactionparams.get(0) instanceof Map && (srfactionparam = (Map)srfactionparams.get(0)).containsKey("pipelineparams")) {
            pipelineParams = (String)srfactionparam.get("pipelineparams");
        }
        ConfigEntity configEntity = null;
        configEntity = StringUtils.hasLength(pipelineParams) ? new ConfigEntity(pipelineParams) : new ConfigEntity(psDevSlnPipelineDTO.getPipelineParams());
        params.put("env", configEntity);
        return params;
    }

    protected void onUninstall() throws Throwable {
        this.getDEMethodPluginRuntimeRepo().shutdown();
        if (!ObjectUtils.isEmpty(this.psDCDeployCenterProviderMap)) {
            this.psDCDeployCenterProviderMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psDCDeployCenterProviderMap2)) {
            this.psDCDeployCenterProviderMap2.clear();
        }
        super.onUninstall();
    }

    @Override
    public void registerPSDCDeployCenterProvider(String strType, IPSDCDeployCenterProvider iPSDCDeployCenterProvider) {
        Assert.hasLength((String)strType, (String)"\u672a\u4f20\u5165\u90e8\u7f72\u4e2d\u5fc3\u7c7b\u578b");
        Assert.notNull((Object)iPSDCDeployCenterProvider, (String)"\u672a\u4f20\u5165\u90e8\u7f72\u4e2d\u5fc3\u63d0\u4f9b\u5bf9\u8c61");
        Map<String, IPSDCDeployCenterProvider> map = this.psDCDeployCenterProviderMap2;
        synchronized (map) {
            this.psDCDeployCenterProviderMap2.put(strType.toUpperCase(), iPSDCDeployCenterProvider);
        }
    }

    @Override
    public boolean unregisterPSDCDeployCenterProvider(String strType, IPSDCDeployCenterProvider iPSDCDeployCenterProvider) {
        Assert.hasLength((String)strType, (String)"\u672a\u4f20\u5165\u90e8\u7f72\u4e2d\u5fc3\u7c7b\u578b");
        Assert.notNull((Object)iPSDCDeployCenterProvider, (String)"\u672a\u4f20\u5165\u90e8\u7f72\u4e2d\u5fc3\u63d0\u4f9b\u5bf9\u8c61");
        Map<String, IPSDCDeployCenterProvider> map = this.psDCDeployCenterProviderMap2;
        synchronized (map) {
            return this.psDCDeployCenterProviderMap2.remove(strType.toUpperCase(), iPSDCDeployCenterProvider);
        }
    }

    @Override
    public IPSDCDeployCenterAgent getPSDCDeployCenterAgent(final String strPSDCDeployCenterId) {
        return (IPSDCDeployCenterAgent)this.executeAction("\u83b7\u53d6\u90e8\u7f72\u4e2d\u5fc3\u4ee3\u7406", new IAction(){

            public Object execute(Object[] args) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.onGetPSDCDeployCenterAgent(strPSDCDeployCenterId);
            }
        }, null);
    }

    protected IPSDCDeployCenterAgent onGetPSDCDeployCenterAgent(String strPSDCDeployCenterId) throws Throwable {
        PSDCDeployCenterDTO psDCDeployCenter = (PSDCDeployCenterDTO)this.iPSDCDeployCenterService.get(strPSDCDeployCenterId, false);
        IPSDCDeployCenterProvider iPSDCDeployCenterProvider = null;
        if (StringUtils.hasLength((String)psDCDeployCenter.getDCType())) {
            Map<String, IPSDCDeployCenterProvider> map = this.psDCDeployCenterProviderMap2;
            synchronized (map) {
                iPSDCDeployCenterProvider = this.psDCDeployCenterProviderMap2.get(psDCDeployCenter.getDCType().toUpperCase());
            }
        }
        if (iPSDCDeployCenterProvider == null) {
            iPSDCDeployCenterProvider = this.psDCDeployCenterProviderMap.get(psDCDeployCenter.getDCType());
            if (iPSDCDeployCenterProvider == null) {
                iPSDCDeployCenterProvider = this.psDCDeployCenterProviderMap.get("JENKINS");
            }
            if (iPSDCDeployCenterProvider == null) {
                throw new Exception(String.format("\u90e8\u7f72\u4e2d\u5fc3[%s]\u63d0\u4f9b\u65b9\u65e0\u6548", psDCDeployCenter.getName()));
            }
        }
        IPSDCDeployCenterAgent iPSDCDeployCenterAgent = iPSDCDeployCenterProvider.createPSDCDeployCenterAgent(psDCDeployCenter);
        iPSDCDeployCenterAgent.init((IModelRuntimeContext)this.getModelRuntimeContext(), (Object)psDCDeployCenter);
        return iPSDCDeployCenterAgent;
    }

    @Override
    public IPSDCDeployCenterAgent getDefaultPSDCDeployCenterAgent() {
        return this.getDefaultPSDCDeployCenterAgent(this.getCurrentPSDevCenterId());
    }

    @Override
    public IPSDCDeployCenterAgent getDefaultPSDCDeployCenterAgent(final String strPSDevCenterId) {
        return (IPSDCDeployCenterAgent)this.executeAction("\u83b7\u53d6\u9ed8\u8ba4\u90e8\u7f72\u4e2d\u5fc3\u4ee3\u7406", new IAction(){

            public Object execute(Object[] args) throws Throwable {
                return DeployCenterSysUtilRuntimeBase.this.onGetDefaultPSDCDeployCenterAgent(strPSDevCenterId);
            }
        }, null);
    }

    protected IPSDCDeployCenterAgent onGetDefaultPSDCDeployCenterAgent(String strPSDevCenterId) throws Throwable {
        SearchContextDTO psDCDeployCenterFilterDTO = new SearchContextDTO();
        psDCDeployCenterFilterDTO.eq("PSDEVCENTERID", (Object)strPSDevCenterId);
        psDCDeployCenterFilterDTO.eq("VALIDFLAG", (Object)1);
        psDCDeployCenterFilterDTO.eq("DEFAULTFLAG", (Object)1);
        psDCDeployCenterFilterDTO.count(false).limit(1);
        Page<PSDCDeployCenterDTO> page = this.iPSDCDeployCenterService.fetchDefault((ISearchContextDTO)psDCDeployCenterFilterDTO);
        if (ObjectUtils.isEmpty((Object)page.getContent())) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u9ed8\u8ba4\u90e8\u7f72\u4e2d\u5fc3", new Object[0]));
        }
        PSDCDeployCenterDTO psDCDeployCenter = (PSDCDeployCenterDTO)((Object)page.getContent().get(0));
        return this.getPSDCDeployCenterAgent(psDCDeployCenter.getPSDCDeployCenterId());
    }

    protected String getCurrentPSDevCenterId() {
        return EmployeeContext.getCurrentMust().getTenant();
    }

    public static abstract class DeployCenterSysUtilRuntimeContextBase<M extends IDeployCenterSysUtilRuntime, C extends ISysUtilRuntimeContext>
    extends SysUtilRuntimeContextProxy<M, C>
    implements IDeployCenterSysUtilRuntimeContext {
        public DeployCenterSysUtilRuntimeContextBase(C superContext) {
            super(superContext);
        }
    }
}
