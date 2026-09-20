package net.ibizsys.modeling.core.dataentity;

import java.util.List;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLResult;
import net.ibizsys.modeling.core.util.domain.CopyModelInput;
import net.ibizsys.modeling.core.util.domain.CopyModelResult;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLResult;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Input;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Result;
import net.ibizsys.modeling.core.util.domain.ImportModelV2Input;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLInput;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLResult;
import net.ibizsys.modeling.core.util.domain.PasteModelInput;
import org.springframework.data.domain.Page;

public interface IDataEntityRuntime
extends net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime {
    String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    String ACTION_INITMODEL = "INITMODEL";

    void initModel(IEntityDTO entity) throws Throwable;

    ExportModelV2Result exportModelV2(ExportModelV2Input input) throws Throwable;

    IEntityDTO importModelV2(ImportModelV2Input input) throws Throwable;

    CopyModelResult copyModel(CopyModelInput input) throws Throwable;

    IEntityDTO pasteModel(PasteModelInput input) throws Throwable;

    String getModelScope(IEntityDTO entity) throws Throwable;

    IPSDEField getModelTagPSDEField();

    List<IPSDER1NBase> getModelScopePSDER1Ns();

    boolean isNestedModel();

    IEntityDTO pasteEntity(IEntityDTO entity) throws Throwable;

    String getFullDataInfo(IEntityDTO entity) throws Throwable;

    String getRealIdByFullModelTag(String fullModelTag, boolean bTryMode) throws Throwable;

    String getFullModelTagByRealId(String realId) throws Throwable;

    String getFullModelTag(IEntityDTO entity) throws Throwable;

    String getModelTag(IEntityDTO entity) throws Throwable;

    CompileModelDSLResult compileModelDSL(CompileModelDSLInput input) throws Throwable;

    ExportModelDSLResult exportModelDSL(ExportModelDSLInput input) throws Throwable;

    String getModelDSLNodeName();

    String getRealIdByDSLUniqueId(String dslUniqueId, boolean bTryMode) throws Throwable;

    String getDSLUniqueIdByRealId(String realId) throws Throwable;

    String getDSLUniqueId(IEntityDTO entity) throws Throwable;

    MergeModelDSLResult mergeModelDSL(MergeModelDSLInput input) throws Throwable;

    Page<IEntityDTO> containsForeignKey2(IPSDEField field, Object value, IPSDERBase der, int fetchSize);

    String getDataInfo2(IEntityDTO entity) throws Throwable;
}