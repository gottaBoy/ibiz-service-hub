package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDEDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSSEARCHDE")
public interface IPSSysSearchDEService
extends IPSModelDEService<PSSysSearchDEDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_BUILDSEARCHDEFIELDS = "BUILDSEARCHDEFIELDS";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURSCHEME = "CURSCHEME";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURSCHEME = "CURSCHEME";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void buildSearchDEFields(PSSysSearchDEDTO dto) throws Throwable;

    public Page<PSSysSearchDEDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysSearchDEDTO> fetchCurScheme(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysSearchDEDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
