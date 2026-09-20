package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunStepDTO;
import cn.ibizlab.runner.servicerunner.runtime.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/**
 * Coordinates the durable Harness write path.
 *
 * <p>The AI_RUN row is the database serialization point for all writes in one
 * Run. In-memory locks only reduce local contention; row locks and unique
 * constraints provide the cross-worker correctness guarantees.</p>
 */
@Component
public class HarnessCoordinator {

    private static final Log log = LogFactory.getLog(HarnessCoordinator.class);

    private static final String RUN_ENTITY_ID = "PSMODULES/ai/PSDATAENTITIES/ai_run.json";
    private static final String STEP_ENTITY_ID = "PSMODULES/ai/PSDATAENTITIES/ai_run_step.json";
    private static final String EVENT_ENTITY_ID = "PSMODULES/ai/PSDATAENTITIES/ai_run_event.json";

    private static final String STATUS_QUEUED = "queued";
    private static final String STATUS_RUNNING = "running";
    private static final String STATUS_WAITING_APPROVAL = "waiting_approval";
    private static final String STATUS_PAUSED = "paused";
    private static final String STATUS_RETRYING = "retrying";
    private static final String STATUS_COMPLETED = "completed";
    private static final String STATUS_FAILED = "failed";
    private static final String STATUS_CANCELLED = "cancelled";

    private static final String EVENT_RUN_CREATED = "run.created";
    private static final String EVENT_STEP_CREATED = "step.created";
    private static final String EVENT_RUN_STARTED = "run.started";
    private static final String EVENT_RUN_RESUMED = "run.resumed";
    private static final String EVENT_RUN_RETRYING = "run.retrying";
    private static final String EVENT_RUN_COMPLETED = "run.completed";
    private static final String EVENT_RUN_CANCEL_REQUESTED = "run.cancel_requested";
    private static final String EVENT_RUN_CANCELLED = "run.cancelled";
    private static final String EVENT_STEP_CANCELLED = "step.cancelled";
    private static final String EVENT_RECOVERY_CLAIMED = "run.recovery_claimed";
    private static final String EVENT_RECOVERY_EXPIRED = "run.recovery_expired";
    private static final String EVENT_RUN_FAILED = "run.failed";

    private static final Pattern BEARER_PATTERN =
            Pattern.compile("(?i)(\\bBearer\\s+)[^\\s,;]+");
    private static final Pattern AUTHORIZATION_PATTERN =
            Pattern.compile("(?i)(\\bAuthorization\\s*:\\s*)[^\\r\\n]+");
    private static final Pattern COOKIE_PATTERN =
            Pattern.compile("(?i)(\\bCookie\\s*:\\s*)[^\\r\\n]+");
    private static final Pattern SECRET_ASSIGNMENT_PATTERN =
            Pattern.compile("(?i)(\\b(?:authorization|cookie|api[_-]?key|apikey|password|secret|access[_-]?token|token)\\s*[=:]\\s*)[^\\s,;]+");

    private static final ConcurrentMap<String, Object> LOCKS = new ConcurrentHashMap<>();

    /**
     * Scans only candidate ids. Every candidate is rechecked under a Run row
     * lock before any lease or terminal decision is written.
     */
    public int recover(final ISystemRuntime systemRuntime,
                       final String workerId,
                       final int batchSize,
                       final long leaseMs) throws Throwable {
        HarnessRecoveryWorkerConfig config = new HarnessRecoveryWorkerConfig(
                true, workerId, 1L, batchSize, leaseMs);
        return recover(
                systemRuntime,
                config,
                new HarnessChatRunExecutor(systemRuntime));
    }

    /**
     * Claims and executes candidates one at a time so a slow Run does not
     * consume the leases of the rest of the scan batch.
     */
    public int recover(final ISystemRuntime systemRuntime,
                       final HarnessRecoveryWorkerConfig config,
                       final HarnessRunExecutor executor) throws Throwable {
        if (config == null) {
            throw new IllegalArgumentException("Recovery worker config is required");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Harness Run executor is required");
        }
        if (!config.isEnabled()) {
            return 0;
        }
        validateRecoveryArguments(
                config.getWorkerId(), config.getBatchSize(), config.getLeaseMs());

        final HarnessRuntimes runtimes = resolveRuntimes(systemRuntime);
        List<String> candidateIds = findRecoveryCandidateIds(
                runtimes, now(), config.getBatchSize());
        int handled = 0;
        for (final String runId : candidateIds) {
            if (runId == null) {
                continue;
            }
            RecoveryClaimOutcome outcome;
            try {
                outcome = (RecoveryClaimOutcome) ActionSessionManager.execute(
                        new IAction() {
                            @Override
                            public Object execute(Object[] ignored) throws Throwable {
                                return claimRecoveryRunInTransaction(
                                        runtimes,
                                        runId,
                                        config.getWorkerId(),
                                        config.getLeaseMs());
                            }
                        },
                        null,
                        ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
            } catch (Throwable ex) {
                log.error(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s run=%2$s claim failed: %3$s",
                        config.getWorkerId(), runId, ex.getMessage()), ex);
                continue;
            }
            if (outcome == null || !outcome.handled) {
                continue;
            }
            handled++;
            if (outcome.claim != null) {
                executeRecoveryClaimSafely(runtimes, outcome.claim, config, executor);
            }
        }
        return handled;
    }

    /**
     * Compatibility API for callers that need to inspect leased Runs before
     * dispatching them through a custom execution mechanism.
     */
    public HarnessRecoveryBatch claimRecoverableRuns(
            final ISystemRuntime systemRuntime,
            final String workerId,
            final int batchSize,
            final long leaseMs) throws Throwable {
        validateRecoveryArguments(workerId, batchSize, leaseMs);
        final HarnessRuntimes runtimes = resolveRuntimes(systemRuntime);
        List<String> candidateIds = findRecoveryCandidateIds(
                runtimes, now(), batchSize);
        List<HarnessRecoveryClaim> claims =
                new ArrayList<HarnessRecoveryClaim>();
        int expiredCount = 0;
        for (final String runId : candidateIds) {
            if (runId == null) {
                continue;
            }
            RecoveryClaimOutcome outcome =
                    (RecoveryClaimOutcome) ActionSessionManager.execute(
                            new IAction() {
                                @Override
                                public Object execute(Object[] ignored)
                                        throws Throwable {
                                    return claimRecoveryRunInTransaction(
                                            runtimes,
                                            runId,
                                            workerId,
                                            leaseMs);
                                }
                            },
                            null,
                            ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
            if (outcome == null || !outcome.handled) {
                continue;
            }
            if (outcome.claim == null) {
                expiredCount++;
            } else {
                claims.add(outcome.claim);
            }
        }
        return new HarnessRecoveryBatch(claims, expiredCount);
    }

    private void validateRecoveryArguments(String workerId,
                                           int batchSize,
                                           long leaseMs) {
        requireText(workerId, "Recovery worker id is required");
        if (batchSize <= 0) {
            throw new IllegalArgumentException("Recovery batch size must be positive");
        }
        if (batchSize > HarnessRecoveryWorkerConfig.MAX_BATCH_SIZE) {
            throw new IllegalArgumentException(
                    "Recovery batch size must not exceed "
                            + HarnessRecoveryWorkerConfig.MAX_BATCH_SIZE);
        }
        if (leaseMs <= 0) {
            throw new IllegalArgumentException("Recovery lease must be positive");
        }
    }

    private List<String> findRecoveryCandidateIds(HarnessRuntimes runtimes,
                                                  Timestamp scanTime,
                                                  int batchSize) throws Throwable {
        String sql = "SELECT ID AS id"
                + " FROM AI_RUN"
                + " WHERE (LEASE_UNTIL IS NULL OR LEASE_UNTIL <= ?)"
                + " AND ((STATUS IN (?, ?, ?)"
                + " AND (NEXT_ATTEMPT_AT IS NULL OR NEXT_ATTEMPT_AT <= ?))"
                + " OR (STATUS IN (?, ?, ?, ?, ?)"
                + " AND DEADLINE_AT IS NOT NULL AND DEADLINE_AT <= ?))"
                + " ORDER BY UPDATE_TIME ASC, ID ASC"
                + " LIMIT " + batchSize;
        List<Object> params = new ArrayList<Object>();
        params.add(scanTime);
        params.add(STATUS_QUEUED);
        params.add(STATUS_RUNNING);
        params.add(STATUS_RETRYING);
        params.add(scanTime);
        params.add(STATUS_QUEUED);
        params.add(STATUS_RUNNING);
        params.add(STATUS_RETRYING);
        params.add(STATUS_WAITING_APPROVAL);
        params.add(STATUS_PAUSED);
        params.add(scanTime);

        List<?> rows = runtimes.run.getSysDBSchemeRuntimeMust().executeSelectSQL(sql, params);
        List<String> result = new ArrayList<String>();
        if (rows == null) {
            return result;
        }
        for (Object row : rows) {
            String id = extractRecoveryCandidateId(row);
            if (id != null && !result.contains(id)) {
                result.add(id);
            }
        }
        return result;
    }

    private String extractRecoveryCandidateId(Object row) {
        if (row == null) {
            return null;
        }
        Object value = row;
        if (row instanceof IEntityDTO) {
            value = ((IEntityDTO) row).get(AIRunDTO.FIELD_ID);
            if (value == null) {
                value = ((IEntityDTO) row).get("ID");
            }
        } else if (row instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) row;
            value = map.get(AIRunDTO.FIELD_ID);
            if (value == null) {
                value = map.get("ID");
            }
        } else if (row instanceof Object[]) {
            Object[] values = (Object[]) row;
            value = values.length == 0 ? null : values[0];
        } else if (row instanceof List) {
            List<?> values = (List<?>) row;
            value = values.isEmpty() ? null : values.get(0);
        }
        if (value == null) {
            return null;
        }
        String id = value.toString().trim();
        return id.isEmpty() ? null : id;
    }

    private RecoveryClaimOutcome claimRecoveryRunInTransaction(
            HarnessRuntimes runtimes,
            String runId,
            String workerId,
            long leaseMs) throws Throwable {
        Timestamp currentTime = now();
        AIRunDTO run = lockRunForUpdate(runtimes, runId);
        if (run == null) {
            return RecoveryClaimOutcome.skipped();
        }
        if (completeCancellationIfRequested(runtimes, run)) {
            return RecoveryClaimOutcome.cancelled();
        }
        HarnessRecoveryPolicy.Decision decision = HarnessRecoveryPolicy.decide(
                run.getStatus(),
                run.getLeaseUntil(),
                run.getNextAttemptAt(),
                run.getDeadlineAt(),
                currentTime);
        if (HarnessRecoveryPolicy.Decision.SKIP.equals(decision)) {
            return RecoveryClaimOutcome.skipped();
        }

        if (HarnessRecoveryPolicy.Decision.EXPIRE.equals(decision)) {
            expireRunInCurrentTransaction(runtimes, run, workerId);
            return RecoveryClaimOutcome.expired();
        }

        int recoveryAttempts = run.getRecoveryAttempts() == null
                ? 0 : run.getRecoveryAttempts();
        recoveryAttempts++;
        Timestamp leaseUntil = HarnessRecoveryPolicy.calculateLeaseUntil(
                currentTime, leaseMs, run.getDeadlineAt());
        String auditUser = resolveAuditUser(run);
        Timestamp auditTime = now();
        AIRunDTO projection = new AIRunDTO()
                .setId(run.getId())
                .setLeaseOwner(workerId)
                .setLeaseUntil(leaseUntil)
                .setRecoveryAttempts(recoveryAttempts)
                .setNextAttemptAt(null)
                .setUpdateMan(auditUser)
                .setUpdateTime(auditTime);
        runtimes.run.rawUpdate(Collections.<IEntityDTO>singletonList(projection), true);

        AIRunEventDTO claimed = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setEventType(EVENT_RECOVERY_CLAIMED)
                .setIdempotencyKey(run.getId() + ":recovery:" + recoveryAttempts)
                .setActorType("worker")
                .setActorId(workerId)
                .setTraceId(run.getTraceId())
                .setPayloadJson(recoveryClaimedPayload(run, workerId, recoveryAttempts, leaseUntil));
        appendEventIfAbsent(runtimes, run, claimed);
        return RecoveryClaimOutcome.claimed(
                new HarnessRecoveryClaim(
                        run, workerId, recoveryAttempts, leaseUntil));
    }

    private void executeRecoveryClaimSafely(
            final HarnessRuntimes runtimes,
            final HarnessRecoveryClaim claim,
            final HarnessRecoveryWorkerConfig config,
            final HarnessRunExecutor executor) {
        boolean executionStarted = false;
        HarnessRecoveryLease recoveryLease = null;
        try {
            Boolean started = (Boolean) ActionSessionManager.execute(
                    new IAction() {
                        @Override
                        public Object execute(Object[] ignored) throws Throwable {
                            return beginRecoveryExecutionInTransaction(
                                    runtimes, claim);
                        }
                    },
                    null,
                    ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
            if (!Boolean.TRUE.equals(started)) {
                return;
            }
            executionStarted = true;
            recoveryLease = new HarnessRecoveryLease(
                    claim,
                    config.getLeaseRenewIntervalMs(),
                    () -> (Boolean) ActionSessionManager.execute(
                            new IAction() {
                                @Override
                                public Object execute(Object[] ignored)
                                        throws Throwable {
                                    return renewRecoveryLeaseInTransaction(
                                            runtimes, claim, config.getLeaseMs());
                                }
                            },
                            null,
                            ITransactionalUtil.PROPAGATION_REQUIRES_NEW));
            recoveryLease.start();
            HarnessRunExecutionResult result = executor.execute(claim);
            if (result == null) {
                throw HarnessRunExecutionException.permanent(
                        "HARNESS_EXECUTION_EMPTY_RESULT",
                        "Harness Run executor returned no result");
            }
            if (!recoveryLease.isActive()) {
                log.warn(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s run=%2$s result discarded because claim was lost during execution",
                        claim.getWorkerId(), claim.getRunId()));
                return;
            }
            Boolean completed = (Boolean) ActionSessionManager.execute(
                    new IAction() {
                        @Override
                        public Object execute(Object[] ignored) throws Throwable {
                            return completeRecoveryExecutionInTransaction(
                                    runtimes, claim, result);
                        }
                    },
                    null,
                    ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
            if (!Boolean.TRUE.equals(completed)) {
                log.warn(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s run=%2$s completion rejected because claim is no longer active",
                        claim.getWorkerId(), claim.getRunId()));
            }
        } catch (Throwable ex) {
            if (!executionStarted) {
                log.error(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s run=%2$s could not start execution: %3$s",
                        claim.getWorkerId(), claim.getRunId(), ex.getMessage()), ex);
                return;
            }
            HarnessRunExecutionException failure = classifyExecutionFailure(ex);
            try {
                ActionSessionManager.execute(
                        new IAction() {
                            @Override
                            public Object execute(Object[] ignored)
                                    throws Throwable {
                                return failRecoveryExecutionInTransaction(
                                        runtimes, claim, config, failure);
                            }
                        },
                        null,
                        ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
            } catch (Throwable persistenceError) {
                log.error(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s run=%2$s could not persist execution failure: %3$s",
                        claim.getWorkerId(),
                        claim.getRunId(),
                        persistenceError.getMessage()), persistenceError);
            }
            log.warn(String.format(
                    "[HARNESS-RECOVERY] worker=%1$s run=%2$s execution failed code=%3$s retryable=%4$s: %5$s",
                    claim.getWorkerId(),
                    claim.getRunId(),
                    failure.getErrorCode(),
                    failure.isRetryable(),
                    failure.getMessage()), ex);
        } finally {
            if (recoveryLease != null) {
                recoveryLease.close();
            }
        }
    }

    private boolean renewRecoveryLeaseInTransaction(
            HarnessRuntimes runtimes,
            HarnessRecoveryClaim claim,
            long leaseMs) throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, claim.getRunId());
        Timestamp currentTime = now();
        if (completeCancellationIfRequested(runtimes, run)) {
            return false;
        }
        if (!isActiveClaim(run, claim, currentTime)) {
            return false;
        }
        if (isDeadlineExpired(run, currentTime)) {
            expireRunInCurrentTransaction(runtimes, run, claim.getWorkerId());
            return false;
        }

        Timestamp leaseUntil = HarnessRecoveryPolicy.calculateLeaseUntil(
                currentTime, leaseMs, run.getDeadlineAt());
        AIRunDTO projection = new AIRunDTO()
                .setId(run.getId())
                .setLeaseUntil(leaseUntil)
                .setUpdateMan(resolveAuditUser(run))
                .setUpdateTime(currentTime);
        runtimes.run.rawUpdate(
                Collections.<IEntityDTO>singletonList(projection), true);
        return true;
    }

    private boolean beginRecoveryExecutionInTransaction(
            HarnessRuntimes runtimes,
            HarnessRecoveryClaim claim) throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, claim.getRunId());
        Timestamp currentTime = now();
        if (completeCancellationIfRequested(runtimes, run)) {
            return false;
        }
        if (!isActiveClaim(run, claim, currentTime)) {
            return false;
        }
        if (isDeadlineExpired(run, currentTime)) {
            expireRunInCurrentTransaction(runtimes, run, claim.getWorkerId());
            return false;
        }

        String status = defaultStatus(run.getStatus(), STATUS_QUEUED);
        String eventType;
        if (STATUS_QUEUED.equals(status)) {
            eventType = EVENT_RUN_STARTED;
        } else if (STATUS_RETRYING.equals(status)) {
            eventType = EVENT_RUN_RESUMED;
        } else if (STATUS_RUNNING.equals(status)) {
            return true;
        } else {
            return false;
        }
        AIRunEventDTO started = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setEventType(eventType)
                .setIdempotencyKey(recoveryEventKey(claim, "started"))
                .setActorType("worker")
                .setActorId(claim.getWorkerId())
                .setTraceId(run.getTraceId())
                .setPayloadJson(recoveryStartedPayload(run, claim));
        appendEventIfAbsent(runtimes, run, started);
        return true;
    }

    private boolean completeRecoveryExecutionInTransaction(
            HarnessRuntimes runtimes,
            HarnessRecoveryClaim claim,
            HarnessRunExecutionResult result) throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, claim.getRunId());
        Timestamp currentTime = now();
        if (completeCancellationIfRequested(runtimes, run)) {
            return false;
        }
        if (!isActiveClaim(run, claim, currentTime)) {
            return false;
        }
        if (isDeadlineExpired(run, currentTime)) {
            expireRunInCurrentTransaction(runtimes, run, claim.getWorkerId());
            return true;
        }

        String resultJson = sanitizeJson(result.getResultJson());
        String auditUser = resolveAuditUser(run);
        AIRunDTO projection = new AIRunDTO()
                .setId(run.getId())
                .setResultJson(resultJson)
                .setErrorCode(null)
                .setErrorMessage(null)
                .setUpdateMan(auditUser)
                .setUpdateTime(currentTime);
        runtimes.run.rawUpdate(
                Collections.<IEntityDTO>singletonList(projection), true);

        AIRunEventDTO completed = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setEventType(EVENT_RUN_COMPLETED)
                .setIdempotencyKey(recoveryEventKey(claim, "completed"))
                .setActorType("worker")
                .setActorId(claim.getWorkerId())
                .setTraceId(run.getTraceId())
                .setPayloadJson(recoveryCompletedPayload(run, claim));
        appendEventIfAbsent(runtimes, run, completed);
        return true;
    }

    private boolean failRecoveryExecutionInTransaction(
            HarnessRuntimes runtimes,
            HarnessRecoveryClaim claim,
            HarnessRecoveryWorkerConfig config,
            HarnessRunExecutionException failure) throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, claim.getRunId());
        Timestamp currentTime = now();
        if (completeCancellationIfRequested(runtimes, run)) {
            return false;
        }
        if (!isActiveClaim(run, claim, currentTime)) {
            return false;
        }
        if (isDeadlineExpired(run, currentTime)) {
            expireRunInCurrentTransaction(runtimes, run, claim.getWorkerId());
            return true;
        }

        String errorCode = sanitizeCode(failure.getErrorCode());
        String errorMessage = sanitizeText(failure.getMessage(), 1000);
        boolean retry = failure.isRetryable()
                && claim.getRecoveryAttempts() < config.getMaxAttempts();
        long backoffMs = HarnessRecoveryPolicy.calculateBackoffMs(
                claim.getRecoveryAttempts(),
                config.getInitialBackoffMs(),
                config.getMaxBackoffMs());
        Timestamp nextAttemptAt = new Timestamp(currentTime.getTime() + backoffMs);
        if (retry
                && run.getDeadlineAt() != null
                && !run.getDeadlineAt().after(nextAttemptAt)) {
            retry = false;
        }

        String auditUser = resolveAuditUser(run);
        AIRunDTO projection = new AIRunDTO()
                .setId(run.getId())
                .setErrorCode(errorCode)
                .setErrorMessage(errorMessage)
                .setUpdateMan(auditUser)
                .setUpdateTime(currentTime);
        AIRunEventDTO event = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setActorType("worker")
                .setActorId(claim.getWorkerId())
                .setTraceId(run.getTraceId());
        if (retry) {
            projection
                    .setLeaseOwner(null)
                    .setLeaseUntil(null)
                    .setNextAttemptAt(nextAttemptAt);
            event
                    .setEventType(EVENT_RUN_RETRYING)
                    .setIdempotencyKey(recoveryEventKey(claim, "retrying"))
                    .setPayloadJson(recoveryRetryingPayload(
                            run, claim, errorCode, errorMessage, nextAttemptAt));
        } else {
            event
                    .setEventType(EVENT_RUN_FAILED)
                    .setIdempotencyKey(recoveryEventKey(claim, "failed"))
                    .setPayloadJson(runFailedPayload(
                            run, errorCode, errorMessage));
        }
        runtimes.run.rawUpdate(
                Collections.<IEntityDTO>singletonList(projection), true);
        appendEventIfAbsent(runtimes, run, event);
        return true;
    }

    private void expireRunInCurrentTransaction(HarnessRuntimes runtimes,
                                               AIRunDTO run,
                                               String workerId)
            throws Throwable {
        String errorCode = "RUN_DEADLINE_EXCEEDED";
        String errorMessage =
                "Run deadline exceeded before recovery could finish execution";
        String auditUser = resolveAuditUser(run);
        Timestamp auditTime = now();
        AIRunDTO projection = new AIRunDTO()
                .setId(run.getId())
                .setLeaseOwner(null)
                .setLeaseUntil(null)
                .setNextAttemptAt(null)
                .setErrorCode(errorCode)
                .setErrorMessage(errorMessage)
                .setUpdateMan(auditUser)
                .setUpdateTime(auditTime);
        runtimes.run.rawUpdate(
                Collections.<IEntityDTO>singletonList(projection), true);

        AIRunEventDTO expired = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setEventType(EVENT_RECOVERY_EXPIRED)
                .setIdempotencyKey(run.getId() + ":recovery_expired")
                .setActorType("worker")
                .setActorId(workerId)
                .setTraceId(run.getTraceId())
                .setPayloadJson(
                        recoveryExpiredPayload(run, errorCode, errorMessage));
        appendEventIfAbsent(runtimes, run, expired);

        AIRunEventDTO failed = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setEventType(EVENT_RUN_FAILED)
                .setIdempotencyKey(run.getId() + ":deadline_failed")
                .setActorType("worker")
                .setActorId(workerId)
                .setTraceId(run.getTraceId())
                .setPayloadJson(runFailedPayload(
                        run, errorCode, errorMessage));
        appendEventIfAbsent(runtimes, run, failed);
    }

    private boolean isActiveClaim(AIRunDTO run,
                                  HarnessRecoveryClaim claim,
                                  Timestamp currentTime) {
        if (run == null) {
            return false;
        }
        HarnessRecoveryPolicy.ClaimState state =
                HarnessRecoveryPolicy.validateClaim(
                        run.getStatus(),
                        run.getLeaseOwner(),
                        run.getLeaseUntil(),
                        run.getRecoveryAttempts(),
                        claim,
                        currentTime);
        if (!HarnessRecoveryPolicy.ClaimState.ACTIVE.equals(state)) {
            log.warn(String.format(
                    "[HARNESS-RECOVERY] worker=%1$s run=%2$s inactive claim state=%3$s",
                    claim.getWorkerId(), claim.getRunId(), state));
            return false;
        }
        return true;
    }

    private boolean isDeadlineExpired(AIRunDTO run, Timestamp currentTime) {
        return run != null
                && run.getDeadlineAt() != null
                && !run.getDeadlineAt().after(currentTime);
    }

    private HarnessRunExecutionException classifyExecutionFailure(
            Throwable error) {
        if (error instanceof HarnessRunExecutionException) {
            return (HarnessRunExecutionException) error;
        }
        if (error instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        String message = error == null || error.getMessage() == null
                ? (error == null ? "Unknown Harness execution failure"
                    : error.getClass().getSimpleName())
                : error.getMessage();
        return HarnessRunExecutionException.retryable(
                "HARNESS_EXECUTION_FAILED", message, error);
    }

    private String recoveryEventKey(HarnessRecoveryClaim claim,
                                    String suffix) {
        return claim.getRunId()
                + ":recovery:"
                + claim.getRecoveryAttempts()
                + ":"
                + suffix;
    }

    public AIRunDTO requestCancel(
            final net.ibizsys.central.ISystemRuntime systemRuntime,
            final String runId,
            final String actorId) throws Throwable {
        requireText(runId, "Run cancellation requires runId");
        final HarnessRuntimes runtimes = resolveRuntimes(systemRuntime);
        synchronized (lockFor("run:" + runId)) {
            return (AIRunDTO) ActionSessionManager.execute(
                    new IAction() {
                        @Override
                        public Object execute(Object[] ignored)
                                throws Throwable {
                            return requestCancelInTransaction(
                                    runtimes, runId, actorId);
                        }
                    },
                    null,
                    ITransactionalUtil.PROPAGATION_REQUIRED);
        }
    }

    public Object createRun(final IDataEntityRuntimeContext context,
                            final net.ibizsys.model.dataentity.action.IPSDEAction action,
                            final Object[] args,
                            final Object actionData) throws Throwable {
        final AIRunDTO request = requireArgument(args, AIRunDTO.class, "Run Create");
        final HarnessRuntimes runtimes = resolveRuntimes(context);
        validateRunCreate(request);
        final String lockKey = "run-idempotency:" + request.getTenantId() + ":" + request.getIdempotencyKey();
        synchronized (lockFor(lockKey)) {
            try {
                return ActionSessionManager.execute(new IAction() {
                    @Override
                    public Object execute(Object[] ignored) throws Throwable {
                        return createRunInTransaction(runtimes, context, action, args, actionData, request);
                    }
                }, null, ITransactionalUtil.PROPAGATION_REQUIRED);
            } catch (Throwable ex) {
                if (!isUniqueConstraintViolation(ex)) {
                    throw ex;
                }
                AIRunDTO existing = reloadRunCreateAfterConflict(runtimes, request);
                if (existing != null) {
                    return existing;
                }
                throw ex;
            }
        }
    }

    public Object updateRun(final IDataEntityRuntimeContext context,
                            final net.ibizsys.model.dataentity.action.IPSDEAction action,
                            final Object[] args,
                            final Object actionData) throws Throwable {
        final AIRunDTO request = requireArgument(args, AIRunDTO.class, "Run Update");
        final HarnessRuntimes runtimes = resolveRuntimes(context);
        requireText(request.getId(), "Run Update requires id");
        sanitizeRunJson(request);
        return ActionSessionManager.execute(new IAction() {
            @Override
            public Object execute(Object[] ignored) throws Throwable {
                AIRunDTO current = lockRunForUpdate(runtimes, request.getId());
                if (current == null) {
                    throw new IllegalArgumentException("Run does not exist: " + request.getId());
                }
                validateRunUpdate(request, current);
                return context.executeActionReal(action, args, actionData);
            }
        }, null, ITransactionalUtil.PROPAGATION_REQUIRED);
    }

    public Object createStep(final IDataEntityRuntimeContext context,
                             final net.ibizsys.model.dataentity.action.IPSDEAction action,
                             final Object[] args,
                             final Object actionData) throws Throwable {
        final AIRunStepDTO request = requireArgument(args, AIRunStepDTO.class, "Step Create");
        final HarnessRuntimes runtimes = resolveRuntimes(context);
        validateStepCreate(request);
        final String runId = request.getRunId();
        synchronized (lockFor("run:" + runId)) {
            return ActionSessionManager.execute(new IAction() {
                @Override
                public Object execute(Object[] ignored) throws Throwable {
                    return createStepInTransaction(runtimes, context, action, args, actionData, request);
                }
            }, null, ITransactionalUtil.PROPAGATION_REQUIRED);
        }
    }

    public Object updateStep(final IDataEntityRuntimeContext context,
                             final net.ibizsys.model.dataentity.action.IPSDEAction action,
                             final Object[] args,
                             final Object actionData) throws Throwable {
        final AIRunStepDTO request = requireArgument(args, AIRunStepDTO.class, "Step Update");
        final HarnessRuntimes runtimes = resolveRuntimes(context);
        requireText(request.getId(), "Step Update requires id");
        sanitizeStepJson(request);
        return ActionSessionManager.execute(new IAction() {
            @Override
            public Object execute(Object[] ignored) throws Throwable {
                AIRunStepDTO snapshot = findStepById(runtimes, request.getId());
                if (snapshot == null) {
                    throw new IllegalArgumentException("Step does not exist: " + request.getId());
                }
                AIRunDTO run = lockRunForUpdate(runtimes, snapshot.getRunId());
                if (run == null) {
                    throw new IllegalStateException("Step Run does not exist: " + snapshot.getRunId());
                }
                AIRunStepDTO current = findStepById(runtimes, request.getId());
                if (current == null) {
                    throw new IllegalArgumentException("Step does not exist: " + request.getId());
                }
                validateStepUpdate(request, current);
                return context.executeActionReal(action, args, actionData);
            }
        }, null, ITransactionalUtil.PROPAGATION_REQUIRED);
    }

    public Object createEvent(final IDataEntityRuntimeContext context,
                              final Object[] args) throws Throwable {
        final AIRunEventDTO request = requireArgument(args, AIRunEventDTO.class, "Event Create");
        final HarnessRuntimes runtimes = resolveRuntimes(context);
        validateEventCreate(request);
        final String runId = request.getRunId();
        synchronized (lockFor("run:" + runId)) {
            return ActionSessionManager.execute(new IAction() {
                @Override
                public Object execute(Object[] ignored) throws Throwable {
                    return createEventInTransaction(runtimes, request);
                }
            }, null, ITransactionalUtil.PROPAGATION_REQUIRED);
        }
    }

    public Object rejectEventMutation(String actionName) {
        throw new UnsupportedOperationException("AI_RUN_EVENT is append-only; action is not supported: " + actionName);
    }

    private Object createRunInTransaction(HarnessRuntimes runtimes,
                                          IDataEntityRuntimeContext context,
                                          net.ibizsys.model.dataentity.action.IPSDEAction action,
                                          Object[] args,
                                          Object actionData,
                                          AIRunDTO request) throws Throwable {
        AIRunDTO existing = findRunByIdempotency(runtimes, request.getTenantId(), request.getIdempotencyKey());
        if (existing != null) {
            if (!sameRunCreateRequest(request, existing)) {
                throw new IllegalArgumentException("Run idempotency key conflicts with an existing Run");
            }
            request.reload(existing, true);
            return existing;
        }

        setIdIfAbsent(request);
        request.setStatus(STATUS_QUEUED);
        request.setLastEventSequence(0L);
        sanitizeRunJson(request);
        context.executeActionReal(action, args, actionData);

        AIRunDTO persisted = findRunById(runtimes, request.getId());
        if (persisted == null) {
            throw new IllegalStateException("Run Create completed without a persisted Run");
        }
        persisted = lockRunForUpdate(runtimes, persisted.getId());
        if (persisted == null) {
            throw new IllegalStateException("Run Create completed without a lockable Run");
        }
        AIRunEventDTO created = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(persisted.getId())
                .setEventType(EVENT_RUN_CREATED)
                .setIdempotencyKey(persisted.getId() + ":created")
                .setActorType("system")
                .setTraceId(persisted.getTraceId())
                .setPayloadJson(runCreatedPayload(persisted));
        appendEventInCurrentTransaction(runtimes, persisted, created);
        request.reload(findRunById(runtimes, persisted.getId()), true);
        return persisted;
    }

    private Object createStepInTransaction(HarnessRuntimes runtimes,
                                           IDataEntityRuntimeContext context,
                                           net.ibizsys.model.dataentity.action.IPSDEAction action,
                                           Object[] args,
                                           Object actionData,
                                           AIRunStepDTO request) throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, request.getRunId());
        if (run == null) {
            throw new IllegalArgumentException("Step requires an existing Run: " + request.getRunId());
        }
        if (isTerminal(run.getStatus())) {
            throw new IllegalStateException("Cannot create a Step for a terminal Run: " + run.getStatus());
        }
        if (hasEvent(runtimes, request.getRunId(), "run.cancel_requested")) {
            throw new IllegalStateException("Cannot create a new Step after run.cancel_requested");
        }

        AIRunStepDTO existing = findStepByIdempotency(runtimes, request.getRunId(), request.getIdempotencyKey());
        if (existing != null) {
            if (!sameStepCreateRequest(request, existing)) {
                throw new IllegalArgumentException("Step idempotency key conflicts with an existing Step");
            }
            request.reload(existing, true);
            return existing;
        }

        Long maxSequence = findMaxStepSequence(runtimes, request.getRunId());
        setIdIfAbsent(request);
        request.setSequence(maxSequence + 1L);
        request.setAttempt(0);
        request.setRetryCount(0);
        request.setStatus(STATUS_QUEUED);
        request.setLastEventSequence(0L);
        sanitizeStepJson(request);
        context.executeActionReal(action, args, actionData);

        AIRunStepDTO persisted = findStepById(runtimes, request.getId());
        if (persisted == null) {
            throw new IllegalStateException("Step Create completed without a persisted Step");
        }
        AIRunEventDTO created = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(persisted.getRunId())
                .setStepId(persisted.getId())
                .setEventType(EVENT_STEP_CREATED)
                .setIdempotencyKey(persisted.getRunId() + ":step:" + persisted.getId() + ":created")
                .setActorType("system")
                .setTraceId(run.getTraceId())
                .setPayloadJson(stepCreatedPayload(persisted));
        appendEventInCurrentTransaction(runtimes, run, created);
        request.reload(findStepById(runtimes, persisted.getId()), true);
        return persisted;
    }

    private Object createEventInTransaction(HarnessRuntimes runtimes,
                                            AIRunEventDTO request) throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, request.getRunId());
        if (run == null) {
            throw new IllegalArgumentException("Event requires an existing Run: " + request.getRunId());
        }
        AIRunEventDTO existing = findEventByIdempotency(runtimes, request.getRunId(), request.getIdempotencyKey());
        if (existing != null) {
            if (!sameEventCreateRequest(request, existing)) {
                throw new IllegalArgumentException("Event idempotency key conflicts with an existing Event");
            }
            request.reload(existing, true);
            return existing;
        }
        if (isCancellationEvent(request.getEventType())) {
            throw new UnsupportedOperationException(
                    "Cancellation events are coordinator-managed; use the cancel API");
        }
        if (isTerminal(run.getStatus())) {
            throw new IllegalStateException("Cannot append an Event to a terminal Run: " + run.getStatus());
        }
        if (hasEvent(runtimes, request.getRunId(), EVENT_RUN_CANCEL_REQUESTED)) {
            throw new IllegalStateException(
                    "Cannot append an Event after run.cancel_requested");
        }
        if (request.getStepId() != null) {
            AIRunStepDTO step = findStepById(runtimes, request.getStepId());
            if (step == null || !Objects.equals(request.getRunId(), step.getRunId())) {
                throw new IllegalArgumentException("Event step_id does not belong to run_id");
            }
        }

        setIdIfAbsent(request);
        appendEventInCurrentTransaction(runtimes, run, request);
        request.reload(findEventById(runtimes, request.getId()), true);
        return request;
    }

    private AIRunDTO requestCancelInTransaction(HarnessRuntimes runtimes,
                                                String runId,
                                                String actorId)
            throws Throwable {
        AIRunDTO run = lockRunForUpdate(runtimes, runId);
        if (run == null) {
            throw new IllegalArgumentException("Run does not exist: " + runId);
        }
        if (isTerminal(run.getStatus())) {
            return run;
        }

        String idempotencyKey = runId + ":cancel_requested";
        AIRunEventDTO requested = findEventByIdempotency(
                runtimes, runId, idempotencyKey);
        if (requested == null) {
            String normalizedActorId = trimToNull(actorId);
            requested = new AIRunEventDTO()
                    .setId(KeyValueUtils.genUUIDString())
                    .setRunId(runId)
                    .setEventType(EVENT_RUN_CANCEL_REQUESTED)
                    .setIdempotencyKey(idempotencyKey)
                    .setActorType(normalizedActorId == null ? "system" : "user")
                    .setActorId(normalizedActorId)
                    .setTraceId(run.getTraceId())
                    .setPayloadJson(cancelRequestedPayload(
                            run, normalizedActorId));
            appendEventInCurrentTransaction(runtimes, run, requested);
        } else if (!EVENT_RUN_CANCEL_REQUESTED.equalsIgnoreCase(
                requested.getEventType())) {
            throw new IllegalStateException(
                    "Cancellation idempotency key is owned by another Event");
        }

        if (isImmediatelyCancellable(run.getStatus())) {
            cancelRunInCurrentTransaction(runtimes, run, requested);
        }
        AIRunDTO current = findRunById(runtimes, runId);
        return current == null ? run : current;
    }

    private boolean completeCancellationIfRequested(
            HarnessRuntimes runtimes,
            AIRunDTO run) throws Throwable {
        if (run == null || isTerminal(run.getStatus())) {
            return false;
        }
        AIRunEventDTO requested = findEventByIdempotency(
                runtimes,
                run.getId(),
                run.getId() + ":cancel_requested");
        if (requested == null) {
            return false;
        }
        if (!EVENT_RUN_CANCEL_REQUESTED.equalsIgnoreCase(
                requested.getEventType())) {
            throw new IllegalStateException(
                    "Cancellation idempotency key is owned by another Event");
        }
        cancelRunInCurrentTransaction(runtimes, run, requested);
        return true;
    }

    private void cancelRunInCurrentTransaction(
            HarnessRuntimes runtimes,
            AIRunDTO run,
            AIRunEventDTO requested) throws Throwable {
        if (run == null || isTerminal(run.getStatus())) {
            return;
        }
        int cancelledStepCount = 0;
        List<String> stepIds = findUnfinishedStepIds(runtimes, run.getId());
        for (String stepId : stepIds) {
            AIRunStepDTO step = findStepById(runtimes, stepId);
            if (step == null || isTerminal(step.getStatus())) {
                continue;
            }
            AIRunEventDTO cancelled = new AIRunEventDTO()
                    .setId(KeyValueUtils.genUUIDString())
                    .setRunId(run.getId())
                    .setStepId(step.getId())
                    .setEventType(EVENT_STEP_CANCELLED)
                    .setIdempotencyKey(
                            run.getId() + ":step:" + step.getId()
                                    + ":cancelled")
                    .setActorType(requested.getActorType())
                    .setActorId(requested.getActorId())
                    .setTraceId(run.getTraceId())
                    .setPayloadJson(stepCancelledPayload(step, requested));
            appendEventIfAbsent(runtimes, run, cancelled);
            cancelledStepCount++;
        }

        AIRunEventDTO cancelled = new AIRunEventDTO()
                .setId(KeyValueUtils.genUUIDString())
                .setRunId(run.getId())
                .setEventType(EVENT_RUN_CANCELLED)
                .setIdempotencyKey(run.getId() + ":cancelled")
                .setActorType(requested.getActorType())
                .setActorId(requested.getActorId())
                .setTraceId(run.getTraceId())
                .setPayloadJson(runCancelledPayload(
                        run, requested, cancelledStepCount));
        appendEventIfAbsent(runtimes, run, cancelled);
    }

    /**
     * Appends an event directly so nested Run/Step creation cannot re-enter the
     * Event Service Create plugin.
     */
    private void appendEventInCurrentTransaction(HarnessRuntimes runtimes,
                                                 AIRunDTO run,
                                                 AIRunEventDTO event) throws Throwable {
        if (run == null) {
            throw new IllegalArgumentException("Event append requires a Run");
        }
        Long currentSequence = valueOrZero(run.getLastEventSequence());
        long sequence = currentSequence + 1L;
        String payload = extractPayload(event.getPayloadJson());

        event.setSequence(sequence);
        event.setAggregateVersion(sequence);
        event.setOccurredAt(now());
        event.setPayloadJson(buildEventEnvelope(event, payload));
        Timestamp auditTime = now();
        String auditUser = resolveAuditUser(run);
        event.setCreateMan(auditUser);
        event.setCreateTime(auditTime);
        event.setUpdateMan(auditUser);
        event.setUpdateTime(auditTime);
        runtimes.event.rawCreate(Collections.<IEntityDTO>singletonList(event), true);

        AIRunDTO runProjection = new AIRunDTO().setId(run.getId());
        applyRunProjection(run, event, runProjection);
        runProjection.setUpdateMan(auditUser);
        runProjection.setUpdateTime(auditTime);
        runtimes.run.rawUpdate(Collections.<IEntityDTO>singletonList(runProjection), true);
        mergeRunProjection(run, runProjection);

        if (event.getStepId() != null) {
            AIRunStepDTO step = findStepById(runtimes, event.getStepId());
            if (step == null || !Objects.equals(run.getId(), step.getRunId())) {
                throw new IllegalArgumentException("Event step_id does not belong to run_id");
            }
            AIRunStepDTO stepProjection = new AIRunStepDTO().setId(step.getId());
            applyStepProjection(step, event, stepProjection);
            stepProjection.setUpdateMan(auditUser);
            stepProjection.setUpdateTime(auditTime);
            runtimes.step.rawUpdate(Collections.<IEntityDTO>singletonList(stepProjection), true);
            mergeStepProjection(step, stepProjection);
        }
    }

    private AIRunEventDTO appendEventIfAbsent(HarnessRuntimes runtimes,
                                              AIRunDTO run,
                                              AIRunEventDTO event) throws Throwable {
        AIRunEventDTO existing = findEventByIdempotency(
                runtimes, event.getRunId(), event.getIdempotencyKey());
        if (existing != null) {
            if (!sameEventCreateRequest(event, existing)) {
                throw new IllegalArgumentException(
                        "Event idempotency key conflicts with an existing Event");
            }
            return existing;
        }
        appendEventInCurrentTransaction(runtimes, run, event);
        return event;
    }

    private void mergeRunProjection(AIRunDTO run, AIRunDTO projection) {
        if (projection.containsStatus()) {
            run.setStatus(projection.getStatus());
        }
        if (projection.containsStartedAt()) {
            run.setStartedAt(projection.getStartedAt());
        }
        if (projection.containsFinishedAt()) {
            run.setFinishedAt(projection.getFinishedAt());
        }
        if (projection.containsLeaseOwner()) {
            run.setLeaseOwner(projection.getLeaseOwner());
        }
        if (projection.containsLeaseUntil()) {
            run.setLeaseUntil(projection.getLeaseUntil());
        }
        if (projection.containsNextAttemptAt()) {
            run.setNextAttemptAt(projection.getNextAttemptAt());
        }
        if (projection.containsLastEventSequence()) {
            run.setLastEventSequence(projection.getLastEventSequence());
        }
    }

    private void mergeStepProjection(AIRunStepDTO step, AIRunStepDTO projection) {
        if (projection.containsStatus()) {
            step.setStatus(projection.getStatus());
        }
        if (projection.containsStartedAt()) {
            step.setStartedAt(projection.getStartedAt());
        }
        if (projection.containsFinishedAt()) {
            step.setFinishedAt(projection.getFinishedAt());
        }
        if (projection.containsDurationMs()) {
            step.setDurationMs(projection.getDurationMs());
        }
        if (projection.containsLastEventSequence()) {
            step.setLastEventSequence(projection.getLastEventSequence());
        }
    }

    private String resolveAuditUser(AIRunDTO run) {
        IUserContext userContext = UserContext.getCurrent();
        if (userContext != null) {
            String userId = trimToNull(userContext.getUserid());
            if (userId != null) {
                return userId;
            }
        }
        String runUserId = trimToNull(run == null ? null : run.getUserId());
        return runUserId == null ? "SYSTEM" : runUserId;
    }

    void applyRunProjection(AIRunDTO current, AIRunEventDTO event, AIRunDTO projection) {
        String eventType = lower(event.getEventType());
        String nextStatus = runStatusForEvent(eventType);
        String currentStatus = defaultStatus(current.getStatus(), STATUS_QUEUED);
        if (nextStatus != null) {
            assertRunTransition(currentStatus, nextStatus, eventType);
            projection.setStatus(nextStatus);
            if (STATUS_RUNNING.equals(nextStatus) && current.getStartedAt() == null) {
                projection.setStartedAt(event.getOccurredAt());
            }
            if (isTerminal(nextStatus)) {
                Timestamp finishedAt = event.getOccurredAt() == null ? now() : event.getOccurredAt();
                projection.setFinishedAt(finishedAt);
                projection.setLeaseOwner(null);
                projection.setLeaseUntil(null);
                projection.setNextAttemptAt(null);
            }
        }
        projection.setLastEventSequence(event.getSequence());
    }

    private void applyStepProjection(AIRunStepDTO current, AIRunEventDTO event, AIRunStepDTO projection) {
        String eventType = lower(event.getEventType());
        String nextStatus = stepStatusForEvent(eventType);
        String currentStatus = defaultStatus(current.getStatus(), STATUS_QUEUED);
        if (nextStatus != null) {
            assertStepTransition(currentStatus, nextStatus, eventType);
            projection.setStatus(nextStatus);
            if (STATUS_RUNNING.equals(nextStatus) && current.getStartedAt() == null) {
                projection.setStartedAt(event.getOccurredAt());
            }
            if (isTerminal(nextStatus)) {
                Timestamp finishedAt = event.getOccurredAt() == null ? now() : event.getOccurredAt();
                projection.setFinishedAt(finishedAt);
                if (current.getStartedAt() != null) {
                    projection.setDurationMs(Math.max(0L, finishedAt.getTime() - current.getStartedAt().getTime()));
                }
            }
        }
        projection.setLastEventSequence(event.getSequence());
    }

    private String runStatusForEvent(String eventType) {
        if ("run.started".equals(eventType) || "run.resumed".equals(eventType)) {
            return STATUS_RUNNING;
        }
        if ("run.waiting_approval".equals(eventType) || "tool.approval_required".equals(eventType)) {
            return STATUS_WAITING_APPROVAL;
        }
        if ("run.paused".equals(eventType)) {
            return STATUS_PAUSED;
        }
        if ("run.retrying".equals(eventType)) {
            return STATUS_RETRYING;
        }
        if ("run.completed".equals(eventType)) {
            return STATUS_COMPLETED;
        }
        if ("run.failed".equals(eventType)) {
            return STATUS_FAILED;
        }
        if ("run.cancelled".equals(eventType)) {
            return STATUS_CANCELLED;
        }
        return null;
    }

    private String stepStatusForEvent(String eventType) {
        if ("step.started".equals(eventType)
                || "tool.started".equals(eventType)
                || "llm.requested".equals(eventType)
                || "retrieval.requested".equals(eventType)) {
            return STATUS_RUNNING;
        }
        if ("step.retrying".equals(eventType)) {
            return STATUS_RETRYING;
        }
        if ("step.waiting_approval".equals(eventType)
                || "tool.approval_required".equals(eventType)) {
            return STATUS_WAITING_APPROVAL;
        }
        if ("step.completed".equals(eventType)
                || "tool.completed".equals(eventType)
                || "llm.completed".equals(eventType)
                || "retrieval.completed".equals(eventType)) {
            return STATUS_COMPLETED;
        }
        if ("step.failed".equals(eventType) || "tool.failed".equals(eventType)) {
            return STATUS_FAILED;
        }
        if ("step.cancelled".equals(eventType)) {
            return STATUS_CANCELLED;
        }
        return null;
    }

    private void assertRunTransition(String current, String next, String eventType) {
        if (Objects.equals(current, next)) {
            throw new IllegalStateException("Illegal Run state transition " + current + " -> " + next + " for " + eventType);
        }
        boolean allowed = (STATUS_QUEUED.equals(current) && STATUS_RUNNING.equals(next))
                || (STATUS_QUEUED.equals(current) && STATUS_FAILED.equals(next))
                || (STATUS_QUEUED.equals(current) && STATUS_CANCELLED.equals(next))
                || (STATUS_RUNNING.equals(current)
                    && (STATUS_WAITING_APPROVAL.equals(next) || STATUS_PAUSED.equals(next)
                        || STATUS_RETRYING.equals(next) || STATUS_COMPLETED.equals(next)
                        || STATUS_FAILED.equals(next) || STATUS_CANCELLED.equals(next)))
                || (STATUS_WAITING_APPROVAL.equals(current)
                    && (STATUS_RUNNING.equals(next) || STATUS_FAILED.equals(next)
                        || STATUS_CANCELLED.equals(next)))
                || (STATUS_PAUSED.equals(current)
                    && (STATUS_RUNNING.equals(next) || STATUS_FAILED.equals(next)
                        || STATUS_CANCELLED.equals(next)))
                || (STATUS_RETRYING.equals(current)
                    && (STATUS_RUNNING.equals(next) || STATUS_FAILED.equals(next)
                        || STATUS_CANCELLED.equals(next)));
        if (!allowed) {
            throw new IllegalStateException("Illegal Run state transition " + current + " -> " + next + " for " + eventType);
        }
    }

    private void assertStepTransition(String current, String next, String eventType) {
        if (Objects.equals(current, next)) {
            throw new IllegalStateException("Illegal Step state transition " + current + " -> " + next + " for " + eventType);
        }
        boolean allowed = (STATUS_QUEUED.equals(current) && STATUS_RUNNING.equals(next))
                || (STATUS_QUEUED.equals(current) && STATUS_CANCELLED.equals(next))
                || (STATUS_RUNNING.equals(current)
                    && (STATUS_WAITING_APPROVAL.equals(next) || STATUS_RETRYING.equals(next)
                        || STATUS_COMPLETED.equals(next) || STATUS_FAILED.equals(next)
                        || STATUS_CANCELLED.equals(next)))
                || (STATUS_WAITING_APPROVAL.equals(current)
                    && (STATUS_RUNNING.equals(next) || STATUS_CANCELLED.equals(next)))
                || (STATUS_PAUSED.equals(current)
                    && STATUS_CANCELLED.equals(next))
                || (STATUS_RETRYING.equals(current)
                    && (STATUS_RUNNING.equals(next) || STATUS_FAILED.equals(next)
                        || STATUS_CANCELLED.equals(next)));
        if (!allowed) {
            throw new IllegalStateException("Illegal Step state transition " + current + " -> " + next + " for " + eventType);
        }
    }

    private void validateRunCreate(AIRunDTO dto) {
        requireText(dto.getRunType(), "run_type is required");
        requireText(dto.getTenantId(), "tenant_id is required");
        requireText(dto.getUserId(), "user_id is required");
        requireText(dto.getAgentId(), "agent_id is required");
        requireText(dto.getModelId(), "model_id is required");
        requireText(dto.getIdempotencyKey(), "idempotency_key is required");
        requireText(dto.getTraceId(), "trace_id is required");
        sanitizeRunJson(dto);
    }

    private void validateStepCreate(AIRunStepDTO dto) {
        requireText(dto.getRunId(), "run_id is required");
        requireText(dto.getStepKind(), "step_kind is required");
        requireText(dto.getIdempotencyKey(), "idempotency_key is required");
        sanitizeStepJson(dto);
    }

    private void validateEventCreate(AIRunEventDTO dto) {
        requireText(dto.getRunId(), "run_id is required");
        requireText(dto.getEventType(), "event_type is required");
        requireText(dto.getIdempotencyKey(), "idempotency_key is required");
        requireText(dto.getActorType(), "actor_type is required");
        requireText(dto.getTraceId(), "trace_id is required");
        requireText(dto.getPayloadJson(), "payload_json is required");
        dto.setPayloadJson(sanitizeJson(dto.getPayloadJson()));
    }

    private void validateRunUpdate(AIRunDTO request, AIRunDTO current) {
        rejectIfPresent(request.containsStatus(), "status is event-projected and cannot be updated directly");
        rejectIfPresent(request.containsLastEventSequence(), "last_event_sequence is event-projected");
        rejectIfPresent(request.containsStartedAt(), "started_at is event-projected");
        rejectIfPresent(request.containsFinishedAt(), "finished_at is event-projected");
        assertImmutable(request.containsTenantId(), request.getTenantId(), current.getTenantId(), "tenant_id");
        assertImmutable(request.containsIdempotencyKey(), request.getIdempotencyKey(), current.getIdempotencyKey(), "idempotency_key");
        assertImmutable(request.containsRunType(), request.getRunType(), current.getRunType(), "run_type");
        assertImmutable(request.containsUserId(), request.getUserId(), current.getUserId(), "user_id");
        assertImmutable(request.containsAgentId(), request.getAgentId(), current.getAgentId(), "agent_id");
        assertImmutable(request.containsModelId(), request.getModelId(), current.getModelId(), "model_id");
        assertImmutable(request.containsTraceId(), request.getTraceId(), current.getTraceId(), "trace_id");
    }

    private void validateStepUpdate(AIRunStepDTO request, AIRunStepDTO current) {
        rejectIfPresent(request.containsStatus(), "status is event-projected and cannot be updated directly");
        rejectIfPresent(request.containsSequence(), "sequence is coordinator-assigned");
        rejectIfPresent(request.containsAttempt(), "attempt is coordinator-assigned");
        rejectIfPresent(request.containsRetryCount(), "retry_count is coordinator-managed");
        rejectIfPresent(request.containsLastEventSequence(), "last_event_sequence is event-projected");
        rejectIfPresent(request.containsStartedAt(), "started_at is event-projected");
        rejectIfPresent(request.containsFinishedAt(), "finished_at is event-projected");
        rejectIfPresent(request.containsDurationMs(), "duration_ms is event-projected");
        assertImmutable(request.containsRunId(), request.getRunId(), current.getRunId(), "run_id");
        assertImmutable(request.containsIdempotencyKey(), request.getIdempotencyKey(), current.getIdempotencyKey(), "idempotency_key");
        assertImmutable(request.containsStepKind(), request.getStepKind(), current.getStepKind(), "step_kind");
    }

    private void sanitizeRunJson(AIRunDTO dto) {
        if (dto.containsRequestJson()) {
            dto.setRequestJson(sanitizeJson(dto.getRequestJson()));
        }
        if (dto.containsResultJson()) {
            dto.setResultJson(sanitizeJson(dto.getResultJson()));
        }
        if (dto.containsBudgetJson()) {
            dto.setBudgetJson(sanitizeJson(dto.getBudgetJson()));
        }
        if (dto.containsErrorMessage()) {
            dto.setErrorMessage(sanitizeText(dto.getErrorMessage(), 1000));
        }
    }

    private void sanitizeStepJson(AIRunStepDTO dto) {
        if (dto.containsInputJson()) {
            dto.setInputJson(sanitizeJson(dto.getInputJson()));
        }
        if (dto.containsOutputJson()) {
            dto.setOutputJson(sanitizeJson(dto.getOutputJson()));
        }
        if (dto.containsErrorMessage()) {
            dto.setErrorMessage(sanitizeText(dto.getErrorMessage(), 1000));
        }
    }

    private String buildEventEnvelope(AIRunEventDTO event, String payload) {
        ObjectNode envelope = JsonUtils.createObjectNode();
        envelope.put("schema_version", 1);
        envelope.put("event_type", event.getEventType());
        envelope.put("run_id", event.getRunId());
        if (event.getStepId() != null) {
            envelope.put("step_id", event.getStepId());
        }
        envelope.put("sequence", valueOrZero(event.getSequence()));
        envelope.put("aggregate_version", valueOrZero(event.getAggregateVersion()));
        envelope.put("idempotency_key", event.getIdempotencyKey());
        envelope.put("trace_id", event.getTraceId());
        if (event.getOccurredAt() != null) {
            envelope.put("occurred_at", event.getOccurredAt().toInstant().toString());
        }
        ObjectNode actor = envelope.putObject("actor");
        actor.put("type", event.getActorType());
        if (event.getActorId() != null) {
            actor.put("id", event.getActorId());
        }
        JsonNode payloadNode = parseAndSanitize(payload);
        envelope.set("payload", payloadNode == null ? JsonUtils.createObjectNode() : payloadNode);
        return JsonUtils.toString(envelope);
    }

    private String runCreatedPayload(AIRunDTO run) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("run_type", run.getRunType());
        payload.put("tenant_id", run.getTenantId());
        payload.put("agent_id", run.getAgentId());
        payload.put("model_id", run.getModelId());
        if (run.getConversationId() != null) {
            payload.put("conversation_id", run.getConversationId());
        }
        return JsonUtils.toString(payload);
    }

    private String stepCreatedPayload(AIRunStepDTO step) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("sequence", valueOrZero(step.getSequence()));
        payload.put("attempt", step.getAttempt() == null ? 0 : step.getAttempt());
        payload.put("step_kind", step.getStepKind());
        if (step.getName() != null) {
            payload.put("name", step.getName());
        }
        return JsonUtils.toString(payload);
    }

    private String cancelRequestedPayload(AIRunDTO run, String actorId) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(
                run.getStatus(), STATUS_QUEUED));
        payload.put("status", "cancel_requested");
        if (actorId != null) {
            payload.put("requested_by", actorId);
        }
        return JsonUtils.toString(payload);
    }

    private String stepCancelledPayload(AIRunStepDTO step,
                                        AIRunEventDTO requested) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(
                step.getStatus(), STATUS_QUEUED));
        payload.put("status", STATUS_CANCELLED);
        if (requested.getSequence() != null) {
            payload.put("cancel_requested_sequence", requested.getSequence());
        }
        return JsonUtils.toString(payload);
    }

    private String runCancelledPayload(AIRunDTO run,
                                       AIRunEventDTO requested,
                                       int cancelledStepCount) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(
                run.getStatus(), STATUS_QUEUED));
        payload.put("status", STATUS_CANCELLED);
        payload.put("cancelled_step_count", cancelledStepCount);
        if (requested.getSequence() != null) {
            payload.put("cancel_requested_sequence", requested.getSequence());
        }
        return JsonUtils.toString(payload);
    }

    private String recoveryExpiredPayload(AIRunDTO run,
                                          String errorCode,
                                          String errorMessage) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(run.getStatus(), STATUS_QUEUED));
        payload.put("decision", "deadline_expired");
        payload.put("error_code", errorCode);
        payload.put("error_message", sanitizeText(errorMessage, 1000));
        if (run.getDeadlineAt() != null) {
            payload.put("deadline_at", run.getDeadlineAt().toInstant().toString());
        }
        if (run.getRecoveryAttempts() != null) {
            payload.put("recovery_attempts", run.getRecoveryAttempts());
        }
        return JsonUtils.toString(payload);
    }

    private String runFailedPayload(AIRunDTO run,
                                    String errorCode,
                                    String errorMessage) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(run.getStatus(), STATUS_QUEUED));
        payload.put("status", STATUS_FAILED);
        payload.put("error_code", errorCode);
        payload.put("error_message", sanitizeText(errorMessage, 1000));
        if (run.getDeadlineAt() != null) {
            payload.put("deadline_at", run.getDeadlineAt().toInstant().toString());
        }
        return JsonUtils.toString(payload);
    }

    private String recoveryClaimedPayload(AIRunDTO run,
                                          String workerId,
                                          int recoveryAttempts,
                                          Timestamp leaseUntil) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(run.getStatus(), STATUS_QUEUED));
        payload.put("decision", "resume");
        payload.put("worker_id", workerId);
        payload.put("recovery_attempts", recoveryAttempts);
        if (leaseUntil != null) {
            payload.put("lease_until", leaseUntil.toInstant().toString());
        }
        return JsonUtils.toString(payload);
    }

    private String recoveryStartedPayload(AIRunDTO run,
                                          HarnessRecoveryClaim claim) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(
                run.getStatus(), STATUS_QUEUED));
        payload.put("worker_id", claim.getWorkerId());
        payload.put("recovery_attempts", claim.getRecoveryAttempts());
        payload.put("lease_until", claim.getLeaseUntil().toInstant().toString());
        return JsonUtils.toString(payload);
    }

    private String recoveryCompletedPayload(AIRunDTO run,
                                            HarnessRecoveryClaim claim) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(
                run.getStatus(), STATUS_RUNNING));
        payload.put("status", STATUS_COMPLETED);
        payload.put("worker_id", claim.getWorkerId());
        payload.put("recovery_attempts", claim.getRecoveryAttempts());
        return JsonUtils.toString(payload);
    }

    private String recoveryRetryingPayload(AIRunDTO run,
                                           HarnessRecoveryClaim claim,
                                           String errorCode,
                                           String errorMessage,
                                           Timestamp nextAttemptAt) {
        ObjectNode payload = JsonUtils.createObjectNode();
        payload.put("previous_status", defaultStatus(
                run.getStatus(), STATUS_RUNNING));
        payload.put("status", STATUS_RETRYING);
        payload.put("worker_id", claim.getWorkerId());
        payload.put("recovery_attempts", claim.getRecoveryAttempts());
        payload.put("error_code", errorCode);
        payload.put("error_message", sanitizeText(errorMessage, 1000));
        if (nextAttemptAt != null) {
            payload.put("next_attempt_at", nextAttemptAt.toInstant().toString());
        }
        return JsonUtils.toString(payload);
    }

    private AIRunDTO findRunById(HarnessRuntimes runtimes, String id) throws Throwable {
        if (id == null) {
            return null;
        }
        IEntityDTO result = runtimes.run.rawGet(id);
        return result instanceof AIRunDTO ? (AIRunDTO) result : copyRun(result);
    }

    private AIRunDTO lockRunForUpdate(HarnessRuntimes runtimes, String id) throws Throwable {
        if (id == null) {
            return null;
        }
        List<?> rows = runtimes.run.getSysDBSchemeRuntimeMust().executeSelectSQL(
                "SELECT ID FROM AI_RUN WHERE ID = ? FOR UPDATE",
                Arrays.<Object>asList(id));
        if (rows == null || rows.isEmpty()) {
            return null;
        }
        AIRunDTO run = findRunById(runtimes, id);
        if (run == null) {
            throw new IllegalStateException("Locked Run cannot be reloaded: " + id);
        }
        return run;
    }

    private AIRunDTO reloadRunCreateAfterConflict(final HarnessRuntimes runtimes,
                                                  final AIRunDTO request) throws Throwable {
        return (AIRunDTO) ActionSessionManager.execute(new IAction() {
            @Override
            public Object execute(Object[] ignored) throws Throwable {
                AIRunDTO existing = findRunByIdempotency(
                        runtimes, request.getTenantId(), request.getIdempotencyKey());
                if (existing == null) {
                    return null;
                }
                if (!sameRunCreateRequest(request, existing)) {
                    throw new IllegalArgumentException(
                            "Run idempotency key conflicts with an existing Run");
                }
                request.reload(existing, true);
                return existing;
            }
        }, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
    }

    private boolean isUniqueConstraintViolation(Throwable error) {
        Throwable current = error;
        for (int depth = 0; current != null && depth < 20; depth++) {
            if (current instanceof SQLIntegrityConstraintViolationException) {
                return true;
            }
            String className = current.getClass().getName();
            if (className.endsWith("DuplicateKeyException")
                    || className.endsWith("ConstraintViolationException")) {
                return true;
            }
            String message = current.getMessage();
            if (message != null) {
                String normalized = message.toLowerCase();
                if (normalized.contains("duplicate entry")
                        || normalized.contains("duplicate key")
                        || normalized.contains("unique constraint")
                        || normalized.contains("uk_ai_run_tenant_idempotency")) {
                    return true;
                }
            }
            current = current.getCause();
        }
        return false;
    }

    private AIRunDTO findRunByIdempotency(HarnessRuntimes runtimes,
                                          String tenantId,
                                          String idempotencyKey) {
        ISearchContextDTO search = runtimes.run.createSearchContext()
                .eq(AIRunDTO.FIELD_TENANTID, tenantId)
                .eq(AIRunDTO.FIELD_IDEMPOTENCYKEY, idempotencyKey);
        IEntityDTO result = runtimes.run.rawSelectOne(search, true);
        return result == null ? null : (result instanceof AIRunDTO ? (AIRunDTO) result : copyRun(result));
    }

    private AIRunStepDTO findStepById(HarnessRuntimes runtimes, String id) throws Throwable {
        if (id == null) {
            return null;
        }
        IEntityDTO result = runtimes.step.rawGet(id);
        return result instanceof AIRunStepDTO ? (AIRunStepDTO) result : copyStep(result);
    }

    private AIRunStepDTO findStepByIdempotency(HarnessRuntimes runtimes,
                                               String runId,
                                               String idempotencyKey) {
        ISearchContextDTO search = runtimes.step.createSearchContext()
                .eq(AIRunStepDTO.FIELD_RUNID, runId)
                .eq(AIRunStepDTO.FIELD_IDEMPOTENCYKEY, idempotencyKey);
        IEntityDTO result = runtimes.step.rawSelectOne(search, true);
        return result == null ? null : (result instanceof AIRunStepDTO ? (AIRunStepDTO) result : copyStep(result));
    }

    private AIRunEventDTO findEventById(HarnessRuntimes runtimes, String id) {
        if (id == null) {
            return null;
        }
        ISearchContextDTO search = runtimes.event.createSearchContext()
                .eq(AIRunEventDTO.FIELD_ID, id);
        IEntityDTO result = runtimes.event.rawSelectOne(search, true);
        return result == null ? null : (result instanceof AIRunEventDTO ? (AIRunEventDTO) result : copyEvent(result));
    }

    private AIRunEventDTO findEventByIdempotency(HarnessRuntimes runtimes,
                                                 String runId,
                                                 String idempotencyKey) {
        ISearchContextDTO search = runtimes.event.createSearchContext()
                .eq(AIRunEventDTO.FIELD_RUNID, runId)
                .eq(AIRunEventDTO.FIELD_IDEMPOTENCYKEY, idempotencyKey);
        IEntityDTO result = runtimes.event.rawSelectOne(search, true);
        return result == null ? null : (result instanceof AIRunEventDTO ? (AIRunEventDTO) result : copyEvent(result));
    }

    private boolean hasEvent(HarnessRuntimes runtimes, String runId, String eventType) {
        ISearchContextDTO search = runtimes.event.createSearchContext()
                .eq(AIRunEventDTO.FIELD_RUNID, runId)
                .eq(AIRunEventDTO.FIELD_EVENTTYPE, eventType);
        return runtimes.event.rawSelectOne(search, true) != null;
    }

    private List<String> findUnfinishedStepIds(HarnessRuntimes runtimes,
                                               String runId)
            throws Throwable {
        String sql = "SELECT ID AS id"
                + " FROM AI_RUN_STEP"
                + " WHERE RUN_ID = ?"
                + " AND (STATUS IS NULL OR STATUS NOT IN (?, ?, ?))"
                + " ORDER BY SEQUENCE ASC, ID ASC";
        List<?> rows = runtimes.step.getSysDBSchemeRuntimeMust()
                .executeSelectSQL(
                        sql,
                        Arrays.<Object>asList(
                                runId,
                                STATUS_COMPLETED,
                                STATUS_FAILED,
                                STATUS_CANCELLED));
        List<String> result = new ArrayList<String>();
        if (rows == null) {
            return result;
        }
        for (Object row : rows) {
            String id = extractRecoveryCandidateId(row);
            if (id != null && !result.contains(id)) {
                result.add(id);
            }
        }
        return result;
    }

    private Long findMaxStepSequence(HarnessRuntimes runtimes, String runId) {
        ISearchContextDTO search = runtimes.step.createSearchContext()
                .eq(AIRunStepDTO.FIELD_RUNID, runId)
                .sort(AIRunStepDTO.FIELD_SEQUENCE + ",desc")
                .limit(1);
        List<IEntityDTO> list = runtimes.step.rawSelect(search);
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        return list.get(0).getLong(AIRunStepDTO.FIELD_SEQUENCE, 0L);
    }

    private boolean sameRunCreateRequest(AIRunDTO request, AIRunDTO existing) {
        return same(request.getTenantId(), existing.getTenantId())
                && same(request.getRunType(), existing.getRunType())
                && same(request.getUserId(), existing.getUserId())
                && same(request.getProjectId(), existing.getProjectId())
                && same(request.getAgentId(), existing.getAgentId())
                && same(request.getAgentVersion(), existing.getAgentVersion())
                && same(request.getModelId(), existing.getModelId())
                && same(request.getProvider(), existing.getProvider())
                && same(request.getContextId(), existing.getContextId())
                && same(request.getConversationId(), existing.getConversationId())
                && same(request.getSessionId(), existing.getSessionId())
                && same(request.getParentRunId(), existing.getParentRunId())
                && same(request.getTraceId(), existing.getTraceId())
                && same(request.getWorkspace(), existing.getWorkspace())
                && sameJson(request.getRequestJson(), existing.getRequestJson())
                && sameJson(request.getBudgetJson(), existing.getBudgetJson())
                && Objects.equals(request.getDeadlineAt(), existing.getDeadlineAt());
    }

    private boolean sameStepCreateRequest(AIRunStepDTO request, AIRunStepDTO existing) {
        return same(request.getRunId(), existing.getRunId())
                && same(request.getStepKind(), existing.getStepKind())
                && same(request.getName(), existing.getName())
                && sameJson(request.getInputJson(), existing.getInputJson())
                && sameJson(request.getOutputJson(), existing.getOutputJson())
                && same(request.getToolName(), existing.getToolName())
                && same(request.getToolCallId(), existing.getToolCallId());
    }

    private boolean sameEventCreateRequest(AIRunEventDTO request, AIRunEventDTO existing) {
        return same(request.getRunId(), existing.getRunId())
                && same(request.getStepId(), existing.getStepId())
                && same(request.getEventType(), existing.getEventType())
                && same(request.getIdempotencyKey(), existing.getIdempotencyKey())
                && same(request.getActorType(), existing.getActorType())
                && same(request.getActorId(), existing.getActorId())
                && same(request.getTraceId(), existing.getTraceId())
                && sameJson(extractPayload(request.getPayloadJson()), extractPayload(existing.getPayloadJson()));
    }

    private String extractPayload(String envelope) {
        JsonNode node = parseAndSanitize(envelope);
        if (isEventEnvelope(node)) {
            return JsonUtils.toString(node.get("payload"));
        }
        return envelope;
    }

    private boolean isEventEnvelope(JsonNode node) {
        return node != null
                && node.isObject()
                && node.has("schema_version")
                && node.has("event_type")
                && node.has("run_id")
                && node.has("sequence")
                && node.has("aggregate_version")
                && node.has("idempotency_key")
                && node.has("trace_id")
                && node.has("actor")
                && node.has("payload");
    }

    private boolean sameJson(String left, String right) {
        if (left == null || right == null) {
            return left == null && right == null;
        }
        JsonNode leftNode = parseAndSanitize(left);
        JsonNode rightNode = parseAndSanitize(right);
        return Objects.equals(leftNode, rightNode);
    }

    private JsonNode parseAndSanitize(String value) {
        if (value == null) {
            return null;
        }
        try {
            JsonNode node = JsonUtils.toJsonNode(value);
            return sanitizeNode(node);
        } catch (RuntimeException ex) {
            return JsonUtils.getMapper().getNodeFactory().textNode(redactText(value));
        }
    }

    private String sanitizeJson(String value) {
        if (value == null) {
            return null;
        }
        JsonNode node = parseAndSanitize(value);
        return node == null ? null : JsonUtils.toString(node);
    }

    private JsonNode sanitizeNode(JsonNode node) {
        if (node == null || node.isNull()) {
            return node;
        }
        if (node.isTextual()) {
            return JsonUtils.getMapper().getNodeFactory().textNode(redactText(node.asText()));
        }
        if (node.isObject()) {
            ObjectNode output = JsonUtils.createObjectNode();
            java.util.Iterator<java.util.Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                java.util.Map.Entry<String, JsonNode> field = fields.next();
                if (isSensitiveKey(field.getKey())) {
                    output.put(field.getKey(), "[REDACTED]");
                } else {
                    output.set(field.getKey(), sanitizeNode(field.getValue()));
                }
            }
            return output;
        }
        if (node.isArray()) {
            ArrayNode output = JsonUtils.createArrayNode();
            for (JsonNode child : node) {
                output.add(sanitizeNode(child));
            }
            return output;
        }
        return node;
    }

    private String sanitizeText(String value, int maxLength) {
        if (value == null) {
            return null;
        }
        String result = redactText(value);
        return result.length() <= maxLength ? result : result.substring(0, maxLength);
    }

    private String sanitizeCode(String value) {
        String code = sanitizeText(value, 100);
        return code == null || code.trim().isEmpty()
                ? "HARNESS_EXECUTION_FAILED"
                : code.trim();
    }

    private String redactText(String value) {
        String result = BEARER_PATTERN.matcher(value).replaceAll("$1[REDACTED]");
        result = AUTHORIZATION_PATTERN.matcher(result).replaceAll("$1[REDACTED]");
        result = COOKIE_PATTERN.matcher(result).replaceAll("$1[REDACTED]");
        return SECRET_ASSIGNMENT_PATTERN.matcher(result).replaceAll("$1[REDACTED]");
    }

    private boolean isSensitiveKey(String key) {
        String normalized = key == null ? "" : key.toLowerCase().replace("-", "_");
        return "authorization".equals(normalized)
                || "cookie".equals(normalized)
                || "api_key".equals(normalized)
                || "apikey".equals(normalized)
                || "password".equals(normalized)
                || "secret".equals(normalized)
                || "access_token".equals(normalized)
                || "token".equals(normalized);
    }

    private HarnessRuntimes resolveRuntimes(IDataEntityRuntimeContext context) {
        if (context == null || context.getDataEntityRuntime() == null) {
            throw new IllegalArgumentException("Harness action requires a DataEntityRuntime context");
        }
        net.ibizsys.central.ISystemRuntime systemRuntime =
                (net.ibizsys.central.ISystemRuntime)
                        context.getDataEntityRuntime().getSystemRuntime();
        if (systemRuntime == null) {
            throw new IllegalStateException("Harness action requires a SystemRuntime");
        }
        return resolveRuntimes(systemRuntime);
    }

    private HarnessRuntimes resolveRuntimes(ISystemRuntime systemRuntime) {
        return resolveRuntimes(
                (net.ibizsys.central.ISystemRuntime) systemRuntime);
    }

    private HarnessRuntimes resolveRuntimes(
            net.ibizsys.central.ISystemRuntime systemRuntime) {
        if (systemRuntime == null) {
            throw new IllegalArgumentException(
                    "Harness operation requires a SystemRuntime");
        }
        return new HarnessRuntimes(
                systemRuntime.getDataEntityRuntime(RUN_ENTITY_ID, false),
                systemRuntime.getDataEntityRuntime(STEP_ENTITY_ID, false),
                systemRuntime.getDataEntityRuntime(EVENT_ENTITY_ID, false));
    }

    private Object lockFor(String key) {
        Object lock = LOCKS.get(key);
        if (lock != null) {
            return lock;
        }
        Object candidate = new Object();
        Object existing = LOCKS.putIfAbsent(key, candidate);
        return existing == null ? candidate : existing;
    }

    private boolean same(Object left, Object right) {
        return Objects.equals(left, right);
    }

    private void assertImmutable(boolean present, Object requested, Object current, String field) {
        if (present && !same(requested, current)) {
            throw new IllegalArgumentException(field + " is immutable");
        }
    }

    private void rejectIfPresent(boolean present, String message) {
        if (present) {
            throw new IllegalArgumentException(message);
        }
    }

    private void requireText(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    private String trimToNull(String value) {
        if (value == null) {
            return null;
        }
        String result = value.trim();
        return result.isEmpty() ? null : result;
    }

    private <T> T requireArgument(Object[] args, Class<T> type, String actionName) {
        if (args == null || args.length == 0 || !type.isInstance(args[0])) {
            throw new IllegalArgumentException(actionName + " requires a " + type.getSimpleName());
        }
        return type.cast(args[0]);
    }

    private String defaultStatus(String value, String fallback) {
        return value == null || value.trim().isEmpty() ? fallback : value.toLowerCase();
    }

    private String lower(String value) {
        return value == null ? null : value.toLowerCase();
    }

    private boolean isTerminal(String status) {
        return STATUS_COMPLETED.equalsIgnoreCase(status)
                || STATUS_FAILED.equalsIgnoreCase(status)
                || STATUS_CANCELLED.equalsIgnoreCase(status);
    }

    private boolean isImmediatelyCancellable(String status) {
        String normalized = defaultStatus(status, STATUS_QUEUED);
        return STATUS_QUEUED.equals(normalized)
                || STATUS_RETRYING.equals(normalized)
                || STATUS_WAITING_APPROVAL.equals(normalized)
                || STATUS_PAUSED.equals(normalized);
    }

    private boolean isCancellationEvent(String eventType) {
        return EVENT_RUN_CANCEL_REQUESTED.equalsIgnoreCase(eventType)
                || EVENT_RUN_CANCELLED.equalsIgnoreCase(eventType)
                || EVENT_STEP_CANCELLED.equalsIgnoreCase(eventType);
    }

    private long valueOrZero(Long value) {
        return value == null ? 0L : value;
    }

    private Timestamp now() {
        return new Timestamp(System.currentTimeMillis());
    }

    private AIRunDTO copyRun(IEntityDTO source) {
        try {
            AIRunDTO result = new AIRunDTO();
            result.reload(source, true);
            return result;
        } catch (Exception ex) {
            throw new IllegalStateException("Failed to copy AI_RUN DTO", ex);
        }
    }

    private AIRunStepDTO copyStep(IEntityDTO source) {
        try {
            AIRunStepDTO result = new AIRunStepDTO();
            result.reload(source, true);
            return result;
        } catch (Exception ex) {
            throw new IllegalStateException("Failed to copy AI_RUN_STEP DTO", ex);
        }
    }

    private AIRunEventDTO copyEvent(IEntityDTO source) {
        try {
            AIRunEventDTO result = new AIRunEventDTO();
            result.reload(source, true);
            return result;
        } catch (Exception ex) {
            throw new IllegalStateException("Failed to copy AI_RUN_EVENT DTO", ex);
        }
    }

    private void setIdIfAbsent(AIRunDTO dto) {
        if (dto.getId() == null || dto.getId().trim().isEmpty()) {
            dto.setId(KeyValueUtils.genUUIDString());
        }
    }

    private void setIdIfAbsent(AIRunStepDTO dto) {
        if (dto.getId() == null || dto.getId().trim().isEmpty()) {
            dto.setId(KeyValueUtils.genUUIDString());
        }
    }

    private void setIdIfAbsent(AIRunEventDTO dto) {
        if (dto.getId() == null || dto.getId().trim().isEmpty()) {
            dto.setId(KeyValueUtils.genUUIDString());
        }
    }

    private static final class RecoveryClaimOutcome {
        private final boolean handled;
        private final HarnessRecoveryClaim claim;

        private RecoveryClaimOutcome(boolean handled,
                                     HarnessRecoveryClaim claim) {
            this.handled = handled;
            this.claim = claim;
        }

        private static RecoveryClaimOutcome skipped() {
            return new RecoveryClaimOutcome(false, null);
        }

        private static RecoveryClaimOutcome expired() {
            return new RecoveryClaimOutcome(true, null);
        }

        private static RecoveryClaimOutcome cancelled() {
            return new RecoveryClaimOutcome(true, null);
        }

        private static RecoveryClaimOutcome claimed(
                HarnessRecoveryClaim claim) {
            return new RecoveryClaimOutcome(true, claim);
        }
    }

    private static final class HarnessRuntimes {
        private final IDataEntityRuntime run;
        private final IDataEntityRuntime step;
        private final IDataEntityRuntime event;

        private HarnessRuntimes(IDataEntityRuntime run,
                                IDataEntityRuntime step,
                                IDataEntityRuntime event) {
            this.run = Objects.requireNonNull(run, "AI_RUN runtime is required");
            this.step = Objects.requireNonNull(step, "AI_RUN_STEP runtime is required");
            this.event = Objects.requireNonNull(event, "AI_RUN_EVENT runtime is required");
        }
    }
}
