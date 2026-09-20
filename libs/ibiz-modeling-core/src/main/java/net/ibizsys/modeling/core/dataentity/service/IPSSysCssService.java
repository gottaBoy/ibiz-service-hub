package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSCSS")
public interface IPSSysCssService
extends IPSModelDEService<PSSysCssDTO, ISearchContextDTO> {
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
    public static final String ACTION_CALCSAMPLECONTENT = "CALCSAMPLECONTENT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETFD = "GETFD";
    public static final String ACTION_GETFDL = "GETFDL";
    public static final String ACTION_GETPI = "GETPI";
    public static final String ACTION_GETPIL = "GETPIL";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATEFD = "UPDATEFD";
    public static final String ACTION_UPDATEFDL = "UPDATEFDL";
    public static final String ACTION_UPDATEPI = "UPDATEPI";
    public static final String ACTION_UPDATEPIL = "UPDATEPIL";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void calcSampleContent(PSSysCssDTO dto) throws Throwable;

    public PSSysCssDTO getFD(String value) throws Throwable;

    public PSSysCssDTO getFDL(String value) throws Throwable;

    public PSSysCssDTO getPI(String value) throws Throwable;

    public PSSysCssDTO getPIL(String value) throws Throwable;

    public void updateFD(PSSysCssDTO dto) throws Throwable;

    public void updateFDL(PSSysCssDTO dto) throws Throwable;

    public void updatePI(PSSysCssDTO dto) throws Throwable;

    public void updatePIL(PSSysCssDTO dto) throws Throwable;

    public Page<PSSysCssDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysCssDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
