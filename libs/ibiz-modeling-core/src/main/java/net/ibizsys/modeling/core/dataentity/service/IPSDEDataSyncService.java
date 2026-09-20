package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSyncDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEDATASYNC")
public interface IPSDEDataSyncService
extends IPSModelDEService<PSDEDataSyncDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURDEIN = "CURDEIN";
    public static final String DATAQUERY_CURDEOUT = "CURDEOUT";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURDEIN = "CURDEIN";
    public static final String DATASET_CURDEOUT = "CURDEOUT";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSDEDataSyncDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDataSyncDTO> fetchCurDEIn(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDataSyncDTO> fetchCurDEOut(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDataSyncDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
