package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicParamDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDELOGICPARAM")
public interface IPSDELogicParamService
extends IPSModelDEService<PSDELogicParamDTO, ISearchContextDTO> {
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
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURLOGIC = "CURLOGIC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_FILELISTPARAM = "FILELISTPARAM";
    public static final String DATAQUERY_FILEPARAM = "FILEPARAM";
    public static final String DATAQUERY_FILTERPARAMS = "FILTERPARAMS";
    public static final String DATAQUERY_FIREEVENTUIPARAM = "FIREEVENTUIPARAM";
    public static final String DATAQUERY_LISTPARAMS = "LISTPARAMS";
    public static final String DATAQUERY_LISTPARAMS2 = "LISTPARAMS2";
    public static final String DATAQUERY_PAGEPARAMS = "PAGEPARAMS";
    public static final String DATAQUERY_UIPARAM = "UIPARAM";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURLOGIC = "CURLOGIC";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FILELISTPARAM = "FILELISTPARAM";
    public static final String DATASET_FILEPARAM = "FILEPARAM";
    public static final String DATASET_FIREEVENTUIPARAM = "FIREEVENTUIPARAM";
    public static final String DATASET_LISTPARAMS = "LISTPARAMS";
    public static final String DATASET_LISTPARAMS2 = "LISTPARAMS2";
    public static final String DATASET_UIPARAM = "UIPARAM";

    public Page<PSDELogicParamDTO> fetchCurLogic(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicParamDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicParamDTO> fetchFileListParam(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicParamDTO> fetchFileParam(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicParamDTO> fetchFireEventUIParam(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicParamDTO> fetchUIParam(ISearchContextDTO searchContext) throws Throwable;
}
