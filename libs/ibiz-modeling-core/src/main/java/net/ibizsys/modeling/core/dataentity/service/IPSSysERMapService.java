package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysERMapDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSERMAP")
public interface IPSSysERMapService
extends IPSModelDEService<PSSysERMapDTO, ISearchContextDTO> {
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
    public static final String ACTION_ADDDBTABLES = "ADDDBTABLES";
    public static final String ACTION_ADDDATAENTITIES = "ADDDATAENTITIES";
    public static final String ACTION_ADDSUBSYSSADES = "ADDSUBSYSSADES";
    public static final String ACTION_CALCCONNECTION = "CALCCONNECTION";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETDRAFTFROMWITHMODEL = "GETDRAFTFROMWITHMODEL";
    public static final String ACTION_GETDRAFTWITHMODEL = "GETDRAFTWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_GETWITHMODEL2 = "GETWITHMODEL2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void addDBTables(PSSysERMapDTO dto) throws Throwable;

    public void addDataEntities(PSSysERMapDTO dto) throws Throwable;

    public void addSubSysSADEs(PSSysERMapDTO dto) throws Throwable;

    public void calcConnection(PSSysERMapDTO dto) throws Throwable;

    public void createWithModel(PSSysERMapDTO dto) throws Throwable;

    public PSSysERMapDTO getDraftFromWithModel(PSSysERMapDTO dto) throws Throwable;

    public PSSysERMapDTO getDraftWithModel(PSSysERMapDTO dto) throws Throwable;

    public PSSysERMapDTO getWithModel(String value) throws Throwable;

    public PSSysERMapDTO getWithModel2(String value) throws Throwable;

    public void updateWithModel(PSSysERMapDTO dto) throws Throwable;

    public Page<PSSysERMapDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysERMapDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
