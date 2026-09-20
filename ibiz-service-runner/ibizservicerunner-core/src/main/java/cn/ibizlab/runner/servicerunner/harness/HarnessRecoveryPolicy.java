package cn.ibizlab.runner.servicerunner.harness;

import java.sql.Timestamp;

/**
 * Pure recovery-state decisions shared by scans and row-lock rechecks.
 */
final class HarnessRecoveryPolicy {

    enum Decision {
        SKIP,
        CLAIM,
        EXPIRE
    }

    enum ClaimState {
        ACTIVE,
        TERMINAL,
        OWNER_MISMATCH,
        ATTEMPT_MISMATCH,
        LEASE_EXPIRED
    }

    private HarnessRecoveryPolicy() {
    }

    static Decision decide(String status,
                           Timestamp leaseUntil,
                           Timestamp nextAttemptAt,
                           Timestamp deadlineAt,
                           Timestamp currentTime) {
        if (currentTime == null || !isManagedStatus(status)) {
            return Decision.SKIP;
        }
        if (leaseUntil != null && leaseUntil.after(currentTime)) {
            return Decision.SKIP;
        }
        if (deadlineAt != null && !deadlineAt.after(currentTime)) {
            return Decision.EXPIRE;
        }
        if (!isExecutableStatus(status)) {
            return Decision.SKIP;
        }
        if (nextAttemptAt != null && nextAttemptAt.after(currentTime)) {
            return Decision.SKIP;
        }
        return Decision.CLAIM;
    }

    static ClaimState validateClaim(String status,
                                    String leaseOwner,
                                    Timestamp leaseUntil,
                                    Integer recoveryAttempts,
                                    HarnessRecoveryClaim claim,
                                    Timestamp currentTime) {
        if (isTerminal(status)) {
            return ClaimState.TERMINAL;
        }
        if (claim == null || !equalsText(leaseOwner, claim.getWorkerId())) {
            return ClaimState.OWNER_MISMATCH;
        }
        if (recoveryAttempts == null
                || recoveryAttempts.intValue() != claim.getRecoveryAttempts()) {
            return ClaimState.ATTEMPT_MISMATCH;
        }
        if (currentTime == null
                || leaseUntil == null
                || !leaseUntil.after(currentTime)) {
            return ClaimState.LEASE_EXPIRED;
        }
        return ClaimState.ACTIVE;
    }

    static long calculateBackoffMs(int recoveryAttempts,
                                   long initialBackoffMs,
                                   long maxBackoffMs) {
        if (recoveryAttempts <= 0
                || initialBackoffMs <= 0
                || maxBackoffMs < initialBackoffMs) {
            throw new IllegalArgumentException("Invalid recovery backoff settings");
        }
        long backoff = initialBackoffMs;
        for (int attempt = 1;
             attempt < recoveryAttempts && backoff < maxBackoffMs;
             attempt++) {
            if (backoff > maxBackoffMs / 2L) {
                return maxBackoffMs;
            }
            backoff *= 2L;
        }
        return Math.min(backoff, maxBackoffMs);
    }

    static Timestamp calculateLeaseUntil(Timestamp currentTime,
                                         long leaseMs,
                                         Timestamp deadlineAt) {
        if (currentTime == null || leaseMs <= 0) {
            throw new IllegalArgumentException("Invalid recovery lease settings");
        }
        long currentMillis = currentTime.getTime();
        long leaseMillis = currentMillis > Long.MAX_VALUE - leaseMs
                ? Long.MAX_VALUE
                : currentMillis + leaseMs;
        Timestamp leaseUntil = new Timestamp(leaseMillis);
        if (deadlineAt != null && deadlineAt.before(leaseUntil)) {
            return new Timestamp(deadlineAt.getTime());
        }
        return leaseUntil;
    }

    private static boolean isManagedStatus(String status) {
        return isExecutableStatus(status)
                || equalsStatus(status, "waiting_approval")
                || equalsStatus(status, "paused");
    }

    private static boolean isExecutableStatus(String status) {
        return equalsStatus(status, "queued")
                || equalsStatus(status, "running")
                || equalsStatus(status, "retrying");
    }

    private static boolean equalsStatus(String value, String expected) {
        return value != null && expected.equalsIgnoreCase(value.trim());
    }

    private static boolean equalsText(String left, String right) {
        return left != null && right != null && left.trim().equals(right.trim());
    }

    private static boolean isTerminal(String status) {
        return equalsStatus(status, "completed")
                || equalsStatus(status, "failed")
                || equalsStatus(status, "cancelled");
    }
}
