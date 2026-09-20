package cn.ibizlab.runner.servicerunner.harness.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.central.util.EntityDTO;

import java.sql.Timestamp;

public class AIRunEventDTO extends EntityDTO {

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_CREATEMAN = "create_man";
    public static final String FIELD_CREATETIME = "create_time";
    public static final String FIELD_UPDATEMAN = "update_man";
    public static final String FIELD_UPDATETIME = "update_time";
    public static final String FIELD_RUNID = "run_id";
    public static final String FIELD_STEPID = "step_id";
    public static final String FIELD_SEQUENCE = "sequence";
    public static final String FIELD_EVENTTYPE = "event_type";
    public static final String FIELD_AGGREGATEVERSION = "aggregate_version";
    public static final String FIELD_IDEMPOTENCYKEY = "idempotency_key";
    public static final String FIELD_ACTORTYPE = "actor_type";
    public static final String FIELD_ACTORID = "actor_id";
    public static final String FIELD_TRACEID = "trace_id";
    public static final String FIELD_OCCURREDAT = "occurred_at";
    public static final String FIELD_PAYLOADJSON = "payload_json";

    @JsonIgnore
    public AIRunEventDTO setId(String val) { this._set(FIELD_ID, val); return this; }
    @JsonIgnore
    public String getId() { return (String) this._get(FIELD_ID); }
    @JsonIgnore
    public boolean containsId() { return this._contains(FIELD_ID); }
    @JsonIgnore
    public AIRunEventDTO resetId() { this._reset(FIELD_ID); return this; }

    @JsonIgnore
    public AIRunEventDTO setName(String val) { this._set(FIELD_NAME, val); return this; }
    @JsonIgnore
    public String getName() { return (String) this._get(FIELD_NAME); }
    @JsonIgnore
    public boolean containsName() { return this._contains(FIELD_NAME); }
    @JsonIgnore
    public AIRunEventDTO resetName() { this._reset(FIELD_NAME); return this; }

    @JsonIgnore
    public AIRunEventDTO setCreateMan(String val) { this._set(FIELD_CREATEMAN, val); return this; }
    @JsonIgnore
    public String getCreateMan() { return (String) this._get(FIELD_CREATEMAN); }
    @JsonIgnore
    public boolean containsCreateMan() { return this._contains(FIELD_CREATEMAN); }
    @JsonIgnore
    public AIRunEventDTO resetCreateMan() { this._reset(FIELD_CREATEMAN); return this; }

    @JsonIgnore
    public AIRunEventDTO setCreateTime(Timestamp val) { this._set(FIELD_CREATETIME, val); return this; }
    @JsonIgnore
    public Timestamp getCreateTime() { return (Timestamp) this._get(FIELD_CREATETIME); }
    @JsonIgnore
    public boolean containsCreateTime() { return this._contains(FIELD_CREATETIME); }
    @JsonIgnore
    public AIRunEventDTO resetCreateTime() { this._reset(FIELD_CREATETIME); return this; }

    @JsonIgnore
    public AIRunEventDTO setUpdateMan(String val) { this._set(FIELD_UPDATEMAN, val); return this; }
    @JsonIgnore
    public String getUpdateMan() { return (String) this._get(FIELD_UPDATEMAN); }
    @JsonIgnore
    public boolean containsUpdateMan() { return this._contains(FIELD_UPDATEMAN); }
    @JsonIgnore
    public AIRunEventDTO resetUpdateMan() { this._reset(FIELD_UPDATEMAN); return this; }

    @JsonIgnore
    public AIRunEventDTO setUpdateTime(Timestamp val) { this._set(FIELD_UPDATETIME, val); return this; }
    @JsonIgnore
    public Timestamp getUpdateTime() { return (Timestamp) this._get(FIELD_UPDATETIME); }
    @JsonIgnore
    public boolean containsUpdateTime() { return this._contains(FIELD_UPDATETIME); }
    @JsonIgnore
    public AIRunEventDTO resetUpdateTime() { this._reset(FIELD_UPDATETIME); return this; }

    @JsonIgnore
    public AIRunEventDTO setRunId(String val) { this._set(FIELD_RUNID, val); return this; }
    @JsonIgnore
    public String getRunId() { return (String) this._get(FIELD_RUNID); }
    @JsonIgnore
    public boolean containsRunId() { return this._contains(FIELD_RUNID); }
    @JsonIgnore
    public AIRunEventDTO resetRunId() { this._reset(FIELD_RUNID); return this; }

    @JsonIgnore
    public AIRunEventDTO setStepId(String val) { this._set(FIELD_STEPID, val); return this; }
    @JsonIgnore
    public String getStepId() { return (String) this._get(FIELD_STEPID); }
    @JsonIgnore
    public boolean containsStepId() { return this._contains(FIELD_STEPID); }
    @JsonIgnore
    public AIRunEventDTO resetStepId() { this._reset(FIELD_STEPID); return this; }

    @JsonIgnore
    public AIRunEventDTO setSequence(Long val) { this._set(FIELD_SEQUENCE, val); return this; }
    @JsonIgnore
    public Long getSequence() { return getLongValue(FIELD_SEQUENCE); }
    @JsonIgnore
    public boolean containsSequence() { return this._contains(FIELD_SEQUENCE); }
    @JsonIgnore
    public AIRunEventDTO resetSequence() { this._reset(FIELD_SEQUENCE); return this; }

    @JsonIgnore
    public AIRunEventDTO setEventType(String val) { this._set(FIELD_EVENTTYPE, val); return this; }
    @JsonIgnore
    public String getEventType() { return (String) this._get(FIELD_EVENTTYPE); }
    @JsonIgnore
    public boolean containsEventType() { return this._contains(FIELD_EVENTTYPE); }
    @JsonIgnore
    public AIRunEventDTO resetEventType() { this._reset(FIELD_EVENTTYPE); return this; }

    @JsonIgnore
    public AIRunEventDTO setAggregateVersion(Long val) { this._set(FIELD_AGGREGATEVERSION, val); return this; }
    @JsonIgnore
    public Long getAggregateVersion() { return getLongValue(FIELD_AGGREGATEVERSION); }
    @JsonIgnore
    public boolean containsAggregateVersion() { return this._contains(FIELD_AGGREGATEVERSION); }
    @JsonIgnore
    public AIRunEventDTO resetAggregateVersion() { this._reset(FIELD_AGGREGATEVERSION); return this; }

    @JsonIgnore
    public AIRunEventDTO setIdempotencyKey(String val) { this._set(FIELD_IDEMPOTENCYKEY, val); return this; }
    @JsonIgnore
    public String getIdempotencyKey() { return (String) this._get(FIELD_IDEMPOTENCYKEY); }
    @JsonIgnore
    public boolean containsIdempotencyKey() { return this._contains(FIELD_IDEMPOTENCYKEY); }
    @JsonIgnore
    public AIRunEventDTO resetIdempotencyKey() { this._reset(FIELD_IDEMPOTENCYKEY); return this; }

    @JsonIgnore
    public AIRunEventDTO setActorType(String val) { this._set(FIELD_ACTORTYPE, val); return this; }
    @JsonIgnore
    public String getActorType() { return (String) this._get(FIELD_ACTORTYPE); }
    @JsonIgnore
    public boolean containsActorType() { return this._contains(FIELD_ACTORTYPE); }
    @JsonIgnore
    public AIRunEventDTO resetActorType() { this._reset(FIELD_ACTORTYPE); return this; }

    @JsonIgnore
    public AIRunEventDTO setActorId(String val) { this._set(FIELD_ACTORID, val); return this; }
    @JsonIgnore
    public String getActorId() { return (String) this._get(FIELD_ACTORID); }
    @JsonIgnore
    public boolean containsActorId() { return this._contains(FIELD_ACTORID); }
    @JsonIgnore
    public AIRunEventDTO resetActorId() { this._reset(FIELD_ACTORID); return this; }

    @JsonIgnore
    public AIRunEventDTO setTraceId(String val) { this._set(FIELD_TRACEID, val); return this; }
    @JsonIgnore
    public String getTraceId() { return (String) this._get(FIELD_TRACEID); }
    @JsonIgnore
    public boolean containsTraceId() { return this._contains(FIELD_TRACEID); }
    @JsonIgnore
    public AIRunEventDTO resetTraceId() { this._reset(FIELD_TRACEID); return this; }

    @JsonIgnore
    public AIRunEventDTO setOccurredAt(Timestamp val) { this._set(FIELD_OCCURREDAT, val); return this; }
    @JsonIgnore
    public Timestamp getOccurredAt() { return (Timestamp) this._get(FIELD_OCCURREDAT); }
    @JsonIgnore
    public boolean containsOccurredAt() { return this._contains(FIELD_OCCURREDAT); }
    @JsonIgnore
    public AIRunEventDTO resetOccurredAt() { this._reset(FIELD_OCCURREDAT); return this; }

    @JsonIgnore
    public AIRunEventDTO setPayloadJson(String val) { this._set(FIELD_PAYLOADJSON, val); return this; }
    @JsonIgnore
    public String getPayloadJson() { return (String) this._get(FIELD_PAYLOADJSON); }
    @JsonIgnore
    public boolean containsPayloadJson() { return this._contains(FIELD_PAYLOADJSON); }
    @JsonIgnore
    public AIRunEventDTO resetPayloadJson() { this._reset(FIELD_PAYLOADJSON); return this; }

    private Long getLongValue(String field) {
        Object value = this._get(field);
        if (value == null) {
            return null;
        }
        if (value instanceof Number) {
            return ((Number) value).longValue();
        }
        return Long.valueOf(value.toString());
    }
}
