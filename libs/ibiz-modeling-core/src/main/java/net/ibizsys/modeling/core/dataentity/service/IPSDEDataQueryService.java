package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEDATAQUERY")
public interface IPSDEDataQueryService
extends IPSModelDEService<PSDEDataQueryDTO, ISearchContextDTO> {
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
    public static final String ACTION_CREATEDEDATASET = "CREATEDEDATASET";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_X_GENERATECODE = "X_GENERATECODE";
    public static final String ACTION_GETDRAFTFROMWITHMODEL = "GETDRAFTFROMWITHMODEL";
    public static final String ACTION_GETDRAFTWITHMODEL = "GETDRAFTWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_PREVIEWSAVE = "PREVIEWSAVE";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void createDEDataSet(PSDEDataQueryDTO dto) throws Throwable;

    public void createWithModel(PSDEDataQueryDTO dto) throws Throwable;

    public void generateCode(PSDEDataQueryDTO dto) throws Throwable;

    public PSDEDataQueryDTO getDraftFromWithModel(PSDEDataQueryDTO dto) throws Throwable;

    public PSDEDataQueryDTO getDraftWithModel(PSDEDataQueryDTO dto) throws Throwable;

    public PSDEDataQueryDTO getWithModel(String value) throws Throwable;

    public void previewSave(PSDEDataQueryDTO dto) throws Throwable;

    public void updateWithModel(PSDEDataQueryDTO dto) throws Throwable;

    public Page<PSDEDataQueryDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDataQueryDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDataQueryDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
