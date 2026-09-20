package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNPIPELINE")
public interface IPSDevSlnPipelineService
extends IPSModelDEService<PSDevSlnPipelineDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_BUILD = "BUILD";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_INGORE = "INGORE";
    public static final String ACTION_PUBCONFIG = "PUBCONFIG";
    public static final String ACTION_PUBCONFIGANDBUILD = "PUBCONFIGANDBUILD";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_VIEWCONFIG = "VIEWCONFIG";
    public static final String DATAQUERY_CURSLN = "CURSLN";
    public static final String DATAQUERY_CURSLNNOTSYS = "CURSLNNOTSYS";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSMAJOR = "CURSYSMAJOR";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_CURSLNMAJORNOTSYS = "CURSLNMAJORNOTSYS";
    public static final String DATASET_CURSLNNOTSYS = "CURSLNNOTSYS";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSALL = "CURSYSALL";
    public static final String DATASET_CURSYSMAJOR = "CURSYSMAJOR";
    public static final String DATASET_CURSYSMAJORALL = "CURSYSMAJORALL";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void build(PSDevSlnPipelineDTO dto) throws Throwable;

    public void pubConfig(PSDevSlnPipelineDTO dto) throws Throwable;

    public void pubConfigAndBuild(PSDevSlnPipelineDTO dto) throws Throwable;

    public void viewConfig(PSDevSlnPipelineDTO dto) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSlnMajorNotSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSlnNotSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSysAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSysMajor(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchCurSysMajorAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnPipelineDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
