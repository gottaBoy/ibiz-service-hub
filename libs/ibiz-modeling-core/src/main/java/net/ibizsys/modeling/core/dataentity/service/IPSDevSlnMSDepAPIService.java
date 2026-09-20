package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAPIDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNMSDEPAPI")
public interface IPSDevSlnMSDepAPIService
extends IPSModelDEService<PSDevSlnMSDepAPIDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_BATCHADD = "BATCHADD";
    public static final String ACTION_BINDAPI = "BINDAPI";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEWITHSTATE = "CREATEWITHSTATE";
    public static final String ACTION_GETWITHSTATE = "GETWITHSTATE";
    public static final String ACTION_LOADPLATFORMID = "LOADPLATFORMID";
    public static final String ACTION_RESTART = "RESTART";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_STOP = "STOP";
    public static final String ACTION_UNBINDAPI = "UNBINDAPI";
    public static final String ACTION_UPDATEWITHSTATE = "UPDATEWITHSTATE";
    public static final String DATAQUERY_CURDEPLOY = "CURDEPLOY";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDEPLOY = "CURDEPLOY";
    public static final String DATASET_CURMSPWITHSTATE = "CURMSPWITHSTATE";
    public static final String DATASET_CURSLNUNUSED = "CURSLNUNUSED";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void batchAdd(PSDevSlnMSDepAPIDTO dto) throws Throwable;

    public void createWithState(PSDevSlnMSDepAPIDTO dto) throws Throwable;

    public PSDevSlnMSDepAPIDTO getWithState(String value) throws Throwable;

    public void restart(PSDevSlnMSDepAPIDTO dto) throws Throwable;

    public void stop(PSDevSlnMSDepAPIDTO dto) throws Throwable;

    public void updateWithState(PSDevSlnMSDepAPIDTO dto) throws Throwable;

    public Page<PSDevSlnMSDepAPIDTO> fetchCurDeploy(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepAPIDTO> fetchCurMSPWithState(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepAPIDTO> fetchCurSlnUnused(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepAPIDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepAPIDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
