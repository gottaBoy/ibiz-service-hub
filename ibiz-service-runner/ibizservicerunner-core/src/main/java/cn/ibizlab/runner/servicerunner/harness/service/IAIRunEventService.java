package cn.ibizlab.runner.servicerunner.harness.service;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IAIRunEventService extends IDEService<AIRunEventDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ai/PSDATAENTITIES/ai_run_event.json";

    String FIELD_ID = "ID";
    String FIELD_NAME = "NAME";
    String FIELD_CREATE_MAN = "CREATE_MAN";
    String FIELD_CREATE_TIME = "CREATE_TIME";
    String FIELD_UPDATE_MAN = "UPDATE_MAN";
    String FIELD_UPDATE_TIME = "UPDATE_TIME";
    String FIELD_RUN_ID = "RUN_ID";
    String FIELD_STEP_ID = "STEP_ID";
    String FIELD_SEQUENCE = "SEQUENCE";
    String FIELD_EVENT_TYPE = "EVENT_TYPE";
    String FIELD_AGGREGATE_VERSION = "AGGREGATE_VERSION";
    String FIELD_IDEMPOTENCY_KEY = "IDEMPOTENCY_KEY";
    String FIELD_ACTOR_TYPE = "ACTOR_TYPE";
    String FIELD_ACTOR_ID = "ACTOR_ID";
    String FIELD_TRACE_ID = "TRACE_ID";
    String FIELD_OCCURRED_AT = "OCCURRED_AT";
    String FIELD_PAYLOAD_JSON = "PAYLOAD_JSON";

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
            case "AIRunEventDTO":
            case "ai_run_event_dto":
                return new AIRunEventDTO();
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
                create((AIRunEventDTO) args[0]);
                return null;
            case "update":
                update((AIRunEventDTO) args[0]);
                return null;
            case "remove":
                remove((List<String>) args[0]);
                return null;
            case "get":
                return get((String) args[0]);
            case "getdraft":
                return getDraft((AIRunEventDTO) args[0]);
            case "checkkey":
                return checkKey((AIRunEventDTO) args[0]);
            case "save":
                save((AIRunEventDTO) args[0]);
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

    default void create(AIRunEventDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_CREATE, null, new Object[]{dto}, true);
    }

    default void update(AIRunEventDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_UPDATE, null, new Object[]{dto}, true);
    }

    default void remove(List<String> keys) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_REMOVE, null, new Object[]{keys}, true);
    }

    default AIRunEventDTO get(String key) throws Throwable {
        return (AIRunEventDTO) getDataEntityRuntime().executeAction(ACTION_GET, null, new Object[]{key}, true);
    }

    default AIRunEventDTO getDraft(AIRunEventDTO dto) throws Throwable {
        return (AIRunEventDTO) getDataEntityRuntime().executeAction(ACTION_GETDRAFT, null, new Object[]{dto}, true);
    }

    default Integer checkKey(AIRunEventDTO dto) throws Throwable {
        return (Integer) getDataEntityRuntime().executeAction(ACTION_CHECKKEY, null, new Object[]{dto}, true);
    }

    default void save(AIRunEventDTO dto) throws Throwable {
        getDataEntityRuntime().executeAction(ACTION_SAVE, null, new Object[]{dto}, true);
    }

    default Page<AIRunEventDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<AIRunEventDTO>) getDataEntityRuntime().fetchDataSet(DATASET_DEFAULT, null, new Object[]{dto}, true);
    }

    default List<AIRunEventDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = getDataEntityRuntime().selectDataQuery(DATAQUERY_DEFAULT, dto);
        return (List<AIRunEventDTO>) obj;
    }

    default List<AIRunEventDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = getDataEntityRuntime().selectDataQuery(DATAQUERY_VIEW, dto);
        return (List<AIRunEventDTO>) obj;
    }
}
