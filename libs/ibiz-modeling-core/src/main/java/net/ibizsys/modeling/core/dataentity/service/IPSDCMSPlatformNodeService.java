package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCMSPLATFORMNODE")
public interface IPSDCMSPlatformNodeService
extends IPSModelDEService<PSDCMSPlatformNodeDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_ASSIGNSLNDEP = "ASSIGNSLNDEP";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEWITHSTATE = "CREATEWITHSTATE";
    public static final String ACTION_GETWITHSTATE = "GETWITHSTATE";
    public static final String ACTION_RESTART = "RESTART";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_STOP = "STOP";
    public static final String ACTION_UPDATEWITHSTATE = "UPDATEWITHSTATE";
    public static final String DATAQUERY_CURSLNAPIREF = "CURSLNAPIREF";
    public static final String DATAQUERY_CURSLNAPPREF = "CURSLNAPPREF";
    public static final String DATAQUERY_CURSLNFUNCREF = "CURSLNFUNCREF";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_APINODE = "APINODE";
    public static final String DATASET_APPNODE = "APPNODE";
    public static final String DATASET_CURMSPWITHSTATE = "CURMSPWITHSTATE";
    public static final String DATASET_CURSLNREF = "CURSLNREF";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void assignSlnDep(PSDCMSPlatformNodeDTO dto) throws Throwable;

    public void createWithState(PSDCMSPlatformNodeDTO dto) throws Throwable;

    public PSDCMSPlatformNodeDTO getWithState(String value) throws Throwable;

    public void restart(PSDCMSPlatformNodeDTO dto) throws Throwable;

    public void stop(PSDCMSPlatformNodeDTO dto) throws Throwable;

    public void updateWithState(PSDCMSPlatformNodeDTO dto) throws Throwable;

    public Page<PSDCMSPlatformNodeDTO> fetchAPINode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCMSPlatformNodeDTO> fetchAppNode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCMSPlatformNodeDTO> fetchCurMSPWithState(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCMSPlatformNodeDTO> fetchCurSlnRef(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCMSPlatformNodeDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
