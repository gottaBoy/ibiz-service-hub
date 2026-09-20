package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunStepDTO;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HarnessCoordinatorCancellationTest {

    private static final String RUN_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run.json";
    private static final String STEP_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run_step.json";
    private static final String EVENT_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run_event.json";

    @Test
    void queuedRunIsCancelledWithEveryUnfinishedStep() throws Throwable {
        TestStore store = new TestStore(
                new AIRunDTO()
                        .setId("run-01")
                        .setStatus("queued")
                        .setTraceId("trace-01"));
        store.steps.put(
                "step-01",
                new AIRunStepDTO()
                        .setId("step-01")
                        .setRunId("run-01")
                        .setSequence(1L)
                        .setStatus("queued"));
        store.steps.put(
                "step-02",
                new AIRunStepDTO()
                        .setId("step-02")
                        .setRunId("run-01")
                        .setSequence(2L)
                        .setStatus("running"));
        store.steps.put(
                "step-03",
                new AIRunStepDTO()
                        .setId("step-03")
                        .setRunId("run-01")
                        .setSequence(3L)
                        .setStatus("completed"));

        AIRunDTO result = new HarnessCoordinator().requestCancel(
                store.systemRuntime, "run-01", "user-01");

        assertEquals("cancelled", result.getStatus());
        assertEquals("cancelled", store.steps.get("step-01").getStatus());
        assertEquals("cancelled", store.steps.get("step-02").getStatus());
        assertEquals("completed", store.steps.get("step-03").getStatus());
        assertEquals(
                Arrays.asList(
                        "run.cancel_requested",
                        "step.cancelled",
                        "step.cancelled",
                        "run.cancelled"),
                eventTypes(store.events));
        assertEquals(
                Arrays.asList(1L, 2L, 3L, 4L),
                eventSequences(store.events));
    }

    @Test
    void repeatedCancellationDoesNotCreateDuplicateEvents() throws Throwable {
        TestStore store = new TestStore(
                new AIRunDTO()
                        .setId("run-01")
                        .setStatus("queued")
                        .setTraceId("trace-01"));
        HarnessCoordinator coordinator = new HarnessCoordinator();

        AIRunDTO first = coordinator.requestCancel(
                store.systemRuntime, "run-01", "user-01");
        AIRunDTO second = coordinator.requestCancel(
                store.systemRuntime, "run-01", "user-02");

        assertEquals("cancelled", first.getStatus());
        assertEquals("cancelled", second.getStatus());
        assertEquals(2, store.events.size());
        assertEquals(
                Arrays.asList(
                        "run.cancel_requested",
                        "run.cancelled"),
                eventTypes(store.events));
    }

    @Test
    void runningRunKeepsOneCancelRequestUntilExecutionCheckpoint() throws Throwable {
        TestStore store = new TestStore(
                new AIRunDTO()
                        .setId("run-01")
                        .setStatus("running")
                        .setTraceId("trace-01"));
        HarnessCoordinator coordinator = new HarnessCoordinator();

        AIRunDTO first = coordinator.requestCancel(
                store.systemRuntime, "run-01", "user-01");
        AIRunDTO second = coordinator.requestCancel(
                store.systemRuntime, "run-01", "user-02");

        assertEquals("running", first.getStatus());
        assertEquals("running", second.getStatus());
        assertEquals(1, store.events.size());
        assertEquals("run.cancel_requested",
                store.events.get(0).getEventType());
        assertEquals(1L, store.events.get(0).getSequence());
    }

    private static List<String> eventTypes(List<AIRunEventDTO> events) {
        List<String> result = new ArrayList<String>();
        for (AIRunEventDTO event : events) {
            result.add(event.getEventType());
        }
        return result;
    }

    private static List<Long> eventSequences(List<AIRunEventDTO> events) {
        List<Long> result = new ArrayList<Long>();
        for (AIRunEventDTO event : events) {
            result.add(event.getSequence());
        }
        return result;
    }

    private static final class TestStore {
        private final AIRunDTO run;
        private final Map<String, AIRunStepDTO> steps =
                new LinkedHashMap<String, AIRunStepDTO>();
        private final List<AIRunEventDTO> events =
                new ArrayList<AIRunEventDTO>();
        private final Map<Object, SearchState> searches =
                new IdentityHashMap<Object, SearchState>();
        private final ISystemRuntime systemRuntime;
        private final IDataEntityRuntime runRuntime;
        private final IDataEntityRuntime stepRuntime;
        private final IDataEntityRuntime eventRuntime;
        private final ISysDBSchemeRuntime runDb;
        private final ISysDBSchemeRuntime stepDb;
        private final ISysDBSchemeRuntime eventDb;

        private TestStore(AIRunDTO run) {
            this.run = run;
            this.runDb = database("run");
            this.stepDb = database("step");
            this.eventDb = database("event");
            this.runRuntime = runtime("run", runDb);
            this.stepRuntime = runtime("step", stepDb);
            this.eventRuntime = runtime("event", eventDb);
            this.systemRuntime = proxy(
                    ISystemRuntime.class,
                    (instance, method, args) -> {
                        if ("getDataEntityRuntime".equals(
                                method.getName())) {
                            String entityId = (String) args[0];
                            if (RUN_ENTITY_ID.equals(entityId)) {
                                return runRuntime;
                            }
                            if (STEP_ENTITY_ID.equals(entityId)) {
                                return stepRuntime;
                            }
                            if (EVENT_ENTITY_ID.equals(entityId)) {
                                return eventRuntime;
                            }
                        }
                        return defaultValue(method.getReturnType());
                    });
        }

        private ISysDBSchemeRuntime database(String kind) {
            return proxy(
                    ISysDBSchemeRuntime.class,
                    (instance, method, args) -> {
                        if (!"executeSelectSQL".equals(method.getName())) {
                            return defaultValue(method.getReturnType());
                        }
                        String sql = (String) args[0];
                        if ("run".equals(kind)) {
                            return run == null
                                    ? Collections.emptyList()
                                    : Collections.<Object>singletonList(
                                            new Object[] {run.getId()});
                        }
                        if ("step".equals(kind)
                                && sql.contains("AI_RUN_STEP")) {
                            String runId = String.valueOf(
                                    ((List<?>) args[1]).get(0));
                            List<Object> rows = new ArrayList<Object>();
                            for (AIRunStepDTO step : steps.values()) {
                                if (!Objects.equals(runId, step.getRunId())
                                        || isTerminal(step.getStatus())) {
                                    continue;
                                }
                                rows.add(new Object[] {step.getId()});
                            }
                            return rows;
                        }
                        return Collections.emptyList();
                    });
        }

        private IDataEntityRuntime runtime(
                String kind,
                ISysDBSchemeRuntime database) {
            return proxy(
                    IDataEntityRuntime.class,
                    (instance, method, args) -> {
                        String name = method.getName();
                        if ("getSysDBSchemeRuntimeMust".equals(name)) {
                            return database;
                        }
                        if ("rawGet".equals(name)) {
                            String id = (String) args[0];
                            if ("run".equals(kind)) {
                                return run != null
                                        && Objects.equals(id, run.getId())
                                        ? run : null;
                            }
                            if ("step".equals(kind)) {
                                return steps.get(id);
                            }
                            return null;
                        }
                        if ("createSearchContext".equals(name)) {
                            final SearchState state = new SearchState();
                            ISearchContextDTO search = proxy(
                                    ISearchContextDTO.class,
                                    (searchInstance,
                                     searchMethod,
                                     searchArgs) -> {
                                        if ("eq".equals(
                                                searchMethod.getName())) {
                                            state.conditions.put(
                                                    (String) searchArgs[0],
                                                    searchArgs[1]);
                                            return searchInstance;
                                        }
                                        if ("sort".equals(
                                                searchMethod.getName())
                                                || "limit".equals(
                                                searchMethod.getName())) {
                                            return searchInstance;
                                        }
                                        return defaultValue(
                                                searchMethod.getReturnType());
                                    });
                            searches.put(search, state);
                            return search;
                        }
                        if ("rawSelectOne".equals(name)) {
                            SearchState state = searches.get(args[0]);
                            return selectOne(kind, state);
                        }
                        if ("rawCreate".equals(name)
                                && "event".equals(kind)) {
                            for (Object item : (List<?>) args[0]) {
                                events.add((AIRunEventDTO) item);
                            }
                            return null;
                        }
                        if ("rawUpdate".equals(name)) {
                            for (Object item : (List<?>) args[0]) {
                                IEntityDTO source = (IEntityDTO) item;
                                if ("run".equals(kind)) {
                                    run.putAll(source.any());
                                } else if ("step".equals(kind)) {
                                    AIRunStepDTO step = steps.get(
                                            source.get(AIRunStepDTO.FIELD_ID)
                                                    .toString());
                                    if (step != null) {
                                        step.putAll(source.any());
                                    }
                                }
                            }
                            return null;
                        }
                        return defaultValue(method.getReturnType());
                    });
        }

        private IEntityDTO selectOne(String kind, SearchState state) {
            if (state == null) {
                return null;
            }
            if ("run".equals(kind)) {
                return matches(run, state.conditions) ? run : null;
            }
            if ("step".equals(kind)) {
                for (AIRunStepDTO step : steps.values()) {
                    if (matches(step, state.conditions)) {
                        return step;
                    }
                }
                return null;
            }
            for (AIRunEventDTO event : events) {
                if (matches(event, state.conditions)) {
                    return event;
                }
            }
            return null;
        }

        private boolean matches(IEntityDTO entity,
                                Map<String, Object> conditions) {
            if (entity == null) {
                return false;
            }
            for (Map.Entry<String, Object> condition
                    : conditions.entrySet()) {
                if (!Objects.equals(
                        entity.get(condition.getKey()),
                        condition.getValue())) {
                    return false;
                }
            }
            return true;
        }
    }

    private static final class SearchState {
        private final Map<String, Object> conditions =
                new LinkedHashMap<String, Object>();
    }

    private static boolean isTerminal(String status) {
        return "completed".equalsIgnoreCase(status)
                || "failed".equalsIgnoreCase(status)
                || "cancelled".equalsIgnoreCase(status);
    }

    private static <T> T proxy(Class<T> type,
                               InvocationHandler handler) {
        return type.cast(Proxy.newProxyInstance(
                HarnessCoordinatorCancellationTest.class.getClassLoader(),
                new Class<?>[] {type},
                (instance, method, args) -> {
                    if (method.getDeclaringClass().equals(Object.class)) {
                        return objectMethod(instance, method, args);
                    }
                    return handler.invoke(instance, method, args);
                }));
    }

    private static Object objectMethod(Object instance,
                                       Method method,
                                       Object[] args) {
        if ("equals".equals(method.getName())) {
            return instance == args[0];
        }
        if ("hashCode".equals(method.getName())) {
            return System.identityHashCode(instance);
        }
        if ("toString".equals(method.getName())) {
            return "HarnessCancellationTestProxy";
        }
        return null;
    }

    private static Object defaultValue(Class<?> type) {
        if (!type.isPrimitive()) {
            return null;
        }
        if (boolean.class.equals(type)) {
            return false;
        }
        if (char.class.equals(type)) {
            return '\0';
        }
        if (byte.class.equals(type)) {
            return (byte) 0;
        }
        if (short.class.equals(type)) {
            return (short) 0;
        }
        if (int.class.equals(type)) {
            return 0;
        }
        if (long.class.equals(type)) {
            return 0L;
        }
        if (float.class.equals(type)) {
            return 0F;
        }
        if (double.class.equals(type)) {
            return 0D;
        }
        return null;
    }
}
