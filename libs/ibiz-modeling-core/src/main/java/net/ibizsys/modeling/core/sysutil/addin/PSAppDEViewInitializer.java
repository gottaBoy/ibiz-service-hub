package net.ibizsys.modeling.core.sysutil.addin;

import java.util.List;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDEViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSAppModuleService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEViewBaseService;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;

public class PSAppDEViewInitializer
extends PSModelInitializerBase {
    private static final Log log = LogFactory.getLog(PSAppDEViewInitializer.class);
    @Autowired
    private IPSDEViewBaseService iPSDEViewBaseService = null;
    @Autowired
    private IPSDataEntityService iPSDataEntityService = null;
    @Autowired
    private IPSAppModuleService iPSAppModuleService = null;
    @Qualifier(value="PSAPPLOCALDE")
    private IDataEntityRuntime iPSAppDataEntityRuntime = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        if (bDraftMode) {
            return super.onPrepare(iEntityDTO, args, bDraftMode);
        }
        PSAppDEViewDTO dto = (PSAppDEViewDTO)iEntityDTO;
        if (!StringUtils.hasLength((String)dto.getPSDEViewBaseId())) {
            throw new Exception("\u6ca1\u6709\u6307\u5b9a\u5b9e\u4f53\u89c6\u56fe");
        }
        PSDEViewBaseDTO psDEViewBaseDTO = new PSDEViewBaseDTO();
        psDEViewBaseDTO.setPSDEViewBaseId(dto.getPSDEViewBaseId());
        if (!this.iPSDEViewBaseService.select(psDEViewBaseDTO, true)) {
            throw new Exception(String.format("\u6307\u5b9a\u5b9e\u4f53\u89c6\u56fe[%1$s]\u4e0d\u5b58\u5728", dto.getPSDEViewBaseId()));
        }
        PSDataEntityDTO psDataEntityDTO = new PSDataEntityDTO();
        psDataEntityDTO.setPSDataEntityId(psDEViewBaseDTO.getPSDEId());
        if (!this.iPSDataEntityService.select(psDataEntityDTO, true)) {
            throw new Exception(String.format("\u6307\u5b9a\u5b9e\u4f53[%1$s]\u4e0d\u5b58\u5728", psDEViewBaseDTO.getPSDEId()));
        }
        if (!StringUtils.hasLength((String)dto.getPSAppDEViewName())) {
            String strCodeName = psDataEntityDTO.getCodeName() + psDEViewBaseDTO.getCodeName();
            dto.setPSAppDEViewName(strCodeName);
        }
        if (!StringUtils.hasLength((String)dto.getPSAppModuleId())) {
            ISearchContextDTO psAppModuleSearchContextDTO = this.iPSAppModuleService.createSearchContextDTO();
            psAppModuleSearchContextDTO.eq("PSSYSAPPID", (Object)dto.getPSSysAppId());
            psAppModuleSearchContextDTO.limit(1000);
            List<PSAppModuleDTO> psAppModuleDTOList = this.iPSAppModuleService.fetchDefault(psAppModuleSearchContextDTO).getContent();
            PSAppModuleDTO psAppModuleDTO = null;
            if (psAppModuleDTOList != null) {
                for (PSAppModuleDTO item : psAppModuleDTOList) {
                    if (psAppModuleDTO == null) {
                        psAppModuleDTO = item;
                        continue;
                    }
                    if (DataTypeUtils.getIntegerValue((Object)item.get("defaultflag"), (Integer)0) != 1) continue;
                    psAppModuleDTO = item;
                }
            }
            if (psAppModuleDTO == null) {
                throw new Exception(String.format("\u5e94\u7528[%1$s]\u672a\u6dfb\u52a0\u6a21\u5757", dto.getPSSysAppId()));
            }
            dto.setPSAppModuleId(psAppModuleDTO.getPSAppModuleId());
            dto.setPSAppModuleName(psAppModuleDTO.getPSAppModuleName());
        }
        if (!StringUtils.hasLength((String)dto.getPSAppLocalDEId())) {
            ISearchContextDTO psAppDataEntitysearchContextDTO = this.iPSAppDataEntityRuntime.createSearchContext();
            psAppDataEntitysearchContextDTO.eq("PSSYSAPPID", (Object)dto.getPSSysAppId()).eq("PSDEID", (Object)psDEViewBaseDTO.getPSDEId());
            psAppDataEntitysearchContextDTO.limit(1000);
            List<? extends IEntityDTO> psAppLocalDEDTOList = this.iPSAppDataEntityRuntime.select(psAppDataEntitysearchContextDTO);
            PSAppDataEntityDTO psAppDataEntityDTO = null;
            if (psAppLocalDEDTOList != null) {
                for (IEntityDTO item : psAppLocalDEDTOList) {
                    if (psAppDataEntityDTO == null) {
                        psAppDataEntityDTO = (PSAppDataEntityDTO)((Object)item);
                        continue;
                    }
                    if (DataTypeUtils.getIntegerValue((Object)((PSAppDataEntityDTO)((Object)item)).getDefaultFlag(), (Integer)1) != 1) continue;
                    psAppDataEntityDTO = (PSAppDataEntityDTO)((Object)item);
                }
            }
            if (psAppDataEntityDTO == null) {
                psAppDataEntityDTO = new PSAppDataEntityDTO();
                psAppDataEntityDTO.setPSDEId(psDEViewBaseDTO.getPSDEId());
                psAppDataEntityDTO.setPSDEName((String)psDEViewBaseDTO.get("psdename"));
                psAppDataEntityDTO.setPSAppLocalDEName((String)psDEViewBaseDTO.get("psdename"));
                psAppDataEntityDTO.setPSSysAppId(dto.getPSSysAppId());
                this.iPSAppDataEntityRuntime.create(psAppDataEntityDTO);
            }
            if (psAppDataEntityDTO != null) {
                dto.setPSAppLocalDEId(psAppDataEntityDTO.getPSAppLocalDEId());
                dto.setPSAppLocalDEName(psAppDataEntityDTO.getPSAppLocalDEName());
            }
        }
        return super.onPrepare(iEntityDTO, args, bDraftMode);
    }
}
