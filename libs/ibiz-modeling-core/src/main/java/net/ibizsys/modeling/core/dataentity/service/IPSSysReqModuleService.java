package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqModuleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSREQMODULE")
public interface IPSSysReqModuleService
extends IPSModelDEService<PSSysReqModuleDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYS2 = "CURSYS2";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSSysReqModuleDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysReqModuleDTO> fetchCurSys2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysReqModuleDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
