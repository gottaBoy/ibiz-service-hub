package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysIssueDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSISSUE")
public interface IPSSysIssueService
extends IPSModelDEService<PSSysIssueDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURDEVIEW = "CURDEVIEW";
    public static final String DATAQUERY_CURMODEL = "CURMODEL";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYS2 = "CURSYS2";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURAPPALL = "CURAPPALL";
    public static final String DATASET_CURDEVIEW = "CURDEVIEW";
    public static final String DATASET_CURMODEL = "CURMODEL";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYS2 = "CURSYS2";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSSysIssueDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysIssueDTO> fetchCurAppAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysIssueDTO> fetchCurDEView(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysIssueDTO> fetchCurModel(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysIssueDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysIssueDTO> fetchCurSys2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysIssueDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
