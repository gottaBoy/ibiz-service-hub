package net.ibizsys.modeling.core.sysutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDeployDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineLogDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysRunSessionDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMSPlatformNodeService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMSPlatformService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepAPIService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepAppService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDeployService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnPipelineLogService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnPipelineService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysRunSessionService;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.SystemAccessManager;
import net.ibizsys.modeling.core.service.IV5CoreAPIClientRuntime;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterAgent;
import net.ibizsys.modeling.core.sysutil.IDeployCenterSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IModelServerSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IModelServerSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.IModelServerSysUtilRTAddin;
import net.ibizsys.modeling.core.util.Base64Helper;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IASFutureAction;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.PropertiesUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class ModelServerSysUtilRuntimeBase
extends SysUtilRuntimeBase
implements IModelServerSysUtilRuntime {
    private static final Log log = LogFactory.getLog(ModelServerSysUtilRuntimeBase.class);
    public static final String DEVSYSTEMACTIONPARAM_THREADMODE = "THREADMODE";
    public static final String LOGCAT_DEVCALLBACK = "DEVCALLBACK";
    public static final String CONSOLESENDER_CENTRAL = "iBizCentral";
    public static final String V5COREAPICALL_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String V5COREAPICALL_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String V5COREAPICALL_X_PREFIX = "X_";
    public static final String V5COREAPICALL_INSPECTMODEL = "INSPECTMODEL";
    private static final Map<String, String> V5ModelMap = new HashMap<String, String>();
    @Autowired
    private IV5CoreAPIClientRuntime iV5CoreAPIClientRuntime = null;
    @Autowired
    private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
    @Autowired
    private IPSDevSlnPipelineService iPSDevSlnPipelineService = null;
    @Autowired
    private IPSDevSlnPipelineLogService iPSDevSlnPipelineLogService = null;
    @Autowired
    private IPSDevSlnService iPSDevSlnService = null;
    @Autowired
    private IPSDevSlnMSDeployService iPSDevSlnMSDeployService = null;
    @Autowired
    private IPSDevSlnMSDepAPIService iPSDevSlnMSDepAPIService = null;
    @Autowired
    private IPSDevSlnMSDepAppService iPSDevSlnMSDepAppService = null;
    @Autowired
    private IDeployCenterSysUtilRuntime iDeployCenterSysUtilRuntime = null;
    @Autowired
    private IPSDCMSPlatformService iPSDCMSPlatformService = null;
    @Autowired
    private IPSDCMSPlatformNodeService iPSDCMSPlatformNodeService = null;
    @Autowired
    private IPSSysRunSessionService iPSSysRunSessionService = null;
    private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();
    private IPSSysContentCat inspectModelPSSysContentCat = null;

    protected ISysUtilRuntimeContext createModelRuntimeContext() {
        return new ModelServerSysUtilRuntimeContextBase<IModelServerSysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()){

            @Override
            public IModelServerSysUtilRuntime getModelRuntime() {
                return ModelServerSysUtilRuntimeBase.this.getSelf();
            }
        };
    }

    private ModelServerSysUtilRuntimeBase getSelf() {
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
        this.prepareAddinRepo((IModelRuntimeContext)this.getModelRuntimeContext(), IModelServerSysUtilRTAddin.class, null);
    }

    protected void onInstall() throws Exception {
        super.onInstall();
        this.inspectModelPSSysContentCat = this.getSystemRuntime().getPSSystemService().getPSSysContentCat(V5COREAPICALL_INSPECTMODEL, true);
        this.onRegisterDEMethodPluginRuntimes();
    }

    protected Map<String, String> getV5ModelMap() {
        return V5ModelMap;
    }

    protected void onRegisterDEMethodPluginRuntimes() throws Exception {
        List<IPSDEAction> psDEActionList;
        List<IPSDataEntity> psDataEntityList;
        Map<String, String> v5ModelMap = this.getV5ModelMap();
        if (!ObjectUtils.isEmpty(v5ModelMap)) {
            for (Map.Entry<String, String> entry : v5ModelMap.entrySet()) {
                String strModelName = entry.getKey();
                String strAction = entry.getValue();
                if (!StringUtils.hasLength((String)strAction)) {
                    strAction = "CREATE;UPDATE;REMOVE";
                }
                String[] actions = strAction.split("[;]");
                for (String action : actions) {
                    this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime(strModelName, action, new IDEActionPluginRuntime(){

                        public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                            return ModelServerSysUtilRuntimeBase.this.doV5CoreAPICall(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
                        }
                    });
                }
            }
        }
        if (!ObjectUtils.isEmpty((Object)(psDataEntityList = this.getSystemRuntime().getPSSystem().getAllPSDataEntities()))) {
            for (IPSDataEntity iPSDataEntity : psDataEntityList) {
                List<IPSDEAction> psDEActionList2 = iPSDataEntity.getAllPSDEActions();
                if (ObjectUtils.isEmpty((Object)psDEActionList2)) continue;
                for (IPSDEAction iPSDEAction : psDEActionList2) {
                    if (V5COREAPICALL_EXPORTMODELV2.equalsIgnoreCase(iPSDEAction.getName())) {
                        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime(iPSDataEntity.getName(), iPSDEAction.getName(), new IDEActionPluginRuntime(){

                            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                                return ModelServerSysUtilRuntimeBase.this.doV5CoreAPIExportModelV2(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
                            }
                        });
                        continue;
                    }
                    if (V5COREAPICALL_IMPORTMODELV2.equalsIgnoreCase(iPSDEAction.getName())) {
                        this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime(iPSDataEntity.getName(), iPSDEAction.getName(), new IDEActionPluginRuntime(){

                            public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                                return ModelServerSysUtilRuntimeBase.this.doV5CoreAPIImportModelV2(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
                            }
                        });
                        continue;
                    }
                    if (iPSDEAction.getName().toUpperCase().indexOf(V5COREAPICALL_X_PREFIX) != 0) continue;
                    this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime(iPSDataEntity.getName(), iPSDEAction.getName(), new IDEActionPluginRuntime(){

                        public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                            return ModelServerSysUtilRuntimeBase.this.doV5CoreAPICall(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
                        }
                    });
                }
            }
        }
        this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeIf("PSSYSRUNSESSION", "create", PSModelEnums.DEActionLogicAttachMode.AFTER.value, new IAction(){

            public Object execute(Object[] args) throws Throwable {
                ModelServerSysUtilRuntimeBase.this.onAfterCreatePSSysRunSession((PSSysRunSessionDTO)((Object)args[0]));
                return null;
            }
        });
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime("PSMODELRT", true);
        if (iDataEntityRuntime != null && !ObjectUtils.isEmpty((Object)(psDEActionList = iDataEntityRuntime.getPSDataEntity().getAllPSDEActions()))) {
            for (IPSDEAction iPSDEAction : psDEActionList) {
                if (!iPSDEAction.getName().equals(V5COREAPICALL_INSPECTMODEL)) continue;
                this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime(iDataEntityRuntime, iPSDEAction.getName(), new IDEActionPluginRuntime(){

                    public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                        return ModelServerSysUtilRuntimeBase.this.doV5CoreAPIInspectModel(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
                    }
                });
            }
        }
    }

    protected Object doV5CoreAPICall(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
        return this.iV5CoreAPIClientRuntime.invokeDEMethod((IDataEntityRuntime)iDataEntityRuntimeContext.getDataEntityRuntime(), iPSDEAction, args);
    }

    protected Object doV5CoreAPIExportModelV2(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
        return this.iV5CoreAPIClientRuntime.invokeDEMethod((IDataEntityRuntime)iDataEntityRuntimeContext.getDataEntityRuntime(), iPSDEAction, args);
    }

    protected Object doV5CoreAPIImportModelV2(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
        return this.iV5CoreAPIClientRuntime.invokeDEMethod((IDataEntityRuntime)iDataEntityRuntimeContext.getDataEntityRuntime(), iPSDEAction, args);
    }

    protected Object doV5CoreAPIInspectModel(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
        if (this.inspectModelPSSysContentCat == null) {
            throw new Exception("\u672a\u5b9a\u4e49\u89c2\u5bdf\u6a21\u578b\u7cfb\u7edf\u5185\u5bb9\u5206\u7c7b");
        }
        String strPSDevSlnSysId = null;
        LinkedHashMap map = new LinkedHashMap();
        IPSDevSysUser iPSDevSysUser = PSDevSysUserHolder.peek();
        if (iPSDevSysUser != null) {
            strPSDevSlnSysId = iPSDevSysUser.getPSDevSlnSysId();
        } else {
            IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
            if (iAppContext != null) {
                strPSDevSlnSysId = (String)iAppContext.get("PSDEVSLNSYS");
            }
        }
        String strPSModelRTId = (String)args[0];
        String[] items = strPSModelRTId.split("[|]");
        if (items.length != 2) {
            throw new Exception("\u4f20\u5165\u53c2\u6570\u65e0\u6548");
        }
        Entity simpleEntity = new Entity(map, false);
        simpleEntity.set("V6MODE", (Object)"true");
        simpleEntity.set("psdevslnsysid", (Object)strPSDevSlnSysId);
        simpleEntity.set("srfdeid", (Object)items[0]);
        simpleEntity.set("srfkey", (Object)items[1]);
        IPSSysContent iPSSysContent = this.inspectModelPSSysContentCat.getPSSysContent((Object)items[0], true);
        if (iPSSysContent == null) {
            throw new Exception(String.format("\u672a\u5b9a\u4e49\u89c2\u5bdf\u6a21\u578b\u7cfb\u7edf\u5185\u5bb9[%1$s]", items[0]));
        }
        simpleEntity.set("srfmodel", (Object)iPSSysContent.getContent());
        return this.inspectModelRT((IEntity)simpleEntity);
    }

    protected Object inspectModelRT(IEntity iEntity) throws Throwable {
        IWebClientRep rep;
        Map ret;
        int nRet;
        String strUrl = String.format("%s/saps/remoteapi.jsp?srfdeid=%s&SRFCALL=%s&SRFV5MODE=TRUE", this.iV5CoreAPIClientRuntime.getServiceUrl(), "PSMODELRT", "XG_INSPECTMODELRT");
        String strUserInfoUrlParams = this.getUserInfoUrlParams();
        if (StringUtils.hasLength((String)strUserInfoUrlParams)) {
            strUrl = strUrl + "&";
            strUrl = strUrl + strUserInfoUrlParams;
        }
        if ((nRet = DataTypeUtils.getIntegerValue((ret = (Map)WebClientBase.MAPPER.readValue((String)(rep = this.iV5CoreAPIClientRuntime.getWebClient().post(strUrl, null, null, null, (Object)iEntity, null, String.class, null)).getBody(), Map.class)).get("ret"), (Integer)0).intValue()) != 0) {
            String errorInfo = (String)ret.get("info");
            log.error((Object)String.format("%s", errorInfo));
            if (StringUtils.hasLength((String)errorInfo) && errorInfo.contains("\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38")) {
                throw new Exception("\u6570\u636e\u5e93\u64cd\u4f5c\u53d1\u751f\u5f02\u5e38");
            }
            throw new Exception(String.format("%s", ret.get("info")));
        }
        Object objItem = ret.get("item");
        if (objItem instanceof Map) {
            Map map = (Map)objItem;
            String strList = DataTypeUtils.asString(map.get("SRFMODELLIST"), null);
            if (!StringUtils.hasLength((String)strList)) {
                return null;
            }
            String strValue = new String(Base64Helper.decode(strList), "GBK");
            List list = JsonUtils.asList((Object)strValue);
            return list.size() == 0 ? null : list.get(0);
        }
        return null;
    }

    protected String getUserInfoUrlParams() throws Exception {
        Map<String, String> map = this.iV5CoreAPIClientRuntime.fillUserInfoUrlParams(null);
        if (!ObjectUtils.isEmpty(map)) {
            return WebClientBase.getUrlParams(map, (boolean)true);
        }
        return null;
    }

    protected void onAfterCreatePSSysRunSession(final PSSysRunSessionDTO et) throws Throwable {
        if (et.getRunState() != null && et.getRunState() == 10) {
            ActionSessionManager.getCurrentSession().registerFutureAction((IASFutureAction)new ASFutureActionBase(){

                public void commit() {
                    try {
                        ModelServerSysUtilRuntimeBase.this.iPSSysRunSessionService.startEx(et);
                    }
                    catch (Throwable ex) {
                        ex = ExceptionUtils.unwrapThrowable((Throwable)ex);
                        DataEntityRuntimeException.rethrow((IModelRuntime)ModelServerSysUtilRuntimeBase.this.iPSSysRunSessionService.getDataEntityRuntime(), (Throwable)ex);
                        throw new DataEntityRuntimeException((IDataEntityRuntimeBase)ModelServerSysUtilRuntimeBase.this.iPSSysRunSessionService.getDataEntityRuntime(), String.format("\u542f\u52a8\u7cfb\u7edf\u8fd0\u884c\u4f1a\u8bdd\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
                    }
                }
            });
            return;
        }
    }

    protected void onUninstall() throws Throwable {
        this.getDEMethodPluginRuntimeRepo().shutdown();
        super.onUninstall();
    }

    @Override
    public Object executeDevCallback(String strPSDevSlnId, String strPSDevSlnSysId, String strSystemTag, String strRunMode, Map<String, Object> params) {
        boolean bOpenSession = false;
        boolean bCommitSession = false;
        try {
            if (ActionSessionManager.getCurrentSession() == null) {
                ActionSessionManager.openSession();
                bOpenSession = true;
            }
            SystemAccessManager.setDefaultDCId(null);
            String strQueryParam = params != null ? WebClientBase.getUrlParams(params, (boolean)true) : "";
            this.getSystemRuntime().log(20000, LOGCAT_DEVCALLBACK, String.format("\u6267\u884c\u5f00\u53d1\u56de\u8c03[/%1$s/%2$s/%3$s/%4$s/token?%5$s]", strPSDevSlnId, strPSDevSlnSysId, strSystemTag, strRunMode, strQueryParam), null);
            this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("\u6267\u884c\u5f00\u53d1\u56de\u8c03[/%1$s/%2$s/%3$s/%4$s/token?%5$s]", strPSDevSlnId, strPSDevSlnSysId, strSystemTag, strRunMode, strQueryParam));
            Object objRet = this.onExecuteDevCallback(strPSDevSlnId, strPSDevSlnSysId, strSystemTag, strRunMode, params);
            bCommitSession = true;
            Object object = objRet;
            return object;
        }
        catch (Throwable ex) {
            log.error((Object)String.format("\u6267\u884c\u5f00\u53d1\u56de\u8c03\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            this.getSystemRuntime().log(40000, LOGCAT_DEVCALLBACK, String.format("\u6267\u884c\u5f00\u53d1\u56de\u8c03\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), (Object)ex);
            this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u6267\u884c\u5f00\u53d1\u56de\u8c03\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()));
        }
        finally {
            SystemAccessManager.setDefaultDCId(null);
            if (bOpenSession) {
                ActionSessionManager.closeSession((boolean)bCommitSession);
            }
        }
        return null;
    }

    protected Object onExecuteDevCallback(final String strPSDevSlnId, final String strPSDevSlnSysId, String strSystemTag, String strRunMode, Map<String, Object> params) throws Throwable {
        if (!StringUtils.hasLength((String)strPSDevSlnId)) {
            throw new Exception("\u672a\u4f20\u5165\u65b9\u6848\u6807\u8bc6");
        }
        String strPSDevCenterId = null;
        String strPSDCMSPlatformId = null;
        String strPSDCMSPlatformNodeId = null;
        String strPSDCRegistryItemId = null;
        String strDebugMode = null;
        String strPSDevSlnPipelineId = null;
        String strPSDevSlnMSDepAPIId = null;
        String strPSDevSlnMSDepAppId = null;
        if (params != null) {
            strPSDCMSPlatformId = (String)params.get("PSDCMSPLATFORMID");
            strPSDCMSPlatformNodeId = (String)params.get("PSDCMSPLATFORMNODEID");
            strPSDCRegistryItemId = (String)params.get("PSDCREGISTRYITEMID");
            strPSDevCenterId = (String)params.get("PSDEVCENTERID");
            strDebugMode = (String)params.get("DEBUGMODE");
            strPSDevSlnPipelineId = (String)params.get("PSDEVSLNPIPELINEID");
            strPSDevSlnMSDepAPIId = (String)params.get("PSDEVSLNMSDEPAPIID");
            strPSDevSlnMSDepAppId = (String)params.get("PSDEVSLNMSDEPAPPID");
        }
        if (!StringUtils.hasLength(strPSDevCenterId)) {
            PSDevSlnDTO psDevSln = (PSDevSlnDTO)this.iPSDevSlnService.get(strPSDevSlnId);
            strPSDevCenterId = psDevSln.getPSDevCenterId();
        }
        SystemAccessManager.setDefaultDCId(strPSDevCenterId);
        if (!StringUtils.hasLength(strPSDevSlnPipelineId)) {
            if ("STARTMSAPI".equalsIgnoreCase(strRunMode)) {
                if (StringUtils.hasLength(strPSDevSlnMSDepAPIId)) {
                    PSDevSlnMSDepAPIDTO psDevSlnMSDepAPIDTO = (PSDevSlnMSDepAPIDTO)this.iPSDevSlnMSDepAPIService.get(strPSDevSlnMSDepAPIId);
                    strPSDevSlnPipelineId = psDevSlnMSDepAPIDTO.getPSDevSlnPipelineId();
                }
            } else if ("STARTMSAPP".equalsIgnoreCase(strRunMode) && StringUtils.hasLength(strPSDevSlnMSDepAppId)) {
                PSDevSlnMSDepAppDTO psDevSlnMSDepAppDTO = (PSDevSlnMSDepAppDTO)this.iPSDevSlnMSDepAppService.get(strPSDevSlnMSDepAppId);
                strPSDevSlnPipelineId = psDevSlnMSDepAppDTO.getPSDevSlnPipelineId();
            }
        }
        if (StringUtils.hasLength(strPSDevSlnPipelineId)) {
            Employee dcEmployee = new Employee();
            dcEmployee.setUserId("SYSTEM");
            dcEmployee.setUserName("\u5185\u7f6e\u7528\u6237");
            dcEmployee.setPersonName("\u5185\u7f6e\u7528\u6237");
            dcEmployee.setSrfdcid(strPSDevCenterId);
            EmployeeContext employeeContext = new EmployeeContext(dcEmployee, null, null);
            UserContext.setCurrent((IUserContext)employeeContext);
            try {
                PSDevSlnPipelineDTO psDevSlnPipelineDTO = (PSDevSlnPipelineDTO)this.iPSDevSlnPipelineService.get(strPSDevSlnPipelineId);
                PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(psDevSlnPipelineDTO.getPSDevSlnId());
                this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("\u5f00\u59cb\u6784\u5efa\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]", psDevSlnPipelineDTO.getName()));
                IPSDCDeployCenterAgent iPSDCDeployCenterAgent = StringUtils.hasLength((String)psDevSlnDTO.getPSDCDeployCenterId()) ? this.iDeployCenterSysUtilRuntime.getPSDCDeployCenterAgent(psDevSlnDTO.getPSDCDeployCenterId()) : this.iDeployCenterSysUtilRuntime.getDefaultPSDCDeployCenterAgent(strPSDevCenterId);
                String strPSDevSlnPipelineLogId = (String)iPSDCDeployCenterAgent.buildPSDevSlnPipeline(psDevSlnPipelineDTO, null);
                if (!StringUtils.hasLength((String)strPSDevSlnPipelineLogId)) {
                    this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u6784\u5efa\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]\u672a\u8fd4\u56de\u4f5c\u4e1a\u6807\u8bc6", psDevSlnPipelineDTO.getName()));
                    throw new Exception(String.format("\u6784\u5efa\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]\u672a\u8fd4\u56de\u4f5c\u4e1a\u6807\u8bc6", psDevSlnPipelineDTO.getName()));
                }
                boolean bFinish = false;
                for (int nTimeout = 0; nTimeout < 1800; ++nTimeout) {
                    PSDevSlnPipelineLogDTO psDevSlnPipelineLogDTO = null;
                    try {
                        psDevSlnPipelineLogDTO = (PSDevSlnPipelineLogDTO)this.iPSDevSlnPipelineLogService.get(strPSDevSlnPipelineLogId);
                    }
                    catch (Throwable ex) {
                        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u83b7\u53d6\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]\u4f5c\u4e1a\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDevSlnPipelineDTO.getName(), ex.getMessage()));
                        throw new Exception(String.format("\u83b7\u53d6\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]\u4f5c\u4e1a\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDevSlnPipelineDTO.getName(), ex.getMessage()));
                    }
                    if (nTimeout == 0) {
                        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("\u6d41\u6c34\u7ebf\u4f5c\u4e1a[%1$s]\u6267\u884c\u4e2d\uff0c\u67e5\u770b\u8def\u5f84[%2$s]", psDevSlnPipelineLogDTO.getPSDevSlnPipelineLogName(), psDevSlnPipelineLogDTO.getQueueUrl()));
                    }
                    if (psDevSlnPipelineLogDTO.getActionState() != null && psDevSlnPipelineLogDTO.getActionState() != PSModelEnums.BackendActionState.CREATING.value) {
                        if (psDevSlnPipelineLogDTO.getActionState() == PSModelEnums.BackendActionState.CREATED.value) {
                            this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("\u6d41\u6c34\u7ebf\u4f5c\u4e1a\u5df2\u7ed3\u675f\uff0c\u6267\u884c\u540e\u7eed\u64cd\u4f5c", new Object[0]));
                            bFinish = true;
                            break;
                        }
                        if (psDevSlnPipelineLogDTO.getActionState() == PSModelEnums.BackendActionState.FAILED.value) {
                            this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u6d41\u6c34\u7ebf\u4f5c\u4e1a\u53d1\u751f\u5f02\u5e38\uff0c%1$s", psDevSlnPipelineLogDTO.getActionResult()));
                            throw new Exception(String.format("\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]\u4f5c\u4e1a\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDevSlnPipelineDTO.getName(), psDevSlnPipelineLogDTO.getActionResult()));
                        }
                    }
                    Thread.sleep(2000L);
                }
                if (!bFinish) {
                    this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u6d41\u6c34\u7ebf\u4f5c\u4e1a\u53d1\u751f\u5f02\u5e38\uff0c%1$s", "\u8d85\u65f6\u9000\u51fa"));
                    throw new Exception(String.format("\u5f00\u53d1\u65b9\u6848\u6d41\u6c34\u7ebf[%1$s]\u4f5c\u4e1a\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDevSlnPipelineDTO.getName(), "\u8d85\u65f6\u9000\u51fa"));
                }
            }
            finally {
                UserContext.setCurrent(null);
            }
        }
        ArrayList<PSDCMSPlatformDTO> psDCMSPlatformList = new ArrayList<PSDCMSPlatformDTO>();
        List<PSDevSlnMSDeployDTO> psDevSlnMSDeployList = null;
        HashMap<String, PSDCMSPlatformDTO> ignoreCallbackPSDCMSPlatformMap = new HashMap<String, PSDCMSPlatformDTO>();
        if (!StringUtils.hasLength((String)strPSDCMSPlatformId)) {
            SearchContextDTO psDevSlnMSDeployFilter = new SearchContextDTO().all().count(false);
            psDevSlnMSDeployFilter.eq("PSDEVSLNID", (Object)strPSDevSlnId);
            psDevSlnMSDeployFilter.eq("VALIDFLAG", (Object)1);
            psDevSlnMSDeployFilter.all();
            psDevSlnMSDeployList = this.iPSDevSlnMSDeployService.select((ISearchContextDTO)psDevSlnMSDeployFilter);
            if (!ObjectUtils.isEmpty((Object)psDevSlnMSDeployList)) {
                for (PSDevSlnMSDeployDTO psDevSlnMSDeploy : psDevSlnMSDeployList) {
                    String strId = psDevSlnMSDeploy.getPSDCMSPlatformId();
                    if (!StringUtils.hasLength((String)strId)) continue;
                    PSDCMSPlatformDTO psDCMSPlatform = (PSDCMSPlatformDTO)this.iPSDCMSPlatformService.get(strId);
                    psDCMSPlatformList.add(psDCMSPlatform);
                }
            }
        } else {
            PSDCMSPlatformDTO psDCMSPlatform = (PSDCMSPlatformDTO)this.iPSDCMSPlatformService.get(strPSDCMSPlatformId);
            psDCMSPlatformList.add(psDCMSPlatform);
            if (StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
                SearchContextDTO psDevSlnMSDeployFilter = new SearchContextDTO().all().count(false);
                psDevSlnMSDeployFilter.eq("PSDEVSLNID", (Object)strPSDevSlnId);
                psDevSlnMSDeployFilter.eq("VALIDFLAG", (Object)1);
                psDevSlnMSDeployFilter.eq("PSDCMSPLATFORMID", (Object)strPSDCMSPlatformId);
                psDevSlnMSDeployFilter.all();
                psDevSlnMSDeployList = this.iPSDevSlnMSDeployService.select((ISearchContextDTO)psDevSlnMSDeployFilter);
            }
        }
        if (ObjectUtils.isEmpty(psDCMSPlatformList)) {
            throw new Exception("\u672a\u6307\u5b9a\u76f8\u5173Cloud\u5e73\u53f0");
        }
        for (PSDCMSPlatformDTO psDCMSPlatform : psDCMSPlatformList) {
            Properties properties;
            String strUserParams = psDCMSPlatform.getUserParams();
            if (!StringUtils.hasLength((String)strUserParams) || (properties = PropertiesUtils.load((String)strUserParams)) == null || !PropertiesUtils.getProperty((Properties)properties, (String)"ignore_callback", (boolean)false)) continue;
            String strId = psDCMSPlatform.getString("PSDCMSPLATFORMID", null);
            String strName = psDCMSPlatform.getString("PSDCMSPLATFORMNAME", null);
            ignoreCallbackPSDCMSPlatformMap.put(strId, psDCMSPlatform);
            log.warn((Object)String.format("\u5fae\u670d\u52a1\u5e73\u53f0[%1$s]\u5ffd\u7565\u56de\u8c03\u5904\u7406", strName));
            this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 30000, LOGCAT_DEVCALLBACK, String.format("\u5fae\u670d\u52a1\u5e73\u53f0[%1$s]\u5ffd\u7565\u56de\u8c03\u5904\u7406", strName));
        }
        if (StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            PSDCMSPlatformNodeDTO psDCMSPlatformNode;
            Object strPSDCMSPlatformId2;
            if (!ObjectUtils.isEmpty((Object)psDevSlnMSDeployList)) {
                for (PSDevSlnMSDeployDTO psDevSlnMSDeploy : psDevSlnMSDeployList) {
                    String strPSDCMSPlatformId22 = psDevSlnMSDeploy.getPSDCMSPlatformId();
                    if (ignoreCallbackPSDCMSPlatformMap.containsKey(strPSDCMSPlatformId22)) continue;
                    try {
                        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("[%1$s]\u53d1\u5e03\u914d\u7f6e", psDevSlnMSDeploy.get("PSDEVSLNMSDEPLOYNAME")));
                        this.iPSDevSlnMSDeployService.pubConfig(psDevSlnMSDeploy);
                    }
                    catch (Throwable ex) {
                        log.error((Object)String.format("[%1$s]\u53d1\u5e03\u914d\u7f6e\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDevSlnMSDeploy.get("PSDEVSLNMSDEPLOYNAME"), ex.getMessage()), ex);
                        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("[%1$s]\u53d1\u5e03\u914d\u7f6e\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDevSlnMSDeploy.get("PSDEVSLNMSDEPLOYNAME"), ex.getMessage()));
                    }
                }
            }
            if (ignoreCallbackPSDCMSPlatformMap.containsKey(strPSDCMSPlatformId2 = (psDCMSPlatformNode = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId)).getPSDCMSPlatformId())) {
                strPSDCRegistryItemId = null;
                strPSDCMSPlatformNodeId = null;
            }
            if (StringUtils.hasLength((String)strPSDCRegistryItemId)) {
                String strLastPSDCRegistryItemId = psDCMSPlatformNode.getString("PSDCREGISTRYITEMID", null);
                String strLastNodeTag = psDCMSPlatformNode.getString("NODETAG", "");
                String strNodeTag = "";
                if ("TRUE".equalsIgnoreCase(strDebugMode)) {
                    strNodeTag = "debug";
                }
                if (!strPSDCRegistryItemId.equals(strLastPSDCRegistryItemId) || !strNodeTag.equals(strLastNodeTag)) {
                    String strPSDCMSPlatformNodeName = psDCMSPlatformNode.getString("PSDCMSPLATFORMNODENAME", null);
                    psDCMSPlatformNode.resetAll();
                    psDCMSPlatformNode.setPSDCMSPlatformNodeId(strPSDCMSPlatformNodeId);
                    psDCMSPlatformNode.setPSDCRegistryItemId(strPSDCRegistryItemId);
                    psDCMSPlatformNode.setNodeTag(StringUtils.hasLength((String)strNodeTag) ? strNodeTag : null);
                    try {
                        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("[%1$s]\u66f4\u65b0\u955c\u50cf", strPSDCMSPlatformNodeName));
                        this.iPSDCMSPlatformNodeService.update(psDCMSPlatformNode);
                    }
                    catch (Throwable ex) {
                        log.error((Object)String.format("[%1$s]\u66f4\u65b0\u955c\u50cf\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strPSDCMSPlatformNodeName, ex.getMessage()), ex);
                        this.getSystemRuntime().log(40000, LOGCAT_DEVCALLBACK, String.format("[%1$s]\u66f4\u65b0\u955c\u50cf\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strPSDCMSPlatformNodeName, ex.getMessage()), null);
                        this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("[%1$s]\u66f4\u65b0\u955c\u50cf\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strPSDCMSPlatformNodeName, ex.getMessage()));
                    }
                }
            }
        }
        final HashSet<String> callbackUrlList = new HashSet<String>();
        for (PSDCMSPlatformDTO psDCMSPlatform : psDCMSPlatformList) {
            String strId = psDCMSPlatform.getPSDCMSPlatformId();
            if (ignoreCallbackPSDCMSPlatformMap.containsKey(strId)) continue;
            String strIPAddr = psDCMSPlatform.getString("IPADDR", "172.16.240.140");
            if (!StringUtils.hasLength((String)strIPAddr)) {
                log.warn((Object)String.format("Cloud\u5e73\u53f0[%1$s]\u672a\u8bbe\u7f6e\u670d\u52a1\u5730\u5740\uff0c\u5ffd\u7565\u56de\u8c03", psDCMSPlatform.getString("PSDCMSPLATFORMNAME", null)));
                this.getSystemRuntime().log(30000, LOGCAT_DEVCALLBACK, String.format("Cloud\u5e73\u53f0[%1$s]\u672a\u8bbe\u7f6e\u670d\u52a1\u5730\u5740\uff0c\u5ffd\u7565\u56de\u8c03", psDCMSPlatform.getString("PSDCMSPLATFORMNAME", null)), null);
                this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 30000, LOGCAT_DEVCALLBACK, String.format("Cloud\u5e73\u53f0[%1$s]\u672a\u8bbe\u7f6e\u670d\u52a1\u5730\u5740\uff0c\u5ffd\u7565\u56de\u8c03", psDCMSPlatform.getString("PSDCMSPLATFORMNAME", null)));
                continue;
            }
            Integer nPort = psDCMSPlatform.getInteger("PORT", 20000);
            String strUrl = String.format("http://%1$s:%2$s/devcallback/%3$s/%4$s/token", strIPAddr, nPort, strSystemTag, strRunMode);
            log.debug((Object)String.format("Cloud\u5e73\u53f0[%1$s]\u4f7f\u7528\u56de\u8c03\u5730\u5740[%2$s]", psDCMSPlatform.getString("PSDCMSPLATFORMNAME", null), strUrl));
            this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 10000, LOGCAT_DEVCALLBACK, String.format("Cloud\u5e73\u53f0[%1$s]\u4f7f\u7528\u56de\u8c03\u5730\u5740[%2$s]", psDCMSPlatform.getString("PSDCMSPLATFORMNAME", null), strUrl));
            callbackUrlList.add(strUrl);
        }
        if (ObjectUtils.isEmpty((Object)strPSDCMSPlatformNodeId) && ObjectUtils.isEmpty(callbackUrlList)) {
            return null;
        }
        final String strPSDCMSPlatformNodeId2 = strPSDCMSPlatformNodeId;
        final String strPSDevCenterId2 = strPSDevCenterId;
        this.getSystemRuntime().threadRun(new Runnable(){

            @Override
            public void run() {
                ModelServerSysUtilRuntimeBase.this.doDevCallbackReal(strPSDevCenterId2, strPSDevSlnId, strPSDevSlnSysId, strPSDCMSPlatformNodeId2, callbackUrlList);
            }
        });
        return null;
    }

    protected void doDevCallbackReal(String strPSDevCenterId, String strPSDevSlnId, String strPSDevSlnSysId, String strPSDCMSPlatformNodeId, Set<String> callbackUrlList) {
        LinkedHashMap<String, String> queries = new LinkedHashMap<String, String>();
        if (StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            queries.put(DEVSYSTEMACTIONPARAM_THREADMODE, "false");
        }
        for (String strUrl : callbackUrlList) {
            try {
                this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("\u8c03\u7528Cloud\u5e73\u53f0\u5f00\u53d1\u56de\u8c03[%1$s]", strUrl));
                this.getSystemRuntime().getDefaultWebClient().get(strUrl, null, null, queries, String.class, null);
            }
            catch (Throwable ex) {
                log.error((Object)String.format("\u8c03\u7528Cloud\u5e73\u53f0\u5f00\u53d1\u56de\u8c03[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strUrl, ex.getMessage()), ex);
                this.getSystemRuntime().log(40000, LOGCAT_DEVCALLBACK, String.format("\u8c03\u7528Cloud\u5e73\u53f0\u5f00\u53d1\u56de\u8c03[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strUrl, ex.getMessage()), (Object)ex);
                this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u8c03\u7528Cloud\u5e73\u53f0\u5f00\u53d1\u56de\u8c03[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strUrl, ex.getMessage()));
            }
        }
        if (StringUtils.hasLength((String)strPSDCMSPlatformNodeId)) {
            PSDCMSPlatformNodeDTO iEntityDTO = null;
            try {
                SystemAccessManager.setDefaultDCId(strPSDevCenterId);
                iEntityDTO = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId);
                iEntityDTO.set("PSDEVSLNID", strPSDevSlnId);
                iEntityDTO.set("PSDEVSLNSYSID", strPSDevSlnSysId);
                this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 20000, LOGCAT_DEVCALLBACK, String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]", iEntityDTO.get("PSDCMSPLATFORMNODENAME")));
                this.iPSDCMSPlatformNodeService.restart(iEntityDTO);
            }
            catch (Throwable ex) {
                if (iEntityDTO == null) {
                    log.error((Object)String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strPSDCMSPlatformNodeId, ex.getMessage()), ex);
                    this.getSystemRuntime().log(40000, LOGCAT_DEVCALLBACK, String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strPSDCMSPlatformNodeId, ex.getMessage()), (Object)ex);
                    this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", strPSDCMSPlatformNodeId, ex.getMessage()));
                } else {
                    log.error((Object)String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", iEntityDTO.get("PSDCMSPLATFORMNODENAME"), ex.getMessage()), ex);
                    this.getSystemRuntime().log(40000, LOGCAT_DEVCALLBACK, String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", iEntityDTO.get("PSDCMSPLATFORMNODENAME"), ex.getMessage()), (Object)ex);
                    this.iSysCloudLogUtilRuntime.sendConsoleMessage(strPSDevSlnSysId, CONSOLESENDER_CENTRAL, true, 40000, LOGCAT_DEVCALLBACK, String.format("\u91cd\u542fCloud\u5e73\u53f0\u670d\u52a1[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", iEntityDTO.get("PSDCMSPLATFORMNODENAME"), ex.getMessage()));
                }
            }
            finally {
                SystemAccessManager.setDefaultDCId(null);
            }
        }
    }

    static {
        V5ModelMap.put("PSDEVSLN", "");
        V5ModelMap.put("PSDEVSLNSYS", "");
        V5ModelMap.put("PSDEVSLNUSER", "");
        V5ModelMap.put("PSDEVUSER", "");
        V5ModelMap.put("PSDEVSLNMSDEPLOY", "");
        V5ModelMap.put("PSDEVSLNMSDEPAPI", "");
        V5ModelMap.put("PSDEVSLNMSDEPAPP", "");
        V5ModelMap.put("PSDEVSLNMSDEPFUNC", "");
        V5ModelMap.put("PSDEVSLNPIPELINE", "");
        V5ModelMap.put("PSDEVSLNPIPELINESTAGE", "");
        V5ModelMap.put("PSDEVSLNPIPELINESTEP", "");
        V5ModelMap.put("PSDEVCENTERSVN", "");
        V5ModelMap.put("PSDEVCENTERDBINST", "");
        V5ModelMap.put("PSDCREGISTRYSERVER", "");
        V5ModelMap.put("PSDCREGISTRYREPO", "");
        V5ModelMap.put("PSDCREGISTRYITEM", "");
    }

    public static abstract class ModelServerSysUtilRuntimeContextBase<M extends IModelServerSysUtilRuntime, C extends ISysUtilRuntimeContext>
    extends SysUtilRuntimeContextProxy<M, C>
    implements IModelServerSysUtilRuntimeContext {
        public ModelServerSysUtilRuntimeContextBase(C superContext) {
            super(superContext);
        }
    }
}