package net.ibizsys.modeling.core.security;

import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.SystemAccessManager;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.pub.IPSSysSFPub;
import net.ibizsys.modeling.core.Version;
import net.ibizsys.modeling.core.dataentity.dto.PSDCBKTaskDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnUserDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevUserDTO;
import net.ibizsys.modeling.core.dataentity.security.PSConfigDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDCRegistryItemDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDCResourceDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDevCenterDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDevSlnDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDevSlnMSDeployDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDevSlnSysDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSModelDEAccessManager;
import net.ibizsys.modeling.core.dataentity.service.IPSDCBKTaskService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnUserService;
import net.ibizsys.modeling.core.security.IPSDevSlnUser;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.IPSDevUser;
import net.ibizsys.modeling.core.security.IPSDevUserBase;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.security.PSDevSlnUser;
import net.ibizsys.modeling.core.security.PSDevSysUser;
import net.ibizsys.modeling.core.security.PSDevUser;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.modeling.core.util.PSModels;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class SystemAccessManagerBase
extends SystemAccessManager
implements ISystemAccessManager {
    private static final Log log = LogFactory.getLog(SystemAccessManagerBase.class);
    public static final String SYSTEMID_CENTRAL = "ibizcentral";
    public static final String PARAM_PSDEVUSER = "psdevuser";
    public static final String CLIENTAG_V5COREAPI = "V5COREAPI";
    public static final String USERROLE_WXMP_USERS = "WXMP_USERS";
    private static final ThreadLocal<String> defaultDCIdThreadLocal = new ThreadLocal();
    private static final ThreadLocal<Boolean> getCurrentPSDevUserIfBusyLocal = new ThreadLocal();
    @Autowired
    private IPSDevSlnService iPSDevSlnService = null;
    @Autowired
    private IPSDevSlnSysService iPSDevSlnSysService = null;
    @Autowired
    private IPSDevSlnUserService iPSDevSlnUserService = null;
    @Autowired
    private IPSDCBKTaskService iPSDCBKTaskService = null;
    public static final String SYSSTATEMSG_UNINIT = "\u5f00\u53d1\u7cfb\u7edf\u672a\u521d\u59cb\u5316";
    public static final String SYSSTATEMSG_OFFLINE = "\u5f00\u53d1\u7cfb\u7edf\u5df2\u79bb\u7ebf";
    public static final String SYSSTATEMSG_DELETED = "\u5f00\u53d1\u7cfb\u7edf\u5df2\u5220\u9664";
    public static final String SYSSTATEMSG_EXPIRED = "\u5f00\u53d1\u7cfb\u7edf\u5df2\u8fc7\u671f";
    public static final String SYSSTATEMSG_OPERATING = "\u5f00\u53d1\u7cfb\u7edf\u8fd0\u7ef4\u4e2d";
    public static final String SYSSTATEMSG_CREATEERR = "\u5f00\u53d1\u7cfb\u7edf\u521b\u5efa\u5931\u8d25";
    public static final PSDevUser ACCESSDENY = new PSDevUser();
    public static final String TAG_PSMODELDEACCESSMANAGER = "PSModelDEAccessManager";
    public static final String TAG_PCONFIGDEACCESSMANAGER = "PSConfigDEAccessManager";
    private int nRequireModelInstVer = 0;
    private String strRuntimeModelVer = null;
    private Boolean bModelAutoUpgrate = false;

    protected void onInit() throws Exception {
        super.onInit();
        IPSSysSFPub iPSSysSFPub = this.getSystemRuntime().getPSSystem().getDefaultPSSysSFPub();
        if (iPSSysSFPub != null) {
            if (StringUtils.hasLength((String)iPSSysSFPub.getUserTag())) {
                this.nRequireModelInstVer = DataTypeUtils.asInteger((Object)iPSSysSFPub.getUserTag(), (Integer)this.nRequireModelInstVer);
            }
            this.strRuntimeModelVer = iPSSysSFPub.getUserTag2();
        }
        this.bModelAutoUpgrate = this.getSystemRuntime().getSystemRuntimeSetting().getParam("modelautoupgrate", false);
    }

    public int getRequireModelInstVer() {
        return this.nRequireModelInstVer;
    }

    public Boolean isModelAutoUpgrate() {
        return this.bModelAutoUpgrate;
    }

    public String getRuntimeModelVer() {
        return this.strRuntimeModelVer;
    }

    public IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
        try {
            String strPluginTag = String.format("%sDEAccessManager", iDataEntityRuntime.getPSDataEntity().getCodeName());
            ISysSFPluginRuntime iSysSFPluginRuntime = this.getSystemRuntime().getSysSFPluginRuntime(strPluginTag, true);
            if (iSysSFPluginRuntime != null) {
                return (IDataEntityAccessManager)iSysSFPluginRuntime.getRuntimeObject(IDataEntityAccessManager.class, true);
            }
            IDataEntityAccessManager iDataEntityAccessManager = this.onCreateDataEntityAccessManager(iDataEntityRuntime);
            if (iDataEntityAccessManager != null) {
                this.getSystemRuntime().autowareObject(iDataEntityAccessManager);
                return iDataEntityAccessManager;
            }
            if (PSModels.isModelInstDataEntity(iDataEntityRuntime.getName())) {
                iSysSFPluginRuntime = this.getSystemRuntime().getSysSFPluginRuntime(TAG_PSMODELDEACCESSMANAGER, true);
                if (iSysSFPluginRuntime != null) {
                    return (IDataEntityAccessManager)iSysSFPluginRuntime.getRuntimeObject(IDataEntityAccessManager.class, true);
                }
                iDataEntityAccessManager = new PSModelDEAccessManager();
                this.getSystemRuntime().autowareObject(iDataEntityAccessManager);
                return iDataEntityAccessManager;
            }
            if (PSModels.isConfigInstDataEntity(iDataEntityRuntime.getName())) {
                iSysSFPluginRuntime = this.getSystemRuntime().getSysSFPluginRuntime(TAG_PCONFIGDEACCESSMANAGER, true);
                if (iSysSFPluginRuntime != null) {
                    return (IDataEntityAccessManager)iSysSFPluginRuntime.getRuntimeObject(IDataEntityAccessManager.class, true);
                }
                iDataEntityAccessManager = new PSConfigDEAccessManager();
                this.getSystemRuntime().autowareObject(iDataEntityAccessManager);
                return iDataEntityAccessManager;
            }
        }
        catch (Throwable ex) {
            throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), String.format("\u5efa\u7acb\u5b9e\u4f53\u8bbf\u95ee\u7ba1\u7406\u5bf9\u8c61\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
        }
        return super.createDataEntityAccessManager(iDataEntityRuntime);
    }

    protected IDataEntityAccessManager onCreateDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
        switch (iDataEntityRuntime.getName()) {
            case "PSDEVSLN": {
                return new PSDevSlnDEAccessManager();
            }
            case "PSDEVSLNSYS": {
                return new PSDevSlnSysDEAccessManager();
            }
            case "PSDEVCENTER": {
                return new PSDevCenterDEAccessManager();
            }
            case "PSDEVSLNMSDEPLOY": {
                return new PSDevSlnMSDeployDEAccessManager();
            }
            case "PSDCREGISTRYITEM": {
                return new PSDCRegistryItemDEAccessManager();
            }
            case "PSDCMSPLATFORM":
            case "PSDEVCENTERDBINST":
            case "PSDCREGISTRYREPO":
            case "PSDCCLUSTER":
            case "PSDEVCENTERSVN":
            case "PSDCDEPLOYCENTER":
            case "PSGITUSER":
            case "PSCREDENTIAL":
            case "PSDCCODESNIPPET":
            case "PSDCFILE":
            case "PSDCBKTASK":
            case "PSDCWORKSPACE":
            case "PSDEVUSER": {
                return new PSDCResourceDEAccessManager();
            }
        }
        return null;
    }

    protected AppData onGetAppData(String strSystemTag, String strOrgId) throws Throwable {
        IPSDevSysUser iPSDevSysUser;
        AppData appData = super.onGetAppData(strSystemTag, strOrgId);
        IPSDevUser iPSDevUser = this.getCurrentPSDevUser();
        if (iPSDevUser == null) {
            iPSDevUser = this.getPSDevUser(appData);
        }
        if ((iPSDevSysUser = this.getCurrentPSDevSysUser(true)) != null) {
            appData.getExtMqttTopicIf().set("psdevslnsystopic", (Object)iPSDevSysUser.getPSDevSlnSysId());
            appData.getExtMqttTopicIf().set("studiotopic", (Object)String.format("%1$s_psdevslnsys_%2$s", EmployeeContext.getCurrent().getMqtttopic(), iPSDevSysUser.getPSDevSlnSysId()));
            appData.getContextIf().set("srfpssysname", (Object)iPSDevSysUser.getPSDevSlnSysName());
            appData.getContextIf().set("srfpssyslogicname", (Object)iPSDevSysUser.getPSDevSlnSysLogicName());
            appData.getContextIf().set("srfpssysinstver", (Object)iPSDevSysUser.getCurSysModelInstVer());
            appData.getContextIf().set("srfpsactiveinstver", (Object)iPSDevSysUser.getActiveSysModelInstVer());
            appData.getContextIf().set("psdevsln", (Object)iPSDevSysUser.getPSDevSlnId());
            if (StringUtils.hasLength((String)this.getRuntimeModelVer())) {
                appData.getContextIf().set("srfmodelingver", (Object)this.getRuntimeModelVer());
            }
        }
        if (StringUtils.hasLength((String)iPSDevSysUser.getPSDevSlnSysId())) {
            int nModelInstVer;
            PSDevSlnSysDTO psDevSlnSys = (PSDevSlnSysDTO)this.iPSDevSlnSysService.get(iPSDevSysUser.getPSDevSlnSysId());
            Integer nSysState = psDevSlnSys.getDevSysState();
            String strSysStateMsg = "";
            if (nSysState != null) {
                switch (nSysState) {
                    case 10: {
                        strSysStateMsg = SYSSTATEMSG_UNINIT;
                        break;
                    }
                    case 31: {
                        strSysStateMsg = SYSSTATEMSG_OPERATING;
                        break;
                    }
                    case 35: {
                        strSysStateMsg = SYSSTATEMSG_OFFLINE;
                        break;
                    }
                    case 40: {
                        strSysStateMsg = SYSSTATEMSG_DELETED;
                        break;
                    }
                    case 41: {
                        strSysStateMsg = SYSSTATEMSG_EXPIRED;
                        break;
                    }
                    case 42: {
                        strSysStateMsg = SYSSTATEMSG_CREATEERR;
                    }
                }
            }
            if (psDevSlnSys != null && this.isModelAutoUpgrate().booleanValue() && !DataTypeUtils.asBoolean((Object)psDevSlnSys.getShareFlag(), (Boolean)false).booleanValue() && (nModelInstVer = DataTypeUtils.asInteger((Object)psDevSlnSys.getModelInstVer(), (Integer)this.getRequireModelInstVer()).intValue()) < this.getRequireModelInstVer()) {
                for (int i = 0; i < 5; ++i) {
                    String strPSDCBKTaskId = KeyValueUtils.genUniqueId((Object)PSModelEnums.DCBKTaskType.UPGRATEDEVSYSMODEL.value, (Object)psDevSlnSys.getPSDevSlnSysId(), (Object)Integer.toString(this.getRequireModelInstVer()), (Object)Integer.toString(i));
                    PSDCBKTaskDTO psDCBKTask = (PSDCBKTaskDTO)this.iPSDCBKTaskService.get(strPSDCBKTaskId, true);
                    if (psDCBKTask != null) {
                        int nTaskState = DataTypeUtils.asInteger((Object)psDCBKTask.getTaskState(), (Integer)PSModelEnums.SysDevBKTaskState.CREATED.value);
                        if (nTaskState != PSModelEnums.SysDevBKTaskState.CREATED.value && nTaskState != PSModelEnums.SysDevBKTaskState.EXECUTING.value) continue;
                        nSysState = 31;
                        strSysStateMsg = String.format("\u5f00\u53d1\u7cfb\u7edf\u6a21\u578b\u4ed3\u5e93\u6b63\u5728\u5347\u7ea7\u4e2d", new Object[0]);
                        continue;
                    }
                    try {
                        this.iPSDevSlnSysService.executeAction("X_ADDUPGRATESYSMODELTASK", null, new Object[]{psDevSlnSys});
                    }
                    catch (Exception exception) {
                    }
                    nSysState = 31;
                    strSysStateMsg = String.format("\u5f00\u53d1\u7cfb\u7edf\u6a21\u578b\u4ed3\u5e93\u7248\u672c\u9700\u8981\u5347\u7ea7\uff0c\u5df2\u5efa\u7acb\u5347\u7ea7\u4efb\u52a1", new Object[0]);
                }
            }
            appData.set("devsysstate", (Object)nSysState);
            appData.set("devsysstatemsg", (Object)strSysStateMsg);
        }
        appData.set("studiover", (Object)Version.getVersionString());
        return appData;
    }

    protected IPSDevUser getPSDevUser(AppData appData) throws Throwable {
        IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime("PSDEVUSER", false);
        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
        ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
        iSearchContextDTO.eq("psdevcenterid", (Object)this.getDefaultDCId());
        if ("aibizhi".equals(iAuthenticationUser.getLoginname()) && "aibizhi".equals(iEmployeeContext.getTenant())) {
            iSearchContextDTO.eq("loginname", (Object)"demo_admin");
        } else {
            iSearchContextDTO.eq("loginname", (Object)iAuthenticationUser.getLoginname());
        }
        PSDevUserDTO iEntityDTO = (PSDevUserDTO)iDataEntityRuntime.selectOne(iSearchContextDTO, true);
        if (iEntityDTO != null) {
            PSDevUser psDevUser = new PSDevUser();
            psDevUser.setPSDevCenterId(iEntityDTO.getPSDevCenterId());
            psDevUser.setPSDevCenterName(iEntityDTO.getPSDevCenterName());
            psDevUser.setPSDevUserId(iEntityDTO.getPSDevUserId());
            psDevUser.setPSDevUserName(iEntityDTO.getPSDevUserName());
            psDevUser.setUserTag(iEntityDTO.getUserTag());
            psDevUser.setUserTag2(iEntityDTO.getUserTag2());
            psDevUser.setUserTag3(iEntityDTO.getUserTag3());
            psDevUser.setUserTag4(iEntityDTO.getUserTag4());
            psDevUser.setAdminMode(iEntityDTO.getInteger("adminmode", 0) == 1);
            if ("aibizhi".equals(iAuthenticationUser.getLoginname()) && "aibizhi".equals(iEmployeeContext.getTenant())) {
                psDevUser.setLoginName("demo_admin");
            } else {
                psDevUser.setLoginName(iAuthenticationUser.getLoginname());
            }
            this.getSysCacheUtilRuntime(false).set(CloudCacheTagUtils.getAuthenticationUserCat((String)iAuthenticationUser.getUsername(), (String)iAuthenticationUser.getToken()), this.getPSDevUserKey(), (Object)psDevUser, iAuthenticationUser.getExpirein());
            return psDevUser;
        }
        if (this.testSysUserRole(iEmployeeContext, USERROLE_WXMP_USERS)) {
            PSDevUser psDevUser = new PSDevUser();
            psDevUser.setPSDevCenterId(iEmployeeContext.getTenant());
            psDevUser.setPSDevUserId(iEmployeeContext.getUserid());
            psDevUser.setPSDevUserName(iEmployeeContext.getUsername());
            psDevUser.setLoginName(iAuthenticationUser.getLoginname());
            this.getSysCacheUtilRuntime(false).set(CloudCacheTagUtils.getAuthenticationUserCat((String)iAuthenticationUser.getUsername(), (String)iAuthenticationUser.getToken()), this.getPSDevUserKey(), (Object)psDevUser, iAuthenticationUser.getExpirein());
            return psDevUser;
        }
        log.error((Object)String.format("\u65e0\u6cd5\u83b7\u53d6\u5f53\u524d\u7528\u6237[%s@%s]\u7ed1\u5b9a\u5f00\u53d1\u7528\u6237", iAuthenticationUser.getLoginname(), iEmployeeContext.getTenant()));
        throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u5f53\u524d\u7528\u6237\u7ed1\u5b9a\u5f00\u53d1\u7528\u6237", new Object[0]));
    }

    @Override
    public IPSDevUser getCurrentPSDevUser() {
        IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
        PSDevUser psDevUser = (PSDevUser)this.getSysCacheUtilRuntime(false).get(CloudCacheTagUtils.getAuthenticationUserCat((String)iAuthenticationUser.getUsername(), (String)iAuthenticationUser.getToken()), this.getPSDevUserKey(), PSDevUser.class);
        if (psDevUser != null) {
            return psDevUser;
        }
        return null;
    }

    @Override
    public IPSDevUser getCurrentPSDevUserIf() {
        IPSDevUser iPSDevUser = this.getCurrentPSDevUser();
        if (iPSDevUser != null) {
            return iPSDevUser;
        }
        Boolean lastBusy = getCurrentPSDevUserIfBusyLocal.get();
        if (lastBusy != null) {
            return null;
        }
        try {
            getCurrentPSDevUserIfBusyLocal.set(true);
            if (AuthenticationUser.getCurrent() != null && EmployeeContext.getCurrent() != null) {
                IPSDevUser iPSDevUser2 = this.getPSDevUser(new AppData());
                return iPSDevUser2;
            }
        }
        catch (Throwable ex) {
            log.error((Object)String.format("\u91cd\u65b0\u8ba1\u7b97\u5f00\u53d1\u7528\u6237\u53d1\u751f\u5f02\u5e38\uff0c%s", ex.getMessage()), ex);
        }
        finally {
            getCurrentPSDevUserIfBusyLocal.set(null);
        }
        return null;
    }

    @Override
    public IPSDevUser getCurrentPSDevUserMust() {
        IPSDevUser iPSDevUser = this.getCurrentPSDevUserIf();
        if (iPSDevUser != null) {
            return iPSDevUser;
        }
        throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), "\u5f53\u524d\u5f00\u53d1\u7528\u6237\u5bf9\u8c61\u65e0\u6548");
    }

    protected String getPSDevUserKey() {
        return String.format("ex-%s-%s", PARAM_PSDEVUSER, SYSTEMID_CENTRAL);
    }

    protected String getPSDevUserKey(String strObjectType, String strObjectId) {
        return String.format("ex-%s-%s-%s-%s", PARAM_PSDEVUSER, SYSTEMID_CENTRAL, strObjectType, strObjectId);
    }

    @Override
    public IPSDevUserBase getPSDevUserBase(String strObjectType, String strObjectId) {
        try {
            return this.onGetPSDevUserBase(strObjectType, strObjectId);
        }
        catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable((Throwable)ex);
            throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), String.format("\u83b7\u53d6\u5f00\u53d1\u5bf9\u8c61\u6388\u6743\u7528\u6237\u53d1\u751f\u5f02\u5e38\uff0c%s", ex.getMessage()), ex);
        }
    }

    protected IPSDevUserBase onGetPSDevUserBase(String strObjectType, String strObjectId) throws Throwable {
        String strPSDevUserKey = this.getPSDevUserKey(strObjectType, strObjectId);
        IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
        IPSDevUserBase iPSDevUserBase = null;
        if ("SLN".equalsIgnoreCase(strObjectType)) {
            iPSDevUserBase = (IPSDevUserBase)this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat((String)iAuthenticationUser.getUsername(), (String)iAuthenticationUser.getToken()), strPSDevUserKey, PSDevSlnUser.class);
        } else if ("SYS".equalsIgnoreCase(strObjectType)) {
            iPSDevUserBase = (IPSDevUserBase)this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat((String)iAuthenticationUser.getUsername(), (String)iAuthenticationUser.getToken()), strPSDevUserKey, PSDevSysUser.class);
        } else {
            throw new Exception(String.format("\u672a\u652f\u6301\u7684\u76ee\u6807\u7c7b\u578b[%1$s]", strObjectType));
        }
        if (iPSDevUserBase instanceof IPSDevSlnUser) {
            if (((IPSDevSlnUser)iPSDevUserBase).getAccMode() == 0) {
                return null;
            }
            return iPSDevUserBase;
        }
        IPSDevUser iPSDevUser = this.getCurrentPSDevUser();
        String strPSDevUserId = EmployeeContext.getCurrentMust().getUserid();
        if (iPSDevUser != null) {
            strPSDevUserId = iPSDevUser.getPSDevUserId();
        }
        if (!StringUtils.hasLength((String)strPSDevUserId)) {
            throw new Exception("\u5f00\u53d1\u7528\u6237\u6807\u8bc6\u65e0\u6548");
        }
        if ("SYS".equalsIgnoreCase(strObjectType)) {
            PSDevSlnSysDTO psDevSlnSysDTO = (PSDevSlnSysDTO)this.iPSDevSlnSysService.get(strObjectId, true);
            if (psDevSlnSysDTO == null) {
                throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5f00\u53d1\u7cfb\u7edf[%s]", strObjectId));
            }
            PSDevSysUser psDevUser = new PSDevSysUser();
            PSDevSlnUserDTO psDevSlnUserDTO = this.getPSDevSlnUserDTO(psDevSlnSysDTO, strPSDevUserId, true);
            if (psDevSlnUserDTO != null) {
                psDevUser.setAccMode(DataTypeUtils.asInteger((Object)psDevSlnUserDTO.getAccMode(), (Integer)0));
            } else if (this.testSysUserRole(EmployeeContext.getCurrentMust(), USERROLE_WXMP_USERS)) {
                psDevUser.setAccMode(1);
            }
            psDevUser.setPSDevSlnSysId(psDevSlnSysDTO.getPSDevSlnSysId());
            psDevUser.setPSSystemId(psDevSlnSysDTO.getPSSystemId());
            psDevUser.setPSSysModelInstId(psDevSlnSysDTO.getPSSysModelInstId());
            psDevUser.setPSSystemName(psDevSlnSysDTO.getPSDevSlnSysName());
            psDevUser.setPSDevSlnSysName(psDevSlnSysDTO.getPSDevSlnSysName());
            psDevUser.setPSDevSlnSysCodeName(psDevSlnSysDTO.getCodeName());
            psDevUser.setPSDevSlnSysLogicName(psDevSlnSysDTO.getLogicName());
            psDevUser.setCurSysModelInstVer(DataTypeUtils.asInteger((Object)psDevSlnSysDTO.getModelInstVer(), (Integer)0));
            psDevUser.setActiveSysModelInstVer(DataTypeUtils.asInteger((Object)psDevSlnSysDTO.get("activemodelinstver"), (Integer)0));
            if (iPSDevUser != null) {
                psDevUser.setPSDevUserId(iPSDevUser.getPSDevUserId());
                psDevUser.setPSDevUserName(iPSDevUser.getPSDevUserName());
                if (iPSDevUser.isAdminMode()) {
                    psDevUser.setAdminMode(true);
                    psDevUser.setAccMode(3);
                }
            } else {
                psDevUser.setPSDevUserId(EmployeeContext.getCurrentMust().getUserid());
                psDevUser.setPSDevUserName(EmployeeContext.getCurrentMust().getUsername());
            }
            psDevUser.setExpiredTime(psDevSlnSysDTO.getExpriedTime());
            psDevUser.setPSDevCenterId(psDevSlnSysDTO.getPSDevCenterId());
            psDevUser.setPSDevSlnId(psDevSlnSysDTO.getPSDevSlnId());
            if (psDevUser.isExpired()) {
                throw new ErrorException(String.format(SYSSTATEMSG_EXPIRED, new Object[0]), 2);
            }
            iPSDevUserBase = psDevUser;
        } else if ("SLN".equalsIgnoreCase(strObjectType)) {
            PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(strObjectId, true);
            if (psDevSlnDTO == null) {
                throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5f00\u53d1\u65b9\u6848[%s]", strObjectId));
            }
            PSDevSlnUser psDevUser = new PSDevSlnUser();
            PSDevSlnUserDTO psDevSlnUserDTO = this.getPSDevSlnUserDTO(psDevSlnDTO, strPSDevUserId, true);
            if (psDevSlnUserDTO != null) {
                psDevUser.setAccMode(DataTypeUtils.asInteger((Object)psDevSlnUserDTO.getAccMode(), (Integer)0));
            }
            if (iPSDevUser != null) {
                psDevUser.setPSDevUserId(iPSDevUser.getPSDevUserId());
                psDevUser.setPSDevUserName(iPSDevUser.getPSDevUserName());
                if (iPSDevUser.isAdminMode()) {
                    psDevUser.setAdminMode(true);
                    psDevUser.setAccMode(3);
                }
            } else {
                psDevUser.setPSDevUserId(EmployeeContext.getCurrentMust().getUserid());
                psDevUser.setPSDevUserName(EmployeeContext.getCurrentMust().getUsername());
            }
            psDevUser.setPSDevCenterId(psDevSlnDTO.getPSDevCenterId());
            psDevUser.setPSDevSlnId(psDevSlnDTO.getPSDevSlnId());
            iPSDevUserBase = psDevUser;
        } else {
            throw new Exception(String.format("\u672a\u652f\u6301\u7684\u76ee\u6807\u7c7b\u578b[%1$s]", strObjectType));
        }
        this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserCat((String)iAuthenticationUser.getUsername(), (String)iAuthenticationUser.getToken()), strPSDevUserKey, (Object)iPSDevUserBase);
        if (iPSDevUserBase instanceof IPSDevSlnUser && ((IPSDevSlnUser)iPSDevUserBase).getAccMode() == 0) {
            return null;
        }
        return iPSDevUserBase;
    }

    protected PSDevSlnUserDTO getPSDevSlnUserDTO(PSDevSlnSysDTO psDevSlnSysDTO, String strPSDevUserId, boolean bTryMode) throws Exception {
        Page<PSDevSlnUserDTO> page;
        PSDevSlnDTO psDevSlnDTO;
        try {
            psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(psDevSlnSysDTO.getPSDevSlnId(), false);
        }
        catch (Throwable ex) {
            throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), String.format("\u83b7\u53d6\u5f00\u53d1\u65b9\u6848\u53d1\u751f\u5f02\u5e38\uff0c%s", ex.getMessage()), ex);
        }
        if (strPSDevUserId.equalsIgnoreCase(psDevSlnDTO.getAdminPSDevUserId())) {
            PSDevSlnUserDTO psDevSlnUserDTO = (PSDevSlnUserDTO)this.iPSDevSlnUserService.getDataEntityRuntime().createEntity();
            psDevSlnUserDTO.setPSDevSlnUserId(KeyValueUtils.genUniqueId((Object)psDevSlnSysDTO.getPSDevSlnSysId(), (Object)strPSDevUserId));
            psDevSlnUserDTO.setPSDevSlnSysId(psDevSlnSysDTO.getPSDevSlnSysId());
            psDevSlnUserDTO.setAccMode(3);
            return psDevSlnUserDTO;
        }
        SearchContextDTO searchContextDTO = new SearchContextDTO();
        searchContextDTO.eq("PSDEVSLNID", (Object)psDevSlnSysDTO.getPSDevSlnId());
        searchContextDTO.count(false).all();
        try {
            page = this.iPSDevSlnUserService.fetchDefault((ISearchContextDTO)searchContextDTO);
        }
        catch (Throwable ex) {
            throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), String.format("\u67e5\u8be2\u5f00\u53d1\u65b9\u6848\u7528\u6237\u53d1\u751f\u5f02\u5e38\uff0c%s", ex.getMessage()), ex);
        }
        if (!ObjectUtils.isEmpty(page)) {
            for (PSDevSlnUserDTO psDevSlnUserDTO : page) {
                if (DataTypeUtils.asInteger((Object)psDevSlnUserDTO.getAllSysFlag(), (Integer)0) != 0 || DataTypeUtils.compare((String)psDevSlnUserDTO.getPSDevSlnSysId(), (String)psDevSlnSysDTO.getPSDevSlnSysId(), (boolean)true) != 0L || DataTypeUtils.compare((String)psDevSlnUserDTO.getPSDevUserObjId(), (String)strPSDevUserId, (boolean)true) != 0L) continue;
                return psDevSlnUserDTO;
            }
            for (PSDevSlnUserDTO psDevSlnUserDTO : page) {
                if (DataTypeUtils.asInteger((Object)psDevSlnUserDTO.getAllSysFlag(), (Integer)0) != 1 || DataTypeUtils.compare((String)psDevSlnUserDTO.getPSDevUserObjId(), (String)strPSDevUserId, (boolean)true) != 0L) continue;
                return psDevSlnUserDTO;
            }
        }
        if (bTryMode) {
            return null;
        }
        throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5f00\u53d1\u7cfb\u7edf\u8bbf\u95ee\u7528\u6237[%s-%s]", psDevSlnSysDTO.getPSDevSlnSysId(), strPSDevUserId));
    }

    protected PSDevSlnUserDTO getPSDevSlnUserDTO(PSDevSlnDTO psDevSlnDTO, String strPSDevUserId, boolean bTryMode) throws Exception {
        int nAccMode = 0;
        if (strPSDevUserId.equals(psDevSlnDTO.getAdminPSDevUserId())) {
            nAccMode = 19;
        } else {
            Integer nRet = this.getPSDevUserAccMode(psDevSlnDTO.getPSDevSlnId(), PSModelEnums.DevSlnUserTarget.ALL.value, null, (Object)psDevSlnDTO, strPSDevUserId);
            if (nRet != null) {
                nAccMode = nRet;
            }
        }
        PSDevSlnUserDTO psDevSlnUserDTO = (PSDevSlnUserDTO)this.iPSDevSlnUserService.getDataEntityRuntime().createEntity();
        psDevSlnUserDTO.setAccMode(nAccMode);
        psDevSlnUserDTO.setPSDevSlnId(psDevSlnDTO.getPSDevSlnId());
        psDevSlnUserDTO.setPSDevUserObjId(strPSDevUserId);
        return psDevSlnUserDTO;
    }

    protected Integer getPSDevUserAccMode(String strPSDevSlnId, int nTargetType, String strTargetId, Object objTarget, String strPSDevUserId) throws Exception {
        Page<PSDevSlnUserDTO> page;
        Integer nAccMode = null;
        SearchContextDTO searchContextDTO = new SearchContextDTO();
        searchContextDTO.eq("PSDEVSLNID", (Object)strPSDevSlnId);
        searchContextDTO.eq("PSDEVUSEROBJID", (Object)strPSDevUserId);
        searchContextDTO.count(false).all();
        try {
            page = this.iPSDevSlnUserService.fetchDefault((ISearchContextDTO)searchContextDTO);
        }
        catch (Throwable ex) {
            throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), String.format("\u67e5\u8be2\u5f00\u53d1\u65b9\u6848\u7528\u6237\u53d1\u751f\u5f02\u5e38\uff0c%s", ex.getMessage()), ex);
        }
        if (!ObjectUtils.isEmpty(page)) {
            for (PSDevSlnUserDTO psDevSlnUserDTO : page) {
                if (psDevSlnUserDTO.getExpiredTime() != null && psDevSlnUserDTO.getExpiredTime().getTime() < System.currentTimeMillis() || psDevSlnUserDTO.getAllSysFlag() == null || psDevSlnUserDTO.getAccMode() == null) continue;
                if (nTargetType == PSModelEnums.DevSlnUserTarget.ALL.value) {
                    if (psDevSlnUserDTO.getAllSysFlag() == PSModelEnums.DevSlnUserTarget.ALL.value) {
                        return psDevSlnUserDTO.getAccMode();
                    }
                    if (nAccMode != null && 1 <= nAccMode) continue;
                    nAccMode = 1;
                    continue;
                }
                if (nTargetType != PSModelEnums.DevSlnUserTarget.SYS.value) continue;
                if (psDevSlnUserDTO.getAllSysFlag() == PSModelEnums.DevSlnUserTarget.ALL.value) {
                    if (nAccMode != null && psDevSlnUserDTO.getAccMode() <= nAccMode) continue;
                    nAccMode = psDevSlnUserDTO.getAccMode();
                    continue;
                }
                if (psDevSlnUserDTO.getAllSysFlag() != PSModelEnums.DevSlnUserTarget.SYS.value || DataTypeUtils.compare((String)psDevSlnUserDTO.getPSDevSlnSysId(), (String)strTargetId, (boolean)false) != 0L) continue;
                return psDevSlnUserDTO.getAccMode();
            }
        }
        return nAccMode;
    }

    @Override
    public IPSDevSysUser getCurrentPSDevSysUser(boolean bTryMode) {
        try {
            return this.onGetCurrentPSDevSysUser(bTryMode);
        }
        catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable((Throwable)ex);
            throw new SystemRuntimeException((ISystemRuntimeBase)this.getSystemRuntime(), String.format("\u83b7\u53d6\u5f53\u524d\u5f00\u53d1\u7cfb\u7edf\u5bf9\u8c61\u53d1\u751f\u5f02\u5e38\uff0c%s", ex.getMessage()), ex);
        }
    }

    protected IPSDevSysUser onGetCurrentPSDevSysUser(boolean bTryMode) throws Throwable {
        Object item;
        IPSDevSysUser iPSDevSysUser = PSDevSysUserHolder.peek();
        if (iPSDevSysUser != null) {
            return iPSDevSysUser;
        }
        IAppContext iAppContext = ActionSessionManager.getAppContext();
        if (iAppContext == null) {
            if (bTryMode) {
                log.debug((Object)"\u5e94\u7528\u4e0a\u4e0b\u6587\u5bf9\u8c61\u65e0\u6548\uff0c\u5ffd\u7565\u83b7\u53d6\u5f00\u53d1\u7cfb\u7edf\u7528\u6237");
                return null;
            }
            throw new Exception("\u5e94\u7528\u4e0a\u4e0b\u6587\u5bf9\u8c61\u65e0\u6548");
        }
        String strPSDevSlnSysId = (String)iAppContext.get("PSDEVSLNSYS");
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            if (bTryMode) {
                log.debug((Object)"\u672a\u4f20\u5165\u5f00\u53d1\u7cfb\u7edf\u6807\u8bc6\uff0c\u5ffd\u7565\u83b7\u53d6\u5f00\u53d1\u7cfb\u7edf\u7528\u6237");
                return null;
            }
            throw new Exception("\u672a\u4f20\u5165\u5f00\u53d1\u7cfb\u7edf\u6807\u8bc6");
        }
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", strPSDevSlnSysId, IPSDevSysUser.class);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (IPSDevSysUser)item;
        }
        iPSDevSysUser = (IPSDevSysUser)this.getPSDevUserBase("SYS", strPSDevSlnSysId);
        if (iPSDevSysUser == null) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5f00\u53d1\u7cfb\u7edf[%1$s]\u8bbf\u95ee\u7528\u6237\u5bf9\u8c61", strPSDevSlnSysId));
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)iPSDevSysUser);
        }
        return iPSDevSysUser;
    }

    @Override
    public String getDefaultDCId() {
        IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
        if (iEmployeeContext != null) {
            if ("aibizhi".equals(iEmployeeContext.getTenant())) {
                return "demo";
            }
            return iEmployeeContext.getTenant();
        }
        String strDCId = defaultDCIdThreadLocal.get();
        if (StringUtils.hasLength((String)strDCId)) {
            return strDCId;
        }
        return "demo";
    }

    public static void setDefaultDCId(String strDCId) {
        defaultDCIdThreadLocal.set(strDCId);
    }
}