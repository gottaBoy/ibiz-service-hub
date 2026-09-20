package net.ibizsys.modeling.core.sysutil.addin;

import java.util.Date;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysRunSessionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemRunDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSSysAppService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysSFPubService;
import net.ibizsys.modeling.core.dataentity.service.IPSSystemDBCfgService;
import net.ibizsys.modeling.core.dataentity.service.IPSSystemRunService;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

public class PSSysRunSessionInitializer
extends PSModelInitializerBase {
    private static final Log log = LogFactory.getLog(PSSysRunSessionInitializer.class);
    @Autowired
    private IPSSystemRunService iPSSystemRunService = null;
    @Autowired
    private IPSSysAppService iPSSysAppService = null;
    @Autowired
    private IPSSysSFPubService iPSSysSFPubService = null;
    @Autowired
    private IPSSystemDBCfgService iPSSystemDBCfgService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        PSSysRunSessionDTO dto = (PSSysRunSessionDTO)iEntityDTO;
        IPSDevSysUser iPSDevSysUser = this.getCurrentPSDevSysUser(false);
        dto.setPSSystemId(iPSDevSysUser.getPSSystemId());
        if (bDraftMode) {
            boolean bDocMode = DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PUBDOC.value, (boolean)true) == 0L;
            PSSystemRunDTO psSystemRun = null;
            if (!bDocMode) {
                ISearchContextDTO iSearchContextDTO = this.iPSSystemRunService.createSearchContextDTO().all().count(false);
                iSearchContextDTO.eq("pssystemid", (Object)dto.getPSSystemId());
                List<PSSystemRunDTO> psSystemRunList = this.iPSSystemRunService.select(iSearchContextDTO);
                if (!ObjectUtils.isEmpty((Object)psSystemRunList)) {
                    for (PSSystemRunDTO psSystemRun2 : psSystemRunList) {
                        if (psSystemRun == null) {
                            psSystemRun = psSystemRun2;
                        }
                        if (!DataTypeUtils.asBoolean((Object)psSystemRun2.getDefaultFlag(), (Boolean)false).booleanValue()) continue;
                        psSystemRun = psSystemRun2;
                        break;
                    }
                }
            }
            if (psSystemRun != null) {
                if (DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PACKMOBAPP.value, (boolean)true) != 0L) {
                    dto.setPSSysAppId(psSystemRun.getPSSysAppId());
                    dto.setPSSysAppId2(psSystemRun.getPSSysAppId2());
                    dto.setPSSysAppName(psSystemRun.getPSSysAppName());
                    dto.setPSSysAppName2(psSystemRun.getPSSysAppName2());
                    dto.setPSSysSFPubId(psSystemRun.getPSSysSFPubId());
                    dto.setPSSysSFPubName(psSystemRun.getPSSysSFPubName());
                    dto.setPSSystemASId(psSystemRun.getPSSystemASId());
                    dto.setPSSystemASName(psSystemRun.getPSSystemASName());
                    dto.setPSSystemDBCfgId(psSystemRun.getPSSystemDBCfgId());
                    dto.setPSSystemDBCfgName(psSystemRun.getPSSystemDBCfgName());
                    dto.setRunPSSysDynaModelId(psSystemRun.getRunPSSysDynaModelId());
                    dto.setRunPSSysDynaModelName(psSystemRun.getRunPSSysDynaModelName());
                }
            } else {
                boolean bStartup;
                boolean bl = bStartup = DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.STARTX.value, (boolean)true) == 0L;
                if (!bDocMode) {
                    ISearchContextDTO psSysAppSearchContextDTO = this.iPSSysAppService.createSearchContextDTO().all().count(false);
                    psSysAppSearchContextDTO.eq("pssystemid", (Object)dto.getPSSystemId());
                    List<PSSysAppDTO> psSysAppList = this.iPSSysAppService.select(psSysAppSearchContextDTO);
                    if (!ObjectUtils.isEmpty((Object)psSysAppList)) {
                        PSSysAppDTO psSysApp = null;
                        for (PSSysAppDTO psSysApp2 : psSysAppList) {
                            if (psSysApp == null) {
                                psSysApp = psSysApp2;
                                continue;
                            }
                            if (!DataTypeUtils.asBoolean((Object)psSysApp2.get("defaultpub"), (Boolean)false).booleanValue()) continue;
                            psSysApp = psSysApp2;
                            break;
                        }
                        dto.setPSSysAppId(psSysApp.getPSSysAppId());
                        dto.setPSSysAppName(psSysApp.getPSSysAppName());
                    }
                }
                ISearchContextDTO psSysSFPubSearchContextDTO = this.iPSSysSFPubService.createSearchContextDTO().all().count(false);
                psSysSFPubSearchContextDTO.eq("pssystemid", (Object)dto.getPSSystemId());
                List<PSSysSFPubDTO> psSysSFPubList = this.iPSSysSFPubService.select(psSysSFPubSearchContextDTO);
                if (!ObjectUtils.isEmpty((Object)psSysSFPubList)) {
                    PSSysSFPubDTO psSysSFPub = null;
                    for (PSSysSFPubDTO psSysSFPub2 : psSysSFPubList) {
                        if (bDocMode && DataTypeUtils.compare((String)PSModelEnums.SFPubContentType.DOC.value, (String)psSysSFPub2.getContentType(), (boolean)false) != 0L) continue;
                        if (psSysSFPub == null) {
                            psSysSFPub = psSysSFPub2;
                            continue;
                        }
                        if (!DataTypeUtils.asBoolean((Object)psSysSFPub2.getDefaultPub(), (Boolean)false).booleanValue()) continue;
                        psSysSFPub = psSysSFPub2;
                        break;
                    }
                    if (psSysSFPub != null) {
                        dto.setPSSysSFPubId(psSysSFPub.getPSSysSFPubId());
                        dto.setPSSysSFPubName(psSysSFPub.getPSSysSFPubName());
                    }
                }
                if (!bDocMode) {
                    ISearchContextDTO psSystemDBCfgSearchContextDTO = this.iPSSystemDBCfgService.createSearchContextDTO().all().count(false);
                    psSystemDBCfgSearchContextDTO.eq("pssystemid", (Object)dto.getPSSystemId());
                    List<PSSystemDBCfgDTO> psSystemDBCfgList = this.iPSSystemDBCfgService.select(psSystemDBCfgSearchContextDTO);
                    if (!ObjectUtils.isEmpty((Object)psSysSFPubList)) {
                        PSSystemDBCfgDTO psSystemDBCfg = null;
                        for (PSSystemDBCfgDTO psSystemDBCfg2 : psSystemDBCfgList) {
                            if (bStartup && ObjectUtils.isEmpty((Object)psSystemDBCfg2.getPSDevCenterDBInstId())) continue;
                            if (psSystemDBCfg == null) {
                                psSystemDBCfg = psSystemDBCfg2;
                                continue;
                            }
                            if (!DataTypeUtils.asBoolean((Object)psSystemDBCfg2.getDefaultFlag(), (Boolean)false).booleanValue()) continue;
                            psSystemDBCfg = psSystemDBCfg2;
                            break;
                        }
                        if (psSystemDBCfg != null) {
                            dto.setPSSystemDBCfgId(psSystemDBCfg.getPSSystemDBCfgId());
                            dto.setPSSystemDBCfgName(psSystemDBCfg.getPSSystemDBCfgName());
                        }
                    }
                }
            }
        } else if (ObjectUtils.isEmpty((Object)dto.getPSSysRunSessionName())) {
            if (DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.STARTX.value, (boolean)true) == 0L) {
                dto.setPSSysRunSessionName(String.format("\u7cfb\u7edf\u8fd0\u884c[%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS]", new Date()));
            } else if (DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PUBCODE.value, (boolean)true) == 0L || DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PUBDOC.value, (boolean)true) == 0L || DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PUBMODEL.value, (boolean)true) == 0L) {
                dto.setPSSysRunSessionName(String.format("\u7cfb\u7edf\u53d1\u5e03[%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS]", new Date()));
            } else if (DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PACKVER.value, (boolean)true) == 0L) {
                dto.setPSSysRunSessionName(String.format("\u7cfb\u7edf\u7248\u672c\u6253\u5305[%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS]", new Date()));
                dto.setRunParam2(DataTypeUtils.asString((Object)dto.get("psdevslnsysvername")));
            } else if (DataTypeUtils.compare((String)dto.getRunMode(), (String)PSModelEnums.SysRunMode.PACKMOBAPP.value, (boolean)true) == 0L) {
                dto.setPSSysRunSessionName(String.format("\u79fb\u52a8\u5e94\u7528\u6253\u5305[%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS]", new Date()));
                dto.setRunParam2(DataTypeUtils.asString((Object)dto.get("psmobapppackname")));
            } else {
                dto.setPSSysRunSessionName(String.format("\u7cfb\u7edf\u8fd0\u884c[%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS]", new Date()));
            }
        }
        return super.onPrepare(iEntityDTO, args, bDraftMode);
    }
}
