package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEJoinTypeDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEJOINTYPE")
public interface IPSDEJoinTypeService
extends IPSModelDEService<PSDEJoinTypeDTO, ISearchContextDTO> {
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
    public static final String DATASET_VALID = "VALID";

    public Page<PSDEJoinTypeDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEJoinTypeDTO> fetchValid(ISearchContextDTO searchContext) throws Throwable;
}
