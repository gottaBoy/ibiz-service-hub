package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;

import java.sql.Timestamp;

/**
 * Immutable ownership token returned after a recoverable Run is leased.
 */
public final class HarnessRecoveryClaim {

    private final AIRunDTO run;
    private final String workerId;
    private final int recoveryAttempts;
    private final Timestamp leaseUntil;

    public HarnessRecoveryClaim(AIRunDTO run,
                                String workerId,
                                int recoveryAttempts,
                                Timestamp leaseUntil) {
        if (run == null || run.getId() == null) {
            throw new IllegalArgumentException("Recovery claim requires a Run");
        }
        if (workerId == null || workerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Recovery claim requires a worker id");
        }
        if (recoveryAttempts <= 0) {
            throw new IllegalArgumentException("Recovery claim attempts must be positive");
        }
        if (leaseUntil == null) {
            throw new IllegalArgumentException("Recovery claim requires a lease deadline");
        }
        this.run = run;
        this.workerId = workerId;
        this.recoveryAttempts = recoveryAttempts;
        this.leaseUntil = new Timestamp(leaseUntil.getTime());
    }

    public AIRunDTO getRun() {
        return run;
    }

    public String getRunId() {
        return run.getId();
    }

    public String getWorkerId() {
        return workerId;
    }

    public int getRecoveryAttempts() {
        return recoveryAttempts;
    }

    public Timestamp getLeaseUntil() {
        return new Timestamp(leaseUntil.getTime());
    }
}
