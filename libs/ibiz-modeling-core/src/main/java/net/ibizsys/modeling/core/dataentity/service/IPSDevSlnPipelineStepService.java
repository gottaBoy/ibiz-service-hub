package net.ibizsys.modeling.core.dataentity.service;

import java.util.List;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineStepDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNPIPELINESTEP")
public interface IPSDevSlnPipelineStepService
extends IPSModelDEService<PSDevSlnPipelineStepDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_MOVEORDER = "MOVEORDER";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATECUSTOMCODE = "UPDATECUSTOMCODE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";
    public static final String DATASET_VIEW = "VIEW";

    public List<PSDevSlnPipelineStepDTO> moveOrder(PSDevSlnPipelineStepDTO dto) throws Throwable;

    public Page<PSDevSlnPipelineStepDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineStepDTO> fetchView(ISearchContextDTO searchContext) throws Throwable;
}
