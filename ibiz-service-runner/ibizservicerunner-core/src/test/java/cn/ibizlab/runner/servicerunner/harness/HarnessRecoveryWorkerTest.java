package cn.ibizlab.runner.servicerunner.harness;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessRecoveryWorkerTest {

    @Test
    void startAndStopAreIdempotent() throws Exception {
        AtomicInteger attempts = new AtomicInteger();
        CountDownLatch firstCycle = new CountDownLatch(1);
        HarnessRecoveryWorker worker = new HarnessRecoveryWorker(
                config(1000L),
                () -> {
                    attempts.incrementAndGet();
                    firstCycle.countDown();
                    return 0;
                });
        try {
            worker.start();
            worker.start();

            assertTrue(firstCycle.await(2, TimeUnit.SECONDS));
            Thread.sleep(100L);
            assertTrue(worker.isRunning());
            assertTrue(attempts.get() == 1);
        } finally {
            worker.stop();
            worker.stop();
        }
        assertFalse(worker.isRunning());
    }

    @Test
    void failedCycleDoesNotStopLaterPolling() throws Exception {
        AtomicInteger attempts = new AtomicInteger();
        CountDownLatch secondCycle = new CountDownLatch(1);
        HarnessRecoveryWorker worker = new HarnessRecoveryWorker(
                config(10L),
                () -> {
                    int attempt = attempts.incrementAndGet();
                    if (attempt == 1) {
                        throw new IllegalStateException("first cycle fails");
                    }
                    secondCycle.countDown();
                    return 0;
                });
        try {
            worker.start();
            assertTrue(secondCycle.await(2, TimeUnit.SECONDS));
            assertTrue(worker.isRunning());
            assertTrue(attempts.get() >= 2);
        } finally {
            worker.stop();
        }
    }

    @Test
    void disabledWorkerDoesNotSchedule() throws Exception {
        AtomicInteger attempts = new AtomicInteger();
        HarnessRecoveryWorkerConfig config = new HarnessRecoveryWorkerConfig(
                false, "worker-test", 10L, 10, 100L);
        HarnessRecoveryWorker worker = new HarnessRecoveryWorker(
                config,
                attempts::incrementAndGet);
        try {
            worker.start();
            Thread.sleep(50L);
            assertFalse(worker.isRunning());
            assertTrue(attempts.get() == 0);
        } finally {
            worker.stop();
        }
    }

    private static HarnessRecoveryWorkerConfig config(long pollIntervalMs) {
        return new HarnessRecoveryWorkerConfig(
                true, "worker-test", pollIntervalMs, 10, 100L);
    }
}
