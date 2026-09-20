package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.sysutil.addin.PSModelDSLTranspilerBase;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.springframework.util.ObjectUtils;

public class PSDEDataQueryDSLTranspiler
extends PSModelDSLTranspilerBase {
    private IDataEntityRuntime psDEDQCodeDERuntime = null;

    @Override
    protected void onInit() throws Exception {
        this.psDEDQCodeDERuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime("PSDEDQCODE");
        super.onInit();
    }

    @Override
    protected void exportPSModelDSLNodes(PSModelDSLExportSession psModelDSLExportSession, IPSModelDSLNode iPSModelDSLNode, IEntityDTO iEntityDTO) throws Throwable {
        String strFieldName;
        Object data;
        PSDEDataQueryDTO psDEDataQuery = (PSDEDataQueryDTO)iEntityDTO;
        if (DataTypeUtils.asBoolean((Object)psDEDataQuery.getCustomMode(), (Boolean)false).booleanValue() && (data = iEntityDTO.get(strFieldName = "_" + Inflector.getInstance().pluralize((Object)this.psDEDQCodeDERuntime.getPSDataEntity().getCodeName()).toLowerCase())) == null) {
            ISearchContextDTO iSearchContextDTO = this.psDEDQCodeDERuntime.createSearchContext();
            iSearchContextDTO.all().count(false);
            iSearchContextDTO.eq("PSDEDQID", (Object)psDEDataQuery.getPSDEDataQueryId());
            List<? extends IEntityDTO> dtoList = this.psDEDQCodeDERuntime.rawSelect(iSearchContextDTO);
            if (!ObjectUtils.isEmpty((Object)dtoList)) {
                ArrayList<PSDEDQCodeDTO> list = new ArrayList<PSDEDQCodeDTO>();
                for (IEntityDTO item : dtoList) {
                    PSDEDQCodeDTO psDEDQCode = (PSDEDQCodeDTO)this.psDEDQCodeDERuntime.get(item.get(this.psDEDQCodeDERuntime.getKeyPSDEField().getLowerCaseName()));
                    list.add(psDEDQCode);
                }
                iEntityDTO.set(strFieldName, list);
            }
        }
        super.exportPSModelDSLNodes(psModelDSLExportSession, iPSModelDSLNode, iEntityDTO);
    }
}
