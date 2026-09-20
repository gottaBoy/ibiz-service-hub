package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBTableDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDETABLE")
public interface IPSDEDBTableService
extends IPSModelDEService<PSDEDBTableDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SYNCDEFIELDS = "SYNCDEFIELDS";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void syncDEFields(PSDEDBTableDTO dto) throws Throwable;

    public Page<PSDEDBTableDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDBTableDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDBTableDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
