package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineStageDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNPIPELINESTAGE")
public interface IPSDevSlnPipelineStageService
extends IPSModelDEService<PSDevSlnPipelineStageDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURPIPELINE = "CURPIPELINE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURPIPELINE = "CURPIPELINE";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_VIEW = "VIEW";

    public Page<PSDevSlnPipelineStageDTO> fetchCurPipeline(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineStageDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineStageDTO> fetchView(ISearchContextDTO searchContext) throws Throwable;
}
