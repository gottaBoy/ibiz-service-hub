package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCCodeSnippetDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCCODESNIPPET")
public interface IPSDCCodeSnippetService
extends IPSModelDEService<PSDCCodeSnippetDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_ALLDC = "ALLDC";
    public static final String DATAQUERY_ALLDCAPP = "ALLDCAPP";
    public static final String DATAQUERY_ALLDCCL = "ALLDCCL";
    public static final String DATAQUERY_ALLDCDB = "ALLDCDB";
    public static final String DATAQUERY_ALLDCDE = "ALLDCDE";
    public static final String DATAQUERY_ALLDCDEACTION = "ALLDCDEACTION";
    public static final String DATAQUERY_ALLDCNONE = "ALLDCNONE";
    public static final String DATAQUERY_ALLDCSYS = "ALLDCSYS";
    public static final String DATAQUERY_ALLDCVIEW = "ALLDCVIEW";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_CURDC2 = "CURDC2";
    public static final String DATAQUERY_CURDCAPP = "CURDCAPP";
    public static final String DATAQUERY_CURDCCL = "CURDCCL";
    public static final String DATAQUERY_CURDCDB = "CURDCDB";
    public static final String DATAQUERY_CURDCDE = "CURDCDE";
    public static final String DATAQUERY_CURDCDEACTION = "CURDCDEACTION";
    public static final String DATAQUERY_CURDCNONE = "CURDCNONE";
    public static final String DATAQUERY_CURDCSYS = "CURDCSYS";
    public static final String DATAQUERY_CURDCVIEW = "CURDCVIEW";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_ALL = "ALL";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_CURDCAPP = "CURDCAPP";
    public static final String DATASET_CURDCCL = "CURDCCL";
    public static final String DATASET_CURDCDB = "CURDCDB";
    public static final String DATASET_CURDCDE = "CURDCDE";
    public static final String DATASET_CURDCDEACTION = "CURDCDEACTION";
    public static final String DATASET_CURDCNONE = "CURDCNONE";
    public static final String DATASET_CURDCSYS = "CURDCSYS";
    public static final String DATASET_CURDCVIEW = "CURDCVIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSDCCodeSnippetDTO> fetchAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCCL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCDB(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCDEAction(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCNone(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchCurDCView(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCCodeSnippetDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
