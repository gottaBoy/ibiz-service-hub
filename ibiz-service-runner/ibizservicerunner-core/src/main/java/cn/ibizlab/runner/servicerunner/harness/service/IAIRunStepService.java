package cn.ibizlab.runner.servicerunner.harness.service;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunStepDTO;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IAIRunStepService extends IDEService<AIRunStepDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ai/PSDATAENTITIES/ai_run_step.json";

    String FIELD_ID = "ID";
    String FIELD_NAME = "NAME";
    String FIELD_CREATE_MAN = "CREATE_MAN";
    String FIELD_CREATE_TIME = "CREATE_TIME";
    String FIELD_UPDATE_MAN = "UPDATE_MAN";
    String FIELD_UPDATE_TIME = "UPDATE_TIME";
    String FIELD_RUN_ID = "RUN_ID";
    String FIELD_SEQUENCE = "SEQUENCE";
    String FIELD_ATTEMPT = "ATTEMPT";
    String FIELD_STEP_KIND = "STEP_KIND";
    String FIELD_STATUS = "STATUS";
    String FIELD_INPUT_JSON = "INPUT_JSON";
    String FIELD_OUTPUT_JSON = "OUTPUT_JSON";
    String FIELD_TOOL_NAME = "TOOL_NAME";
    String FIELD_TOOL_CALL_ID = "TOOL_CALL_ID";
    String FIELD_IDEMPOTENCY_KEY = "IDEMPOTENCY_KEY";
    String FIELD_RETRY_COUNT = "RETRY_COUNT";
    String FIELD_ERROR_CODE = "ERROR_CODE";
    String FIELD_ERROR_MESSAGE = "ERROR_MESSAGE";
    String FIELD_STARTED_AT = "STARTED_AT";
    String FIELD_FINISHED_AT = "FINISHED_AT";
    String FIELD_DURATION_MS = "DURATION_MS";
    String FIELD_LAST_EVENT_SEQUENCE = "LAST_EVENT_SEQUENCE";

    String ACTION_CREATE = "Create";
    String ACTION_UPDATE = "Update";
    String ACTION_REMOVE = "Remove";
    String ACTION_GET = "Get";
    String ACTION_GETDRAFT = "GetDraft";
    String ACTION_CHECKKEY = "CheckKey";
    String ACTION_SAVE = "Save";

    String DATAQUERY_DEFAULT = "DEFAULT";
    String DATAQUERY_VIEW = "VIEW";
    String DATASET_DEFAULT = "DEFAULT";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String name = iPSDEMethodDTO.getName();
        switch (name) {
            case "AIRunStepDTO":
            case "ai_run_step_dto":
                return new AIRunStepDTO();
            default:
                return null;
        }
    }

    @Override
    default ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        return new SearchContextDTO();
    }

    @Override
    default Object executeAction(String actionName, IPSDEAction action, Object[] args) throws Throwable {
        switch (actionName.toLowerCase()) {
            case "create":
                create((AIRunStepDTO) args[0]);
                return null;
            case "update":
                update((AIRunStepDTO) args[0]);
                return null;
            case "remove":
                remove((List<String>) args[0]);
                return null;
            case "get":
                return get((String) args[0]);
            case "getdraft":
                return getDraft((AIRunStepDTO) args[0]);
            case "checkkey":
                return checkKey((AIRunStepDTO) args[0]);
            case "save":
                save((AIRunStepDTO) args[0]);
                return null;
            default:
                return getDataEntityRuntime().executeAction(actionName, action, args, true);
        }
    }

    @Override
    default Object fetchDataSet(String dataSetName, IPSDEDataSet dataSet, Object[] args) throws Throwable {
        if ("default".equalsIgnoreCase(dataSetName)) {
            return fetchDefault((ISearchContextDTO) args[0]);
        }
        return getDataEntityRuntime().fetchDataSet(dataSetName, dataSet, args, true);
    }

    default void create(AIRunStepDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_CREATE, null, new Object[]{dto}, true);
    }

    default void update(AIRunStepDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_UPDATE, null, new Object[]{dto}, true);
    }

    default void remove(List<String> keys) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_REMOVE, null, new Object[]{keys}, true);
    }

    default AIRunStepDTO get(String key) throws Throwable {
        return (AIRunStepDTO) getDataEntityRuntime().executeAction(ACTION_GET, null, new Object[]{key}, true);
    }

    default AIRunStepDTO getDraft(AIRunStepDTO dto) throws Throwable {
        return (AIRunStepDTO) getDataEntityRuntime().executeAction(ACTION_GETDRAFT, null, new Object[]{dto}, true);
    }

    default Integer checkKey(AIRunStepDTO dto) throws Throwable {
        return (Integer) getDataEntityRuntime().executeAction(ACTION_CHECKKEY, null, new Object[]{dto}, true);
    }

    default void save(AIRunStepDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_SAVE, null, new Object[]{dto}, true);
    }

    default Page<AIRunStepDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<AIRunStepDTO>) getDataEntityRuntime().fetchDataSet(DATASET_DEFAULT, null, new Object[]{dto}, true);
    }

    default List<AIRunStepDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = getDataEntityRuntime().selectDataQuery(DATAQUERY_DEFAULT, dto);
        return (List<AIRunStepDTO>) obj;
    }

    default List<AIRunStepDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = getDataEntityRuntime().selectDataQuery(DATAQUERY_VIEW, dto);
        return (List<AIRunStepDTO>) obj;
    }
}
