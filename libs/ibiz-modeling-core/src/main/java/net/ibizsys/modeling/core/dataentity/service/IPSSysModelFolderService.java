package net.ibizsys.modeling.core.dataentity.service;

import java.util.List;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelFolderDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSMODELFOLDER")
public interface IPSSysModelFolderService
extends IPSModelDEService<PSSysModelFolderDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_MOVEORDER = "MOVEORDER";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSROOT = "CURSYSROOT";
    public static final String DATAQUERY_CURUSER = "CURUSER";
    public static final String DATAQUERY_CURUSER2 = "CURUSER2";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSROOT = "CURSYSROOT";
    public static final String DATASET_CURUSER = "CURUSER";
    public static final String DATASET_CURUSER2 = "CURUSER2";
    public static final String DATASET_CURUSERALL = "CURUSERALL";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public List<PSSysModelFolderDTO> moveOrder(PSSysModelFolderDTO dto) throws Throwable;

    public Page<PSSysModelFolderDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderDTO> fetchCurSysRoot(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderDTO> fetchCurUser(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderDTO> fetchCurUser2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderDTO> fetchCurUserAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
