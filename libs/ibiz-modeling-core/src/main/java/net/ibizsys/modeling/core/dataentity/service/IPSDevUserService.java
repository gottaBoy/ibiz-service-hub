package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevUserDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVUSER")
public interface IPSDevUserService
extends IPSModelDEService<PSDevUserDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEEX = "CREATEEX";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_FINDBYLOGINNAME = "FINDBYLOGINNAME";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void createEx(PSDevUserDTO dto) throws Throwable;

    public Page<PSDevUserDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevUserDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
