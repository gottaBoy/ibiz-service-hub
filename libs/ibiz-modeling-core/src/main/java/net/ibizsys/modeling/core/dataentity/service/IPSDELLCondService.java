package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELLCondDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDELLCOND")
public interface IPSDELLCondService
extends IPSModelDEService<PSDELLCondDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_CREATETEMP = "CREATETEMP";
    public static final String ACTION_CREATETEMPMAJOR = "CREATETEMPMAJOR";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_UPDATETEMP = "UPDATETEMP";
    public static final String ACTION_UPDATETEMPMAJOR = "UPDATETEMPMAJOR";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_REMOVETEMP = "REMOVETEMP";
    public static final String ACTION_REMOVETEMPMAJOR = "REMOVETEMPMAJOR";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETTEMP = "GETTEMP";
    public static final String ACTION_GETTEMPMAJOR = "GETTEMPMAJOR";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_GETDRAFTTEMP = "GETDRAFTTEMP";
    public static final String ACTION_GETDRAFTTEMPMAJOR = "GETDRAFTTEMPMAJOR";
    public static final String ACTION_CALCDSTPARAMPSDEID = "CALCDSTPARAMPSDEID";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURLLROOTCOND = "CURLLROOTCOND";
    public static final String DATAQUERY_CURLOGICLINK = "CURLOGICLINK";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURLLROOTCOND = "CURLLROOTCOND";
    public static final String DATASET_CURLOGICLINK = "CURLOGICLINK";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void calcDstParamPSDEId(PSDELLCondDTO dto) throws Throwable;

    public Page<PSDELLCondDTO> fetchCurLLRootCond(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELLCondDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
