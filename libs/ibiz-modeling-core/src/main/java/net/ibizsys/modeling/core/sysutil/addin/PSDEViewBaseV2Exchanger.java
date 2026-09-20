package net.ibizsys.modeling.core.sysutil.addin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDEViewBaseService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysViewPanelService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelV2ExchangerBase;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Input;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Result;
import net.ibizsys.modeling.core.util.domain.ImportModelV2Input;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class PSDEViewBaseV2Exchanger
extends PSModelV2ExchangerBase {
    private static final Log log = LogFactory.getLog(PSDEViewBaseV2Exchanger.class);
    public static final String MODELFIELD_PSSYSVIEWPANEL = "pssysviewpanel";
    @Autowired
    private IPSSysViewPanelService iPSSysViewPanelService;
    @Autowired
    private IPSDEViewBaseService iPSDEViewBaseService;

    @Override
    protected boolean onPrepareExport(ExportModelV2Input exportModelV2Input, Object[] args) throws Throwable {
        return super.onPrepareExport(exportModelV2Input, args);
    }

    @Override
    protected boolean onFinishExport(ExportModelV2Input exportModelV2Input, ExportModelV2Result exportModelV2Result, Object[] args) throws Throwable {
        if (exportModelV2Result.getModel() != null && !exportModelV2Result.getModel().has(MODELFIELD_PSSYSVIEWPANEL)) {
            ISearchContextDTO iSearchContextDTO = this.iPSDEViewBaseService.createSearchContextDTO();
            iSearchContextDTO.all().count(false);
            iSearchContextDTO.eq("PSDEVIEWBASEID", (Object)exportModelV2Input.getKey());
            PSDEViewBaseDTO psdeViewBaseDTO = (PSDEViewBaseDTO)this.iPSDEViewBaseService.selectOne(iSearchContextDTO, true);
            if (psdeViewBaseDTO != null && StringUtils.hasLength((String) psdeViewBaseDTO.get("pssysviewpanelid"))) {
                ExportModelV2Input input = new ExportModelV2Input();
                input.set("PSSYSVIEWPANELID", psdeViewBaseDTO.get("pssysviewpanelid"));
                ExportModelV2Result result = this.iPSSysViewPanelService.exportModelV2(input);
                exportModelV2Result.getModel().set(MODELFIELD_PSSYSVIEWPANEL, (JsonNode)result.getModel());
            }
        }
        return super.onFinishExport(exportModelV2Input, exportModelV2Result, args);
    }

    @Override
    protected boolean onFinishImport(ImportModelV2Input importModelV2Input, IEntityDTO importEntity, Object[] args) throws Throwable {
        PSDEViewBaseDTO psdeViewBaseDTO = (PSDEViewBaseDTO)importEntity;
        if (importModelV2Input.getModel() != null && importModelV2Input.getModel().has(MODELFIELD_PSSYSVIEWPANEL)) {
            ObjectNode pssysviewpanelmodel = (ObjectNode)importModelV2Input.getModel().get(MODELFIELD_PSSYSVIEWPANEL);
            ISearchContextDTO iSearchContextDTO = this.iPSDEViewBaseService.createSearchContextDTO();
            iSearchContextDTO.all().count(false);
            iSearchContextDTO.eq("PSDEVIEWBASEID", (Object)psdeViewBaseDTO.getPSDEViewBaseId());
            PSDEViewBaseDTO psdeViewBaseDTO2 = (PSDEViewBaseDTO)this.iPSDEViewBaseService.selectOne(iSearchContextDTO, true);
            if (psdeViewBaseDTO2 != null
                    && StringUtils.hasLength((String) psdeViewBaseDTO2.get("pssysviewpanelid"))
                    && psdeViewBaseDTO2.get("layoutpanelmode") != null
                    && ((Integer) psdeViewBaseDTO2.get("layoutpanelmode")) == 2) {
                ImportModelV2Input input = new ImportModelV2Input();
                input.set("PSSYSVIEWPANELID", psdeViewBaseDTO2.get("pssysviewpanelid"));
                input.setModel(pssysviewpanelmodel);
                this.iPSSysViewPanelService.importModelV2(input);
            }
        }
        return super.onFinishImport(importModelV2Input, importEntity, args);
    }
}