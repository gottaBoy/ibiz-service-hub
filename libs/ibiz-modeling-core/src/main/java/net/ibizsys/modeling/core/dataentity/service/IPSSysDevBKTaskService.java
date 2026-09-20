package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDevBKTaskDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSDEVBKTASK")
public interface IPSSysDevBKTaskService
extends IPSModelDEService<PSSysDevBKTaskDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_X_CANCELTASK = "X_CANCELTASK";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYSFINISH = "CURSYSFINISH";
    public static final String DATAQUERY_CURSYSRUN = "CURSYSRUN";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYSFINISH = "CURSYSFINISH";
    public static final String DATASET_CURSYSRUN = "CURSYSRUN";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void cancelTask(PSSysDevBKTaskDTO dto) throws Throwable;

    public Page<PSSysDevBKTaskDTO> fetchCurSysFinish(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysDevBKTaskDTO> fetchCurSysRun(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysDevBKTaskDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
