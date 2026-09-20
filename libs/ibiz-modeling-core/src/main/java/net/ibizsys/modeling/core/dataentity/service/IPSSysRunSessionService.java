package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysRunSessionDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSRUNSESSION")
public interface IPSSysRunSessionService
extends IPSModelDEService<PSSysRunSessionDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_GOTORUNSYS_MSAPP = "GOTORUNSYS_MSAPP";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_X_STARTEX = "X_STARTEX";
    public static final String DATAQUERY_CURSYSACTIVE = "CURSYSACTIVE";
    public static final String DATAQUERY_CURSYSFINISHED = "CURSYSFINISHED";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYSACTIVE = "CURSYSACTIVE";
    public static final String DATASET_CURSYSFINISHED = "CURSYSFINISHED";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_MODELINGACTIVITY = "MODELINGACTIVITY";

    public void startEx(PSSysRunSessionDTO dto) throws Throwable;

    public Page<PSSysRunSessionDTO> fetchCurSysActive(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysRunSessionDTO> fetchCurSysFinished(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysRunSessionDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysRunSessionDTO> fetchModelingActivity(ISearchContextDTO searchContext) throws Throwable;
}
