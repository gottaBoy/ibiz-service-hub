package net.ibizsys.modeling.core.sysutil;

import java.util.List;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.addin.IPSModelCloner;
import net.ibizsys.modeling.core.addin.IPSModelDSLTranspiler;
import net.ibizsys.modeling.core.addin.IPSModelInitializer;
import net.ibizsys.modeling.core.addin.IPSModelV2Exchanger;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModelDSLCompileSession;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Enhanced modeling system utility runtime.
 *
 * <p>Provides model-level operations such as DSL export, compilation,
 * cloning, and V2 exchange. Each model type can register addins for
 * custom behavior.</p>
 */
@Qualifier("MODELENHANCERUTIL")
public interface IModelEnhancerSysUtilRuntime extends ISysUtilRuntime {

    String ADDIN_INITIALIZER_PREFIX = "INITIALIZER:";
    String ADDIN_V2EXCHANGER_PREFIX = "V2EXCHANGER:";
    String ADDIN_DSLTRANSPILER_PREFIX = "DSLTRANSPILER:";
    String ADDIN_CLONER_PREFIX = "CLONER:";

    // ---- initializer ----

    void preparePSModel(String modelType, Object[] args, int stage);

    void initializePSModel(String modelType, Object[] args);

    boolean containsPSModelInitializer(String modelType);

    void registerPSModelInitializer(String modelType, IPSModelInitializer addin);

    boolean unregisterPSModelInitializer(String modelType, IPSModelInitializer addin);

    // ---- V2 exchanger ----

    boolean containsPSModelV2Exchanger(String modelType);

    void registerPSModelV2Exchanger(String modelType, IPSModelV2Exchanger addin);

    boolean unregisterPSModelV2Exchanger(String modelType, IPSModelV2Exchanger addin);

    void prepareImportPSModelV2(String modelType, Object[] args);

    void finishImportPSModelV2(String modelType, Object[] args, Object result);

    void prepareExportPSModelV2(String modelType, Object[] args);

    void finishExportPSModelV2(String modelType, Object[] args, Object result);

    // ---- cloner ----

    boolean containsPSModelCloner(String modelType);

    void registerPSModelCloner(String modelType, IPSModelCloner addin);

    boolean unregisterPSModelCloner(String modelType, IPSModelCloner addin);

    Object copyPSModel(String modelType, Object[] args);

    Object pastePSModel(String modelType, Object[] args);

    // ---- DSL transpiler ----

    boolean containsPSModelDSLTranspiler(String modelType);

    void registerPSModelDSLTranspiler(String modelType, IPSModelDSLTranspiler addin);

    boolean unregisterPSModelDSLTranspiler(String modelType, IPSModelDSLTranspiler addin);

    Object compilePSModelDSL(String modelType, Object[] args);

    void compilePSModelDSLNode(String modelType, PSModelDSLCompileSession session,
                               IPSModelDSLNode node);

    void prepareCompilePSModelDSLNode(String modelType, PSModelDSLCompileSession session,
                                      IPSModelDSLNode node);

    Object exportPSModelDSL(String modelType, Object[] args);

    void exportPSModelDSLNodes(String modelType, PSModelDSLExportSession session,
                               List<? extends IEntityDTO> entities);

    void prepareExportPSModelDSLNodes(String modelType, PSModelDSLExportSession session,
                                      List<? extends IEntityDTO> entities);

    IPSModelDSLNode createPSModelDSLNode(String nodeName, Object attributes,
                                         IPSModelDSLNode parent);

    Object mergePSModelDSL(String modelType, Object[] args);
}