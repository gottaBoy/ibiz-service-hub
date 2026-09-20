package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessEventReplayServiceTest {

    private static final String RUN_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run.json";
    private static final String EVENT_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run_event.json";

    @Test
    void mapsRowsAndUsesLimitPlusOneForPagination() throws Throwable {
        AIRunDTO run = new AIRunDTO()
                .setId("run-01")
                .setStatus("running");
        List<Object> rows = Arrays.<Object>asList(
                mapRow(1L, "step-01", "step.started"),
                new Object[] {
                        "event-02", "run-01", "step-02", 2L,
                        "step.completed", 2L, "key-02", "system",
                        null, "trace-01", new Timestamp(2000L), "{}"
                },
                Arrays.<Object>asList(
                        "event-03", "run-01", null, 3L, "run.completed",
                        3L, "key-03", "system", null, "trace-01",
                        "1970-01-01T00:00:04Z", "{}"));
        AtomicReference<String> sql = new AtomicReference<String>();
        AtomicReference<List<?>> parameters =
                new AtomicReference<List<?>>();

        ISystemRuntime systemRuntime = systemRuntime(
                runtimeWithRun(run),
                runtimeWithRows(rows, sql, parameters));

        HarnessEventReplay replay = new HarnessEventReplayService().replay(
                systemRuntime, "run-01", null, 2);

        assertEquals(2, replay.getEvents().size());
        assertEquals("step.started",
                replay.getEvents().get(0).getEventType());
        assertEquals("step.completed",
                replay.getEvents().get(1).getEventType());
        assertEquals(2L, replay.getLastSequence());
        assertTrue(replay.isHasMore());
        HarnessEventReplayCursor cursor =
                HarnessEventReplayCursor.decode(replay.getNextCursor());
        assertEquals("run-01", cursor.getRunId());
        assertEquals(2L, cursor.getSequence());
        assertTrue(sql.get().contains("LIMIT 3"));
        assertEquals(Arrays.<Object>asList("run-01", 0L), parameters.get());
    }

    @Test
    void startsAfterCursorAndSupportsDtoRows() throws Throwable {
        AIRunDTO run = new AIRunDTO()
                .setId("run-01")
                .setStatus("completed");
        AIRunEventDTO event = new AIRunEventDTO()
                .setId("event-04")
                .setRunId("run-01")
                .setSequence(4L)
                .setEventType("run.completed");
        AtomicReference<List<?>> parameters =
                new AtomicReference<List<?>>();
        ISystemRuntime systemRuntime = systemRuntime(
                runtimeWithRun(run),
                runtimeWithRows(
                        Collections.<Object>singletonList(event),
                        null,
                        parameters));
        String cursor = HarnessEventReplayCursor.encode("run-01", 3L);

        HarnessEventReplay replay = new HarnessEventReplayService().replay(
                systemRuntime, "run-01", cursor, 10);

        assertEquals(1, replay.getEvents().size());
        assertEquals(4L, replay.getLastSequence());
        assertFalse(replay.isHasMore());
        assertEquals(Arrays.<Object>asList("run-01", 3L), parameters.get());
    }

    @Test
    void rejectsInvalidLimitAndCursorRun() throws Throwable {
        AIRunDTO run = new AIRunDTO()
                .setId("run-01")
                .setStatus("running");
        ISystemRuntime systemRuntime = systemRuntime(
                runtimeWithRun(run),
                runtimeWithRows(Collections.emptyList(), null, null));
        HarnessEventReplayService service = new HarnessEventReplayService();

        assertThrows(IllegalArgumentException.class,
                () -> service.replay(systemRuntime, "run-01", null, 0));
        assertThrows(IllegalArgumentException.class,
                () -> service.replay(systemRuntime, "run-01", null,
                        HarnessEventReplayService.MAX_LIMIT + 1));
        assertThrows(IllegalArgumentException.class,
                () -> service.replay(
                        systemRuntime,
                        "run-01",
                        HarnessEventReplayCursor.encode("run-02", 1L),
                        10));
    }

    @Test
    void mapsAllSupportedScalarTypes() {
        HarnessEventReplayService service = new HarnessEventReplayService();
        Map<String, Object> row = mapRow(
                "5", "step-05", "tool.completed");
        row.put("occurred_at", "1970-01-01T00:00:06Z");

        AIRunEventDTO event = service.mapEventRow(row);

        assertEquals("event-05", event.getId());
        assertEquals(5L, event.getSequence());
        assertEquals(5L, event.getAggregateVersion());
        assertEquals(new Timestamp(6000L), event.getOccurredAt());
    }

    private static Map<String, Object> mapRow(Object sequence,
                                               String stepId,
                                               String eventType) {
        Map<String, Object> row = new HashMap<String, Object>();
        row.put("ID", "event-0" + sequence);
        row.put("RUN_ID", "run-01");
        row.put("STEP_ID", stepId);
        row.put("SEQUENCE", sequence);
        row.put("EVENT_TYPE", eventType);
        row.put("AGGREGATE_VERSION", sequence);
        row.put("IDEMPOTENCY_KEY", "key-" + sequence);
        row.put("ACTOR_TYPE", "system");
        row.put("ACTOR_ID", null);
        row.put("TRACE_ID", "trace-01");
        row.put("OCCURRED_AT", new Timestamp(1000L));
        row.put("PAYLOAD_JSON", "{}");
        return row;
    }

    private static ISystemRuntime systemRuntime(
            IDataEntityRuntime runRuntime,
            IDataEntityRuntime eventRuntime) {
        return proxy(
                ISystemRuntime.class,
                (instance, method, args) -> {
                    if ("getDataEntityRuntime".equals(method.getName())) {
                        String entityId = (String) args[0];
                        return RUN_ENTITY_ID.equals(entityId)
                                ? runRuntime : eventRuntime;
                    }
                    return defaultValue(method.getReturnType());
                });
    }

    private static IDataEntityRuntime runtimeWithRun(AIRunDTO run) {
        return runtime(run, null, null, null);
    }

    private static IDataEntityRuntime runtimeWithRows(
            List<?> rows,
            AtomicReference<String> sql,
            AtomicReference<List<?>> parameters) {
        return runtime(null, rows, sql, parameters);
    }

    private static IDataEntityRuntime runtime(
            AIRunDTO run,
            List<?> rows,
            AtomicReference<String> sql,
            AtomicReference<List<?>> parameters) {
        ISysDBSchemeRuntime db = proxy(
                ISysDBSchemeRuntime.class,
                (instance, method, args) -> {
                    if ("executeSelectSQL".equals(method.getName())) {
                        if (sql != null) {
                            sql.set((String) args[0]);
                        }
                        if (parameters != null) {
                            parameters.set((List<?>) args[1]);
                        }
                        return rows == null
                                ? Collections.emptyList() : rows;
                    }
                    return defaultValue(method.getReturnType());
                });
        return proxy(
                IDataEntityRuntime.class,
                (instance, method, args) -> {
                    if ("rawGet".equals(method.getName())) {
                        return run;
                    }
                    if ("getSysDBSchemeRuntimeMust".equals(method.getName())) {
                        return db;
                    }
                    return defaultValue(method.getReturnType());
                });
    }

    private static <T> T proxy(Class<T> type,
                               InvocationHandler handler) {
        return type.cast(Proxy.newProxyInstance(
                HarnessEventReplayServiceTest.class.getClassLoader(),
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
            return "HarnessTestProxy";
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
