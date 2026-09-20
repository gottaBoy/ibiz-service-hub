package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDBValueOPDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDBVALUEOP")
public interface IPSDBValueOPService
extends IPSModelDEService<PSDBValueOPDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DBMODE = "DBMODE";
    public static final String DATAQUERY_DLMODE = "DLMODE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DBMODE = "DBMODE";
    public static final String DATASET_DLMODE = "DLMODE";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSDBValueOPDTO> fetchDBMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDBValueOPDTO> fetchDLMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDBValueOPDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
