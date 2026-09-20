package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEACTION")
public interface IPSDEActionService
extends IPSModelDEService<PSDEActionDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHANGELOGIC = "CHANGELOGIC";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSNOTSUBSYS = "CURSYSNOTSUBSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSNOTSUBSYS = "CURSYSNOTSUBSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSDEActionDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEActionDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEActionDTO> fetchCurSysNotSubSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEActionDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
