package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSACHANDLER")
public interface IPSACHandlerService
extends IPSModelDEService<PSACHandlerDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DERANGE = "DERANGE";
    public static final String DATAQUERY_SYSRANGE = "SYSRANGE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_GRID = "GRID";
    public static final String DATASET_SYSANDDERANGE = "SYSANDDERANGE";

    public Page<PSACHandlerDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSACHandlerDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSACHandlerDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSACHandlerDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSACHandlerDTO> fetchGrid(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSACHandlerDTO> fetchSysAndDERange(ISearchContextDTO searchContext) throws Throwable;
}
