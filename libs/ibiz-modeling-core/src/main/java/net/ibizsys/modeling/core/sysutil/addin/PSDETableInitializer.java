package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBTableDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysDBSchemeService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysDBTableService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class PSDETableInitializer
extends PSModelInitializerBase {
    @Autowired
    private IPSDataEntityService iPSDataEntityService = null;
    @Autowired
    private IPSSysDBSchemeService iPSSysDBSchemeService = null;
    @Autowired
    private IPSSysDBTableService iPSSysDBTableService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        boolean result = super.onPrepare(iEntityDTO, args, bDraftMode);
        if (bDraftMode) {
            return result;
        }
        PSDEDBTableDTO et = (PSDEDBTableDTO)iEntityDTO;
        PSDataEntityDTO dataEntityDTO = this.getPSDataEntity(et);
        if (ObjectUtils.isEmpty((Object)et.getPSSysDBTableId()) && dataEntityDTO != null) {
            String strDSLink = dataEntityDTO.getDSLink();
            if (!StringUtils.hasLength((String)strDSLink)) {
                strDSLink = "DEFAULT";
            }
            PSSysDBSchemeDTO psSysDBScheme = new PSSysDBSchemeDTO();
            psSysDBScheme.setPSSystemId(dataEntityDTO.getPSSystemId());
            psSysDBScheme.setDSLink(strDSLink);
            if (this.iPSSysDBSchemeService.select(psSysDBScheme, true)) {
                PSSysDBTableDTO psSysDBTable = new PSSysDBTableDTO();
                psSysDBTable.setPSSysDBTableName(et.getPSDETableName());
                psSysDBTable.setPSSysDBSchemeId(psSysDBScheme.getPSSysDBSchemeId());
                if (this.iPSSysDBTableService.select(psSysDBTable, true)) {
                    et.setPSSysDBTableId(psSysDBTable.getPSSysDBTableId());
                    et.setPSSysDBTableName(psSysDBTable.getPSSysDBTableName());
                }
            }
        }
        return result;
    }

    private PSDataEntityDTO getPSDataEntity(PSDEDBTableDTO et) throws Throwable {
        if (ObjectUtils.isEmpty((Object)et.getPSDEId())) {
            return null;
        }
        PSDataEntityDTO dataEntityDTO = new PSDataEntityDTO();
        dataEntityDTO.setPSDataEntityId(et.getPSDEId());
        return this.iPSDataEntityService.select(dataEntityDTO, true) ? dataEntityDTO : null;
    }
}
