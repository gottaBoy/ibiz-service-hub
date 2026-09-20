package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewTypeDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSVIEWTYPE")
public interface IPSViewTypeService
extends IPSModelDEService<PSViewTypeDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VALID = "VALID";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_DYANINSTCREATE = "DYANINSTCREATE";
    public static final String DATASET_ROOTCAT = "ROOTCAT";
    public static final String DATASET_VALID = "VALID";

    public Page<PSViewTypeDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSViewTypeDTO> fetchDyanInstCreate(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSViewTypeDTO> fetchRootCat(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSViewTypeDTO> fetchValid(ISearchContextDTO searchContext) throws Throwable;
}
