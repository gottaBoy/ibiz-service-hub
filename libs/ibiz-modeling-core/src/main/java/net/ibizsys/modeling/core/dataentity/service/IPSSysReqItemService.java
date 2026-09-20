package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSREQITEM")
public interface IPSSysReqItemService
extends IPSModelDEService<PSSysReqItemDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_AIBUILD = "AIBUILD";
    public static final String ACTION_AIMARKCONFIRMED = "AIMARKCONFIRMED";
    public static final String ACTION_ASYNC_AIBUILD = "ASYNC_AIBUILD";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURMOD = "CURMOD";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURMOD = "CURMOD";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void aIBuild(PSSysReqItemDTO dto) throws Throwable;

    public void aIMarkConfirmed(PSSysReqItemDTO dto) throws Throwable;

    public Object asyncAIBuild(PSSysReqItemDTO dto) throws Throwable;

    public Page<PSSysReqItemDTO> fetchCurMod(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysReqItemDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysReqItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
