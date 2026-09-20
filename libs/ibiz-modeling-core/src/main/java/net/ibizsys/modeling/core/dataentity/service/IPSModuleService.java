package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSMODULE")
public interface IPSModuleService
extends IPSModelDEService<PSModuleDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSNOTSUB = "CURSYSNOTSUB";
    public static final String DATAQUERY_CURSYSSUB = "CURSYSSUB";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSNOTSUB = "CURSYSNOTSUB";
    public static final String DATASET_CURSYSSUB = "CURSYSSUB";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSModuleDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSModuleDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSModuleDTO> fetchCurSysNotSub(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSModuleDTO> fetchCurSysSub(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSModuleDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
