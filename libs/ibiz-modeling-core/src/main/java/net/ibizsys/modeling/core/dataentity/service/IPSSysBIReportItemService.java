package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIReportItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSBIREPORTITEM")
public interface IPSSysBIReportItemService
extends IPSModelDEService<PSSysBIReportItemDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_ROOT = "ROOT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_ROOT = "ROOT";

    public Page<PSSysBIReportItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysBIReportItemDTO> fetchRoot(ISearchContextDTO searchContext) throws Throwable;
}
