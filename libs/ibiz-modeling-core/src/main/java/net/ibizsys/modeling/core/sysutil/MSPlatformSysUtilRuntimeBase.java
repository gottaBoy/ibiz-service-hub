package net.ibizsys.modeling.core.sysutil;

import io.jsonwebtoken.lang.Assert;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.dataentity.action.IDEActionPluginRuntime2;
import net.ibizsys.central.dataentity.ds.DEDataSetLogicRuntimeBaseBase;
import net.ibizsys.central.dataentity.ds.IDEDataSetLogicRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformProvider;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAppDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMSPlatformNodeService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMSPlatformService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepAPIService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepAppService;
import net.ibizsys.modeling.core.sysutil.IMSPlatformSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IMSPlatformSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.IMSPlatformSysUtilRTAddin;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.util.IAction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class MSPlatformSysUtilRuntimeBase
extends SysUtilRuntimeBase
implements IMSPlatformSysUtilRuntime {
    private static final Log log = LogFactory.getLog(MSPlatformSysUtilRuntimeBase.class);
    private Map<String, IPSDCMSPlatformProvider> psDCMSPlatformProviderMap = null;
    private Map<String, IPSDCMSPlatformProvider> psDCMSPlatformProviderMap2 = new HashMap<String, IPSDCMSPlatformProvider>();
    @Autowired
    private IPSDCMSPlatformService iPSDCMSPlatformService = null;
    @Autowired
    private IPSDevSlnMSDepAPIService iPSDevSlnMSDepAPIService;
    @Autowired
    private IPSDevSlnMSDepAppService iPSDevSlnMSDepAppService;
    @Autowired
    private IPSDCMSPlatformNodeService iPSDCMSPlatformNodeService;
    private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

    protected ISysUtilRuntimeContext createModelRuntimeContext() {
        return new MSPlatformSysUtilRuntimeContextBase<IMSPlatformSysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()){

            @Override
            public IMSPlatformSysUtilRuntime getModelRuntime() {
                return MSPlatformSysUtilRuntimeBase.this.getSelf();
            }
        };
    }

    private MSPlatformSysUtilRuntimeBase getSelf() {
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
        this.prepareAddinRepo((IModelRuntimeContext)this.getModelRuntimeContext(), IMSPlatformSysUtilRTAddin.class, null);
    }

    protected void onInstall() throws Exception {
        super.onInstall();
        this.psDCMSPlatformProviderMap = this.getAddins(IPSDCMSPlatformProvider.class, "PSDCMSPLATFORM:");
        this.onRegisterDEMethodPluginRuntimes();
    }

    protected void onRegisterDEMethodPluginRuntimes() throws Exception {
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDCMSPLATFORM", "PUBCONFIG", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doPubConfig((PSDCMSPlatformDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDCMSPLATFORMNODE", "RESTART", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doRestart((PSDCMSPlatformNodeDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDCMSPLATFORMNODE", "STOP", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doStop((PSDCMSPlatformNodeDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEDataSetLogicRuntimeBaseIf("PSDCMSPLATFORMNODE", "CURMSPWITHSTATE", (IDEDataSetLogicRuntimeBase)new DEDataSetLogicRuntimeBaseBase(){

           protected Object onExecute(net.ibizsys.central.dataentity.IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, List<?> ret) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.onAfterFetchCurMSPWithState(iSearchContext, (List<PSDCMSPlatformNodeDTO>) ret);
           }

            public String getAttachMode() {
                return PSModelEnums.DEActionLogicAttachMode.AFTER.value;
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNMSDEPAPI", "RESTART", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doRestart((PSDevSlnMSDepAPIDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNMSDEPAPI", "STOP", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doStop((PSDevSlnMSDepAPIDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNMSDEPAPP", "RESTART", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doRestart((PSDevSlnMSDepAppDTO)((Object)args[0]));
            }
        });
        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime("PSDEVSLNMSDEPAPP", "STOP", (IDEActionPluginRuntime)new IDEActionPluginRuntime2(){

            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.doStop((PSDevSlnMSDepAppDTO)((Object)args[0]));
            }
        });
    }

    protected Object doPubConfig(PSDCMSPlatformDTO dto) throws Throwable {
        this.getPSDCMSPlatformAgent(dto.getPSDCMSPlatformId()).publishConfig(null);
        return null;
    }

    protected Object doRestart(PSDCMSPlatformNodeDTO dto) throws Throwable {
        Iterator iterator;
        SearchContextDTO iSearchContextDTO;
        String strPSDCMSPlatformNodeId = dto.getPSDCMSPlatformNodeId();
        String strPSDevSlnId = dto.getString("PSDEVSLNID", null);
        String strPSDevSlnSysId = dto.getString("PSDEVSLNSYSID", null);
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            iSearchContextDTO = (SearchContextDTO)this.iPSDevSlnMSDepAPIService.getDataEntityRuntime().createSearchContext().all().count(false);
            iSearchContextDTO.eq("PSDCMSPLATFORMNODEID", (Object)strPSDCMSPlatformNodeId);
            List psDevSlnMSDepAPIList = this.iPSDevSlnMSDepAPIService.select((ISearchContextDTO)iSearchContextDTO);
            if (!ObjectUtils.isEmpty((Object)psDevSlnMSDepAPIList)) {
                PSDevSlnMSDepAPIDTO psDevSlnMSDepAPI;
                iterator = psDevSlnMSDepAPIList.iterator();
                while (iterator.hasNext() && !StringUtils.hasLength((String)(strPSDevSlnSysId = (psDevSlnMSDepAPI = (PSDevSlnMSDepAPIDTO)((Object)iterator.next())).getPSDevSlnSysId()))) {
                }
            }
        }
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            iSearchContextDTO = (SearchContextDTO)this.iPSDevSlnMSDepAppService.getDataEntityRuntime().createSearchContext().all().count(false);
            iSearchContextDTO.eq("PSDCMSPLATFORMNODEID", (Object)strPSDCMSPlatformNodeId);
            List psDevSlnMSDepAppList = this.iPSDevSlnMSDepAppService.select((ISearchContextDTO)iSearchContextDTO);
            if (!ObjectUtils.isEmpty((Object)psDevSlnMSDepAppList)) {
                PSDevSlnMSDepAppDTO psDevSlnMSDepApp;
                iterator = psDevSlnMSDepAppList.iterator();
                while (iterator.hasNext() && !StringUtils.hasLength((String)(strPSDevSlnSysId = (psDevSlnMSDepApp = (PSDevSlnMSDepAppDTO)((Object)iterator.next())).getPSDevSlnSysId()))) {
                }
            }
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
        String strPSDCMSPlatformId = psDCMSPlatformNode.getPSDCMSPlatformId();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("PSDEVSLNID", strPSDevSlnId);
        params.put("PSDEVSLNSYSID", strPSDevSlnSysId);
        this.getPSDCMSPlatformAgent(strPSDCMSPlatformId).restartPSDCMSPlatformNode(psDCMSPlatformNode, params);
        return null;
    }

    protected Object doStop(PSDCMSPlatformNodeDTO dto) throws Throwable {
        Iterator iterator;
        SearchContextDTO iSearchContextDTO;
        String strPSDCMSPlatformNodeId = dto.getPSDCMSPlatformNodeId();
        String strPSDevSlnId = dto.getString("PSDEVSLNID", null);
        String strPSDevSlnSysId = dto.getString("PSDEVSLNSYSID", null);
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            iSearchContextDTO = (SearchContextDTO)this.iPSDevSlnMSDepAPIService.getDataEntityRuntime().createSearchContext().all().count(false);
            iSearchContextDTO.eq("PSDCMSPLATFORMNODEID", (Object)strPSDCMSPlatformNodeId);
            List psDevSlnMSDepAPIList = this.iPSDevSlnMSDepAPIService.select((ISearchContextDTO)iSearchContextDTO);
            if (!ObjectUtils.isEmpty((Object)psDevSlnMSDepAPIList)) {
                PSDevSlnMSDepAPIDTO psDevSlnMSDepAPI;
                iterator = psDevSlnMSDepAPIList.iterator();
                while (iterator.hasNext() && !StringUtils.hasLength((String)(strPSDevSlnSysId = (psDevSlnMSDepAPI = (PSDevSlnMSDepAPIDTO)((Object)iterator.next())).getPSDevSlnSysId()))) {
                }
            }
        }
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            iSearchContextDTO = (SearchContextDTO)this.iPSDevSlnMSDepAppService.getDataEntityRuntime().createSearchContext().all().count(false);
            iSearchContextDTO.eq("PSDCMSPLATFORMNODEID", (Object)strPSDCMSPlatformNodeId);
            List psDevSlnMSDepAppList = this.iPSDevSlnMSDepAppService.select((ISearchContextDTO)iSearchContextDTO);
            if (!ObjectUtils.isEmpty((Object)psDevSlnMSDepAppList)) {
                PSDevSlnMSDepAppDTO psDevSlnMSDepApp;
                iterator = psDevSlnMSDepAppList.iterator();
                while (iterator.hasNext() && !StringUtils.hasLength((String)(strPSDevSlnSysId = (psDevSlnMSDepApp = (PSDevSlnMSDepAppDTO)((Object)iterator.next())).getPSDevSlnSysId()))) {
                }
            }
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
        String strPSDCMSPlatformId = psDCMSPlatformNode.getPSDCMSPlatformId();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("PSDEVSLNID", strPSDevSlnId);
        params.put("PSDEVSLNSYSID", strPSDevSlnSysId);
        this.getPSDCMSPlatformAgent(strPSDCMSPlatformId).stopPSDCMSPlatformNode(psDCMSPlatformNode, params);
        return null;
    }

    protected Object onAfterFetchCurMSPWithState(ISearchContext iSearchContext, List<PSDCMSPlatformNodeDTO> ret) throws Throwable {
        String strPSDCMSPlatformId = (String)iSearchContext.get("n_psdcmsplatformid_eq");
        if (StringUtils.hasLength((String)strPSDCMSPlatformId)) {
            this.getPSDCMSPlatformAgent(strPSDCMSPlatformId).refreshPSDCMSPlatformNodesState(ret, null);
        }
        return ret;
    }

    protected Object doRestart(PSDevSlnMSDepAPIDTO dto) throws Throwable {
        String strPSDevSlnMSDepAPIId = dto.getPSDevSlnMSDepAPIId();
        PSDevSlnMSDepAPIDTO psDevSlnMSDepAPIDTO = (PSDevSlnMSDepAPIDTO)this.iPSDevSlnMSDepAPIService.get(strPSDevSlnMSDepAPIId);
        String strPSDCMSPlatformNodeId = psDevSlnMSDepAPIDTO.getPSDCMSPlatformNodeId();
        if (!StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            return null;
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
        String strPSDevSlnId = psDevSlnMSDepAPIDTO.getPSDevSlnId();
        String strPSDevSlnSysId = psDevSlnMSDepAPIDTO.getPSDevSlnSysId();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("PSDEVSLNID", strPSDevSlnId);
        params.put("PSDEVSLNSYSID", strPSDevSlnSysId);
        this.getPSDCMSPlatformAgent(psDCMSPlatformNode.getPSDCMSPlatformId()).restartPSDCMSPlatformNode(psDCMSPlatformNode, params);
        return null;
    }

    protected Object doStop(PSDevSlnMSDepAPIDTO dto) throws Throwable {
        String strPSDevSlnMSDepAPIId = dto.getPSDevSlnMSDepAPIId();
        PSDevSlnMSDepAPIDTO psDevSlnMSDepAPIDTO = (PSDevSlnMSDepAPIDTO)this.iPSDevSlnMSDepAPIService.get(strPSDevSlnMSDepAPIId);
        String strPSDCMSPlatformNodeId = psDevSlnMSDepAPIDTO.getPSDCMSPlatformNodeId();
        if (!StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            return null;
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
        String strPSDevSlnId = psDevSlnMSDepAPIDTO.getPSDevSlnId();
        String strPSDevSlnSysId = psDevSlnMSDepAPIDTO.getPSDevSlnSysId();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("PSDEVSLNID", strPSDevSlnId);
        params.put("PSDEVSLNSYSID", strPSDevSlnSysId);
        this.getPSDCMSPlatformAgent(psDCMSPlatformNode.getPSDCMSPlatformId()).stopPSDCMSPlatformNode(psDCMSPlatformNode, params);
        return null;
    }

    protected Object doRestart(PSDevSlnMSDepAppDTO dto) throws Throwable {
        String strPSDevSlnMSDepAppId = dto.getPSDevSlnMSDepAppId();
        PSDevSlnMSDepAppDTO psDevSlnMSDepAppDTO = (PSDevSlnMSDepAppDTO)this.iPSDevSlnMSDepAppService.get(strPSDevSlnMSDepAppId);
        String strPSDCMSPlatformNodeId = psDevSlnMSDepAppDTO.getPSDCMSPlatformNodeId();
        if (!StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            return null;
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
        String strPSDevSlnId = psDevSlnMSDepAppDTO.getPSDevSlnId();
        String strPSDevSlnSysId = psDevSlnMSDepAppDTO.getPSDevSlnSysId();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("PSDEVSLNID", strPSDevSlnId);
        params.put("PSDEVSLNSYSID", strPSDevSlnSysId);
        this.getPSDCMSPlatformAgent(psDCMSPlatformNode.getPSDCMSPlatformId()).restartPSDCMSPlatformNode(psDCMSPlatformNode, params);
        return null;
    }

    protected Object doStop(PSDevSlnMSDepAppDTO dto) throws Throwable {
        String strPSDevSlnMSDepAppId = dto.getPSDevSlnMSDepAppId();
        PSDevSlnMSDepAppDTO psDevSlnMSDepAppDTO = (PSDevSlnMSDepAppDTO)this.iPSDevSlnMSDepAppService.get(strPSDevSlnMSDepAppId);
        String strPSDCMSPlatformNodeId = psDevSlnMSDepAppDTO.getPSDCMSPlatformNodeId();
        if (!StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            return null;
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
        String strPSDevSlnId = psDevSlnMSDepAppDTO.getPSDevSlnId();
        String strPSDevSlnSysId = psDevSlnMSDepAppDTO.getPSDevSlnSysId();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("PSDEVSLNID", strPSDevSlnId);
        params.put("PSDEVSLNSYSID", strPSDevSlnSysId);
        this.getPSDCMSPlatformAgent(psDCMSPlatformNode.getPSDCMSPlatformId()).stopPSDCMSPlatformNode(psDCMSPlatformNode, params);
        return null;
    }

    protected void onUninstall() throws Throwable {
        this.getDEMethodPluginRuntimeRepo().shutdown();
        if (!ObjectUtils.isEmpty(this.psDCMSPlatformProviderMap)) {
            this.psDCMSPlatformProviderMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psDCMSPlatformProviderMap2)) {
            this.psDCMSPlatformProviderMap2.clear();
        }
        super.onUninstall();
    }

    @Override
    public void registerPSDCMSPlatformProvider(String strType, IPSDCMSPlatformProvider iPSDCMSPlatformProvider) {
        Assert.hasLength((String)strType, (String)"\u672a\u4f20\u5165\u5fae\u670d\u52a1\u5e73\u53f0\u7c7b\u578b");
        Assert.notNull((Object)iPSDCMSPlatformProvider, (String)"\u672a\u4f20\u5165\u5fae\u670d\u52a1\u5e73\u53f0\u63d0\u4f9b\u5bf9\u8c61");
        Map<String, IPSDCMSPlatformProvider> map = this.psDCMSPlatformProviderMap2;
        synchronized (map) {
            this.psDCMSPlatformProviderMap2.put(strType.toUpperCase(), iPSDCMSPlatformProvider);
        }
    }

    @Override
    public boolean unregisterPSDCMSPlatformProvider(String strType, IPSDCMSPlatformProvider iPSDCMSPlatformProvider) {
        Assert.hasLength((String)strType, (String)"\u672a\u4f20\u5165\u5fae\u670d\u52a1\u5e73\u53f0\u7c7b\u578b");
        Assert.notNull((Object)iPSDCMSPlatformProvider, (String)"\u672a\u4f20\u5165\u5fae\u670d\u52a1\u5e73\u53f0\u63d0\u4f9b\u5bf9\u8c61");
        Map<String, IPSDCMSPlatformProvider> map = this.psDCMSPlatformProviderMap2;
        synchronized (map) {
            return this.psDCMSPlatformProviderMap2.remove(strType.toUpperCase(), iPSDCMSPlatformProvider);
        }
    }

    @Override
    public IPSDCMSPlatformAgent getPSDCMSPlatformAgent(final String strPSDCMSPlatformId) {
        return (IPSDCMSPlatformAgent)this.executeAction("\u83b7\u53d6\u5fae\u670d\u52a1\u5e73\u53f0\u4ee3\u7406", new IAction(){

            public Object execute(Object[] args) throws Throwable {
                return MSPlatformSysUtilRuntimeBase.this.onGetPSDCMSPlatformAgent(strPSDCMSPlatformId);
            }
        }, null);
    }

    protected IPSDCMSPlatformAgent onGetPSDCMSPlatformAgent(String strPSDCMSPlatformId) throws Throwable {
        PSDCMSPlatformDTO psDCMSPlatform = (PSDCMSPlatformDTO)this.iPSDCMSPlatformService.get(strPSDCMSPlatformId, false);
        IPSDCMSPlatformProvider iPSDCMSPlatformProvider = null;
        if (StringUtils.hasLength((String)psDCMSPlatform.getMSType())) {
            Map<String, IPSDCMSPlatformProvider> map = this.psDCMSPlatformProviderMap2;
            synchronized (map) {
                iPSDCMSPlatformProvider = this.psDCMSPlatformProviderMap2.get(psDCMSPlatform.getMSType().toUpperCase());
            }
        }
        if (iPSDCMSPlatformProvider == null) {
            iPSDCMSPlatformProvider = this.psDCMSPlatformProviderMap.get(psDCMSPlatform.getMSType());
            if (iPSDCMSPlatformProvider == null) {
                iPSDCMSPlatformProvider = this.psDCMSPlatformProviderMap.get("IBIZCLOUD");
            }
            if (iPSDCMSPlatformProvider == null) {
                throw new Exception(String.format("\u5fae\u670d\u52a1\u5e73\u53f0[%s]\u63d0\u4f9b\u65b9\u65e0\u6548", psDCMSPlatform.getPSDCMSPlatformName()));
            }
        }
        IPSDCMSPlatformAgent iPSDCMSPlatformAgent = iPSDCMSPlatformProvider.createPSDCMSPlatformAgent(psDCMSPlatform);
        iPSDCMSPlatformAgent.init((IModelRuntimeContext)this.getModelRuntimeContext(), (Object)psDCMSPlatform);
        return iPSDCMSPlatformAgent;
    }

    protected String getCurrentPSDevCenterId() {
        return EmployeeContext.getCurrentMust().getTenant();
    }

    public static abstract class MSPlatformSysUtilRuntimeContextBase<M extends IMSPlatformSysUtilRuntime, C extends ISysUtilRuntimeContext>
    extends SysUtilRuntimeContextProxy<M, C>
    implements IMSPlatformSysUtilRuntimeContext {
        public MSPlatformSysUtilRuntimeContextBase(C superContext) {
            super(superContext);
        }
    }
}