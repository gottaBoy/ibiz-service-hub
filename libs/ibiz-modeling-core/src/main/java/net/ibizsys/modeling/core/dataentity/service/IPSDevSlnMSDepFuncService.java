package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepFuncDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNMSDEPFUNC")
public interface IPSDevSlnMSDepFuncService
extends IPSModelDEService<PSDevSlnMSDepFuncDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEWITHSTATE = "CREATEWITHSTATE";
    public static final String ACTION_GETWITHSTATE = "GETWITHSTATE";
    public static final String ACTION_LOADPLATFORMID = "LOADPLATFORMID";
    public static final String ACTION_RESTART = "RESTART";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_STOP = "STOP";
    public static final String ACTION_UPDATEWITHSTATE = "UPDATEWITHSTATE";
    public static final String DATAQUERY_CURDEPLOY = "CURDEPLOY";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDEPLOY = "CURDEPLOY";
    public static final String DATASET_CURMSPWITHSTATE = "CURMSPWITHSTATE";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void createWithState(PSDevSlnMSDepFuncDTO dto) throws Throwable;

    public PSDevSlnMSDepFuncDTO getWithState(String value) throws Throwable;

    public void restart(PSDevSlnMSDepFuncDTO dto) throws Throwable;

    public void stop(PSDevSlnMSDepFuncDTO dto) throws Throwable;

    public void updateWithState(PSDevSlnMSDepFuncDTO dto) throws Throwable;

    public Page<PSDevSlnMSDepFuncDTO> fetchCurDeploy(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepFuncDTO> fetchCurMSPWithState(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepFuncDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnMSDepFuncDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
