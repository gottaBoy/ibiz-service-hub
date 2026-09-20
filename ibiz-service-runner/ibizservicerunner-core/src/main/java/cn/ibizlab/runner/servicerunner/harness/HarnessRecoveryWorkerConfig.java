package cn.ibizlab.runner.servicerunner.harness;

import net.ibizsys.runtime.ISystemRuntimeSetting;

/**
 * Runtime settings for durable Harness Run recovery.
 */
public final class HarnessRecoveryWorkerConfig {

    public static final String CONFIG_PREFIX = "harness.recovery";
    public static final int MAX_BATCH_SIZE = 1000;

    private static final boolean DEFAULT_ENABLED = false;
    private static final long DEFAULT_POLL_INTERVAL_MS = 5000L;
    private static final int DEFAULT_BATCH_SIZE = 100;
    private static final long DEFAULT_LEASE_MS = 60000L;
    private static final int DEFAULT_MAX_ATTEMPTS = 3;
    private static final long DEFAULT_INITIAL_BACKOFF_MS = 5000L;
    private static final long DEFAULT_MAX_BACKOFF_MS = 60000L;

    private final boolean enabled;
    private final String workerId;
    private final long pollIntervalMs;
    private final int batchSize;
    private final long leaseMs;
    private final long leaseRenewIntervalMs;
    private final int maxAttempts;
    private final long initialBackoffMs;
    private final long maxBackoffMs;

    public HarnessRecoveryWorkerConfig(boolean enabled,
                                       String workerId,
                                       long pollIntervalMs,
                                       int batchSize,
                                       long leaseMs) {
        this(enabled,
                workerId,
                pollIntervalMs,
                batchSize,
                leaseMs,
                defaultLeaseRenewIntervalMs(leaseMs),
                DEFAULT_MAX_ATTEMPTS,
                DEFAULT_INITIAL_BACKOFF_MS,
                DEFAULT_MAX_BACKOFF_MS);
    }

    public HarnessRecoveryWorkerConfig(boolean enabled,
                                       String workerId,
                                       long pollIntervalMs,
                                       int batchSize,
                                       long leaseMs,
                                       int maxAttempts,
                                       long initialBackoffMs,
                                       long maxBackoffMs) {
        this(enabled,
                workerId,
                pollIntervalMs,
                batchSize,
                leaseMs,
                defaultLeaseRenewIntervalMs(leaseMs),
                maxAttempts,
                initialBackoffMs,
                maxBackoffMs);
    }

    public HarnessRecoveryWorkerConfig(boolean enabled,
                                       String workerId,
                                       long pollIntervalMs,
                                       int batchSize,
                                       long leaseMs,
                                       long leaseRenewIntervalMs,
                                       int maxAttempts,
                                       long initialBackoffMs,
                                       long maxBackoffMs) {
        this.enabled = enabled;
        this.workerId = requireWorkerId(workerId);
        this.pollIntervalMs = requirePositive(pollIntervalMs, "Recovery poll interval");
        this.batchSize = requireBatchSize(batchSize);
        this.leaseMs = requirePositive(leaseMs, "Recovery lease");
        this.leaseRenewIntervalMs = requirePositive(
                leaseRenewIntervalMs, "Recovery lease renew interval");
        if (leaseRenewIntervalMs > leaseMs) {
            throw new IllegalArgumentException(
                    "Recovery lease renew interval must not exceed recovery lease");
        }
        this.maxAttempts = requirePositive(maxAttempts, "Recovery max attempts");
        this.initialBackoffMs = requirePositive(
                initialBackoffMs, "Recovery initial backoff");
        this.maxBackoffMs = requirePositive(
                maxBackoffMs, "Recovery max backoff");
        if (maxBackoffMs < initialBackoffMs) {
            throw new IllegalArgumentException(
                    "Recovery max backoff must be greater than or equal to initial backoff");
        }
    }

    public static HarnessRecoveryWorkerConfig from(ISystemRuntimeSetting settings,
                                                   String defaultWorkerId) {
        if (settings == null) {
            throw new IllegalArgumentException("System runtime settings are required");
        }
        boolean enabled = settings.getParam(key("enabled"), DEFAULT_ENABLED);
        String workerId = settings.getParam(key("worker-id"), defaultWorkerId);
        long pollIntervalMs = settings.getParam(
                key("poll-interval-ms"), DEFAULT_POLL_INTERVAL_MS);
        int batchSize = settings.getParam(key("batch-size"), DEFAULT_BATCH_SIZE);
        long leaseMs = settings.getParam(key("lease-ms"), DEFAULT_LEASE_MS);
        long leaseRenewIntervalMs = settings.getParam(
                key("lease-renew-interval-ms"),
                defaultLeaseRenewIntervalMs(leaseMs));
        int maxAttempts = settings.getParam(
                key("max-attempts"), DEFAULT_MAX_ATTEMPTS);
        long initialBackoffMs = settings.getParam(
                key("initial-backoff-ms"), DEFAULT_INITIAL_BACKOFF_MS);
        long maxBackoffMs = settings.getParam(
                key("max-backoff-ms"), DEFAULT_MAX_BACKOFF_MS);
        return new HarnessRecoveryWorkerConfig(
                enabled,
                workerId,
                pollIntervalMs,
                batchSize,
                leaseMs,
                leaseRenewIntervalMs,
                maxAttempts,
                initialBackoffMs,
                maxBackoffMs);
    }

    private static long defaultLeaseRenewIntervalMs(long leaseMs) {
        return Math.max(1L, leaseMs / 3L);
    }

    private static String key(String name) {
        return CONFIG_PREFIX + "." + name;
    }

    private static String requireWorkerId(String workerId) {
        String normalized = workerId == null ? null : workerId.trim();
        if (normalized == null || normalized.isEmpty()) {
            throw new IllegalArgumentException("Recovery worker id is required");
        }
        if (normalized.length() > 100) {
            throw new IllegalArgumentException(
                    "Recovery worker id must not exceed 100 characters");
        }
        return normalized;
    }

    private static long requirePositive(long value, String name) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " must be positive");
        }
        return value;
    }

    private static int requirePositive(int value, String name) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " must be positive");
        }
        return value;
    }

    private static int requireBatchSize(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Recovery batch size must be positive");
        }
        if (value > MAX_BATCH_SIZE) {
            throw new IllegalArgumentException(
                    "Recovery batch size must not exceed " + MAX_BATCH_SIZE);
        }
        return value;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getWorkerId() {
        return workerId;
    }

    public long getPollIntervalMs() {
        return pollIntervalMs;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public long getLeaseMs() {
        return leaseMs;
    }

    public long getLeaseRenewIntervalMs() {
        return leaseRenewIntervalMs;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public long getInitialBackoffMs() {
        return initialBackoffMs;
    }

    public long getMaxBackoffMs() {
        return maxBackoffMs;
    }
}
