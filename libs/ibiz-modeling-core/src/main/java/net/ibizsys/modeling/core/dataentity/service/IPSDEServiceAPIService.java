package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEServiceAPIDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDESERVICEAPI")
public interface IPSDEServiceAPIService
extends IPSModelDEService<PSDEServiceAPIDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEEX = "CREATEEX";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_REBUILDDETAILS = "REBUILDDETAILS";
    public static final String ACTION_BATADDDATAENTITIES = "BATADDDATAENTITIES";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURSYSAPI = "CURSYSAPI";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURSYSAPI = "CURSYSAPI";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void createEx(PSDEServiceAPIDTO dto) throws Throwable;

    public void rebuildDetails(PSDEServiceAPIDTO dto) throws Throwable;

    public Page<PSDEServiceAPIDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEServiceAPIDTO> fetchCurSysAPI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEServiceAPIDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
