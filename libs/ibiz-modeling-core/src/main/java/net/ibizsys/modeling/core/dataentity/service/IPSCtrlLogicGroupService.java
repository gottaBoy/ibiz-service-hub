package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSCTRLLOGICGROUP")
public interface IPSCtrlLogicGroupService
extends IPSModelDEService<PSCtrlLogicGroupDTO, ISearchContextDTO> {
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
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSALL = "CURSYSALL";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURDEALL = "CURDEALL";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSALL = "CURSYSALL";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSCtrlLogicGroupDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCtrlLogicGroupDTO> fetchCurDEAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCtrlLogicGroupDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCtrlLogicGroupDTO> fetchCurSysAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCtrlLogicGroupDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
