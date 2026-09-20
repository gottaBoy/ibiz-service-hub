package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCredentialDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSCREDENTIAL")
public interface IPSCredentialService
extends IPSModelDEService<PSCredentialDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_ALLDCVALID = "ALLDCVALID";
    public static final String DATAQUERY_CURDCVALID = "CURDCVALID";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_ALLDCVALID = "ALLDCVALID";
    public static final String DATASET_CURDCVALID = "CURDCVALID";
    public static final String DATASET_CURDCVALID2 = "CURDCVALID2";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_VIEW = "VIEW";

    public Page<PSCredentialDTO> fetchAllDCValid(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCredentialDTO> fetchCurDCValid(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCredentialDTO> fetchCurDCValid2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCredentialDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSCredentialDTO> fetchView(ISearchContextDTO searchContext) throws Throwable;
}
