package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.dataentity.service.IPSModuleService;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class PSDELogicInitializer
extends PSModelInitializerBase {
    @Autowired
    private IPSDataEntityService iPSDataEntityService = null;
    @Autowired
    private IPSModuleService iPSModuleService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        boolean result = super.onPrepare(iEntityDTO, args, bDraftMode);
        PSDELogicDTO et = (PSDELogicDTO)iEntityDTO;
        if (ObjectUtils.isEmpty((Object)et.getPSSystemId())) {
            this.fillPSSystemId(et);
        }
        if (bDraftMode) {
            this.doInitPSDELogic(et);
        }
        return result;
    }

    protected void doInitPSDELogic(PSDELogicDTO et) throws Throwable {
        ArrayList<PSDELogicParamDTO> logicParamDTOList = new ArrayList<PSDELogicParamDTO>();
        ArrayList<PSDELogicNodeDTO> logicNodeDTOList = new ArrayList<PSDELogicNodeDTO>();
        if (DataTypeUtils.compare((String)et.getLogicType(), (String)PSModelEnums.LogicType.MAINSTATELOGIC.value, (boolean)true) != 0L && DataTypeUtils.compare((String)et.getLogicType(), (String)PSModelEnums.LogicType.DATAFLOWLOGIC.value, (boolean)true) != 0L) {
            PSDELogicNodeDTO psDELogicNode = new PSDELogicNodeDTO();
            psDELogicNode.setLogicNodeType(PSModelEnums.LogicNodeType.BEGIN.value);
            psDELogicNode.setPSDELogicNodeName("\u5f00\u59cb");
            psDELogicNode.setCodeName("Begin");
            psDELogicNode.setParallelOutput(1);
            psDELogicNode.setPSDELogicId(et.getPSDELogicId());
            psDELogicNode.setLeftPos(200);
            psDELogicNode.setTopPos(200);
            psDELogicNode.setPSSystemId(et.getPSSystemId());
            logicNodeDTOList.add(psDELogicNode);
        }
        if (DataTypeUtils.compare((String)et.getLogicType(), (String)PSModelEnums.LogicType.DATAFLOWLOGIC.value, (boolean)true) != 0L && DataTypeUtils.compare((String)et.getLogicType(), (String)PSModelEnums.LogicType.MAINSTATELOGIC.value, (boolean)true) != 0L) {
            PSDELogicParamDTO psDELogicParam = new PSDELogicParamDTO();
            psDELogicParam.setPSDELogicParamName("Default");
            psDELogicParam.setPSDELogicId(et.getPSDELogicId());
            if (DataTypeUtils.compare((String)et.getLogicType(), (String)PSModelEnums.LogicType.VIEWLOGIC.value, (boolean)true) != 0L) {
                psDELogicParam.setParamPSDEId(et.getPSDEId());
                psDELogicParam.setParamPSDEName(et.getPSDEName());
            }
            psDELogicParam.setLogicName("\u4f20\u5165\u53d8\u91cf");
            psDELogicParam.setPSSystemId(et.getPSSystemId());
            psDELogicParam.setDefaultParam(1);
            logicParamDTOList.add(psDELogicParam);
        }
        et.setPSDELogicNodes(logicNodeDTOList);
        et.setPSDELogicParams(logicParamDTOList);
    }

    protected void fillPSSystemId(PSDELogicDTO et) throws Throwable {
        IPSDevSysUser iPSDevSlnUser = this.getCurrentPSDevSysUser(false);
        String strPSSystemId = iPSDevSlnUser.getPSSystemId();
        et.setPSSystemId(strPSSystemId);
        if (StringUtils.hasLength((String)et.getPSSystemId())) {
            return;
        }
        if (!ObjectUtils.isEmpty((Object)et.getPSDEId())) {
            PSDataEntityDTO psDataEntityDTO = new PSDataEntityDTO();
            psDataEntityDTO.setPSDataEntityId(et.getPSDEId());
            if (!this.iPSDataEntityService.select(psDataEntityDTO, true)) {
                et.setPSSystemId(psDataEntityDTO.getPSSystemId());
                return;
            }
        }
        if (!ObjectUtils.isEmpty((Object)et.getPSModuleId())) {
            PSModuleDTO psModuleDTO = new PSModuleDTO();
            psModuleDTO.setPSModuleId(et.getPSModuleId());
            if (this.iPSModuleService.select(psModuleDTO, true)) {
                et.setPSSystemId(psModuleDTO.getPSSystemId());
                return;
            }
        }
    }
}
