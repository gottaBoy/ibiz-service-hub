package cn.ibizlab.runner.servicerunner.harness.service;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IAIRunService extends IDEService<AIRunDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ai/PSDATAENTITIES/ai_run.json";

    String FIELD_ID = "ID";
    String FIELD_NAME = "NAME";
    String FIELD_CREATE_MAN = "CREATE_MAN";
    String FIELD_CREATE_TIME = "CREATE_TIME";
    String FIELD_UPDATE_MAN = "UPDATE_MAN";
    String FIELD_UPDATE_TIME = "UPDATE_TIME";
    String FIELD_STATUS = "STATUS";
    String FIELD_RUN_TYPE = "RUN_TYPE";
    String FIELD_TENANT_ID = "TENANT_ID";
    String FIELD_USER_ID = "USER_ID";
    String FIELD_PROJECT_ID = "PROJECT_ID";
    String FIELD_AGENT_ID = "AGENT_ID";
    String FIELD_AGENT_VERSION = "AGENT_VERSION";
    String FIELD_MODEL_ID = "MODEL_ID";
    String FIELD_PROVIDER = "PROVIDER";
    String FIELD_CONTEXT_ID = "CONTEXT_ID";
    String FIELD_CONVERSATION_ID = "CONVERSATION_ID";
    String FIELD_SESSION_ID = "SESSION_ID";
    String FIELD_PARENT_RUN_ID = "PARENT_RUN_ID";
    String FIELD_IDEMPOTENCY_KEY = "IDEMPOTENCY_KEY";
    String FIELD_TRACE_ID = "TRACE_ID";
    String FIELD_WORKSPACE = "WORKSPACE";
    String FIELD_REQUEST_JSON = "REQUEST_JSON";
    String FIELD_RESULT_JSON = "RESULT_JSON";
    String FIELD_ERROR_CODE = "ERROR_CODE";
    String FIELD_ERROR_MESSAGE = "ERROR_MESSAGE";
    String FIELD_BUDGET_JSON = "BUDGET_JSON";
    String FIELD_DEADLINE_AT = "DEADLINE_AT";
    String FIELD_STARTED_AT = "STARTED_AT";
    String FIELD_FINISHED_AT = "FINISHED_AT";
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
            case "AIRunDTO":
            case "ai_run_dto":
                return new AIRunDTO();
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
                create((AIRunDTO) args[0]);
                return null;
            case "update":
                update((AIRunDTO) args[0]);
                return null;
            case "remove":
                remove((List<String>) args[0]);
                return null;
            case "get":
                return get((String) args[0]);
            case "getdraft":
                return getDraft((AIRunDTO) args[0]);
            case "checkkey":
                return checkKey((AIRunDTO) args[0]);
            case "save":
                save((AIRunDTO) args[0]);
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

    default void create(AIRunDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_CREATE, null, new Object[]{dto}, true);
    }

    default void update(AIRunDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_UPDATE, null, new Object[]{dto}, true);
    }

    default void remove(List<String> keys) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_REMOVE, null, new Object[]{keys}, true);
    }

    default AIRunDTO get(String key) throws Throwable {
        return (AIRunDTO) getDataEntityRuntime().executeAction(ACTION_GET, null, new Object[]{key}, true);
    }

    default AIRunDTO getDraft(AIRunDTO dto) throws Throwable {
        return (AIRunDTO) getDataEntityRuntime().executeAction(ACTION_GETDRAFT, null, new Object[]{dto}, true);
    }

    default Integer checkKey(AIRunDTO dto) throws Throwable {
        return (Integer) getDataEntityRuntime().executeAction(ACTION_CHECKKEY, null, new Object[]{dto}, true);
    }

    default void save(AIRunDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_SAVE, null, new Object[]{dto}, true);
    }

    default Page<AIRunDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<AIRunDTO>) getDataEntityRuntime().fetchDataSet(DATASET_DEFAULT, null, new Object[]{dto}, true);
    }

    default List<AIRunDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = getDataEntityRuntime().selectDataQuery(DATAQUERY_DEFAULT, dto);
        return (List<AIRunDTO>) obj;
    }

    default List<AIRunDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = getDataEntityRuntime().selectDataQuery(DATAQUERY_VIEW, dto);
        return (List<AIRunDTO>) obj;
    }
}
