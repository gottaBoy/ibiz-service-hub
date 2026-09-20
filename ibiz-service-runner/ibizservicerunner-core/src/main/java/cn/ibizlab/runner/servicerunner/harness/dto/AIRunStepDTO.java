package cn.ibizlab.runner.servicerunner.harness.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.central.util.EntityDTO;

import java.sql.Timestamp;

public class AIRunStepDTO extends EntityDTO {

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_CREATEMAN = "create_man";
    public static final String FIELD_CREATETIME = "create_time";
    public static final String FIELD_UPDATEMAN = "update_man";
    public static final String FIELD_UPDATETIME = "update_time";
    public static final String FIELD_RUNID = "run_id";
    public static final String FIELD_SEQUENCE = "sequence";
    public static final String FIELD_ATTEMPT = "attempt";
    public static final String FIELD_STEPKIND = "step_kind";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_INPUTJSON = "input_json";
    public static final String FIELD_OUTPUTJSON = "output_json";
    public static final String FIELD_TOOLNAME = "tool_name";
    public static final String FIELD_TOOLCALLID = "tool_call_id";
    public static final String FIELD_IDEMPOTENCYKEY = "idempotency_key";
    public static final String FIELD_RETRYCOUNT = "retry_count";
    public static final String FIELD_ERRORCODE = "error_code";
    public static final String FIELD_ERRORMESSAGE = "error_message";
    public static final String FIELD_STARTEDAT = "started_at";
    public static final String FIELD_FINISHEDAT = "finished_at";
    public static final String FIELD_DURATIONMS = "duration_ms";
    public static final String FIELD_LASTEVENTSEQUENCE = "last_event_sequence";

    @JsonIgnore
    public AIRunStepDTO setId(String val) { this._set(FIELD_ID, val); return this; }
    @JsonIgnore
    public String getId() { return (String) this._get(FIELD_ID); }
    @JsonIgnore
    public boolean containsId() { return this._contains(FIELD_ID); }
    @JsonIgnore
    public AIRunStepDTO resetId() { this._reset(FIELD_ID); return this; }

    @JsonIgnore
    public AIRunStepDTO setName(String val) { this._set(FIELD_NAME, val); return this; }
    @JsonIgnore
    public String getName() { return (String) this._get(FIELD_NAME); }
    @JsonIgnore
    public boolean containsName() { return this._contains(FIELD_NAME); }
    @JsonIgnore
    public AIRunStepDTO resetName() { this._reset(FIELD_NAME); return this; }

    @JsonIgnore
    public AIRunStepDTO setCreateMan(String val) { this._set(FIELD_CREATEMAN, val); return this; }
    @JsonIgnore
    public String getCreateMan() { return (String) this._get(FIELD_CREATEMAN); }
    @JsonIgnore
    public boolean containsCreateMan() { return this._contains(FIELD_CREATEMAN); }
    @JsonIgnore
    public AIRunStepDTO resetCreateMan() { this._reset(FIELD_CREATEMAN); return this; }

    @JsonIgnore
    public AIRunStepDTO setCreateTime(Timestamp val) { this._set(FIELD_CREATETIME, val); return this; }
    @JsonIgnore
    public Timestamp getCreateTime() { return (Timestamp) this._get(FIELD_CREATETIME); }
    @JsonIgnore
    public boolean containsCreateTime() { return this._contains(FIELD_CREATETIME); }
    @JsonIgnore
    public AIRunStepDTO resetCreateTime() { this._reset(FIELD_CREATETIME); return this; }

    @JsonIgnore
    public AIRunStepDTO setUpdateMan(String val) { this._set(FIELD_UPDATEMAN, val); return this; }
    @JsonIgnore
    public String getUpdateMan() { return (String) this._get(FIELD_UPDATEMAN); }
    @JsonIgnore
    public boolean containsUpdateMan() { return this._contains(FIELD_UPDATEMAN); }
    @JsonIgnore
    public AIRunStepDTO resetUpdateMan() { this._reset(FIELD_UPDATEMAN); return this; }

    @JsonIgnore
    public AIRunStepDTO setUpdateTime(Timestamp val) { this._set(FIELD_UPDATETIME, val); return this; }
    @JsonIgnore
    public Timestamp getUpdateTime() { return (Timestamp) this._get(FIELD_UPDATETIME); }
    @JsonIgnore
    public boolean containsUpdateTime() { return this._contains(FIELD_UPDATETIME); }
    @JsonIgnore
    public AIRunStepDTO resetUpdateTime() { this._reset(FIELD_UPDATETIME); return this; }

    @JsonIgnore
    public AIRunStepDTO setRunId(String val) { this._set(FIELD_RUNID, val); return this; }
    @JsonIgnore
    public String getRunId() { return (String) this._get(FIELD_RUNID); }
    @JsonIgnore
    public boolean containsRunId() { return this._contains(FIELD_RUNID); }
    @JsonIgnore
    public AIRunStepDTO resetRunId() { this._reset(FIELD_RUNID); return this; }

    @JsonIgnore
    public AIRunStepDTO setSequence(Long val) { this._set(FIELD_SEQUENCE, val); return this; }
    @JsonIgnore
    public Long getSequence() { return getLongValue(FIELD_SEQUENCE); }
    @JsonIgnore
    public boolean containsSequence() { return this._contains(FIELD_SEQUENCE); }
    @JsonIgnore
    public AIRunStepDTO resetSequence() { this._reset(FIELD_SEQUENCE); return this; }

    @JsonIgnore
    public AIRunStepDTO setAttempt(Integer val) { this._set(FIELD_ATTEMPT, val); return this; }
    @JsonIgnore
    public Integer getAttempt() { return getIntegerValue(FIELD_ATTEMPT); }
    @JsonIgnore
    public boolean containsAttempt() { return this._contains(FIELD_ATTEMPT); }
    @JsonIgnore
    public AIRunStepDTO resetAttempt() { this._reset(FIELD_ATTEMPT); return this; }

    @JsonIgnore
    public AIRunStepDTO setStepKind(String val) { this._set(FIELD_STEPKIND, val); return this; }
    @JsonIgnore
    public String getStepKind() { return (String) this._get(FIELD_STEPKIND); }
    @JsonIgnore
    public boolean containsStepKind() { return this._contains(FIELD_STEPKIND); }
    @JsonIgnore
    public AIRunStepDTO resetStepKind() { this._reset(FIELD_STEPKIND); return this; }

    @JsonIgnore
    public AIRunStepDTO setStatus(String val) { this._set(FIELD_STATUS, val); return this; }
    @JsonIgnore
    public String getStatus() { return (String) this._get(FIELD_STATUS); }
    @JsonIgnore
    public boolean containsStatus() { return this._contains(FIELD_STATUS); }
    @JsonIgnore
    public AIRunStepDTO resetStatus() { this._reset(FIELD_STATUS); return this; }

    @JsonIgnore
    public AIRunStepDTO setInputJson(String val) { this._set(FIELD_INPUTJSON, val); return this; }
    @JsonIgnore
    public String getInputJson() { return (String) this._get(FIELD_INPUTJSON); }
    @JsonIgnore
    public boolean containsInputJson() { return this._contains(FIELD_INPUTJSON); }
    @JsonIgnore
    public AIRunStepDTO resetInputJson() { this._reset(FIELD_INPUTJSON); return this; }

    @JsonIgnore
    public AIRunStepDTO setOutputJson(String val) { this._set(FIELD_OUTPUTJSON, val); return this; }
    @JsonIgnore
    public String getOutputJson() { return (String) this._get(FIELD_OUTPUTJSON); }
    @JsonIgnore
    public boolean containsOutputJson() { return this._contains(FIELD_OUTPUTJSON); }
    @JsonIgnore
    public AIRunStepDTO resetOutputJson() { this._reset(FIELD_OUTPUTJSON); return this; }

    @JsonIgnore
    public AIRunStepDTO setToolName(String val) { this._set(FIELD_TOOLNAME, val); return this; }
    @JsonIgnore
    public String getToolName() { return (String) this._get(FIELD_TOOLNAME); }
    @JsonIgnore
    public boolean containsToolName() { return this._contains(FIELD_TOOLNAME); }
    @JsonIgnore
    public AIRunStepDTO resetToolName() { this._reset(FIELD_TOOLNAME); return this; }

    @JsonIgnore
    public AIRunStepDTO setToolCallId(String val) { this._set(FIELD_TOOLCALLID, val); return this; }
    @JsonIgnore
    public String getToolCallId() { return (String) this._get(FIELD_TOOLCALLID); }
    @JsonIgnore
    public boolean containsToolCallId() { return this._contains(FIELD_TOOLCALLID); }
    @JsonIgnore
    public AIRunStepDTO resetToolCallId() { this._reset(FIELD_TOOLCALLID); return this; }

    @JsonIgnore
    public AIRunStepDTO setIdempotencyKey(String val) { this._set(FIELD_IDEMPOTENCYKEY, val); return this; }
    @JsonIgnore
    public String getIdempotencyKey() { return (String) this._get(FIELD_IDEMPOTENCYKEY); }
    @JsonIgnore
    public boolean containsIdempotencyKey() { return this._contains(FIELD_IDEMPOTENCYKEY); }
    @JsonIgnore
    public AIRunStepDTO resetIdempotencyKey() { this._reset(FIELD_IDEMPOTENCYKEY); return this; }

    @JsonIgnore
    public AIRunStepDTO setRetryCount(Integer val) { this._set(FIELD_RETRYCOUNT, val); return this; }
    @JsonIgnore
    public Integer getRetryCount() { return getIntegerValue(FIELD_RETRYCOUNT); }
    @JsonIgnore
    public boolean containsRetryCount() { return this._contains(FIELD_RETRYCOUNT); }
    @JsonIgnore
    public AIRunStepDTO resetRetryCount() { this._reset(FIELD_RETRYCOUNT); return this; }

    @JsonIgnore
    public AIRunStepDTO setErrorCode(String val) { this._set(FIELD_ERRORCODE, val); return this; }
    @JsonIgnore
    public String getErrorCode() { return (String) this._get(FIELD_ERRORCODE); }
    @JsonIgnore
    public boolean containsErrorCode() { return this._contains(FIELD_ERRORCODE); }
    @JsonIgnore
    public AIRunStepDTO resetErrorCode() { this._reset(FIELD_ERRORCODE); return this; }

    @JsonIgnore
    public AIRunStepDTO setErrorMessage(String val) { this._set(FIELD_ERRORMESSAGE, val); return this; }
    @JsonIgnore
    public String getErrorMessage() { return (String) this._get(FIELD_ERRORMESSAGE); }
    @JsonIgnore
    public boolean containsErrorMessage() { return this._contains(FIELD_ERRORMESSAGE); }
    @JsonIgnore
    public AIRunStepDTO resetErrorMessage() { this._reset(FIELD_ERRORMESSAGE); return this; }

    @JsonIgnore
    public AIRunStepDTO setStartedAt(Timestamp val) { this._set(FIELD_STARTEDAT, val); return this; }
    @JsonIgnore
    public Timestamp getStartedAt() { return (Timestamp) this._get(FIELD_STARTEDAT); }
    @JsonIgnore
    public boolean containsStartedAt() { return this._contains(FIELD_STARTEDAT); }
    @JsonIgnore
    public AIRunStepDTO resetStartedAt() { this._reset(FIELD_STARTEDAT); return this; }

    @JsonIgnore
    public AIRunStepDTO setFinishedAt(Timestamp val) { this._set(FIELD_FINISHEDAT, val); return this; }
    @JsonIgnore
    public Timestamp getFinishedAt() { return (Timestamp) this._get(FIELD_FINISHEDAT); }
    @JsonIgnore
    public boolean containsFinishedAt() { return this._contains(FIELD_FINISHEDAT); }
    @JsonIgnore
    public AIRunStepDTO resetFinishedAt() { this._reset(FIELD_FINISHEDAT); return this; }

    @JsonIgnore
    public AIRunStepDTO setDurationMs(Long val) { this._set(FIELD_DURATIONMS, val); return this; }
    @JsonIgnore
    public Long getDurationMs() { return getLongValue(FIELD_DURATIONMS); }
    @JsonIgnore
    public boolean containsDurationMs() { return this._contains(FIELD_DURATIONMS); }
    @JsonIgnore
    public AIRunStepDTO resetDurationMs() { this._reset(FIELD_DURATIONMS); return this; }

    @JsonIgnore
    public AIRunStepDTO setLastEventSequence(Long val) { this._set(FIELD_LASTEVENTSEQUENCE, val); return this; }
    @JsonIgnore
    public Long getLastEventSequence() { return getLongValue(FIELD_LASTEVENTSEQUENCE); }
    @JsonIgnore
    public boolean containsLastEventSequence() { return this._contains(FIELD_LASTEVENTSEQUENCE); }
    @JsonIgnore
    public AIRunStepDTO resetLastEventSequence() { this._reset(FIELD_LASTEVENTSEQUENCE); return this; }

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

    private Integer getIntegerValue(String field) {
        Object value = this._get(field);
        if (value == null) {
            return null;
        }
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        return Integer.valueOf(value.toString());
    }
}
