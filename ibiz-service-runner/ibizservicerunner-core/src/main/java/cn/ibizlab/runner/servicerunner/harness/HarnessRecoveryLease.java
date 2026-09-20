package cn.ibizlab.runner.servicerunner.harness;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Keeps a recovery claim leased while its external execution is in progress.
 */
final class HarnessRecoveryLease implements AutoCloseable {

    private static final Log log = LogFactory.getLog(HarnessRecoveryLease.class);
    private static final long SHUTDOWN_TIMEOUT_SECONDS = 5L;

    @FunctionalInterface
    interface Renewal {
        boolean renew() throws Throwable;
    }

    private final HarnessRecoveryClaim claim;
    private final long renewIntervalMs;
    private final Renewal renewal;
    private final ScheduledExecutorService scheduler;
    private final AtomicBoolean active = new AtomicBoolean(true);
    private final AtomicBoolean closed = new AtomicBoolean(false);

    private ScheduledFuture<?> scheduledFuture;

    HarnessRecoveryLease(HarnessRecoveryClaim claim,
                         long renewIntervalMs,
                         Renewal renewal) {
        this(claim, renewIntervalMs, renewal, createScheduler(claim));
    }

    HarnessRecoveryLease(HarnessRecoveryClaim claim,
                         long renewIntervalMs,
                         Renewal renewal,
                         ScheduledExecutorService scheduler) {
        if (claim == null) {
            throw new IllegalArgumentException("Recovery claim is required");
        }
        if (renewIntervalMs <= 0) {
            throw new IllegalArgumentException(
                    "Recovery lease renew interval must be positive");
        }
        if (renewal == null) {
            throw new IllegalArgumentException("Recovery lease renewal is required");
        }
        if (scheduler == null) {
            throw new IllegalArgumentException(
                    "Recovery lease scheduler is required");
        }
        this.claim = claim;
        this.renewIntervalMs = renewIntervalMs;
        this.renewal = renewal;
        this.scheduler = scheduler;
    }

    synchronized void start() {
        if (scheduledFuture != null) {
            return;
        }
        if (closed.get()) {
            throw new IllegalStateException("Recovery lease is already closed");
        }
        scheduledFuture = scheduler.scheduleWithFixedDelay(
                this::renewSafely,
                renewIntervalMs,
                renewIntervalMs,
                TimeUnit.MILLISECONDS);
    }

    boolean isActive() {
        return active.get();
    }

    void renewSafely() {
        if (closed.get() || !active.get()) {
            return;
        }
        try {
            if (!renewal.renew()) {
                active.set(false);
                cancelScheduledFuture();
                log.warn(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s run=%2$s lease renewal rejected",
                        claim.getWorkerId(), claim.getRunId()));
            }
        } catch (Throwable ex) {
            if (ex instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            log.error(String.format(
                    "[HARNESS-RECOVERY] worker=%1$s run=%2$s lease renewal failed: %3$s",
                    claim.getWorkerId(), claim.getRunId(), ex.getMessage()), ex);
        }
    }

    @Override
    public void close() {
        if (!closed.compareAndSet(false, true)) {
            return;
        }
        cancelScheduledFuture();
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(
                    SHUTDOWN_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            scheduler.shutdownNow();
        }
    }

    private synchronized void cancelScheduledFuture() {
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            scheduledFuture = null;
        }
    }

    private static ScheduledExecutorService createScheduler(
            HarnessRecoveryClaim claim) {
        if (claim == null) {
            throw new IllegalArgumentException("Recovery claim is required");
        }
        String threadName = "harness-lease-"
                + sanitize(claim.getWorkerId())
                + "-"
                + sanitize(claim.getRunId());
        ThreadFactory threadFactory = runnable -> {
            Thread thread = new Thread(runnable, threadName);
            thread.setDaemon(true);
            return thread;
        };
        return Executors.newSingleThreadScheduledExecutor(threadFactory);
    }

    private static String sanitize(String value) {
        return value.replaceAll("[^A-Za-z0-9_.-]", "_");
    }
}
