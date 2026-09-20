package net.ibizsys.modeling.core.sysutil.addin;

import net.ibizsys.modeling.core.dataentity.dto.PSDELogicNodeDTO;
import net.ibizsys.modeling.core.sysutil.addin.PSModelDSLTranspilerBase;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;

public class PSDELogicNodeDSLTranspiler
extends PSModelDSLTranspilerBase {
    @Override
    protected IPSModelDSLNode onCreatePSModelDSLNode(Object data, IPSModelDSLNode parent) throws Throwable {
        if (parent != null && "PSDELOGICNODE".equalsIgnoreCase(parent.getNodeName())) {
            PSDELogicNodeDTO psDELogicNode = (PSDELogicNodeDTO)this.getEntityDTO(data);
            if ("BEGIN".equals(psDELogicNode.getLogicNodeType())) {
                return null;
            }
            psDELogicNode.set("_dslpid", ((PSDELogicNodeDTO)parent.getReal()).getCodeName());
            return super.onCreatePSModelDSLNode((Object)psDELogicNode, parent.getParent());
        }
        return super.onCreatePSModelDSLNode(data, parent);
    }
}
