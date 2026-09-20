package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.List;
import net.ibizsys.central.cloud.core.addin.SysUtilRTAddinBase;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMTDEFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCMTDEFService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.dataentity.service.IPSModuleService;
import net.ibizsys.modeling.core.dataentity.service.IPSSystemService;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAppContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class ModelSysUtilRTAddinBase
extends SysUtilRTAddinBase {
    private static final Log log = LogFactory.getLog(ModelSysUtilRTAddinBase.class);
    @Autowired
    private IPSModuleService iPSModuleService = null;
    @Autowired
    private IPSSystemService iPSSystemService = null;
    @Autowired
    private IPSDCMTDEFService iPSDCMTDEFService = null;
    @Autowired
    private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
    @Autowired
    private IPSDevSlnSysService iPSDevSlnSysService = null;

    protected List<PSDCMTDEFDTO> getPSDCMTDEFDTOs(String strPSDCModelTemplId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_LIST_%s_%s:%s", PSDCMTDEFDTO.class, "PSDCMODELTEMPLID", strPSDCModelTemplId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (List)item;
        }
        SearchContextDTO psDCMTDEFFilterDTO = new SearchContextDTO();
        psDCMTDEFFilterDTO.eq("PSDCMODELTEMPLID", (Object)strPSDCModelTemplId);
        psDCMTDEFFilterDTO.all().count(false);
        ArrayList<PSDCMTDEFDTO> list = new ArrayList<PSDCMTDEFDTO>();
        Page<PSDCMTDEFDTO> page = this.iPSDCMTDEFService.fetchDefault((ISearchContextDTO)psDCMTDEFFilterDTO);
        if (!ObjectUtils.isEmpty((Object)page.getContent())) {
            list.addAll(page.getContent());
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, list);
        }
        return list;
    }

    protected PSModuleDTO getPSModuleDTO(String strPSModuleId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s_%s", this.getCurrentPSDevSlnSysId(), PSModuleDTO.class, strPSModuleId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSModuleDTO)((Object)item);
        }
        PSModuleDTO psModuleDTO = (PSModuleDTO)this.iPSModuleService.get(strPSModuleId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psModuleDTO);
        }
        return psModuleDTO;
    }

    protected PSSystemDTO getPSSystemDTO(String strPSSystemId) throws Throwable {
        Object item;
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s_%s", this.getCurrentPSDevSlnSysId(), PSSystemDTO.class, strPSSystemId);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSSystemDTO)((Object)item);
        }
        PSSystemDTO psSystemDTO = (PSSystemDTO)this.iPSSystemService.get(strPSSystemId, false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psSystemDTO);
        }
        return psSystemDTO;
    }

    protected PSSystemDTO getCurrentPSSystemDTO() throws Throwable {
        Object item;
        IPSDevSysUser iPSDevSysUser = this.getCurrentPSDevSysUser();
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s_%s", iPSDevSysUser.getPSDevSlnSysId(), PSSystemDTO.class, iPSDevSysUser.getPSSystemId());
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (PSSystemDTO)((Object)item);
        }
        PSSystemDTO psSystemDTO = (PSSystemDTO)this.iPSSystemService.get(iPSDevSysUser.getPSSystemId(), false);
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)psSystemDTO);
        }
        return psSystemDTO;
    }

    protected IPSDevSysUser getCurrentPSDevSysUser() throws Exception {
        return this.getCurrentPSDevSysUser(false);
    }

    protected IPSDevSysUser getCurrentPSDevSysUser(boolean bTryMode) throws Exception {
        Object item;
        IPSDevSysUser iPSDevSysUser = PSDevSysUserHolder.peek();
        if (iPSDevSysUser != null) {
            return iPSDevSysUser;
        }
        IAppContext iAppContext = ActionSessionManager.getAppContext();
        if (iAppContext == null) {
            if (bTryMode) {
                return null;
            }
            throw new Exception("\u5e94\u7528\u4e0a\u4e0b\u6587\u5bf9\u8c61\u65e0\u6548");
        }
        String strPSDevSlnSysId = (String)iAppContext.get("PSDEVSLNSYS");
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            if (bTryMode) {
                return null;
            }
            throw new Exception("\u672a\u4f20\u5165\u5f00\u53d1\u7cfb\u7edf\u6807\u8bc6");
        }
        ActionSession actionSession = ActionSessionManager.getCurrentSession();
        String strCacheTag = String.format("CACHE_%s_%s", strPSDevSlnSysId, IPSDevSysUser.class);
        if (actionSession != null && (item = actionSession.getActionParam(strCacheTag)) != null) {
            return (IPSDevSysUser)item;
        }
        iPSDevSysUser = (IPSDevSysUser)((ISystemAccessManager)this.getSystemRuntime().getSystemAccessManager()).getPSDevUserBase("SYS", strPSDevSlnSysId);
        if (iPSDevSysUser == null) {
            throw new Exception(String.format("\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5f00\u53d1\u7cfb\u7edf[%1$s]\u8bbf\u95ee\u7528\u6237\u5bf9\u8c61", strPSDevSlnSysId));
        }
        if (actionSession != null) {
            actionSession.setActionParam(strCacheTag, (Object)iPSDevSysUser);
        }
        return iPSDevSysUser;
    }

    protected String getCurrentPSDevSlnSysId() throws Exception {
        IPSDevSysUser iPSDevSysUser = PSDevSysUserHolder.peek();
        if (iPSDevSysUser != null) {
            return iPSDevSysUser.getPSDevSlnSysId();
        }
        IAppContext iAppContext = ActionSessionManager.getAppContext();
        if (iAppContext == null) {
            throw new Exception("\u5e94\u7528\u4e0a\u4e0b\u6587\u5bf9\u8c61\u65e0\u6548");
        }
        String strPSDevSlnSysId = (String)iAppContext.get("PSDEVSLNSYS");
        if (!StringUtils.hasLength((String)strPSDevSlnSysId)) {
            throw new Exception("\u672a\u4f20\u5165\u5f00\u53d1\u7cfb\u7edf\u6807\u8bc6");
        }
        return strPSDevSlnSysId;
    }

    protected PSDevSlnSysDTO getPSDevSlnSysDTO(String strPSDevSlnSysId) throws Throwable {
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
