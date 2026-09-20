package net.ibizsys.modeling.core.sysutil.addin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBTableDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSSysDBTableService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelV2ExchangerBase;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Input;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Result;
import net.ibizsys.modeling.core.util.domain.ImportModelV2Input;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

public class PSSysDBSchemeV2Exchanger
extends PSModelV2ExchangerBase {
    private static final Log log = LogFactory.getLog(PSSysDBSchemeV2Exchanger.class);
    public static final String MODELFIELD_PSSYSDBTABLES = "pssysdbtables";
    @Autowired
    private IPSSysDBTableService iPSSysDBTableService;

    @Override
    protected boolean onPrepareExport(ExportModelV2Input exportModelV2Input, Object[] args) throws Throwable {
        return super.onPrepareExport(exportModelV2Input, args);
    }

    @Override
    protected boolean onFinishExport(ExportModelV2Input exportModelV2Input, ExportModelV2Result exportModelV2Result, Object[] args) throws Throwable {
        if (exportModelV2Result.getModel() != null && !exportModelV2Result.getModel().has(MODELFIELD_PSSYSDBTABLES)) {
            ISearchContextDTO iSearchContextDTO = this.iPSSysDBTableService.createSearchContextDTO();
            iSearchContextDTO.all().count(false);
            iSearchContextDTO.eq("PSSYSDBSCHEMEID", (Object)exportModelV2Input.getKey());
            List<PSSysDBTableDTO> list = this.iPSSysDBTableService.select(iSearchContextDTO);
            if (!ObjectUtils.isEmpty((Object)list)) {
                ArrayNode pssysdbtables = exportModelV2Result.getModel().putArray(MODELFIELD_PSSYSDBTABLES);
                for (PSSysDBTableDTO psSysDBTableDTO : list) {
                    ExportModelV2Input input = new ExportModelV2Input();
                    input.set("PSSYSDBTABLEID", psSysDBTableDTO.getId());
                    ExportModelV2Result result = this.iPSSysDBTableService.exportModelV2(input);
                    result.getModel().put("PSSYSDBSCHEMEID".toLowerCase(), String.format("<%1$s>", "PSSYSDBSCHEME"));
                    pssysdbtables.add((JsonNode)result.getModel());
                }
            }
        }
        return super.onFinishExport(exportModelV2Input, exportModelV2Result, args);
    }

    @Override
    protected boolean onFinishImport(ImportModelV2Input importModelV2Input, IEntityDTO importEntity, Object[] args) throws Throwable {
        PSSysDBSchemeDTO psSysDBSchemeDTO = (PSSysDBSchemeDTO)importEntity;
        if (importModelV2Input.getModel() != null && importModelV2Input.getModel().has(MODELFIELD_PSSYSDBTABLES)) {
            ArrayNode pssysdbtables = (ArrayNode)importModelV2Input.getModel().get(MODELFIELD_PSSYSDBTABLES);
            for (int i = 0; i < pssysdbtables.size(); ++i) {
                ObjectNode pssysdbtableModel = (ObjectNode)pssysdbtables.get(i);
                ImportModelV2Input input = new ImportModelV2Input();
                input.setModelScope(String.format("%1$s#%2$s", "PSSYSDBSCHEME", psSysDBSchemeDTO.getPSSysDBSchemeId()));
                pssysdbtableModel.put("PSSYSDBSCHEMEID".toLowerCase(), String.format("<%1$s>", "PSSYSDBSCHEME"));
                input.setModel(pssysdbtableModel);
                this.iPSSysDBTableService.importModelV2(input);
            }
        }
        return super.onFinishImport(importModelV2Input, importEntity, args);
    }
}