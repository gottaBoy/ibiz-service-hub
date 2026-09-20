package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysServiceAPIDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSSERVICEAPI")
public interface IPSSysServiceAPIService
extends IPSModelDEService<PSSysServiceAPIDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_X_ADDSYNCCLIENTMODELTASK = "X_ADDSYNCCLIENTMODELTASK";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATESUBSYSFILE = "CREATESUBSYSFILE";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GENUNIQUETAG = "GENUNIQUETAG";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_REBUILDBYAPPDE = "REBUILDBYAPPDE";
    public static final String ACTION_REBUILDDESARS = "REBUILDDESARS";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void addSyncClientModelTask(PSSysServiceAPIDTO dto) throws Throwable;

    public void createSubSysFile(PSSysServiceAPIDTO dto) throws Throwable;

    public void genUniqueTag(PSSysServiceAPIDTO dto) throws Throwable;

    public void rebuildByAppDE(PSSysServiceAPIDTO dto) throws Throwable;

    public void rebuildDESARS(PSSysServiceAPIDTO dto) throws Throwable;

    public Page<PSSysServiceAPIDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysServiceAPIDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
