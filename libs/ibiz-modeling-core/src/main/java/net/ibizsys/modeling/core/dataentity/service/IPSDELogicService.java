package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDELOGIC")
public interface IPSDELogicService
extends IPSModelDEService<PSDELogicDTO, ISearchContextDTO> {
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
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETDRAFTFROMWITHMODEL = "GETDRAFTFROMWITHMODEL";
    public static final String ACTION_GETDRAFTWITHMODEL = "GETDRAFTWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURDEDF = "CURDEDF";
    public static final String DATAQUERY_CURDEMS = "CURDEMS";
    public static final String DATAQUERY_CURDEUL = "CURDEUL";
    public static final String DATAQUERY_CURMODDF = "CURMODDF";
    public static final String DATAQUERY_CURMODMS = "CURMODMS";
    public static final String DATAQUERY_CURMODNOTDEUL = "CURMODNOTDEUL";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSDF = "CURSYSDF";
    public static final String DATAQUERY_CURSYSMS = "CURSYSMS";
    public static final String DATAQUERY_CURSYSNOTDEUL = "CURSYSNOTDEUL";
    public static final String DATAQUERY_CURSYSUL = "CURSYSUL";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_UL = "UL";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURDEDF = "CURDEDF";
    public static final String DATASET_CURDEMS = "CURDEMS";
    public static final String DATASET_CURDEUL = "CURDEUL";
    public static final String DATASET_CURMODALLUL = "CURMODALLUL";
    public static final String DATASET_CURMODDF = "CURMODDF";
    public static final String DATASET_CURMODMS = "CURMODMS";
    public static final String DATASET_CURMODNOTDEUL = "CURMODNOTDEUL";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSALLUL = "CURSYSALLUL";
    public static final String DATASET_CURSYSDF = "CURSYSDF";
    public static final String DATASET_CURSYSMS = "CURSYSMS";
    public static final String DATASET_CURSYSNOTDEUL = "CURSYSNOTDEUL";
    public static final String DATASET_CURSYSUL = "CURSYSUL";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_UL = "UL";

    public void createWithModel(PSDELogicDTO dto) throws Throwable;

    public PSDELogicDTO getDraftFromWithModel(PSDELogicDTO dto) throws Throwable;

    public PSDELogicDTO getDraftWithModel(PSDELogicDTO dto) throws Throwable;

    public PSDELogicDTO getWithModel(String value) throws Throwable;

    public void updateWithModel(PSDELogicDTO dto) throws Throwable;

    public Page<PSDELogicDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurDEDF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurDEMS(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurDEUL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurModAllUL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurModDF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurModMS(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurModNotDEUL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurSysAllUL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurSysDF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurSysMS(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurSysNotDEUL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchCurSysUL(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDELogicDTO> fetchUL(ISearchContextDTO searchContext) throws Throwable;
}
