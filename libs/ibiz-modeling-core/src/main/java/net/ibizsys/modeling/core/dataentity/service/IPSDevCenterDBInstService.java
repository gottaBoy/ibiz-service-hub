package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterDBInstDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVCENTERDBINST")
public interface IPSDevCenterDBInstService
extends IPSModelDEService<PSDevCenterDBInstDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SYNCDBSCHEME = "SYNCDBSCHEME";
    public static final String ACTION_UNASSIGNSLN = "UNASSIGNSLN";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_CURDC2 = "CURDC2";
    public static final String DATAQUERY_CURSLN = "CURSLN";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void syncDBScheme(PSDevCenterDBInstDTO dto) throws Throwable;

    public Page<PSDevCenterDBInstDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevCenterDBInstDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevCenterDBInstDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
