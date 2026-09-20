package cn.ibizlab.runner.servicerunner.harness;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.Decision.CLAIM;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.Decision.EXPIRE;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.Decision.SKIP;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.ClaimState.ACTIVE;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.ClaimState.ATTEMPT_MISMATCH;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.ClaimState.LEASE_EXPIRED;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.ClaimState.OWNER_MISMATCH;
import static cn.ibizlab.runner.servicerunner.harness.HarnessRecoveryPolicy.ClaimState.TERMINAL;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HarnessRecoveryPolicyTest {

    private static final Timestamp NOW = timestamp(1000L);

    @Test
    void claimsExecutableRunWhenLeaseAndRetryAreDue() {
        assertEquals(CLAIM, decide("queued", null, null, null));
        assertEquals(CLAIM, decide("running", timestamp(999L), timestamp(999L), null));
        assertEquals(CLAIM, decide("retrying", null, timestamp(1000L), null));
    }

    @Test
    void skipsRunWithActiveLeaseOrFutureRetry() {
        assertEquals(SKIP, decide("running", timestamp(1001L), null, null));
        assertEquals(SKIP, decide("retrying", null, timestamp(1001L), null));
    }

    @Test
    void doesNotAutomaticallyClaimPausedOrApprovalRuns() {
        assertEquals(SKIP, decide("paused", null, null, null));
        assertEquals(SKIP, decide("waiting_approval", null, timestamp(999L), null));
    }

    @Test
    void expiresAnyManagedNonTerminalStatusAfterDeadline() {
        assertEquals(EXPIRE, decide("queued", null, null, timestamp(1000L)));
        assertEquals(EXPIRE, decide("running", null, timestamp(2000L), timestamp(999L)));
        assertEquals(EXPIRE, decide("retrying", null, null, timestamp(999L)));
        assertEquals(EXPIRE, decide("paused", null, null, timestamp(999L)));
        assertEquals(EXPIRE, decide("waiting_approval", null, null, timestamp(999L)));
    }

    @Test
    void activeLeaseWinsUntilItsOwnerReleasesOrExpires() {
        assertEquals(SKIP, decide("running", timestamp(1001L), null, timestamp(999L)));
    }

    @Test
    void skipsTerminalAndUnknownStatuses() {
        assertEquals(SKIP, decide("completed", null, null, timestamp(999L)));
        assertEquals(SKIP, decide("failed", null, null, timestamp(999L)));
        assertEquals(SKIP, decide("cancelled", null, null, timestamp(999L)));
        assertEquals(SKIP, decide("other", null, null, timestamp(999L)));
        assertEquals(SKIP, decide(null, null, null, timestamp(999L)));
    }

    @Test
    void validatesClaimOwnerAttemptLeaseAndTerminalState() {
        HarnessRecoveryClaim claim = new HarnessRecoveryClaim(
                new cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO()
                        .setId("run-01"),
                "worker-01",
                2,
                timestamp(2000L));

        assertEquals(ACTIVE, validateClaim(
                "running", "worker-01", timestamp(1001L), 2, claim));
        assertEquals(OWNER_MISMATCH, validateClaim(
                "running", "worker-02", timestamp(1001L), 2, claim));
        assertEquals(ATTEMPT_MISMATCH, validateClaim(
                "running", "worker-01", timestamp(1001L), 3, claim));
        assertEquals(LEASE_EXPIRED, validateClaim(
                "running", "worker-01", timestamp(1000L), 2, claim));
        assertEquals(TERMINAL, validateClaim(
                "completed", "worker-01", timestamp(1001L), 2, claim));
    }

    @Test
    void calculatesExponentialBackoffWithCap() {
        assertEquals(5000L,
                HarnessRecoveryPolicy.calculateBackoffMs(1, 5000L, 60000L));
        assertEquals(10000L,
                HarnessRecoveryPolicy.calculateBackoffMs(2, 5000L, 60000L));
        assertEquals(20000L,
                HarnessRecoveryPolicy.calculateBackoffMs(3, 5000L, 60000L));
        assertEquals(60000L,
                HarnessRecoveryPolicy.calculateBackoffMs(10, 5000L, 60000L));
    }

    @Test
    void calculatesLeaseDeadlineAndCapsItAtRunDeadline() {
        assertEquals(timestamp(1600L),
                HarnessRecoveryPolicy.calculateLeaseUntil(
                        timestamp(1000L), 600L, null));
        assertEquals(timestamp(1400L),
                HarnessRecoveryPolicy.calculateLeaseUntil(
                        timestamp(1000L), 600L, timestamp(1400L)));
    }

    private static HarnessRecoveryPolicy.Decision decide(String status,
                                                         Timestamp leaseUntil,
                                                         Timestamp nextAttemptAt,
                                                         Timestamp deadlineAt) {
        return HarnessRecoveryPolicy.decide(
                status, leaseUntil, nextAttemptAt, deadlineAt, NOW);
    }

    private static HarnessRecoveryPolicy.ClaimState validateClaim(
            String status,
            String leaseOwner,
            Timestamp leaseUntil,
            Integer recoveryAttempts,
            HarnessRecoveryClaim claim) {
        return HarnessRecoveryPolicy.validateClaim(
                status,
                leaseOwner,
                leaseUntil,
                recoveryAttempts,
                claim,
                NOW);
    }

    private static Timestamp timestamp(long value) {
        return new Timestamp(value);
    }
}
