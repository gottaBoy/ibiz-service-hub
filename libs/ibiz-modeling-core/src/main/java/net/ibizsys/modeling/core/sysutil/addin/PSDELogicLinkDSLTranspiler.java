package net.ibizsys.modeling.core.sysutil.addin;

import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicLinkDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicNodeDTO;
import net.ibizsys.modeling.core.sysutil.addin.PSModelDSLTranspilerBase;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModelDSLCompileSession;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import org.springframework.util.StringUtils;

public class PSDELogicLinkDSLTranspiler
extends PSModelDSLTranspilerBase {
    @Override
    protected IPSModelDSLNode onCreatePSModelDSLNode(Object data, IPSModelDSLNode parent) throws Throwable {
        if (parent != null && "PSDELOGICNODE".equalsIgnoreCase(parent.getNodeName())) {
            PSDELogicLinkDTO psDELogicLink = (PSDELogicLinkDTO)this.getEntityDTO(data);
            psDELogicLink.set("_dslpid", ((PSDELogicNodeDTO)parent.getReal()).getCodeName());
            return super.onCreatePSModelDSLNode((Object)psDELogicLink, parent.getParent());
        }
        return super.onCreatePSModelDSLNode(data, parent);
    }

    @Override
    protected void onCompilePSModelDSLNode(PSModelDSLCompileSession psModelDSLCompileSession, IPSModelDSLNode iPSModelDSLNode) throws Throwable {
        PSDELogicLinkDTO psDELogicLink = (PSDELogicLinkDTO)iPSModelDSLNode.getReal();
        if (!psDELogicLink.isDefaultLinkDirty()) {
            psDELogicLink.setDefaultLink(0);
        }
        if (!StringUtils.hasLength((String)psDELogicLink.getPSDELogicLinkName())) {
            psDELogicLink.setPSDELogicLinkName("\u8fde\u63a5");
        }
        super.onCompilePSModelDSLNode(psModelDSLCompileSession, iPSModelDSLNode);
    }

    @Override
    protected void onExportPSModelDSLNodes(PSModelDSLExportSession psModelDSLExportSession, List<? extends IEntityDTO> list) throws Throwable {
        super.onExportPSModelDSLNodes(psModelDSLExportSession, list);
    }
}
