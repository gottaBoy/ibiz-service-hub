package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchFieldDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSSEARCHFIELD")
public interface IPSSysSearchFieldService
extends IPSModelDEService<PSSysSearchFieldDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDOC = "CURDOC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_CURDOC = "CURDOC";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSSysSearchFieldDTO> fetchCurDoc(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysSearchFieldDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
