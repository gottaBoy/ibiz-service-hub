package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCWorkspaceDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCWORKSPACE")
public interface IPSDCWorkspaceService
extends IPSModelDEService<PSDCWorkspaceDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_ASSIGNSLN = "ASSIGNSLN";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_INSTALLSYS = "INSTALLSYS";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UNASSIGNSLN = "UNASSIGNSLN";
    public static final String ACTION_UNINSTALLSYS = "UNINSTALLSYS";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_CURDCASSIGNED = "CURDCASSIGNED";
    public static final String DATAQUERY_CURDCUNASSIGNED = "CURDCUNASSIGNED";
    public static final String DATAQUERY_CURDCUNUSED = "CURDCUNUSED";
    public static final String DATAQUERY_CURDCUSED = "CURDCUSED";
    public static final String DATAQUERY_CURSLN = "CURSLN";
    public static final String DATAQUERY_CURSLNUNUSED = "CURSLNUNUSED";
    public static final String DATAQUERY_CURSLNUSED = "CURSLNUSED";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_CURDCASSIGNED = "CURDCASSIGNED";
    public static final String DATASET_CURDCUNASSIGNED = "CURDCUNASSIGNED";
    public static final String DATASET_CURDCUNUSED = "CURDCUNUSED";
    public static final String DATASET_CURDCUSED = "CURDCUSED";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_CURSLNUNUSED = "CURSLNUNUSED";
    public static final String DATASET_CURSLNUSED = "CURSLNUSED";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void aassignSln(PSDCWorkspaceDTO dto) throws Throwable;

    public void installSys(PSDCWorkspaceDTO dto) throws Throwable;

    public void uninstallSys(PSDCWorkspaceDTO dto) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurDCAssigned(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurDCUnassigned(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurDCUnused(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurDCUsed(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurSlnUnused(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchCurSlnUsed(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCWorkspaceDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
