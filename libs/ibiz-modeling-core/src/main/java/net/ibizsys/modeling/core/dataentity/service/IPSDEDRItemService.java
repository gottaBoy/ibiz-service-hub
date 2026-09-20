package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEDRITEM")
public interface IPSDEDRItemService
extends IPSModelDEService<PSDEDRItemDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CALCREFDEID = "CALCREFDEID";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURDEREF = "CURDEREF";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURDEREF = "CURDEREF";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";

    public void calcRefDEId(PSDEDRItemDTO dto) throws Throwable;

    public Page<PSDEDRItemDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDRItemDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDRItemDTO> fetchCurDERef(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDRItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDRItemDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;
}
