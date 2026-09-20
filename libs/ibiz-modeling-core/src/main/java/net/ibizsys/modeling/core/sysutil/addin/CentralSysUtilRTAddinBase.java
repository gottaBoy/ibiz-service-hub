package net.ibizsys.modeling.core.sysutil.addin;

import groovy.text.Template;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.modeling.core.dataentity.dto.PSCredentialDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCBKTaskDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCClusterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCCodeSnippetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryRepoDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterSVNDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDeployDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineStepDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSGitUserDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSCredentialService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCBKTaskService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCClusterService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCCodeSnippetService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMSPlatformNodeService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMSPlatformService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCRegistryItemService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCRegistryRepoService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevCenterSVNService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepAPIService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepAppService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDepFuncService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnMSDeployService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnPipelineStepService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysAPIService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysAppService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.dataentity.service.IPSGitUserService;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class CentralSysUtilRTAddinBase
extends SysUtilRTAddinBase {
    private static final Log log = LogFactory.getLog(CentralSysUtilRTAddinBase.class);
    public static final String CONSOLESENDER_CENTRAL = "iBizCentral";
    public static final String REGISTRYITEM_API = "api";
    public static final String REGISTRYITEM_APP = "app";
    public static final String REGISTRYITEM_CODESERVER = "codeserver";
    public static final String PARAM_PSDEVSLNID = "PSDEVSLNID";
    public static final String PARAM_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    @Autowired
    private IPSDCBKTaskService iPSDCBKTaskService = null;
    @Autowired
    private IPSDCRegistryItemService iPSDCRegistryItemService = null;
    @Autowired
    private IPSDCRegistryRepoService iPSDCRegistryRepoService = null;
    @Autowired
    private IPSDCMSPlatformService iPSDCMSPlatformService = null;
    @Autowired
    private IPSDCMSPlatformNodeService iPSDCMSPlatformNodeService = null;
    @Autowired
    private IPSDevSlnMSDeployService iPSDevSlnMSDeployService = null;
    @Autowired
    private IPSDevSlnMSDepAPIService iPSDevSlnMSDepAPIService = null;
    @Autowired
    private IPSDevSlnMSDepAppService iPSDevSlnMSDepAppService = null;
    @Autowired
    private IPSDevSlnMSDepFuncService iPSDevSlnMSDepFuncService = null;
    @Autowired
    private IPSDCClusterService iPSDCClusterService = null;
    @Autowired
    private IPSDevCenterSVNService iPSDevCenterSVNService = null;
    @Autowired
    private IPSGitUserService iPSGitUserService = null;
    @Autowired
    private IPSCredentialService iPSCredentialService = null;
    @Autowired
    private IPSDCCodeSnippetService iPSDCCodeSnippetService = null;
    @Autowired
    private IPSDevSlnSysService iPSDevSlnSysService = null;
    @Autowired
    private IPSDevSlnPipelineStepService iPSDevSlnPipelineStepService = null;
    @Autowired
    private IPSDevSlnSysAppService iPSDevSlnSysAppService = null;
    @Autowired
    private IPSDevSlnSysAPIService iPSDevSlnSysAPIService = null;
    @Autowired
    private IPSDevSlnService iPSDevSlnService = null;
    @Autowired
    private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
    private static final ThreadLocal<Deque<String>> psDCBKTaskIdThreadLocal = new ThreadLocal<Deque<String>>(){

        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<String>();
        }
    };

    protected String beginPSDCBKTask(String strTaskName, String strPSDevSlnId) throws Throwable {
        return this.beginPSDCBKTask(strTaskName, strPSDevSlnId, null);
    }

    protected String beginPSDCBKTask(String strTaskName, String strPSDevSlnId, String strPSDevSlnSysId) throws Throwable {
        PSDCBKTaskDTO psDCBKTask = (PSDCBKTaskDTO)this.iPSDCBKTaskService.createEntityDTO();
        psDCBKTask.setPSDCBKTaskName(strTaskName);
        if (StringUtils.hasLength((String)strPSDevSlnId)) {
            psDCBKTask.setPSDevSlnId(strPSDevSlnId);
        }
        if (StringUtils.hasLength((String)strPSDevSlnSysId)) {
            psDCBKTask.setPSDevSlnSysId(strPSDevSlnSysId);
        }
        psDCBKTask.setTaskType(PSModelEnums.DCBKTaskType.IBIZCENTRAL.value);
        psDCBKTask.setTaskState(PSModelEnums.SysDevBKTaskState.CREATED.value);
        psDCBKTask.setPSDevCenterId(this.getPSDevCenterId());
        this.iPSDCBKTaskService.create(psDCBKTask);
        String strPSDCBKTaskId = psDCBKTask.getPSDCBKTaskId();
        this.pushPSDCBKTaskId(strPSDCBKTaskId);
        return strPSDCBKTaskId;
    }

    protected void updateCurrentPSDCBKTask(int nLogLevel, String strTaskInfo) {
        String strFullTaskInfo = null;
        switch (nLogLevel) {
            case 10000: {
                strFullTaskInfo = String.format("[DEBUG] %s", strTaskInfo);
                break;
            }
            case 40000: {
                strFullTaskInfo = String.format("[ERROR] %s", strTaskInfo);
                break;
            }
            case 50000: {
                strFullTaskInfo = String.format("[FATAL] %s", strTaskInfo);
                break;
            }
            case 20000: {
                strFullTaskInfo = String.format("[INFO] %s", strTaskInfo);
                break;
            }
            case 5000: {
                strFullTaskInfo = String.format("[TRACE] %s", strTaskInfo);
                break;
            }
            case 30000: {
                strFullTaskInfo = String.format("[WARN] %s", strTaskInfo);
                break;
            }
            default: {
                strFullTaskInfo = strTaskInfo;
            }
        }
        this.updateCurrentPSDCBKTask(strFullTaskInfo);
    }

    protected void updateCurrentPSDCBKTask(String strTaskInfo) {
        try {
            String strPSDCBKTaskId = this.peekPSDCBKTaskId();
            if (!StringUtils.hasLength((String)strPSDCBKTaskId)) {
                return;
            }
            this.updatePSDCBKTask(strPSDCBKTaskId, strTaskInfo);
        }
        catch (Throwable ex) {
            log.error((Object)ex);
        }
    }

    protected void updatePSDCBKTask(String strTaskId, String strTaskInfo) throws Throwable {
        PSDCBKTaskDTO psDCBKTask = (PSDCBKTaskDTO)this.iPSDCBKTaskService.createEntityDTO();
        psDCBKTask.setPSDCBKTaskId(strTaskId);
        psDCBKTask.setResultInfo(strTaskInfo);
        psDCBKTask.setTaskType(PSModelEnums.DCBKTaskType.IBIZCENTRAL.value);
        psDCBKTask.setTaskState(PSModelEnums.SysDevBKTaskState.EXECUTING.value);
        this.iPSDCBKTaskService.update(psDCBKTask);
    }

    protected void errorCurrentPSDCBKTask(String strTaskInfo) {
        try {
            String strPSDCBKTaskId = this.pollPSDCBKTaskId();
            if (!StringUtils.hasLength((String)strPSDCBKTaskId)) {
                throw new Exception(String.format("\u4e0a\u4e0b\u6587\u672a\u5b9a\u4e49\u540e\u53f0\u4efb\u52a1\u6807\u8bc6", new Object[0]));
            }
            this.errorPSDCBKTask(strPSDCBKTaskId, strTaskInfo);
        }
        catch (Throwable ex) {
            log.error((Object)ex);
        }
    }

    protected void errorPSDCBKTask(String strTaskId, String strTaskInfo) throws Throwable {
        PSDCBKTaskDTO psDCBKTask = (PSDCBKTaskDTO)this.iPSDCBKTaskService.createEntityDTO();
        psDCBKTask.setPSDCBKTaskId(strTaskId);
        psDCBKTask.setResultInfo(strTaskInfo);
        psDCBKTask.setTaskType(PSModelEnums.DCBKTaskType.IBIZCENTRAL.value);
        psDCBKTask.setTaskState(PSModelEnums.SysDevBKTaskState.CANCELLED.value);
        this.iPSDCBKTaskService.update(psDCBKTask);
    }

    protected void finishCurrentPSDCBKTask(String strTaskInfo) {
        try {
            String strPSDCBKTaskId = this.pollPSDCBKTaskId();
            if (!StringUtils.hasLength((String)strPSDCBKTaskId)) {
                throw new Exception(String.format("\u4e0a\u4e0b\u6587\u672a\u5b9a\u4e49\u540e\u53f0\u4efb\u52a1\u6807\u8bc6", new Object[0]));
            }
            this.finishPSDCBKTask(strPSDCBKTaskId, strTaskInfo);
        }
        catch (Throwable ex) {
            log.error((Object)ex);
        }
    }

    protected void finishPSDCBKTask(String strTaskId, String strTaskInfo) throws Throwable {
        PSDCBKTaskDTO psDCBKTask = (PSDCBKTaskDTO)this.iPSDCBKTaskService.createEntityDTO();
        psDCBKTask.setPSDCBKTaskId(strTaskId);
        psDCBKTask.setResultInfo(strTaskInfo);
        psDCBKTask.setTaskType(PSModelEnums.DCBKTaskType.IBIZCENTRAL.value);
        psDCBKTask.setTaskState(PSModelEnums.SysDevBKTaskState.FINISHED.value);
        this.iPSDCBKTaskService.update(psDCBKTask);
    }

    private String peekPSDCBKTaskId() {
        return psDCBKTaskIdThreadLocal.get().peek();
    }

    private void pushPSDCBKTaskId(String strPSDCBKTaskId) {
        psDCBKTaskIdThreadLocal.get().push(strPSDCBKTaskId);
    }

    private String pollPSDCBKTaskId() {
        Deque<String> deque = psDCBKTaskIdThreadLocal.get();
        String strPSDCBKTaskId = deque.poll();
        if (deque.isEmpty()) {
            psDCBKTaskIdThreadLocal.remove();
        }
        return strPSDCBKTaskId;
    }

    private void clearPSDCBKTaskId() {
        psDCBKTaskIdThreadLocal.remove();
    }

    protected String getPSDevCenterId() {
        return EmployeeContext.getCurrentMust().getTenant();
    }

    protected PSDCRegistryRepoDTO getPSDCRegistryRepo(String strPSDCRegistryRepoId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDCRegistryItemDTO.class, strPSDCRegistryRepoId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDCRegistryRepoDTO)((Object)item);
        }
        PSDCRegistryRepoDTO psDCRegistryRepoDTO = (PSDCRegistryRepoDTO)this.iPSDCRegistryRepoService.get(strPSDCRegistryRepoId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDCRegistryRepoDTO);
        }
        return psDCRegistryRepoDTO;
    }

    protected PSDCRegistryItemDTO getPSDCRegistryItem(String strPSDCRegistryItemId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDCRegistryItemDTO.class, strPSDCRegistryItemId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDCRegistryItemDTO)((Object)item);
        }
        PSDCRegistryItemDTO psDCRegistryItem = (PSDCRegistryItemDTO)this.iPSDCRegistryItemService.get(strPSDCRegistryItemId, false);
        String strConnStr = psDCRegistryItem.getConnStr();
        if (StringUtils.hasLength((String)strConnStr)) {
            if (actionSession != null) {
                actionSession.setActionParam(strCacheTag, (Object)psDCRegistryItem);
            }
            return psDCRegistryItem;
        }
        String strImageName = psDCRegistryItem.getPSDCRegistryItemName();
        String strPSDCRegistryRepoId = psDCRegistryItem.getPSDCRegistryRepoId();
        if (StringUtils.hasLength((String)strPSDCRegistryRepoId)) {
            String strUrl;
            Object item2;
            PSDCRegistryRepoDTO psDCRegistryRepo = null;
            String strCacheTag2 = String.format("CACHE_%s_%s", PSDCRegistryRepoDTO.class, strPSDCRegistryRepoId);
            if (actionSession != null && (item2 = actionSession.getActionParam(strCacheTag2)) != null) {
                psDCRegistryRepo = (PSDCRegistryRepoDTO)((Object)item2);
            }
            if (psDCRegistryRepo == null) {
                psDCRegistryRepo = (PSDCRegistryRepoDTO)this.iPSDCRegistryRepoService.get(strPSDCRegistryRepoId, false);
                if (actionSession != null) {
                    actionSession.setActionParam(strCacheTag2, (Object)psDCRegistryRepo);
                }
            }
            if (StringUtils.hasLength((String)(strUrl = psDCRegistryRepo.getConnStr())) && strUrl.indexOf(strImageName) == -1) {
                psDCRegistryItem.setConnStr(String.format("%s/%s", strUrl, strImageName));
            }
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDCRegistryItem);
        }
        return psDCRegistryItem;
    }

    protected PSDCMSPlatformDTO getPSDCMSPlatform(String strPSDCMSPlatformId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDCMSPlatformDTO.class, strPSDCMSPlatformId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDCMSPlatformDTO)((Object)item);
        }
        PSDCMSPlatformDTO psDCMSPlatformDTO = (PSDCMSPlatformDTO)this.iPSDCMSPlatformService.get(strPSDCMSPlatformId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDCMSPlatformDTO);
        }
        return psDCMSPlatformDTO;
    }

    protected PSDevSlnMSDeployDTO getPSDevSlnMSDeploy(String strPSDevSlnMSDeployId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnMSDeployDTO.class, strPSDevSlnMSDeployId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnMSDeployDTO)((Object)item);
        }
        PSDevSlnMSDeployDTO psDevSlnMSDeployDTO = (PSDevSlnMSDeployDTO)this.iPSDevSlnMSDeployService.get(strPSDevSlnMSDeployId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnMSDeployDTO);
        }
        return psDevSlnMSDeployDTO;
    }

    protected PSDevSlnMSDepAPIDTO getPSDevSlnMSDepAPI(String strPSDevSlnMSDepAPIId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnMSDepAPIDTO.class, strPSDevSlnMSDepAPIId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnMSDepAPIDTO)((Object)item);
        }
        PSDevSlnMSDepAPIDTO psDevSlnMSDepAPIDTO = (PSDevSlnMSDepAPIDTO)this.iPSDevSlnMSDepAPIService.get(strPSDevSlnMSDepAPIId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnMSDepAPIDTO);
        }
        return psDevSlnMSDepAPIDTO;
    }

    protected PSDevSlnMSDepAppDTO getPSDevSlnMSDepApp(String strPSDevSlnMSDepAppId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnMSDepAppDTO.class, strPSDevSlnMSDepAppId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnMSDepAppDTO)((Object)item);
        }
        PSDevSlnMSDepAppDTO psDevSlnMSDepAppDTO = (PSDevSlnMSDepAppDTO)this.iPSDevSlnMSDepAppService.get(strPSDevSlnMSDepAppId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnMSDepAppDTO);
        }
        return psDevSlnMSDepAppDTO;
    }

    protected PSDevSlnMSDepFuncDTO getPSDevSlnMSDepFunc(String strPSDevSlnMSDepFuncId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnMSDepFuncDTO.class, strPSDevSlnMSDepFuncId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnMSDepFuncDTO)((Object)item);
        }
        PSDevSlnMSDepFuncDTO psDevSlnMSDepFuncDTO = (PSDevSlnMSDepFuncDTO)this.iPSDevSlnMSDepFuncService.get(strPSDevSlnMSDepFuncId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnMSDepFuncDTO);
        }
        return psDevSlnMSDepFuncDTO;
    }

    protected PSDCClusterDTO getPSDCCluster(String strPSDCClusterId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDCClusterDTO.class, strPSDCClusterId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDCClusterDTO)((Object)item);
        }
        PSDCClusterDTO psDCClusterDTO = (PSDCClusterDTO)this.iPSDCClusterService.get(strPSDCClusterId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDCClusterDTO);
        }
        return psDCClusterDTO;
    }

    protected PSDevCenterSVNDTO getPSDevCenterSVN(String strPSDevCenterSVNId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevCenterSVNDTO.class, strPSDevCenterSVNId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevCenterSVNDTO)((Object)item);
        }
        PSDevCenterSVNDTO psDevCenterSVNDTO = (PSDevCenterSVNDTO)this.iPSDevCenterSVNService.get(strPSDevCenterSVNId, false);
        if (!StringUtils.hasLength((String)psDevCenterSVNDTO.getGitBranch())) {
            psDevCenterSVNDTO.setGitBranch("master");
        }
        if (!StringUtils.hasLength((String)psDevCenterSVNDTO.getGitPrj())) {
            String[] items;
            String strGitPrj;
            if (StringUtils.hasLength((String)psDevCenterSVNDTO.getGitPath()) && (strGitPrj = (items = psDevCenterSVNDTO.getGitPath().split("[/]"))[items.length - 1]).indexOf(".git") == strGitPrj.length() - 4) {
                strGitPrj = strGitPrj.substring(0, strGitPrj.length() - 4);
                psDevCenterSVNDTO.setGitPrj(strGitPrj);
            }
            if (!StringUtils.hasLength((String)psDevCenterSVNDTO.getGitPrj())) {
                psDevCenterSVNDTO.setGitPrj(psDevCenterSVNDTO.getPSDevCenterSVNId());
            }
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevCenterSVNDTO);
        }
        return psDevCenterSVNDTO;
    }

    protected PSGitUserDTO getPSGitUser(String strPSGitUserId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSGitUserDTO.class, strPSGitUserId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSGitUserDTO)((Object)item);
        }
        PSGitUserDTO psGitUserDTO = (PSGitUserDTO)this.iPSGitUserService.get(strPSGitUserId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psGitUserDTO);
        }
        return psGitUserDTO;
    }

    protected PSCredentialDTO getPSCredential(String strPSCredentialId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSCredentialDTO.class, strPSCredentialId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSCredentialDTO)((Object)item);
        }
        PSCredentialDTO psCredentialDTO = (PSCredentialDTO)this.iPSCredentialService.get(strPSCredentialId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psCredentialDTO);
        }
        return psCredentialDTO;
    }

    protected PSDCCodeSnippetDTO getPSDCCodeSnippet(String strPSDCCodeSnippetId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDCCodeSnippetDTO.class, strPSDCCodeSnippetId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDCCodeSnippetDTO)((Object)item);
        }
        PSDCCodeSnippetDTO psDCCodeSnippetDTO = (PSDCCodeSnippetDTO)this.iPSDCCodeSnippetService.get(strPSDCCodeSnippetId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDCCodeSnippetDTO);
        }
        return psDCCodeSnippetDTO;
    }

    protected PSDevSlnSysDTO getPSDevSlnSys(String strPSDevSlnSysId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnSysDTO.class, strPSDevSlnSysId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnSysDTO)((Object)item);
        }
        PSDevSlnSysDTO psDevSlnSysDTO = (PSDevSlnSysDTO)this.iPSDevSlnSysService.get(strPSDevSlnSysId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnSysDTO);
        }
        return psDevSlnSysDTO;
    }

    protected PSDevSlnDTO getPSDevSln(String strPSDevSlnId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnDTO.class, strPSDevSlnId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnDTO)((Object)item);
        }
        PSDevSlnDTO psDevSlnDTO = (PSDevSlnDTO)this.iPSDevSlnService.get(strPSDevSlnId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnDTO);
        }
        return psDevSlnDTO;
    }

    protected PSDevSlnSysAppDTO getPSDevSlnSysApp(String strPSDevSlnSysAppId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnSysAppDTO.class, strPSDevSlnSysAppId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnSysAppDTO)((Object)item);
        }
        PSDevSlnSysAppDTO psDevSlnSysAppDTO = (PSDevSlnSysAppDTO)this.iPSDevSlnSysAppService.get(strPSDevSlnSysAppId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnSysAppDTO);
        }
        return psDevSlnSysAppDTO;
    }

    protected PSDevSlnSysAPIDTO getPSDevSlnSysAPI(String strPSDevSlnSysAPIId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDevSlnSysAPIDTO.class, strPSDevSlnSysAPIId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDevSlnSysAPIDTO)((Object)item);
        }
        PSDevSlnSysAPIDTO psDevSlnSysAPIDTO = (PSDevSlnSysAPIDTO)this.iPSDevSlnSysAPIService.get(strPSDevSlnSysAPIId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDevSlnSysAPIDTO);
        }
        return psDevSlnSysAPIDTO;
    }

    protected PSDCMSPlatformNodeDTO getPSDCMSPlatformNode(String strPSDCMSPlatformNodeId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", PSDCMSPlatformNodeDTO.class, strPSDCMSPlatformNodeId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSDCMSPlatformNodeDTO)((Object)item);
        }
        PSDCMSPlatformNodeDTO psDCMSPlatformNodeDTO = (PSDCMSPlatformNodeDTO)this.iPSDCMSPlatformNodeService.get(strPSDCMSPlatformNodeId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psDCMSPlatformNodeDTO);
        }
        return psDCMSPlatformNodeDTO;
    }

    protected List<PSDCMSPlatformNodeDTO> getPSDCMSPlatformNodes(String strPSDCMSPlatformId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_LIST_%s_%s:%s", PSDCMSPlatformNodeDTO.class, "PSDCMSPLATFORMID", strPSDCMSPlatformId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (List)item;
        }
        SearchContextDTO psDCMSPlatformNodeFilterDTO = new SearchContextDTO();
        psDCMSPlatformNodeFilterDTO.eq("PSDCMSPLATFORMID", (Object)strPSDCMSPlatformId);
        psDCMSPlatformNodeFilterDTO.all().count(false);
        ArrayList<PSDCMSPlatformNodeDTO> list = new ArrayList<PSDCMSPlatformNodeDTO>();
        Page<PSDCMSPlatformNodeDTO> page = this.iPSDCMSPlatformNodeService.fetchDefault((ISearchContextDTO)psDCMSPlatformNodeFilterDTO);
        if (!ObjectUtils.isEmpty((Object)page.getContent())) {
            list.addAll(page.getContent());
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, list);
        }
        return list;
    }

    protected List<PSDevSlnPipelineStepDTO> getPSDevSlnPipelineSteps(String strPSDevSlnPipelineId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_LIST_%s_%s:%s", PSDevSlnPipelineStepDTO.class, "PSDEVSLNPIPELINEID", strPSDevSlnPipelineId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (List)item;
        }
        SearchContextDTO psDevSlnPipelineStepFilterDTO = new SearchContextDTO();
        psDevSlnPipelineStepFilterDTO.eq("PSDEVSLNPIPELINEID", (Object)strPSDevSlnPipelineId);
        psDevSlnPipelineStepFilterDTO.eq("VALIDFLAG", (Object)1);
        psDevSlnPipelineStepFilterDTO.all().count(false);
        ArrayList<PSDevSlnPipelineStepDTO> list = new ArrayList<PSDevSlnPipelineStepDTO>();
        Page<PSDevSlnPipelineStepDTO> page = this.iPSDevSlnPipelineStepService.fetchDefault((ISearchContextDTO)psDevSlnPipelineStepFilterDTO);
        if (!ObjectUtils.isEmpty((Object)page.getContent())) {
            list.addAll(page.getContent());
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, list);
        }
        return list;
    }

    protected void writeStringToFile(File file, String data, String charsetName) throws IOException {
        String strContent;
        if (file.exists() && StringUtils.hasLength((String)(strContent = FileUtils.readFileToString((File)file, (String)charsetName))) && strContent.equals(data)) {
            return;
        }
        FileUtils.writeStringToFile((File)file, (String)data, (String)charsetName, (boolean)false);
    }

    protected String getTemplateContent(String strTemplate, Map<String, Object> params) throws Exception {
        Template template = this.getSystemRuntime().getGroovyTemplate(strTemplate);
        StringWriter sw = new StringWriter();
        template.make(params).writeTo((Writer)sw);
        return sw.toString();
    }

    protected String getResourceContent(String strPath, String strDefault) {
        IPSSysContent iPSSysContent = this.getSystemRuntime().getResourcePSSysContent(strPath, true);
        if (iPSSysContent != null && StringUtils.hasLength((String)iPSSysContent.getContent())) {
            return iPSSysContent.getContent();
        }
        return strDefault;
    }

    protected void sendStudioConsole(boolean bDSConsoleOnly, int nLogLevel, String strInfo, boolean bCommit) {
        this.sendStudioConsole(bDSConsoleOnly, nLogLevel, strInfo, null, null, bCommit);
    }

    protected void sendStudioConsole(boolean bDSConsoleOnly, int nLogLevel, String strInfo, String strLogger, String strData, boolean bCommit) {
        if (!this.internalSendStudioConsole(bDSConsoleOnly, nLogLevel, strInfo, strLogger, strData, bCommit)) {
            // empty if block
        }
    }

    protected boolean internalSendStudioConsole(boolean bDSConsoleOnly, int nLogLevel, String strInfo, String strLogger, String strData, boolean bCommit) {
        return false;
    }

    protected ISysCloudLogUtilRuntime getSysCloudLogUtilRuntime() {
        return this.iSysCloudLogUtilRuntime;
    }
}
