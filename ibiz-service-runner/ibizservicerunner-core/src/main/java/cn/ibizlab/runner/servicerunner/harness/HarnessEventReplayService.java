package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class HarnessEventReplayService {

    public static final int DEFAULT_LIMIT = 100;
    public static final int MAX_LIMIT = 500;

    private static final String RUN_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run.json";
    private static final String EVENT_ENTITY_ID =
            "PSMODULES/ai/PSDATAENTITIES/ai_run_event.json";

    public HarnessEventReplay replay(
            net.ibizsys.central.ISystemRuntime systemRuntime,
            String runId,
            String afterCursor,
            int limit) throws Throwable {
        requireSystemRuntime(systemRuntime);
        requireRunId(runId);
        validateLimit(limit);
        getRun(systemRuntime, runId);

        long afterSequence = 0L;
        if (afterCursor != null && !afterCursor.trim().isEmpty()) {
            HarnessEventReplayCursor cursor =
                    HarnessEventReplayCursor.decode(afterCursor);
            if (!runId.equals(cursor.getRunId())) {
                throw new IllegalArgumentException(
                        "Harness event cursor belongs to another Run");
            }
            afterSequence = cursor.getSequence();
        }

        IDataEntityRuntime eventRuntime =
                systemRuntime.getDataEntityRuntime(EVENT_ENTITY_ID, false);
        int queryLimit = limit + 1;
        String sql = "SELECT ID AS id, RUN_ID AS run_id,"
                + " STEP_ID AS step_id, SEQUENCE AS sequence,"
                + " EVENT_TYPE AS event_type,"
                + " AGGREGATE_VERSION AS aggregate_version,"
                + " IDEMPOTENCY_KEY AS idempotency_key,"
                + " ACTOR_TYPE AS actor_type, ACTOR_ID AS actor_id,"
                + " TRACE_ID AS trace_id, OCCURRED_AT AS occurred_at,"
                + " PAYLOAD_JSON AS payload_json"
                + " FROM AI_RUN_EVENT"
                + " WHERE RUN_ID = ? AND SEQUENCE > ?"
                + " ORDER BY SEQUENCE ASC"
                + " LIMIT " + queryLimit;
        List<?> rows = eventRuntime.getSysDBSchemeRuntimeMust()
                .executeSelectSQL(
                        sql,
                        Arrays.<Object>asList(runId, afterSequence));

        boolean hasMore = rows != null && rows.size() > limit;
        int eventCount = rows == null
                ? 0 : Math.min(rows.size(), limit);
        List<AIRunEventDTO> events =
                new ArrayList<AIRunEventDTO>(eventCount);
        long lastSequence = afterSequence;
        for (int index = 0; index < eventCount; index++) {
            AIRunEventDTO event = mapEventRow(rows.get(index));
            if (!runId.equals(event.getRunId())) {
                throw new IllegalStateException(
                        "Replay query returned an Event for another Run");
            }
            if (event.getSequence() == null
                    || event.getSequence().longValue() <= lastSequence) {
                throw new IllegalStateException(
                        "Replay query returned a non-increasing Event sequence");
            }
            lastSequence = event.getSequence().longValue();
            events.add(event);
        }
        return new HarnessEventReplay(
                events,
                HarnessEventReplayCursor.encode(runId, lastSequence),
                lastSequence,
                hasMore);
    }

    public AIRunDTO getRun(
            net.ibizsys.central.ISystemRuntime systemRuntime,
            String runId) throws Throwable {
        requireSystemRuntime(systemRuntime);
        requireRunId(runId);
        IDataEntityRuntime runRuntime =
                systemRuntime.getDataEntityRuntime(RUN_ENTITY_ID, false);
        IEntityDTO value = runRuntime.rawGet(runId);
        if (value == null) {
            throw new IllegalArgumentException(
                    "Run does not exist: " + runId);
        }
        if (value instanceof AIRunDTO) {
            return (AIRunDTO) value;
        }
        try {
            AIRunDTO result = new AIRunDTO();
            result.reload(value, true);
            return result;
        } catch (Exception ex) {
            throw new IllegalStateException("Failed to copy AI_RUN DTO", ex);
        }
    }

    AIRunEventDTO mapEventRow(Object row) {
        if (row instanceof AIRunEventDTO) {
            return (AIRunEventDTO) row;
        }
        AIRunEventDTO event = new AIRunEventDTO()
                .setId(stringValue(value(row, 0, "id")))
                .setRunId(stringValue(value(row, 1, "run_id")))
                .setStepId(stringValue(value(row, 2, "step_id")))
                .setSequence(longValue(value(row, 3, "sequence")))
                .setEventType(stringValue(value(row, 4, "event_type")))
                .setAggregateVersion(longValue(
                        value(row, 5, "aggregate_version")))
                .setIdempotencyKey(stringValue(
                        value(row, 6, "idempotency_key")))
                .setActorType(stringValue(value(row, 7, "actor_type")))
                .setActorId(stringValue(value(row, 8, "actor_id")))
                .setTraceId(stringValue(value(row, 9, "trace_id")))
                .setOccurredAt(timestampValue(
                        value(row, 10, "occurred_at")))
                .setPayloadJson(stringValue(
                        value(row, 11, "payload_json")));
        if (event.getRunId() == null || event.getSequence() == null
                || event.getEventType() == null) {
            throw new IllegalStateException(
                    "Replay query returned an incomplete Event row");
        }
        return event;
    }

    private Object value(Object row, int index, String fieldName) {
        if (row == null) {
            return null;
        }
        if (row instanceof IEntityDTO) {
            IEntityDTO entity = (IEntityDTO) row;
            Object result = entity.get(fieldName);
            return result == null
                    ? entity.get(fieldName.toUpperCase()) : result;
        }
        if (row instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) row;
            Object result = map.get(fieldName);
            if (result != null) {
                return result;
            }
            result = map.get(fieldName.toUpperCase());
            if (result != null) {
                return result;
            }
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry.getKey() != null
                        && fieldName.equalsIgnoreCase(
                                entry.getKey().toString())) {
                    return entry.getValue();
                }
            }
            return null;
        }
        if (row instanceof Object[]) {
            Object[] values = (Object[]) row;
            return index < values.length ? values[index] : null;
        }
        if (row instanceof List) {
            List<?> values = (List<?>) row;
            return index < values.size() ? values.get(index) : null;
        }
        throw new IllegalStateException(
                "Unsupported Replay SQL row type: "
                        + row.getClass().getName());
    }

    private String stringValue(Object value) {
        return value == null ? null : value.toString();
    }

    private Long longValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Number) {
            return ((Number) value).longValue();
        }
        try {
            return Long.valueOf(value.toString());
        } catch (NumberFormatException ex) {
            throw new IllegalStateException(
                    "Replay Event sequence is not numeric", ex);
        }
    }

    private Timestamp timestampValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Timestamp) {
            return (Timestamp) value;
        }
        if (value instanceof Date) {
            return new Timestamp(((Date) value).getTime());
        }
        if (value instanceof Number) {
            return new Timestamp(((Number) value).longValue());
        }
        String text = value.toString();
        try {
            return Timestamp.from(Instant.parse(text));
        } catch (DateTimeParseException ex) {
            try {
                return Timestamp.valueOf(text);
            } catch (IllegalArgumentException nested) {
                throw new IllegalStateException(
                        "Replay Event occurred_at is invalid", nested);
            }
        }
    }

    private void requireSystemRuntime(
            net.ibizsys.central.ISystemRuntime systemRuntime) {
        if (systemRuntime == null) {
            throw new IllegalArgumentException(
                    "Harness Replay requires a SystemRuntime");
        }
    }

    private void requireRunId(String runId) {
        if (runId == null || runId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Harness Replay requires runId");
        }
    }

    private void validateLimit(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException(
                    "Harness Replay limit must be positive");
        }
        if (limit > MAX_LIMIT) {
            throw new IllegalArgumentException(
                    "Harness Replay limit must not exceed " + MAX_LIMIT);
        }
    }
}
