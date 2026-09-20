package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFStyleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSFSTYLE")
public interface IPSSFStyleService
extends IPSModelDEService<PSSFStyleDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDCDOC = "CURDCDOC";
    public static final String DATAQUERY_CURDCDOC2 = "CURDCDOC2";
    public static final String DATAQUERY_CURDCDOC3 = "CURDCDOC3";
    public static final String DATAQUERY_CURDCDOC4 = "CURDCDOC4";
    public static final String DATAQUERY_CURDCSF = "CURDCSF";
    public static final String DATAQUERY_CURDCSF2 = "CURDCSF2";
    public static final String DATAQUERY_CURDCSF3 = "CURDCSF3";
    public static final String DATAQUERY_CURDCSF4 = "CURDCSF4";
    public static final String DATAQUERY_CURSF = "CURSF";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDCDOCALL = "CURDCDOCALL";
    public static final String DATASET_CURDCSFALL = "CURDCSFALL";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSSFStyleDTO> fetchCurDCDocAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSFStyleDTO> fetchCurDCSFAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSFStyleDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
