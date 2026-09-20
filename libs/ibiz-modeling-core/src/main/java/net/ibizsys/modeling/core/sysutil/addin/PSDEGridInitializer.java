package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridColDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFieldService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEGridService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

public class PSDEGridInitializer
extends PSModelInitializerBase {
    @Autowired
    private IPSDEGridService iPSDEGridService = null;
    @Autowired
    private IPSDEFieldService iPSDEFieldService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        boolean result = super.onPrepare(iEntityDTO, args, bDraftMode);
        if (!bDraftMode) {
            return result;
        }
        PSDEGridDTO et = (PSDEGridDTO)iEntityDTO;
        this.doInitDefaultGrid(et);
        return result;
    }

    protected void doInitDefaultGrid(PSDEGridDTO et) throws Throwable {
        PSDEGridColDTO psDEGridCol;
        PSDEFieldDTO psDEField2;
        PSDEGridDTO psDEGrid2;
        String dataEntityId = et.getPSDEId();
        int nGridIndex = 1;
        String strCodeName = null;
        do {
            strCodeName = String.format("Main%1$s", nGridIndex == 1 ? "" : Integer.valueOf(nGridIndex));
            ++nGridIndex;
            psDEGrid2 = new PSDEGridDTO();
            psDEGrid2.setPSDEId(dataEntityId);
            psDEGrid2.setCodeName(strCodeName);
        } while (this.iPSDEGridService.select(psDEGrid2, true));
        et.setPSDEId(dataEntityId);
        et.setCodeName(strCodeName);
        et.setPSDEGridName("\u4e3b\u8868\u683c");
        et.setEnablePagingBar(1);
        et.setPagingSize(20);
        ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext();
        searchContextDTO.eq("PSDEID", (Object)dataEntityId).all();
        List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.select(searchContextDTO);
        HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
        PSDEFieldDTO majorPSDEField = null;
        if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
            for (PSDEFieldDTO psDEField : psDEFieldList) {
                psDEFieldMap.put(psDEField.getPSDEFieldName(), psDEField);
                if (!DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue()) continue;
                majorPSDEField = psDEField;
            }
        }
        ArrayList<PSDEGridColDTO> gridColDTOList = new ArrayList<PSDEGridColDTO>();
        if (majorPSDEField != null) {
            PSDEGridColDTO majordef = new PSDEGridColDTO();
            majordef.setPSDEGridColName(majorPSDEField.getPSDEFieldName().toLowerCase());
            majordef.setGridColType(PSModelEnums.GridColType.DEFGRIDCOLUMN.value);
            majordef.setOrderValue(1);
            majordef.setWidth(150);
            majordef.setPSDEFId(majorPSDEField.getPSDEFieldId());
            majordef.setPSDEFName(majorPSDEField.getPSDEFieldName());
            gridColDTOList.add(majordef);
        }
        if ((psDEField2 = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.UPDATEMAN.value))) != null) {
            psDEGridCol = new PSDEGridColDTO();
            psDEGridCol.setPSDEGridColName(psDEField2.getPSDEFieldName().toLowerCase());
            psDEGridCol.setGridColType(PSModelEnums.GridColType.DEFGRIDCOLUMN.value);
            psDEGridCol.setOrderValue(3);
            psDEGridCol.setWidth(150);
            psDEGridCol.setPSDEFId(psDEField2.getPSDEFieldId());
            psDEGridCol.setPSDEFName(psDEField2.getPSDEFieldName());
            gridColDTOList.add(psDEGridCol);
        }
        if ((psDEField2 = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.UPDATEDATE.value))) != null) {
            psDEGridCol = new PSDEGridColDTO();
            psDEGridCol.setPSDEGridColName(psDEField2.getPSDEFieldName().toLowerCase());
            psDEGridCol.setGridColType(PSModelEnums.GridColType.DEFGRIDCOLUMN.value);
            psDEGridCol.setOrderValue(4);
            psDEGridCol.setWidth(150);
            psDEGridCol.setPSDEFId(psDEField2.getPSDEFieldId());
            psDEGridCol.setPSDEFName(psDEField2.getPSDEFieldName());
            gridColDTOList.add(psDEGridCol);
        }
        et.setPSDEGridCols(gridColDTOList);
    }
}
