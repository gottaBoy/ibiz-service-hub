package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDEFieldDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSSEARCHDEFIELD")
public interface IPSSysSearchDEFieldService
extends IPSModelDEService<PSSysSearchDEFieldDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CALCSEARCHDE = "CALCSEARCHDE";
    public static final String ACTION_CALCSEARCHDOC = "CALCSEARCHDOC";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void calcSearchDE(PSSysSearchDEFieldDTO dto) throws Throwable;

    public void calcSearchDoc(PSSysSearchDEFieldDTO dto) throws Throwable;

    public Page<PSSysSearchDEFieldDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
