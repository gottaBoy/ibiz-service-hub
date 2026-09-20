package net.ibizsys.modeling.core.dataentity.service;

import java.util.List;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelFolderItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSMODELFOLDERITEM")
public interface IPSSysModelFolderItemService
extends IPSModelDEService<PSSysModelFolderItemDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_MOVEORDER = "MOVEORDER";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURUSER = "CURUSER";
    public static final String DATAQUERY_CURUSER2 = "CURUSER2";
    public static final String DATAQUERY_CURUSER3 = "CURUSER3";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_ROOT = "ROOT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURUSER = "CURUSER";
    public static final String DATASET_CURUSER2 = "CURUSER2";
    public static final String DATASET_CURUSER3 = "CURUSER3";
    public static final String DATASET_CURUSERALL = "CURUSERALL";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_ROOTALL = "ROOTALL";

    public List<PSSysModelFolderItemDTO> moveOrder(PSSysModelFolderItemDTO dto) throws Throwable;

    public Page<PSSysModelFolderItemDTO> fetchCurUser(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderItemDTO> fetchCurUser2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderItemDTO> fetchCurUser3(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderItemDTO> fetchCurUserAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysModelFolderItemDTO> fetchRootAll(ISearchContextDTO searchContext) throws Throwable;
}
