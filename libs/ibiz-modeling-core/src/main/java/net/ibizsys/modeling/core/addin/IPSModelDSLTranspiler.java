package net.ibizsys.modeling.core.addin;

import java.util.List;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModelDSLCompileSession;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IPSModelDSLTranspiler extends IModelRTAddin {

    int PRIORITY_PRIMARY = 50;
    int PRIORITY_DEFAULT = 100;

    default int getPriority() {
        return PRIORITY_DEFAULT;
    }

    IPSModelDSLNode createPSModelDSLNode(Object data, IPSModelDSLNode parent);

    void compilePSModelDSLNode(PSModelDSLCompileSession session, IPSModelDSLNode node);

    void prepareCompilePSModelDSLNode(PSModelDSLCompileSession session, IPSModelDSLNode node);

    void exportPSModelDSLNodes(PSModelDSLExportSession session, List<? extends IEntityDTO> entities);

    void prepareExportPSModelDSLNodes(PSModelDSLExportSession session,
                                      List<? extends IEntityDTO> entities);
}