package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUIActionDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEUIACTION")
public interface IPSDEUIActionService
extends IPSModelDEService<PSDEUIActionDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEDEUAGROUP = "CREATEDEUAGROUP";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSDE = "CURSYSDE";
    public static final String DATAQUERY_CURSYSNOWF = "CURSYSNOWF";
    public static final String DATAQUERY_CURSYSWF = "CURSYSWF";
    public static final String DATAQUERY_DECODENAMECNT = "DECODENAMECNT";
    public static final String DATAQUERY_DERANGE = "DERANGE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SYSRANGE = "SYSRANGE";
    public static final String DATAQUERY_SYSRANGE2 = "SYSRANGE2";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSDE = "CURSYSDE";
    public static final String DATASET_CURSYSNOWF = "CURSYSNOWF";
    public static final String DATASET_CURSYSWF = "CURSYSWF";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_SYSANDDERANGE = "SYSANDDERANGE";

    public void createDEUAGroup(PSDEUIActionDTO dto) throws Throwable;

    public Page<PSDEUIActionDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEUIActionDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEUIActionDTO> fetchCurSysDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEUIActionDTO> fetchCurSysNoWF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEUIActionDTO> fetchCurSysWF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEUIActionDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEUIActionDTO> fetchSysAndDERange(ISearchContextDTO searchContext) throws Throwable;
}
