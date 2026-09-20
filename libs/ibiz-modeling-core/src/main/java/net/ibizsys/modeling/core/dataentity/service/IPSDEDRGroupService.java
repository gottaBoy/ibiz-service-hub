package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRGroupDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEDRGROUP")
public interface IPSDEDRGroupService
extends IPSModelDEService<PSDEDRGroupDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSDEDRGroupDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDRGroupDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
