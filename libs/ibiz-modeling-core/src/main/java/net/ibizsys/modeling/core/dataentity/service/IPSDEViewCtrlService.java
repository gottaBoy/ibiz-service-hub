package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewCtrlDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVIEWCTRL")
public interface IPSDEViewCtrlService
extends IPSModelDEService<PSDEViewCtrlDTO, ISearchContextDTO> {
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
    public static final String ACTION_CHANGECHART = "CHANGECHART";
    public static final String ACTION_CHANGEDASHBOARD = "CHANGEDASHBOARD";
    public static final String ACTION_CHANGEDATARELATION = "CHANGEDATARELATION";
    public static final String ACTION_CHANGEDATAVIEW = "CHANGEDATAVIEW";
    public static final String ACTION_CHANGEEDITFORM = "CHANGEEDITFORM";
    public static final String ACTION_CHANGEGRID = "CHANGEGRID";
    public static final String ACTION_CHANGELIST = "CHANGELIST";
    public static final String ACTION_CHANGETOOLBAR = "CHANGETOOLBAR";
    public static final String ACTION_CHANGETREE = "CHANGETREE";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURVIEW = "CURVIEW";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURVIEW = "CURVIEW";
    public static final String DATASET_CURVIEWRT = "CURVIEWRT";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";

    public void changeChart(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeDashboard(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeDataRelation(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeDataView(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeEditForm(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeGrid(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeList(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeToolbar(PSDEViewCtrlDTO dto) throws Throwable;

    public void changeTree(PSDEViewCtrlDTO dto) throws Throwable;

    public Page<PSDEViewCtrlDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewCtrlDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewCtrlDTO> fetchCurView(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewCtrlDTO> fetchCurViewRT(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewCtrlDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewCtrlDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;
}
