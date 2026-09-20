package cn.ibizlab.runner.servicerunner.harness.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.central.util.EntityDTO;

import java.sql.Timestamp;

public class AIRunDTO extends EntityDTO {

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_CREATEMAN = "create_man";
    public static final String FIELD_CREATETIME = "create_time";
    public static final String FIELD_UPDATEMAN = "update_man";
    public static final String FIELD_UPDATETIME = "update_time";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_RUNTYPE = "run_type";
    public static final String FIELD_TENANTID = "tenant_id";
    public static final String FIELD_USERID = "user_id";
    public static final String FIELD_PROJECTID = "project_id";
    public static final String FIELD_AGENTID = "agent_id";
    public static final String FIELD_AGENTVERSION = "agent_version";
    public static final String FIELD_MODELID = "model_id";
    public static final String FIELD_PROVIDER = "provider";
    public static final String FIELD_CONTEXTID = "context_id";
    public static final String FIELD_CONVERSATIONID = "conversation_id";
    public static final String FIELD_SESSIONID = "session_id";
    public static final String FIELD_PARENTRUNID = "parent_run_id";
    public static final String FIELD_IDEMPOTENCYKEY = "idempotency_key";
    public static final String FIELD_TRACEID = "trace_id";
    public static final String FIELD_WORKSPACE = "workspace";
    public static final String FIELD_REQUESTJSON = "request_json";
    public static final String FIELD_RESULTJSON = "result_json";
    public static final String FIELD_ERRORCODE = "error_code";
    public static final String FIELD_ERRORMESSAGE = "error_message";
    public static final String FIELD_BUDGETJSON = "budget_json";
    public static final String FIELD_DEADLINEAT = "deadline_at";
    public static final String FIELD_LEASEOWNER = "lease_owner";
    public static final String FIELD_LEASEUNTIL = "lease_until";
    public static final String FIELD_RECOVERYATTEMPTS = "recovery_attempts";
    public static final String FIELD_NEXTATTEMPTAT = "next_attempt_at";
    public static final String FIELD_STARTEDAT = "started_at";
    public static final String FIELD_FINISHEDAT = "finished_at";
    public static final String FIELD_LASTEVENTSEQUENCE = "last_event_sequence";

    @JsonIgnore
    public AIRunDTO setId(String val) { this._set(FIELD_ID, val); return this; }
    @JsonIgnore
    public String getId() { return (String) this._get(FIELD_ID); }
    @JsonIgnore
    public boolean containsId() { return this._contains(FIELD_ID); }
    @JsonIgnore
    public AIRunDTO resetId() { this._reset(FIELD_ID); return this; }

    @JsonIgnore
    public AIRunDTO setName(String val) { this._set(FIELD_NAME, val); return this; }
    @JsonIgnore
    public String getName() { return (String) this._get(FIELD_NAME); }
    @JsonIgnore
    public boolean containsName() { return this._contains(FIELD_NAME); }
    @JsonIgnore
    public AIRunDTO resetName() { this._reset(FIELD_NAME); return this; }

    @JsonIgnore
    public AIRunDTO setCreateMan(String val) { this._set(FIELD_CREATEMAN, val); return this; }
    @JsonIgnore
    public String getCreateMan() { return (String) this._get(FIELD_CREATEMAN); }
    @JsonIgnore
    public boolean containsCreateMan() { return this._contains(FIELD_CREATEMAN); }
    @JsonIgnore
    public AIRunDTO resetCreateMan() { this._reset(FIELD_CREATEMAN); return this; }

    @JsonIgnore
    public AIRunDTO setCreateTime(Timestamp val) { this._set(FIELD_CREATETIME, val); return this; }
    @JsonIgnore
    public Timestamp getCreateTime() { return (Timestamp) this._get(FIELD_CREATETIME); }
    @JsonIgnore
    public boolean containsCreateTime() { return this._contains(FIELD_CREATETIME); }
    @JsonIgnore
    public AIRunDTO resetCreateTime() { this._reset(FIELD_CREATETIME); return this; }

    @JsonIgnore
    public AIRunDTO setUpdateMan(String val) { this._set(FIELD_UPDATEMAN, val); return this; }
    @JsonIgnore
    public String getUpdateMan() { return (String) this._get(FIELD_UPDATEMAN); }
    @JsonIgnore
    public boolean containsUpdateMan() { return this._contains(FIELD_UPDATEMAN); }
    @JsonIgnore
    public AIRunDTO resetUpdateMan() { this._reset(FIELD_UPDATEMAN); return this; }

    @JsonIgnore
    public AIRunDTO setUpdateTime(Timestamp val) { this._set(FIELD_UPDATETIME, val); return this; }
    @JsonIgnore
    public Timestamp getUpdateTime() { return (Timestamp) this._get(FIELD_UPDATETIME); }
    @JsonIgnore
    public boolean containsUpdateTime() { return this._contains(FIELD_UPDATETIME); }
    @JsonIgnore
    public AIRunDTO resetUpdateTime() { this._reset(FIELD_UPDATETIME); return this; }

    @JsonIgnore
    public AIRunDTO setStatus(String val) { this._set(FIELD_STATUS, val); return this; }
    @JsonIgnore
    public String getStatus() { return (String) this._get(FIELD_STATUS); }
    @JsonIgnore
    public boolean containsStatus() { return this._contains(FIELD_STATUS); }
    @JsonIgnore
    public AIRunDTO resetStatus() { this._reset(FIELD_STATUS); return this; }

    @JsonIgnore
    public AIRunDTO setRunType(String val) { this._set(FIELD_RUNTYPE, val); return this; }
    @JsonIgnore
    public String getRunType() { return (String) this._get(FIELD_RUNTYPE); }
    @JsonIgnore
    public boolean containsRunType() { return this._contains(FIELD_RUNTYPE); }
    @JsonIgnore
    public AIRunDTO resetRunType() { this._reset(FIELD_RUNTYPE); return this; }

    @JsonIgnore
    public AIRunDTO setTenantId(String val) { this._set(FIELD_TENANTID, val); return this; }
    @JsonIgnore
    public String getTenantId() { return (String) this._get(FIELD_TENANTID); }
    @JsonIgnore
    public boolean containsTenantId() { return this._contains(FIELD_TENANTID); }
    @JsonIgnore
    public AIRunDTO resetTenantId() { this._reset(FIELD_TENANTID); return this; }

    @JsonIgnore
    public AIRunDTO setUserId(String val) { this._set(FIELD_USERID, val); return this; }
    @JsonIgnore
    public String getUserId() { return (String) this._get(FIELD_USERID); }
    @JsonIgnore
    public boolean containsUserId() { return this._contains(FIELD_USERID); }
    @JsonIgnore
    public AIRunDTO resetUserId() { this._reset(FIELD_USERID); return this; }

    @JsonIgnore
    public AIRunDTO setProjectId(String val) { this._set(FIELD_PROJECTID, val); return this; }
    @JsonIgnore
    public String getProjectId() { return (String) this._get(FIELD_PROJECTID); }
    @JsonIgnore
    public boolean containsProjectId() { return this._contains(FIELD_PROJECTID); }
    @JsonIgnore
    public AIRunDTO resetProjectId() { this._reset(FIELD_PROJECTID); return this; }

    @JsonIgnore
    public AIRunDTO setAgentId(String val) { this._set(FIELD_AGENTID, val); return this; }
    @JsonIgnore
    public String getAgentId() { return (String) this._get(FIELD_AGENTID); }
    @JsonIgnore
    public boolean containsAgentId() { return this._contains(FIELD_AGENTID); }
    @JsonIgnore
    public AIRunDTO resetAgentId() { this._reset(FIELD_AGENTID); return this; }

    @JsonIgnore
    public AIRunDTO setAgentVersion(String val) { this._set(FIELD_AGENTVERSION, val); return this; }
    @JsonIgnore
    public String getAgentVersion() { return (String) this._get(FIELD_AGENTVERSION); }
    @JsonIgnore
    public boolean containsAgentVersion() { return this._contains(FIELD_AGENTVERSION); }
    @JsonIgnore
    public AIRunDTO resetAgentVersion() { this._reset(FIELD_AGENTVERSION); return this; }

    @JsonIgnore
    public AIRunDTO setModelId(String val) { this._set(FIELD_MODELID, val); return this; }
    @JsonIgnore
    public String getModelId() { return (String) this._get(FIELD_MODELID); }
    @JsonIgnore
    public boolean containsModelId() { return this._contains(FIELD_MODELID); }
    @JsonIgnore
    public AIRunDTO resetModelId() { this._reset(FIELD_MODELID); return this; }

    @JsonIgnore
    public AIRunDTO setProvider(String val) { this._set(FIELD_PROVIDER, val); return this; }
    @JsonIgnore
    public String getProvider() { return (String) this._get(FIELD_PROVIDER); }
    @JsonIgnore
    public boolean containsProvider() { return this._contains(FIELD_PROVIDER); }
    @JsonIgnore
    public AIRunDTO resetProvider() { this._reset(FIELD_PROVIDER); return this; }

    @JsonIgnore
    public AIRunDTO setContextId(String val) { this._set(FIELD_CONTEXTID, val); return this; }
    @JsonIgnore
    public String getContextId() { return (String) this._get(FIELD_CONTEXTID); }
    @JsonIgnore
    public boolean containsContextId() { return this._contains(FIELD_CONTEXTID); }
    @JsonIgnore
    public AIRunDTO resetContextId() { this._reset(FIELD_CONTEXTID); return this; }

    @JsonIgnore
    public AIRunDTO setConversationId(String val) { this._set(FIELD_CONVERSATIONID, val); return this; }
    @JsonIgnore
    public String getConversationId() { return (String) this._get(FIELD_CONVERSATIONID); }
    @JsonIgnore
    public boolean containsConversationId() { return this._contains(FIELD_CONVERSATIONID); }
    @JsonIgnore
    public AIRunDTO resetConversationId() { this._reset(FIELD_CONVERSATIONID); return this; }

    @JsonIgnore
    public AIRunDTO setSessionId(String val) { this._set(FIELD_SESSIONID, val); return this; }
    @JsonIgnore
    public String getSessionId() { return (String) this._get(FIELD_SESSIONID); }
    @JsonIgnore
    public boolean containsSessionId() { return this._contains(FIELD_SESSIONID); }
    @JsonIgnore
    public AIRunDTO resetSessionId() { this._reset(FIELD_SESSIONID); return this; }

    @JsonIgnore
    public AIRunDTO setParentRunId(String val) { this._set(FIELD_PARENTRUNID, val); return this; }
    @JsonIgnore
    public String getParentRunId() { return (String) this._get(FIELD_PARENTRUNID); }
    @JsonIgnore
    public boolean containsParentRunId() { return this._contains(FIELD_PARENTRUNID); }
    @JsonIgnore
    public AIRunDTO resetParentRunId() { this._reset(FIELD_PARENTRUNID); return this; }

    @JsonIgnore
    public AIRunDTO setIdempotencyKey(String val) { this._set(FIELD_IDEMPOTENCYKEY, val); return this; }
    @JsonIgnore
    public String getIdempotencyKey() { return (String) this._get(FIELD_IDEMPOTENCYKEY); }
    @JsonIgnore
    public boolean containsIdempotencyKey() { return this._contains(FIELD_IDEMPOTENCYKEY); }
    @JsonIgnore
    public AIRunDTO resetIdempotencyKey() { this._reset(FIELD_IDEMPOTENCYKEY); return this; }

    @JsonIgnore
    public AIRunDTO setTraceId(String val) { this._set(FIELD_TRACEID, val); return this; }
    @JsonIgnore
    public String getTraceId() { return (String) this._get(FIELD_TRACEID); }
    @JsonIgnore
    public boolean containsTraceId() { return this._contains(FIELD_TRACEID); }
    @JsonIgnore
    public AIRunDTO resetTraceId() { this._reset(FIELD_TRACEID); return this; }

    @JsonIgnore
    public AIRunDTO setWorkspace(String val) { this._set(FIELD_WORKSPACE, val); return this; }
    @JsonIgnore
    public String getWorkspace() { return (String) this._get(FIELD_WORKSPACE); }
    @JsonIgnore
    public boolean containsWorkspace() { return this._contains(FIELD_WORKSPACE); }
    @JsonIgnore
    public AIRunDTO resetWorkspace() { this._reset(FIELD_WORKSPACE); return this; }

    @JsonIgnore
    public AIRunDTO setRequestJson(String val) { this._set(FIELD_REQUESTJSON, val); return this; }
    @JsonIgnore
    public String getRequestJson() { return (String) this._get(FIELD_REQUESTJSON); }
    @JsonIgnore
    public boolean containsRequestJson() { return this._contains(FIELD_REQUESTJSON); }
    @JsonIgnore
    public AIRunDTO resetRequestJson() { this._reset(FIELD_REQUESTJSON); return this; }

    @JsonIgnore
    public AIRunDTO setResultJson(String val) { this._set(FIELD_RESULTJSON, val); return this; }
    @JsonIgnore
    public String getResultJson() { return (String) this._get(FIELD_RESULTJSON); }
    @JsonIgnore
    public boolean containsResultJson() { return this._contains(FIELD_RESULTJSON); }
    @JsonIgnore
    public AIRunDTO resetResultJson() { this._reset(FIELD_RESULTJSON); return this; }

    @JsonIgnore
    public AIRunDTO setErrorCode(String val) { this._set(FIELD_ERRORCODE, val); return this; }
    @JsonIgnore
    public String getErrorCode() { return (String) this._get(FIELD_ERRORCODE); }
    @JsonIgnore
    public boolean containsErrorCode() { return this._contains(FIELD_ERRORCODE); }
    @JsonIgnore
    public AIRunDTO resetErrorCode() { this._reset(FIELD_ERRORCODE); return this; }

    @JsonIgnore
    public AIRunDTO setErrorMessage(String val) { this._set(FIELD_ERRORMESSAGE, val); return this; }
    @JsonIgnore
    public String getErrorMessage() { return (String) this._get(FIELD_ERRORMESSAGE); }
    @JsonIgnore
    public boolean containsErrorMessage() { return this._contains(FIELD_ERRORMESSAGE); }
    @JsonIgnore
    public AIRunDTO resetErrorMessage() { this._reset(FIELD_ERRORMESSAGE); return this; }

    @JsonIgnore
    public AIRunDTO setBudgetJson(String val) { this._set(FIELD_BUDGETJSON, val); return this; }
    @JsonIgnore
    public String getBudgetJson() { return (String) this._get(FIELD_BUDGETJSON); }
    @JsonIgnore
    public boolean containsBudgetJson() { return this._contains(FIELD_BUDGETJSON); }
    @JsonIgnore
    public AIRunDTO resetBudgetJson() { this._reset(FIELD_BUDGETJSON); return this; }

    @JsonIgnore
    public AIRunDTO setDeadlineAt(Timestamp val) { this._set(FIELD_DEADLINEAT, val); return this; }
    @JsonIgnore
    public Timestamp getDeadlineAt() { return (Timestamp) this._get(FIELD_DEADLINEAT); }
    @JsonIgnore
    public boolean containsDeadlineAt() { return this._contains(FIELD_DEADLINEAT); }
    @JsonIgnore
    public AIRunDTO resetDeadlineAt() { this._reset(FIELD_DEADLINEAT); return this; }

    @JsonIgnore
    public AIRunDTO setLeaseOwner(String val) { this._set(FIELD_LEASEOWNER, val); return this; }
    @JsonIgnore
    public String getLeaseOwner() { return (String) this._get(FIELD_LEASEOWNER); }
    @JsonIgnore
    public boolean containsLeaseOwner() { return this._contains(FIELD_LEASEOWNER); }
    @JsonIgnore
    public AIRunDTO resetLeaseOwner() { this._reset(FIELD_LEASEOWNER); return this; }

    @JsonIgnore
    public AIRunDTO setLeaseUntil(Timestamp val) { this._set(FIELD_LEASEUNTIL, val); return this; }
    @JsonIgnore
    public Timestamp getLeaseUntil() { return (Timestamp) this._get(FIELD_LEASEUNTIL); }
    @JsonIgnore
    public boolean containsLeaseUntil() { return this._contains(FIELD_LEASEUNTIL); }
    @JsonIgnore
    public AIRunDTO resetLeaseUntil() { this._reset(FIELD_LEASEUNTIL); return this; }

    @JsonIgnore
    public AIRunDTO setRecoveryAttempts(Integer val) { this._set(FIELD_RECOVERYATTEMPTS, val); return this; }
    @JsonIgnore
    public Integer getRecoveryAttempts() { return getIntegerValue(FIELD_RECOVERYATTEMPTS); }
    @JsonIgnore
    public boolean containsRecoveryAttempts() { return this._contains(FIELD_RECOVERYATTEMPTS); }
    @JsonIgnore
    public AIRunDTO resetRecoveryAttempts() { this._reset(FIELD_RECOVERYATTEMPTS); return this; }

    @JsonIgnore
    public AIRunDTO setNextAttemptAt(Timestamp val) { this._set(FIELD_NEXTATTEMPTAT, val); return this; }
    @JsonIgnore
    public Timestamp getNextAttemptAt() { return (Timestamp) this._get(FIELD_NEXTATTEMPTAT); }
    @JsonIgnore
    public boolean containsNextAttemptAt() { return this._contains(FIELD_NEXTATTEMPTAT); }
    @JsonIgnore
    public AIRunDTO resetNextAttemptAt() { this._reset(FIELD_NEXTATTEMPTAT); return this; }

    @JsonIgnore
    public AIRunDTO setStartedAt(Timestamp val) { this._set(FIELD_STARTEDAT, val); return this; }
    @JsonIgnore
    public Timestamp getStartedAt() { return (Timestamp) this._get(FIELD_STARTEDAT); }
    @JsonIgnore
    public boolean containsStartedAt() { return this._contains(FIELD_STARTEDAT); }
    @JsonIgnore
    public AIRunDTO resetStartedAt() { this._reset(FIELD_STARTEDAT); return this; }

    @JsonIgnore
    public AIRunDTO setFinishedAt(Timestamp val) { this._set(FIELD_FINISHEDAT, val); return this; }
    @JsonIgnore
    public Timestamp getFinishedAt() { return (Timestamp) this._get(FIELD_FINISHEDAT); }
    @JsonIgnore
    public boolean containsFinishedAt() { return this._contains(FIELD_FINISHEDAT); }
    @JsonIgnore
    public AIRunDTO resetFinishedAt() { this._reset(FIELD_FINISHEDAT); return this; }

    @JsonIgnore
    public AIRunDTO setLastEventSequence(Long val) { this._set(FIELD_LASTEVENTSEQUENCE, val); return this; }
    @JsonIgnore
    public Long getLastEventSequence() { return getLongValue(FIELD_LASTEVENTSEQUENCE); }
    @JsonIgnore
    public boolean containsLastEventSequence() { return this._contains(FIELD_LASTEVENTSEQUENCE); }
    @JsonIgnore
    public AIRunDTO resetLastEventSequence() { this._reset(FIELD_LASTEVENTSEQUENCE); return this; }

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
