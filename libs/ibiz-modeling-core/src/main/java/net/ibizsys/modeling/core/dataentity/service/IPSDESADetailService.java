package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESADetailDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDESADETAIL")
public interface IPSDESADetailService
extends IPSModelDEService<PSDESADetailDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CALCREQUESTMETHOD = "CALCREQUESTMETHOD";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETDEID = "GETDEID";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPI = "CURAPI";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPI = "CURAPI";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void calcRequestMethod(PSDESADetailDTO dto) throws Throwable;

    public Page<PSDESADetailDTO> fetchCurAPI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDESADetailDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
