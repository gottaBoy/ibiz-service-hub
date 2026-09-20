package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCREGISTRYITEM")
public interface IPSDCRegistryItemService
extends IPSModelDEService<PSDCRegistryItemDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_RUNIMAGE = "RUNIMAGE";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CODESERVER = "CODESERVER";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_CURDC2 = "CURDC2";
    public static final String DATAQUERY_CURDCAPI = "CURDCAPI";
    public static final String DATAQUERY_CURDCAPI2 = "CURDCAPI2";
    public static final String DATAQUERY_CURDCAPP = "CURDCAPP";
    public static final String DATAQUERY_CURDCAPP2 = "CURDCAPP2";
    public static final String DATAQUERY_CURDCCODESERVER = "CURDCCODESERVER";
    public static final String DATAQUERY_CURDCCODESERVER2 = "CURDCCODESERVER2";
    public static final String DATAQUERY_CURDCGENERATOR = "CURDCGENERATOR";
    public static final String DATAQUERY_CURDCGENERATOR2 = "CURDCGENERATOR2";
    public static final String DATAQUERY_CURDCRUNNER = "CURDCRUNNER";
    public static final String DATAQUERY_CURDCRUNNER2 = "CURDCRUNNER2";
    public static final String DATAQUERY_CURREPO = "CURREPO";
    public static final String DATAQUERY_CURSLN = "CURSLN";
    public static final String DATAQUERY_CURSLNGENERATOR = "CURSLNGENERATOR";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSAPI = "CURSYSAPI";
    public static final String DATAQUERY_CURSYSAPP = "CURSYSAPP";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_GENERATOR = "GENERATOR";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CODESERVER = "CODESERVER";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_CURDC2 = "CURDC2";
    public static final String DATASET_CURDCAPI = "CURDCAPI";
    public static final String DATASET_CURDCAPI2 = "CURDCAPI2";
    public static final String DATASET_CURDCANDSLN = "CURDCANDSLN";
    public static final String DATASET_CURDCANDSLNGENERATOR = "CURDCANDSLNGENERATOR";
    public static final String DATASET_CURDCAPP = "CURDCAPP";
    public static final String DATASET_CURDCAPP2 = "CURDCAPP2";
    public static final String DATASET_CURDCCODESERVER = "CURDCCODESERVER";
    public static final String DATASET_CURDCCODESERVER2 = "CURDCCODESERVER2";
    public static final String DATASET_CURDCGENERATOR = "CURDCGENERATOR";
    public static final String DATASET_CURDCGENERATOR2 = "CURDCGENERATOR2";
    public static final String DATASET_CURDCRUNNER = "CURDCRUNNER";
    public static final String DATASET_CURDCRUNNER2 = "CURDCRUNNER2";
    public static final String DATASET_CURREPO = "CURREPO";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_CURSLNGENERATOR = "CURSLNGENERATOR";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSAPI = "CURSYSAPI";
    public static final String DATASET_CURSYSAPP = "CURSYSAPP";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_GENERATOR = "GENERATOR";
    public static final String DATASET_RUNNER = "RUNNER";
    public static final String DATASET_TOOL = "TOOL";

    public void runImage(PSDCRegistryItemDTO dto) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCodeServer(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDC2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCAPI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCAPI2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCAndSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCAndSlnGenerator(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCApp2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCCodeServer(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCCodeServer2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCGenerator(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCGenerator2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCRunner(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurDCRunner2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurRepo(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurSlnGenerator(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurSysAPI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchCurSysApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchGenerator(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchRunner(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryItemDTO> fetchTool(ISearchContextDTO searchContext) throws Throwable;
}
