package cn.ibizlab.runner.servicerunner.harness;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Polls durable Run recovery without allowing one failed cycle to stop future
 * scans.
 */
public final class HarnessRecoveryWorker implements AutoCloseable {

    private static final Log log = LogFactory.getLog(HarnessRecoveryWorker.class);
    private static final long SHUTDOWN_TIMEOUT_SECONDS = 5L;

    @FunctionalInterface
    public interface RecoveryCycle {
        int recover() throws Throwable;
    }

    private final HarnessRecoveryWorkerConfig config;
    private final RecoveryCycle recoveryCycle;
    private final ScheduledExecutorService scheduler;

    private ScheduledFuture<?> scheduledFuture;
    private boolean running;
    private boolean closed;

    public HarnessRecoveryWorker(HarnessRecoveryWorkerConfig config,
                                 RecoveryCycle recoveryCycle) {
        this(config, recoveryCycle, createScheduler(config));
    }

    HarnessRecoveryWorker(HarnessRecoveryWorkerConfig config,
                          RecoveryCycle recoveryCycle,
                          ScheduledExecutorService scheduler) {
        if (config == null) {
            throw new IllegalArgumentException("Recovery worker config is required");
        }
        if (recoveryCycle == null) {
            throw new IllegalArgumentException("Recovery cycle is required");
        }
        if (scheduler == null) {
            throw new IllegalArgumentException("Recovery scheduler is required");
        }
        this.config = config;
        this.recoveryCycle = recoveryCycle;
        this.scheduler = scheduler;
    }

    public synchronized void start() {
        if (!config.isEnabled() || running) {
            return;
        }
        if (closed) {
            throw new IllegalStateException("Recovery worker is already closed");
        }
        scheduledFuture = scheduler.scheduleWithFixedDelay(
                this::runCycleSafely,
                0L,
                config.getPollIntervalMs(),
                TimeUnit.MILLISECONDS);
        running = true;
        log.info(String.format(
                "[HARNESS-RECOVERY] started worker=%1$s pollIntervalMs=%2$d batchSize=%3$d leaseMs=%4$d",
                config.getWorkerId(),
                config.getPollIntervalMs(),
                config.getBatchSize(),
                config.getLeaseMs()));
    }

    void runCycleSafely() {
        try {
            int handled = recoveryCycle.recover();
            if (handled > 0) {
                log.info(String.format(
                        "[HARNESS-RECOVERY] worker=%1$s handled=%2$d",
                        config.getWorkerId(), handled));
            }
        } catch (Throwable ex) {
            log.error(String.format(
                    "[HARNESS-RECOVERY] worker=%1$s cycle failed: %2$s",
                    config.getWorkerId(), ex.getMessage()), ex);
        }
    }

    public synchronized boolean isRunning() {
        return running;
    }

    public void stop() {
        ScheduledFuture<?> future;
        synchronized (this) {
            if (closed) {
                return;
            }
            running = false;
            closed = true;
            future = scheduledFuture;
            scheduledFuture = null;
        }
        if (future != null) {
            future.cancel(false);
        }
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
        log.info(String.format(
                "[HARNESS-RECOVERY] stopped worker=%1$s", config.getWorkerId()));
    }

    @Override
    public void close() {
        stop();
    }

    private static ScheduledExecutorService createScheduler(
            HarnessRecoveryWorkerConfig config) {
        if (config == null) {
            throw new IllegalArgumentException("Recovery worker config is required");
        }
        final String threadName = "harness-recovery-" + sanitize(config.getWorkerId());
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
