package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCMSPLATFORM")
public interface IPSDCMSPlatformService
extends IPSModelDEService<PSDCMSPlatformDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_PUBCONFIG = "PUBCONFIG";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void pubConfig(PSDCMSPlatformDTO dto) throws Throwable;

    public Page<PSDCMSPlatformDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCMSPlatformDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
